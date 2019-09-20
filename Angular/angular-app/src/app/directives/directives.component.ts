import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directives',
  templateUrl: './directives.component.html',
  styleUrls: ['./directives.component.css']
})
export class DirectivesComponent implements OnInit {
  condition=false;
  users=[
    {
      id:123,
      name:'syeda',
      city:'mys'
    },
    {
      id:124,
      name:'umme',
      city:'bangalore'
    },
    {
      id:125,
      name:'Irum',
      city:'kerala'
    },
    {
      id:126,
      name:'ruman',
      city:'pune'
    },
    {
      id:127,
      name:'rahul',
      city:'chandighad'
    }
  ];
  constructor() { }
  removeUser(user){
    let index= this.users.indexOf(user);
    this.users.splice(index,1);
    this.condition=true;
  }
  close(){
    this.condition=false;
  }
  ngOnInit() {
  }

}
