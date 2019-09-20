import { Injectable, DoCheck } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Product } from '../product-details/product_details';

@Injectable({
 providedIn:'root'
})
export class ProductService implements DoCheck {
  url='https://products-c9f2f.firebaseio.com/';

  selectedpro:Product={
    name:null,
    img:null,
    description:null,
    id:null
  }
  constructor(private http:HttpClient) { }

  products=[];

  getData(){
    this.http.get(`${this.url}products.json`).pipe(map(resData=>{
      let productArray=[];
      for(let key in resData){
        productArray.push({...resData[key],id:key});
      }
      return productArray;
    })).subscribe(data=>{
      this.products=data;
      console.log(data);
    }, err=> {
      console.log(err);
    });
  }
    postData(data){
      return this.http.post(`${this.url}/products.json`,data);//postdata
    }

    updateData(data){
      return this.http.put(`${this.url}products/${data.id}.json`,data)
    }

    deleteData(data){
      return this.http.delete(`${this.url}products/${data.id}.json`)      
    }
    ngDoCheck(){
      this.getData();
    }
}