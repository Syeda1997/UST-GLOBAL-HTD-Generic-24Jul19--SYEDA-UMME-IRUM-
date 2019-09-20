import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class GithubService {
  url='https://api.github.com/users';//fetching the data from url
  constructor(private http:HttpClient) { }
  hubdata:any[]=[];//to get data in array
  getData(){
    this.http.get(`${this.url}gitNews.json`).pipe(map(resData=>{
      let gitArray=[];
      for(let key in resData){
        gitArray.push({...resData[key],id:key});
      }
      return gitArray;
    })).subscribe(data => {//observables
      this.hubdata=data;
      console.log(data);
    },err=>{
      console.log(err);
    });
  }
  deleteData(data)//to delete data
  {
     return this.http.delete(`${this.url}gitNews.json`);
  }
}
