import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {
  carsData:any='';
  cars=[
    {
      brand:'BMW',
      img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',
      description:'BMW the series of new innovation'
    },
    {
      brand:'Wolkwagen',
      img:'https://image.shutterstock.com/image-photo/cars-sale-stock-row-car-260nw-636632101.jpg',
      description:'Different variety of wolkswagen and its series to be displayed'
    },
    {
      brand:'Benz',
      img:'https://cdn.pixabay.com/photo/2016/04/13/20/36/mercedes-1327610__340.jpg',
      description:'Open roof top royal blue benz'
    },
    {
      brand:'swift',
      img:'https://cdn.pixabay.com/photo/2019/06/29/09/49/suzuki-sx4-4305859__340.jpg',
      description:'Swift is a comfortable and trending car in alot of many others'
    }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendCar(car) {
      this.carsData=car;
  }

}
