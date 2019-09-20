let resultData= new Promise(function(resolve,reject){
    if(10>10){
        reject('failed');
    }else{
        resolve('success');
    }
});
resultData.then((data)=>{
    console.log('then block=' +data);
}).catch((error)=>{
    console.log("catch block ="+error);
});

let employeeData= new Promise(function(resolve,reject){
    const employee=[
                    {
                        name:'john',
                        age:20
                    },
                    {
                        name:'tina',
                        age:30
                    }
    ];
    if(10>11){
        reject('failed');
    }else{
        resolve(employee);
    }
});
employeeData.then((data)=>{
    return data;
    // console.log('employee data=',data);
}).catch((error)=>{
    console.log("catch block ="+error);
}).then(function(data1){
    console.log('this is then block 2',data1);
});

function fact(n){
    if(n===0||n===1){
        return 1;
    }else{
        return fact(n-1)*n;
    }
}
let factorialValue=fact(0);
console.log(factorialValue);