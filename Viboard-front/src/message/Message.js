import React, { Component } from 'react';
import './Message.css'
import TextField from '@material-ui/core/TextField';
export default class Menssage extends Component {

    constructor(props) {
        super(props);
        this.state =
            {
                chatMessage: '',
            };
    }
    handleSendMessage = () => {

        this.props.sendMessage('CHAT', this.state.chatMessage)

            this.setState({
              chatMessage: ''
            })
    }
    handleTyping = (event) => {

        this.setState({
            chatMessage: event.target.value,
        });
        this.props.sendMessage('TYPING', event.target.value);

    };
    render() {
        return (
            <div>
            <div className="MessageComponent">
                <TextField
                    id="msg"
                    label=""
                    placeholder="Enter para enviar"
                    onChange={this.handleTyping}
                    margin="normal"
                    value={this.state.chatMessage}
                    onKeyPress={event => {
                        if (event.key === 'Enter') {
                            this.handleSendMessage();
                        }
                    }}
                />
            </div>}
            </div>
        )
    }
}
