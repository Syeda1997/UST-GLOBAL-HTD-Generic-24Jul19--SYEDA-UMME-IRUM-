let sports=['badminton','cricket','swimming'];
sports.forEach(function(sporty,index){
    if(sporty.length>8)
    console.log(sporty);
});
let m1=Array.isArray(sports);
console.log(m1);
let m2=sports.includes('swimming',0);
console.log(m2);
let length=sports.push('football');
console.log(length);
let less=sports.pop();
console.log(less);
let unsh=sports.unshift('football');
console.log(unsh);
let sh=sports.shift();
console.log(sh);
let spl=sports.splice(1,2,'ruckby');
console.log(spl);
let sl=sports.slice(0,2);
console.log(sl);
let jo=sports.join('-');
console.log(jo);
let ind=sports.indexOf('badminton');
console.log(ind);
let spt=sports.map(function(value,index){
    value="game"+value;
    return value;
});
console.log(spt)

let fil=sports.filter((value)=>(value.length>5))
console.log(fil);

console.log('====================================');
let num=['2','4','6','8'];
num.forEach(function(numb,index){
    if(numb.length>4)
    console.log(numb);
});
let n1=Array.isArray(num);
console.log(n1);
let n2=num.includes('1',0);
console.log(n2);
let length1=num.push('12');
console.log(length1);
let less1=num.pop();
console.log(less1);
let unsh1=num.unshift('14');
console.log(unsh1);
let sh1=num.shift();
console.log(sh1);
let spll=num.splice(1,2,'22');
console.log(spll);
let sll=num.slice(0,3);
console.log(sll);
let joi=num.join('-');
console.log(joi);
let inde=num.indexOf('8');
console.log(inde);
let spt1=num.map(function(value,index){
    value="1" + value;
    return value;
});
console.log(spt1);
let filt=num.filter((value)=>(value.length>3))
console.log(filt);