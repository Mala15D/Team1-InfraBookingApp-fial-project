import { Injectable } from '@angular/core';
import { User } from 'src/model/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }
  checkUser(user:User):boolean
{
  if(user.userName==="zensar" && user.password==="Zensar123")
  {
    return true;
  }  
  return false;
}
}
