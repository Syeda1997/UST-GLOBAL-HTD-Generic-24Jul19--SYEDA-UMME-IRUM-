var months=['jan','feb','mar','apr','may','jun','jul','aug','sept','oct','nov','dec']
var days=['sun','mon','tue','wed','thu','fri','sat']
var todaysDate=new Date();
console.log(todaysDate);
// var Date=new Date(milliseconds);
// console.log(Date);//return milliseconds
// var Date1=new Date1(year,month,day,hours,minutes,seconds,milliseconds);
// console.log(Date1)
// var Date2=new Date2(String)
// console.log(Date2)
var year=todaysDate.getFullYear()
console.log(year)
var month=todaysDate.getMonth()
console.log(month)
var Date=todaysDate.getDate()
console.log(Date)
var Day=todaysDate.getDay()
console.log(Day)
console.log("month ="+months[todaysDate.getMonth()])
console.log("Day ="+days[todaysDate.getDay()])

for(var i=0;i<months.length;i++)
{
    if(months==i)
    {
    console.log(months[i])
        for(var k=0;k<days.length;k++)
        {
            if(days==k)
            console.log(days[i])
        }
    }
}
console.log("====================================")

console.log(Math.PI)
console.log(Math.floor(4.5))
console.log(Math.ceil(4.6))
console.log(Math.round(4.8))
console.log(Math.pow(4,5))
console.log(Math.random())
console.log(Math.random(1,100)*10)
// var num=Math.random();
// console.log(num);
// num1=num*100;
// res=Math.floor(num1);
// console.log(res);
console.log(Math.floor(Math.random()*100))
        var number =10;
        var number1='10';
        if(number===number1)
        {
            console.log("equals");
        }else{
            console.log("not equal");
        }
console.log("==================================================")
console.log(typeof number);
console.log(typeof months);
var nz=null;
console.log(typeof nz);
var a='true';
console.log(typeof a);
var b=false;
console.log(typeof b);
var age=6
console.log((age>=18)?'Adult':'child')
var no=90
console.log((no>21)?'greater':(no===21)?'equal':'lesser')
console.log("==================================================")
var emp=[
        {name:'varun',
        age:29
        },
        {name:'deepika',
            age:34
        },
        {name:'bhagat singh',
            age:90
        }]
for(var i=0;i<emp.length;i++){
    console.log(emp[i]) 
}
console.log("==================================================")
var hobbies=['Cricket','dancing','painting']
for(var value of hobbies)
{
    console.log(value)
}
for(var index in hobbies)
{
    console.log(hobbies[index])
}
console.log("==================================================")
var person={
    name:'dhoni',
    age:22
}
for (var index in person)
{
    console.log(person[index])
}
console.log("==================================================")

        
