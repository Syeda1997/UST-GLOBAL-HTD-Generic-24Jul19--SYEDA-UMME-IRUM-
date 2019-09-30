import { Component, OnInit } from '@angular/core';
import { TaskService } from '../task.service';

@Component({
  selector: 'app-task',
  templateUrl: './task.component.html',
  styleUrls: ['./task.component.css']
})
export class TaskComponent implements OnInit {

  constructor(private taskService:TaskService) { }

  lists:any[]=[];
  senddata(data){
    console.log(data);
    this.lists.push(data);
    this.taskService.li=this.lists;  
    data.reset;
  }
  delete(li){
    let index=this.lists.indexOf(li);
    this.lists.splice(index,1);
    console.log(this.lists);
  }

  ngOnInit() {
  }

}
