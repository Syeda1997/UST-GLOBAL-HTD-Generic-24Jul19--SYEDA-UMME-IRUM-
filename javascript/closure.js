function sum(a,b){
    function addsum(){
        return a+b;
    }
    return addsum;
}
var addfunc=sum(10,20);
var total=addfunc;
console.log(total);
console.log("===========================")
console.log(window)
console.log(this)
console.log(this===window)
var name='khan';
console.log(window.name);
console.log(this.name);

var person={
    name:'Dulquer salman',
    age:30,
    getName :function(){
        console.log(this);
        console.log(window);
        getData();
        function getData(){
            console.log('get Data method'+this)
        }
        return this.name;
    }
}
var p=person.getName();
console.log(p);
console.log("================================")
var person={
    name:'Dulquer',
    age:30,
    getName :function(){
        console.log("getname method",this.name);
        console.log(window);
        function getData(){
            console.log("getdata method",this.name);
        }
        return this.name;
    }
}
console.log(person.getName());
console.log("================================")
// for(var i=0;i<5;i++){
//     console.log(i);
// }
// for(let j=0;j<5;j++){
//     console.log(j);
// }
var hobbies=['dancing','swimming','singing'];
console.log(hobbies);
var hobbies=['numismatics']
console.log(hobbies);
hobbies=['cooking'];
console.log("================================")
let fruits=['orange','banana'];
console.log('fruits',+fruits);
fruits=['jackfruit'];
console.log(fruits);
console.log("================================")
const sports=['carrom','criccket'];
console.log(sports);
sports[1]=['ludo'];
console.log(sports);