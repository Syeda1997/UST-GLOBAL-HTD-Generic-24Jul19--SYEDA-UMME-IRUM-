import { Component, OnInit } from '@angular/core';
import { ProductService } from './addproduct.services';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }

  constructor(private productService:ProductService ,private router:Router) { }
  postPro(form:NgForm) {
    if (form.value.id) {
    this.productService.updateData(form.value).subscribe((data)=>{
      console.log(data);
      this.productService.getData();
      form.reset();
      this.router.navigateByUrl('/productdetails');
    },err =>{
    console.log(err);
    })
  }else{
    this.productService.postData(form.value).subscribe((data)=>{
      console.log(data);
      this.productService.getData();
      form.reset();
      this.router.navigateByUrl('/productdetails');
    },err =>{
    console.log(err);
  })
  }

  }
}
