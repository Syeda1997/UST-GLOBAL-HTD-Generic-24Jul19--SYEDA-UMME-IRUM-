export class User{  //ng g class class_name to create a class
    constructor(
        public name:string,
        public email:string,
        public PhNo:number,
        public id ?: string){ }
}