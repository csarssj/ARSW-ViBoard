import React from 'react';
import { Component } from 'react';
import RoomService from './services/RoomService';
import './App.css';
import {DataTable} from 'primereact/datatable';
import {Column} from 'primereact/column';
import {Panel} from 'primereact/panel';
import Canvas from './components/Canvas'

export class App extends Component{
  constructor(){
    super();
    this.state = {};
    this.roomService= new RoomService();
  }
  componentDidMount(){
      this.roomService.getAll().then(data => this.setState({rooms: data}));
  }
  render(){
    return(
      <div>
        <Panel header= "Viboard">
          <DataTable value = {this.state.rooms} >
            <Column field="id" header="id"></Column>
            <Column field="tittle" header="tittle"></Column>
            <Column field="pass" header="pass"></Column>
            <Column field="creator" header="creator"></Column>
            <Column field="capacity" header= "capacity"></Column>
          </DataTable>
        </Panel>
      </div>
    );
  }
}
export default App;
