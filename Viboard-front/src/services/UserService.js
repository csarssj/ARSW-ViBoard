import axios from 'axios';

export class UserService{

  getAll(){
      return axios.get("http://localhost:8080/api/users").then(res => res.data);
  }
  save(user){
      return axios.get("http://localhost:8080/api/save").then(res => res.data);
  }
}
export default UserService;
