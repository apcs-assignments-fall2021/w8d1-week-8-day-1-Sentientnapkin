import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
        while (true) {
            int random = (int)(Math.random() * 21 + 1);
            if (random >= 10)
                return random;
        }
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        // YOUR CODE HERE FOR WARMUP
        int x1 = randomTeen();
        int x2 = randomTeen();
        int x3 = randomTeen();
        System.out.println("The three random numbers are "+x1+", "+x2+", "+x3);
        System.out.println("The largest number is "+Math.max(Math.max(x1,x2),x3));
        System.out.println("The smallest number is "+Math.min(Math.min(x1,x2),x3));




         System.out.println("Mathey.max tests");
         System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2
        System.out.println(Mathey.max(1.0, 2.0)); // 2.0
        System.out.println(Mathey.max(2.0, 1.0)); // 2.0
        System.out.println(Mathey.max(1, 2, 3)); // 3
        System.out.println(Mathey.max(3, 2, 1)); // 3
        System.out.println(Mathey.max(1.0, 2.0, 3.0, 4.0)); // 4.0
        System.out.println(Mathey.max(4.0, 3.0, 2.0, 1.0)); // 4.0

        System.out.println("Mathey.randomInteger tests");
        System.out.println(Mathey.randomInteger(1,7)); //random num between 1 and 7
        System.out.println(Mathey.randomInteger(3,10)); //random num between 3 and 10
        System.out.println(Mathey.randomInteger(10)); //random num between 0 and 10
        System.out.println(Mathey.randomInteger(3)); //random num between 0 and 3

        System.out.println("Mathey.pow tests");
        System.out.println(Mathey.pow(2,8)); //256
        System.out.println(Mathey.pow(7,23)); //should be really big

        System.out.println("Mathey.abs tests");
        System.out.println(Mathey.abs(-43)); //43
        System.out.println(Mathey.abs(63)); //63

        System.out.println("Mathey.round tests");
        System.out.println(Mathey.round(2.5)); //3
        System.out.println(Mathey.round(3.4)); //3

        System.out.println("Mathey.floor tests");
        System.out.println(Mathey.floor(2.5)); //2
        System.out.println(Mathey.floor(3.4)); //3

        System.out.println("Mathey.ceil tests");
        System.out.println(Mathey.ceil(2.5)); //3
        System.out.println(Mathey.ceil(3.4)); //4
        System.out.println("Pythagorean Theorem");
        System.out.println(Mathey.sqrt((double)(Mathey.pow(5,2)+Mathey.pow(12,2)))-(Mathey.sqrt((double)(Mathey.pow(5,2)+Mathey.pow(12,2)))%0.0001));
    }

}


