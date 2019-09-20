var MathOperations;
(function (MathOperations) {
    var rectangle;
    (function (rectangle) {
        function area(length, breadth) {
            console.log('area of rectangle is' + length * breadth);
        }
        rectangle.area = area;
        function perimeter(length, breadth) {
            console.log('perimeter is ' + 2 * (length + breadth));
        }
        rectangle.perimeter = perimeter;
    })(rectangle = MathOperations.rectangle || (MathOperations.rectangle = {}));
})(MathOperations || (MathOperations = {}));
