public class operator {
    static void main() {

//        example of arithmetic operstor

        int num1 = 25;
        int num2 = 15;

        int total = num1 + num2;
        int sub = num1 - num2;
        int div = num1 / num2;
        int mod = num1 % 7;

        System.out.println(total);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mod);

//        example of realtional operator

        int num3 = 35;
        int num4 = 64;

        boolean compare = num3 == num4;
        boolean greter_than_equal  = num3 <= num4;
        boolean not_equal = num3 != num4;

        System.out.println(compare);
        System.out.println(greter_than_equal);
        System.out.println(not_equal);

//        example logical operator

        boolean learn_dsa = true;
        boolean not_learn_lang = false;

        System.out.println(learn_dsa && not_learn_lang);
        System.out.println(learn_dsa || not_learn_lang);
        System.out.println(!not_learn_lang);

//        example of assignment operator

//        here we are assigning the value to the varibale with the use of (=) assignment operator
        int a = 10;

        a += 5;
        System.out.println(a);

        a -= 6;
        System.out.println(a);

        a /= 5;
        System.out.println(a);

//        example of unary operator

        int num7 = 5;

        int addd = +num7;
        System.out.println(addd);

        int minus = -num7;
        System.out.println(minus);

        System.out.println("INCREMENT EXAMPLE");
        int num8 = 15;
        System.out.println(++num8);
        System.out.println(num8);

        int num9 = 15;
        System.out.println(num9++);
        System.out.println(num9);  // now this give me the 16 bcoz the 16 is the new stored value in the variable num9

        System.out.println("DECREMENT EXAMPLE");
        int num11 = 56;
        System.out.println(--num11);
        System.out.println(num11);

        int num12 = 56;
        System.out.println(num12--);
        System.out.println(num12);
    }
}
