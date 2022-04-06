import { Injectable } from '@angular/core';
import { User } from 'src/model/User';
import { HttpClient } from '@angular/common/http';
import { UserResponse } from 'src/model/UserResponse';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient:HttpClient) {
  }

  checkUser(user:User){
    console.log(user)
    return this.httpClient.post<UserResponse>('http://localhost:9051/user/authenticate',user);
  }
}
