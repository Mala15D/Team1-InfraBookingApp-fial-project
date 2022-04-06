import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor() { }

  isLoggedIn():boolean{
    let token=sessionStorage.getItem("token")
    return token!=null
  }

  getToken(){
    return sessionStorage.getItem("token")
  }

  login(token:string){
    sessionStorage.setItem('token',token)
  }

}