import java.util.Scanner;

public class takingInput {
    static void main() {

//        this is hard-coded
        int a = 5;
        int b = 6;
        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int firstnum = sc.nextInt();
        System.out.println("Enter your second number: ");
        int secondnum = sc.nextInt();
        int find = firstnum + secondnum;
        System.out.println("Answer is: " + find);

        sc.close();  //this is mainly use for not leaking the information ans also this is the good practice acc.  to developers
    }
}


//JAVA GARBAGE COLLECTOR

//Interview answer: Garbage collection in Java is an automatic memory-management process
//that reclaims memory occupied by objects that are no longer reachable.

//Think of it like cleaning your room: when something is no longer needed, you clear it away to make space.