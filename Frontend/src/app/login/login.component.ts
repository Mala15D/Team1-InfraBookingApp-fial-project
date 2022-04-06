import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/model/User';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user: User = new User();
  constructor(private service: UserService, private router: Router) {
  }
  PerformLogin() {
    let result = this.service.checkUser(this.user)
    if (result) {
      this.router.navigate(['booking'])
    }
    else {
      alert('invalid user name and password')
      this.user.userName = '';
      this.user.password = ''
    }
  }
  ngOnInit() {
  }

}
