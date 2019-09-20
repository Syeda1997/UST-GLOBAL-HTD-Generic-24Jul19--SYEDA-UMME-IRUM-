import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  indianNews:any[]=[];
  sportsNews:any[]=[];
  technologyNews:any[]=[]
  constructor(private http: HttpClient) { 
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=137fb98c1f2043b788b8358af838ee62')
    .subscribe(resData=>{
      this.indianNews=resData.articles;
      console.log(this.indianNews);
    })
    http.get<any>('https://newsapi.org/v2/top-headlines?category=sports&apiKey=137fb98c1f2043b788b8358af838ee62')
    .subscribe(resData=>{
      this.sportsNews=resData.articles;
      console.log(this.sportsNews);
    })
    http.get<any>('https://newsapi.org/v2/top-headlines?category=technology&apiKey=137fb98c1f2043b788b8358af838ee62')
    .subscribe(resData=>{
      this.technologyNews=resData.articles;
      console.log(this.technologyNews);
    })
  }

  ngOnInit() {
  }

}
