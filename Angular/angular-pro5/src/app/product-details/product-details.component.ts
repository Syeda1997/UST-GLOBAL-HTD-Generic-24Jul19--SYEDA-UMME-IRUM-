import { Component, OnInit } from '@angular/core';
import { ProductService } from '../addproduct/addproduct.services';
import { Router } from '@angular/router';


@Component({
  selector: 'app-product-details',
  templateUrl: './product-details.component.html',
  styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

  constructor(private productService:ProductService,private router:Router) { }
  updatePro(product){
    this.productService.selectedpro=product;
    this.router.navigateByUrl('/addproduct');
  }

  deletePro(product){
    this.productService.deleteData(product).subscribe(resData=>{
      console.log(resData);
      this.productService.getData();
    })
  }
  ngOnInit() {
    this.productService.getData();
  }

}
