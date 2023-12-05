// Importing the Random class to generate random numbers
import java.util.Random;

// This class generates random numbers and starts new threads to calculate their squares or cubes
class RandomNumberGenerator implements Runnable {
    // Creating a Random object to generate random numbers
    private Random random = new Random();
    // Counter to keep track of the number of random numbers generated
    private int counter = 0;
    // Limit for the number of random numbers to generate
    private int limit = 10;
    // Lock object for synchronization
    private final Object lock = new Object();

    // The run method is called when the thread starts
    public void run() {
        // Keep generating random numbers until the limit is reached
        while (counter < limit) {
            try {
                // Pause for 2 seconds
                Thread.sleep(2000);
                // Generate a random number between 0 and 99
                int randomnumber = random.nextInt(100);

                // Print the random number
                System.out.println("Random Number : " + randomnumber);

                // If the random number is even and less than 100, calculate its square
                if (randomnumber % 2 == 0 && randomnumber < 100) {
                    // Synchronize on the lock object to prevent race conditions
                    synchronized (lock) {
                        // Start a new thread to calculate the square of the random number
                        Thread evenThread = new Thread(new Square(randomnumber));
                        evenThread.start();
                    }
                } else {
                    // Synchronize on the lock object to prevent race conditions
                    synchronized (lock) {
                        // Start a new thread to calculate the cube of the random number
                        Thread oddThread = new Thread(new Cube(randomnumber));
                        oddThread.start();
                    }
                }
                // Increment the counter
                counter++;
            } catch (InterruptedException e) {
                // Print the stack trace for the InterruptedException
                e.printStackTrace();
            }
        }
    }
}

// This class calculates the square of a number
class Square implements Runnable {
    // The number to square
    private int number;

    // Constructor that takes the number to square
    public Square(int number) {
        this.number = number;
    }

    // The run method is called when the thread starts
    public void run() {
        // Print the square of the number
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

// This class calculates the cube of a number
class Cube implements Runnable {
    // The number to cube
    private int number;

    // Constructor that takes the number to cube
    public Cube(int number) {
        this.number = number;
    }

    // The run method is called when the thread starts
    public void run() {
        // Print the cube of the number
        System.out.println("Cube of " + number + " = " + (number * number * number));
    }
}

// The main class
public class MultiThreadSynchronized {
    // The main method
    public static void main(String args[]) {
        // Start a new thread to generate random numbers
        Thread randomThread = new Thread(new RandomNumberGenerator());
        randomThread.start();
    }
}
