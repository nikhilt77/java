class InvalidAgeException extends Error {
    constructor(message) {
        super(message);
        this.name = 'InvalidAgeException';
    }
}

function validateAge(age) {
    if (age < 18) {
        throw new InvalidAgeException('Age must be 18 or older.');
    }
    console.log('Age is valid. You are eligible.');
}

function main(args) {
    try {
        // Check if there is exactly one command line argument
        if (args.length !== 1) {
            console.log('Please provide your age as a command line argument.');
            return;
        }

        // Parse the command line argument as an integer
        const age = parseInt(args[0], 10);

        // Handle the case where the argument is not a valid integer
        if (isNaN(age)) {
            console.log('Please provide a valid integer for age.');
            return;
        }

        // Validate age and raise exception if it's less than 18
        validateAge(age);

    } catch (e) {
        // Handle the custom exception for invalid age
        if (e instanceof InvalidAgeException) {
            console.log('Invalid Age: ' + e.message);
        } else {
            // Handle any other unexpected errors
            console.log('An unexpected error occurred: ' + e.message);
        }
    }
}

// Simulate command line arguments
const args = process.argv.slice(2);
main(args);
