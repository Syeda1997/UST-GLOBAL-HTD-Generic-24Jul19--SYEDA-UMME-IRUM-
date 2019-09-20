import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
  bikeData:any='';
  bikes=[
    {
      brand:'KTM',
      img:'https://cdn.pixabay.com/photo/2017/08/13/13/14/motorcycle-2637088__340.jpg',
      description:'KTM rc-100 new model'
    },
    {
    brand:'Royal enfield',
    img:'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
    description:'royal enfield with many'
    },
    {
      brand:'yamaha RX100',
      img:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXbKDQ0YK4QyhaI_8rdJT5dXmfXoYxr2__xX619eJLT3slhQYX',
      description:'rx100 and many'
    },
    {
      brand:'Duke',
      img:'https://cdn.pixabay.com/photo/2015/05/20/07/57/grassland-774929__340.jpg',
      description:'duke new model'
    }
  ]
  constructor() { }
  sendBike(bike){
    this.bikeData=bike;
  }
  ngOnInit() {
  }

}
