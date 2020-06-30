import React, { Component } from 'react';

import Login from '../login/Login'
import Message from '../message/Message'
import './ChatMessageBox.css';


var stompClient = null;
class ChatMessageBox extends Component {

  constructor(props) {
    super(props);
    this.state =
      {
        username: '',
        channelConnected: false,
        chatMessage: '',
        roomNotification: [],
        broadcastMessage: [],
        bellRing: false
      };
  }

  connect = (userName) => {

    if (userName) {

      const Stomp = require('stompjs')

      var SockJS = require('sockjs-client')

      SockJS = new SockJS('/ws')

      stompClient = Stomp.over(SockJS);

      stompClient.connect({}, this.onConnected);

      this.setState({
        username: userName,
      })
    }
  }

  onConnected = () => {

    this.setState({
      channelConnected: true
    })

    // Me conecto
    stompClient.subscribe('/topic/pubic', this.onMessageReceived);

    // Registro el usuario
    stompClient.send("/app/addUser", {}, JSON.stringify({ sender: this.state.username, type: 'JOIN' }))

  }

  sendMessage = (type, value) => {

    if (stompClient) {
      var chatMessage = {
        sender: this.state.username,
        content: type === 'TYPING' ? value : value,
        type: type

      };
      // Envio el mensaje
      stompClient.send("/app/sendMessage", {}, JSON.stringify(chatMessage));
    }
  }

  onMessageReceived = (payload) => {

    var message = JSON.parse(payload.body);

    if (message.type === 'JOIN') {

      this.state.roomNotification.push({ 'sender': message.sender + " ~ joined", 'status': 'online'})
      this.setState({
        roomNotification: this.state.roomNotification,
        bellRing: true
      })

    }
    else if (message.type === 'LEAVE') {
      this.state.roomNotification.map((notification, i) => {
        if (notification.sender === message.sender + " ~ joined") {
          notification.status = "offline";
          notification.sender = message.sender + " ~ left";
        }
      })
      this.setState({
        roomNotification: this.state.roomNotification,
        bellRing: true
      })
    }
    else if (message.type === 'TYPING') {

      this.state.roomNotification.map((notification, i) => {
        if (notification.sender === message.sender + " ~ joined") {
          if (message.content)
            notification.status = "typing...";
          else
            notification.status = "online";
        }

      })
      this.setState({
        roomNotification: this.state.roomNotification
      })
    }
    else if (message.type === 'CHAT') {

      this.state.roomNotification.map((notification, i) => {
        if (notification.sender === message.sender + " ~ joined") {
          notification.status = "online";
        }
      })
      this.state.broadcastMessage.push({
        message: message.content,
        sender: message.sender,
      })
      this.setState({
        broadcastMessage: this.state.broadcastMessage,

      })
    }
    else {

    }
  }


  render() {

    return (
      <div>
        {this.state.channelConnected ?
          (
            <div>
                <ul id="chat" ref="messageBox">
                  {this.state.broadcastMessage.map((msg, i) =>
                    this.state.username === msg.sender ?
                      <li className="you" key={i}>
                        <div className="entete">
                          <h2> <h2/>
                            <span> </span>
                            <span className="sender"> {msg.sender} ~ (You)</span></h2>
                          <span> </span>
                        </div>
                        <div className="message">
                          {msg.message}
                        </div>
                      </li>
                      :
                      <li className="others">
                        <div className="entete">
                          <span> </span>
                          <span> </span>
                          <span className="sender">{msg.sender}</span>
                        </div>
                        <div className="message">
                          {msg.message}
                        </div>
                      </li>
                  )}
                </ul>
                      <Message sendMessage={this.sendMessage} />
            </div>

          ) : (
            <Login connect={this.connect} />

          )
        }
      </div>
    )
  }

}

export default ChatMessageBox;
