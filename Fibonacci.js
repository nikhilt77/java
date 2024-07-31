function fibonacciGenerator(n) {
    var arr = [];
    
    if (n === 1) {
        arr.push(0);
    } else if (n === 2) {
        arr.push(0);
        arr.push(1);
    } else {
        arr.push(0);
        arr.push(1);
        for (var i = 2; i < n; i++) {
            arr.push(arr[arr.length - 1] + arr[arr.length - 2]);
        }
    }
    
    return arr;
}

const n = parseInt(prompt("Enter the number of Fibonacci numbers to generate:"));
alert(fibonacciGenerator(n));
