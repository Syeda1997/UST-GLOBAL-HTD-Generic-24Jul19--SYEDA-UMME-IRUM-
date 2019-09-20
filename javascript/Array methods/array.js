var sports=['carrom','football','badminton']
sports.forEach(function(value,index){
    if(value.length>7){
    console.log(value);
    }
})
console.log("==============================")
console.log(myname);
var myname='syeda';
console.log("==============================")
function getage(){
    console.log(age);
    var age=10;
}
getage();
console.log("==============================")
var check=Array.isArray(sports);
console.log(check);
console.log("==============================")
var check1=sports.includes('volleyball',1);
console.log(check1);
console.log("==============================")
sports.push('volleyball','swimming');
console.log(sports);
// console.log(sports);
console.log("==============================")
sports.pop();
console.log(sports);
console.log("==============================")
sports.unshift('cooking');
console.log(sports);
console.log("==============================")
sports.shift()
console.log(sports);
console.log("==============================")
console.log(sports.splice(0,2,'tennis','ruckby'));
console.log(sports);
// console.log(sports.splice(0,0));delete all elements in array
console.log("==============================")
console.log(sports.slice(0,3));
// console.log(sports.slice(0,0));delete all elements in array
console.log("==============================")
console.log(sports.join('-'));
console.log(sports.join());
console.log(sports.join('--------'));
console.log("==============================")
console.log(sports.indexOf('badminton'));
console.log("==============================")
var nums=[10,20,30,40];
var num1=[]
var num1=nums.map(function(value,index){
    value=value+10;
    return value;
})
console.log(num1);
//var num1=num.map((mapnum=>(mapnum+10)))
console.log("==============================")
var num2=[];
var num2=num1.filter(function(value){
    return value>20;
})
console.log(num2);
// var num2=nums.filter((filternums=>(filternums>20)));


//map function
var items=[{
    name:'lipstick',
    price:90,
    id:1
},
{name:'watch',
    price:100,
    id:2
},
{
    name:'perfume',
    price:190,
    id:3
}];
var newitems=items.map(function(items){
    items.price=items.price+100;
    return items;
});
console.log(newitems);

console.log("=================================")
//filter method
var filter=items.filter(function(items){
    var itemsfilter=items.price>100 && items.name.length>7;
    return itemsfilter;
});
console.log(filter),