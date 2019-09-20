// let myName='syeda';
// console.log(myName);
// alert(myName);
// let company;
// company='ust';
// company=44;
// console.log(company);
// console.log(myName);

// let sample: number |boolean;//unions
// sample=10;
// sample=true;
// console.log(sample);

// let myarray : string[]=['kjhgfy','khygi'];
// console.log(myarray);
// let mytuple:[string,number,boolean]=['',2333,true];//whatever we specify we have to pass it in same order

// enum colors{
//     red='danger',
//     green='success',
//     black='dark'
// }
// console.log(colors.black);

// class Person{
   
//     constructor(public personname:string,public personage:number){
        
//     }
// }
// let person=new Person('raj',23);
// console.log(person.personage);
// let myname='raj';
// myname=null;
// class Car{
//     constructor(public brand: string,public model:string){

//     }
// }
// let bmwcar=new Car('bmw','x5');//creating objects with new keyword
// console.log(bmwcar.brand);
// console.log(bmwcar.model);

// let benzcar: Car={//object creation without new keyword
//     brand:"benz",
//     model:'0002'
// }

// class Person{
//     constructor(public name:string,public age:number){}
// }
// class Student extends Person{
//     constructor(public myname: string,public myAge:number,public usn:number){
//         super(myname,myAge);
//     }
// }
// let person1=new Person('dinga',23);
// let student1=new Student('dingi',14,9878987);
// console.log(student1.usn);
// class Person{
//     constructor(public name:string,public age:number ,public degree?:string){}
// }
// let Person1:Person={
//     name:'raj',
//     age:12
// }

//interface

// interface student{
//     name:string;//only declaration is done in interface can't do initialization
//     age:number;
//     printdetails():void;
// }
// class Person implements student{
//     name='raj';
//     age=23;
//     printdetails(){
//         console.log('my name is' + this.name + 'age is' + this.age);
//     }
// }
// let person1=new Person;
// person1.printdetails();

// let student1:student={
//     name:'xyz',
//     age:23,
//     printdetails:()=>{
//             console.log('my name is' + student1.name + 'age is' + student1.age);
    
//     }
// }
// student1.printdetails();

//generics

// function getarray<p>(items:p[]):p[]{
//     return new Array<p>().concat(items);
// }

// let strArray=getarray<string>(['abc' , 'efg','hij']);
// let numarray=getarray<number>([123,456,789]);
// numarray.push(987);
// console.log(numarray);

//syntax to import other files
///<reference path="./circle.ts" />
///<reference path="./rectangle.ts" />
MathOperations.Circle.circumferenceofcircle(2);
MathOperations.rectangle.area(2,2);