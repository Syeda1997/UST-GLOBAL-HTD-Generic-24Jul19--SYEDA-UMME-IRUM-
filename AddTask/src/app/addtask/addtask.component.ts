import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { AddtaskService } from '../addtask.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addtask',
  templateUrl: './addtask.component.html',
  styleUrls: ['./addtask.component.css']
})
export class AddtaskComponent implements OnInit {

  constructor(private addtaskService:AddtaskService,private router:Router) { }
  posttasks(data){
    return this.posttasks;
  }
  ngOnInit() {
  }

}
