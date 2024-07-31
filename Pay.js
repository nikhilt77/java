function whosPaying(names) {
    const n = names.length;
    const ind = Math.floor(Math.random() * n);
    const name = names[ind];
    return name + " is going to buy lunch today!";
}

// Example usage with user input
const userInput = prompt("Enter names separated by commas:");
const names = userInput.split(",");
alert(whosPaying(names));
