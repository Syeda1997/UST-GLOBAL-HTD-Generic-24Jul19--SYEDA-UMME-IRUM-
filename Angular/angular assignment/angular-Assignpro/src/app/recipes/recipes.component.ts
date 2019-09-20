import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recipes',
  templateUrl: './recipes.component.html',
  styleUrls: ['./recipes.component.css']
})
export class RecipesComponent implements OnInit {
  recipeData:any='';
  recipes=[
    {
      name:'Chicken Wings',
      img:'https://cdn.pixabay.com/photo/2015/03/26/09/39/fried-chicken-690039__340.jpg',
      description:'Non-veg dish coated meat with the crispy coat'
    },
    {
      name:'idli',
      img:'https://cdn.pixabay.com/photo/2017/06/16/11/38/breakfast-2408818__340.jpg',
      description:'A south-indian dish served with sambar and chutney'
    },
    {
      name:'Dosa',
      img:'https://image.shutterstock.com/image-photo/paper-masala-dosa-south-indian-260nw-1008144772.jpg',
      description:'A south-indian dish served with palya,sambar and chutney'
    },
    {
      name:'Burger',
      img:'https://image.shutterstock.com/image-photo/tasty-grilled-prawn-beef-burger-260nw-357029936.jpg',
      description:'A western dish or a foreign invented dish with indian flavours'
    },
    {
      name:'Pizza',
      img:'https://image.shutterstock.com/image-photo/hot-pizza-slice-melting-cheese-260nw-378226756.jpg',
      description:'Italian dish where a parota with cheese and vegetable topping'
    },
    {
      name:'pav-bhaji',
      img:'https://image.shutterstock.com/image-photo/pav-bhaji-indian-spicy-fast-260nw-396476260.jpg',
      description:'A famous mumbai dish in india famous in chaupati mumbai'
    },
    {
      name:'Biryani',
      img:'https://image.shutterstock.com/image-photo/close-homemade-chicken-tikka-biryani-260nw-1025313970.jpg',
      description:'A famous rice with meat full of spices started preparing during nizam period'
    },
    {
      name:'Noodles',
      img:'https://image.shutterstock.com/image-photo/chopsticks-take-chinese-noodles-sweet-260nw-1111644116.jpg',
      description:'A chinese-cusine dish which is ate with help of chop-sticks or fork'
    },
    {
      name:'bath/palav',
      img:'https://image.shutterstock.com/image-photo/home-made-vegan-vegetarian-vegetable-260nw-417335335.jpg',
      description:'A vegetarian dish with full of vegetables and spices'
    },
    {
      name:'Paneer-makhni',
      img:'https://image.shutterstock.com/image-photo/famous-indian-food-recipepaneer-butter-260nw-529460374.jpg',
      description:'A punjabi dish full of cottage cheese cubes with spices served with parota or fried rice'
    }
  ];
  constructor() { }
  sendRecipe(recipe){
    this.recipeData=recipe;
  }
  ngOnInit() {
  }

}
