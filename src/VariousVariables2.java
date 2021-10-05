import java.util.Scanner;

public class VariousVariables2 {
    public static void main(String[] args) {
        //declare variables here before we use them
        Scanner keybd = new Scanner(System.in);
        int x, y, answer;
        //all three variable will be declared as integers
        double temperature;
        float Temperature, gpa;
        //a float uses less memory than a double
        String firstName, lastName;
        String question = "unknown";    //question is initialized</p>
        //assign values to the variables here
        x = 99;
        y = 2147483647;
        answer = 42;
        firstName = "James";
        lastName = "Gosling";

        temperature = 98.6;
        Temperature = 32.0f;
        // Ask for the last movie watched
        System.out.println(firstName + " what is the last movie you watched?");
        question = keybd.nextLine();
        System.out.println("Last question, " + firstName + ", What is your GPA?");
        gpa = keybd.nextFloat();

        //Use the variables here
        System.out.println("The variable x contains a value of " + x);
        System.out.print("The value " + y + " is the largest value");
        System.out.println("you can store in an integer.");
        System.out.println("The answer to the question is: " + answer);
        System.out.println("If you're not sick your temperature is " + temperature);
        System.out.println("If you're an ice cube your temperature is " + Temperature);
        System.out.println("The variable Temperature is not " + "the same as temperature");
        System.out.println("The founder of Java is " + firstName + " " + lastName); //Add a space between first and last name
        System.out.println("The last movie you watched is: " + question);
        System.out.println("Your GPA is: " + gpa);

    }
}
