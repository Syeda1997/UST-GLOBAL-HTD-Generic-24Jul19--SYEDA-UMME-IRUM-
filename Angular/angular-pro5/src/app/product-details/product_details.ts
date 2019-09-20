export class Product{  //ng g class class_name to create a class
    constructor(
        public name:string,
        public img:string,
        public description:string,
        public id ?: string){ }
}