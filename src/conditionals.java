import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {

//        example of if statement
        System.out.println("example of if statement--------------");
        int age = 25;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }

//        exmaple of if-else statement
        System.out.println("example of if-else statement----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = sc.nextInt();

//        int marks = 98;
        if (marks >= 45) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


//        example of if-else-if ladder
        System.out.println("example of if-else-if ladder--------------");
        System.out.println("Enter your marks to check your grade");
        int grade  = sc.nextInt();
        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 75) {
            System.out.println("B");
        } else if (grade >= 55) {
            System.out.println("C");
        } else if (grade >= 33) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }

//        example of nested if-else
        System.out.println("exmaple of nested if-else--------------");
        boolean hasGamePass = true;
        int clearedLevel = 150;
        if (hasGamePass) {
            if (clearedLevel >= 100) {
                System.out.println("Eligible for fight with king");
            } else {
                System.out.println("Need to cleared atlest 100 level");
            }
        }
        else {
            System.out.println("Upgrade to premium");
        }

//        exmaple of ternary operator
        System.out.println("Exmaple of ternary operator---------------");
        int lic = 22;
        String eligible = (lic > 18) ? "You are eligilbe for licence" : "You are not eligible for Licence" ;
        System.out.println(eligible);

//        example of switch case
        System.out.println("Enter the value of day--------------------------");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:   // not madantory
                if (day == 7) {
                    System.out.println("Sunday");
                } else {
                    System.out.println("Invalid day");
                }
        }
        sc.close();
    }
}
