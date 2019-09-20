//getelementById()
let pElement=document.getElementById("demo");
console.log(pElement);
pElement.textContent='this is new p tag';
//getElementByClassName()
let divElements=document.getElementsByClassName('blue');
console.log(divElements);
let pElements=document.getElementsByTagName('p');
console.log(pElements);
let nameElements=document.getElementsByName('helement');
console.log(nameElements);
let demoElement=document.querySelector('#demo');
console.log(demoElement);
let blueClassElements=document.querySelectorAll('.blue');
console.log(blueClassElements);
let buttonElement=document.createElement('button');
buttonElement.textContent='click me';
console.log(buttonElement);
document.body.appendChild(buttonElement);
let spanEle=document.getElementById('demo');
spanEle.style.color='blue';
// buttonElement.className='add';
buttonElement.classList='add add1';

let pElementData=document.getElementById('demo1');
//pElementData.style.color='blue';
pElementData.className='blue';
pElementData.classList='blue add1';