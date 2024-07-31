var count=1;
var arr=[];
function Fizzbuzz(){
    if(count%3===0){
        arr.push("Fizz");
    }
    else{
        arr.push(count);
    }
    console.log(arr);
    count++;
}
for(let i=0;i<=15;i++){
    Fizzbuzz();
}
