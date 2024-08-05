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
        if (args.length !== 1) {
            console.log('Please provide your age as a command line argument.');
            return;
        }

        const age = parseInt(args[0], 10);

        if (isNaN(age)) {
            console.log('Please provide a valid integer for age.');
            return;
        }

        validateAge(age);

    } catch (e) {
        if (e instanceof InvalidAgeException) {
            console.log('Invalid Age: ' + e.message);
        } else {
            console.log('An unexpected error occurred: ' + e.message);
        }
    }
}

const args = process.argv.slice(2);
main(args);
