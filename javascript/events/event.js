// function sayHello(){
//     alert('hello!!!!');
// }
// let buttonElement=document.getElementById('clickbutton');
// buttonElement.onclick=function(){
//     alert('hello world');
//}
function createPElement(){
    let pElementData=document.createElement('p');
     pElementData.textContent='this is p element';
     document.body.appendChild(pElementData);
 }
let alertElement = document.getElementById('alertHi');
alertElement.addEventListener('click',function(){
alert('Good Morning');
});

let h1Element=document.createElement('h1');
function showText(){
    let inputElement=document.getElementById('showData');
    console.log(inputElement.value);
    h1Element.textContent=inputElement.value;
    document.body.appendChild(h1Element);
}