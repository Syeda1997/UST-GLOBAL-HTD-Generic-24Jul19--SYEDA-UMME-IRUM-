import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { GithubService } from '../github.service';



@Component({
  selector: 'app-github',
  templateUrl: './github.component.html',
  styleUrls: ['./github.component.css']
})
export class GithubComponent implements OnInit {
  gitnews:any[]=[];
  constructor(private http:HttpClient,githubServices:GithubService) {
    http.get<any>('https://api.github.com/users')//observables
    .subscribe(resData=>{
      this.gitnews=resData;
      console.log(this.gitnews);
    });
   }
   

  ngOnInit() {
  }

}
