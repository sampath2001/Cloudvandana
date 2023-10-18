//Perform sorting of an array in descending order.

function arrSort(arr) { 
    arr.sort((a,b)=>b-a); 
    return arr; 
}

const arr=[1,4,5,3,5,2,6,9,3,6];
console.log(arrSort(arr));