import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/model/User';
import { AuthenticationService } from '../service/authentication.service';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User();
  constructor(private userService: UserService, private router: Router,private authenticationService:AuthenticationService) {
  }
  PerformLogin() {
    this.userService.checkUser(this.user).subscribe(response=>{
      let token=response.jwt;
      console.log(token)
      this.authenticationService.login(token);
      this.router.navigate(["booking"])
    });
  }
  ngOnInit() {
  }

}
