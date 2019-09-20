import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  users=[];
  constructor() { }

  ngOnInit() {
  }
  printForm(loginForm:NgForm){
    console.log(loginForm);
    this.users.push(loginForm.value);
    loginForm.reset();
    console.log(this.users);
  }
}
