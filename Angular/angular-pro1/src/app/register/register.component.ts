import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { CustomValidator } from './custom.validator';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  get name(){
    return this.registerForm.get('name');
  }
  get email(){
    return this.registerForm.get('email');
  }
  get mobile(){
    return this.registerForm.get('mobile');
  }
  registerForm = new FormGroup({
    name: new FormControl('',[Validators.minLength(3),
                              Validators.required]),
    email: new FormControl('',[Validators.email,Validators.minLength(5),Validators.required,
                                CustomValidator.noSpace]),
    mobile: new FormControl('',[Validators.minLength(10),Validators.required])
  })
  ngOnInit() {
  }

}
