import React, { Component } from 'react';
import ChatMessageBox from './ChatMessageBox/ChatMessageBox'
import {ErrorBoundary} from 'react-error-boundary'
import { BrowserRouter as Router, Route, Switch, Link } from 'react-router-dom'
import RoomService from './services/RoomService';
import UserService from './services/UserService';
import './App.css';
import {DataTable} from 'primereact/datatable';
import {Column} from 'primereact/column';
import {Panel} from 'primereact/panel';

class App extends Component {
  constructor(){
    super();
    this.state = {};
    this.roomService= new RoomService();
    this.userService = new UserService();

  }
  componentDidMount(){
      this.roomService.getAll().then(data => this.setState({rooms: data}));
      this.userService.getAll().then(data => this.setState({users : data}));
  }
  refreshPage(){
    window.location.reload();
  }

  render() {
    return (
      <Router>
        <div className = "container mt-5">
          <div className = "btm-group">
            <Link to= "/" className="btm btn-dark">
                Inicio
            </Link>
            <Link to= "/api/rooms" className="btm btn-dark">
                Rooms
            </Link>
            <Link to= "/api/users" className="btm btn-dark">
                Users
            </Link>
          </div>
          <hr/>
          <Switch>
            <Route path = '/' exact>
            <ErrorBoundary headerColor="lightseagreen" errorTitle="Server Error"
                errorText="Unable to not connect you to the Chat Room Server. Please refresh this page and try again!"
                buttonType={['', 'primary', '', '']} buttonLabel={['', 'Refresh', '', '']} modal={true} autoScrollBodyContent={false}
                customContentStyle={null} onClick={this.refreshPage}>
                <ChatMessageBox />
            </ErrorBoundary>
            </Route>
            <Route path='/api/rooms' >
              <Panel header= "Viboard">
                <DataTable value = {this.state.rooms} >
                  <Column field="id" header="id"></Column>
                  <Column field="tittle" header="tittle"></Column>
                  <Column field="pass" header="pass"></Column>
                  <Column field="creator" header="creator"></Column>
                  <Column field="capacity" header= "capacity"></Column>
                </DataTable>
              </Panel>
            </Route>
            <Route path='/api/users'>
              <Panel header= "Viboard">
                <DataTable value = {this.state.users} >
                  <Column field="id" header="id"></Column>
                  <Column field="username" header="username"></Column>
                </DataTable>
              </Panel>
            </Route>
          </Switch >
        </div>
      </Router>
    );
  }
}

export default App;
