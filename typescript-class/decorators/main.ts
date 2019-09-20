function printConstructor(cons: Function){
    console.log(cons);
}
@printConstructor
class sample{
    constructor(){
        console.log('hi hello i am sample constructor')
    }
}