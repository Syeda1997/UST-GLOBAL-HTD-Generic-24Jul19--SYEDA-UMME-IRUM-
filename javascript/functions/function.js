var sumValue=function(num1,num2){
    if(num1!==undefined && num2!==undefined){
        sumValue = num1+num2;
        return sumValue
    }
}
sumValue(10,20)
console.log('sum='+sumValue)

var addData=function(num1,num2){
        sumValue = num1+num2;
        return sumValue
    }

var addValue=addData(10,20)
console.log('sum='+addValue);
console.log("==============================");
(function(num1,num2){
    var sumData=num1+num2;
    console.log(sumData);
}(10,20));

var sum1=(num1,num2)=>{
    var total=num1+num2
    return total
}
var value=sum1(10,20)
console.log(value)
console.log("==============================")

var sumVal=(num1,num2)=>num1+num2
var sumValue=sumVal(10,80)
console.log("s1="+sumValue)
var message='hello';
console.log(message);
message=message+'world';
console.log(message);
var message1=message;
console.log(message1)
message='hi';
console.log(message);
console.log(message1);
console.log("==============================")
var person1={
    name:"samantha",
    age:30,
    color:"white"
};
console.log(person1);
person1.name="kajal";
console.log(person1);
var person2=person1;
console.log(person1);
person1.name="rajini";
console.log(person1); 
console.log(person2);
console.log("==============================")
    // function first(){
    //     console.log(first)
    // }
    // function second(){
    //     console.log(second)
    // }
    // first();
    // second();
console.log("==============================")
// function first(){
//     setTimeout(function(){
//         console.log('first')
//     })
// }
// function second(){
//     console.log('second')
// }
// first();
// second();
// // call back function
console.log("==============================")
function first(callback){
    setTimeout(function(){
        console.log('first')
        callback();
    },1000);
    //console.log("this is first");
}
function second(){
    console.log('second')
}
first(second);