namespace MathOperations{
    export namespace rectangle{
        export function area(length:number,breadth:number){
            console.log('area of rectangle is'+length*breadth);
        }
        export function perimeter(length:number,breadth:number){
            console.log('perimeter is '+ 2*(length+breadth));
        }
    }
}