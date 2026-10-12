public class loop {
    static void main() {

        //    example of for loop
        System.out.println("EXAMPLE OF FOR LOOP");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value of i: " + i);
        }

        for (int i = 1; i <= 7; i++){
            System.out.println(i + " Abhishek pandey");
        }

        for (int i = 1; i <= 17; i += 2) {
            System.out.println(i);
        }

//        printing square pattern squaring nested loop
        System.out.println("HOW TO PRINT A SQUARE");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("EXAMPLE OF NESTED FOR LOOP");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++){
                System.out.println("i = " + i + ", j = " + j);
            }
        }

//        implementation of break keywords
        System.out.println("EXAMPLE OF BREAK");
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;       // this stop here printing and also did not include this number
            }
            System.out.println(i);
        }

        //        implementation of continue keywords
        System.out.println("EXAMPLE OF CONTINUE");
        for (int i = 1; i <= 10; i++){
            if (i == 9 || i == 4 || i == 6){
                continue;              // this skip the no. and continue printing
            }
            System.out.println(i);
        }

//        example of while loop
        System.out.println("EXAMPLE OF WHILE LOOP");
        int i = 5;
        while (i <= 46) {
            System.out.println(i);
            i++;
        }

//        how the nested while loop work
        System.out.println("EXAMPLE OF NESTED WHILE LOOP");
        int a = 1;
        while (a <= 5) {
            int b = 1;
            while (b <= 5) {
                System.out.println("i =" + a + ", j =" + b);
                b++;
            }
            System.out.println();
            a++;
            }


//        example of do while loop
        System.out.println("EXAMPLE OF DO WHILE LOOP");
        int x = 1;
        do {
            System.out.println(x);
            x++;
        }while(x <= 0);  // in this date the loop is not going to run but in the do while this is going to run once bcoz in this first it execute before checking the condtion


//        print all the integer number between (50 to 100) that are perfectly divisible by 7
        System.out.println("EXAMPLE OF QUESTION");
        for (int num = 50; num <= 100; num++) {
            if (num % 7 == 0) {
                System.out.println(num);
            }
        }

    }
}
