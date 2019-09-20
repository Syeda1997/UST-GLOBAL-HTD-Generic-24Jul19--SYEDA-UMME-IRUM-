import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent{
        redcolor=true;
        name='syeda';
        imgURL='https://cdn.pixabay.com/photo/2015/06/25/17/56/people-821624__340.jpg';
        textClasses='bg-success text-white';
        paragraphstyle=true;
        padding='50px';
        colspan=2;
  constructor() { 
    setTimeout(()=>{
      this.redcolor= false;
      this.paragraphstyle=false;
    },5000)
  }


}
