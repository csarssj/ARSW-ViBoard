import axios from 'axios';

export class RoomService{
  baseUrl = "http://localhost:8080/api/rooms";
  getAll(){
      return axios.get(this.baseUrl).then(res => res.data);
  }
}
export default RoomService;
