import { Component, OnInit } from '@angular/core';
import { ProductService } from '../addproduct/addproduct.services';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private productService:ProductService) { 
  }

  ngOnInit() {
  }
  
}
