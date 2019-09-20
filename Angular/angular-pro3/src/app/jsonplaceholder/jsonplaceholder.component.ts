import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Component({
  selector: 'app-jsonplaceholder',
  templateUrl: './jsonplaceholder.component.html',
  styleUrls: ['./jsonplaceholder.component.css']
})
export class JsonplaceholderComponent implements OnInit {
  jsonplaceholder:any[]=[];
  constructor(private http:HttpClient) { 
  http.get<any>('https://jsonplaceholder.typicode.com/posts')
  .subscribe(resData=>{
    this.jsonplaceholder=resData;
    console.log(this.jsonplaceholder);
  })
  }
  ngOnInit() {
  }

}
