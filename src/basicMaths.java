public class basicMaths {

    //    // print the digit of the number
//    static void printDigit(int num) {
//        // aage number 0 ho to ruk jaao
//        // ya phit aage num != 0 ho to process karte raho
//
//        while (num != 0) {
//            int digit = num % 10;
//            System.out.println(digit);
//            // last digit remove
//            num = num / 10;
//        }
//    }
//------------------------------------------------
//    // count the digit of a number
//    static int countDigit(int num) {
//        int count = 0;
//        while(num != 0) {
//            int digit =num % 10;
//            count++;
//            num /= 10;
//        }
//        return count;
//    }
//----------------------------------------------------------
//    // print the sum of the digit in a number
//    static int sumOfDigit(int num) {
//        int sum = 0;
//        while (num != 0) {
//            int digit = num % 10;
//            sum = sum + digit;
//            num = num/10;
//        }
//        return sum;
//    }
//-----------------------------------------------------------------
//    // reverse a number
//    static int reverseNum(int num) {
//        int revNum = 0;
//
//        while (num != 0) {
//            int digit = num % 10;
//            // ans = ans*10 + currentDigit
//            revNum = revNum * 10 + digit;
//            num = num / 10;
//        }
//        return revNum;
//    }
//-----------------------------------------------------
//    // check the number is palindrome or not
//    static boolean isPalindrome (int num) {
//        int originalNum = num;
//        int revNum = 0;
//
//        // add this is the munber is less then 0 or goes in the negative it show false
//        if (num < 0) {  // ADD HERE
//            System.out.println("This number is not a palindrome " + originalNum);
//            return false;
//        }
//        while (num != 0) {
//            int digit = num % 10;
//            revNum = revNum * 10 + digit;
//            num = num /10;
//        }
//        if (originalNum == revNum) {
//            System.out.println("This number is a palindrome " + originalNum);
//            return true;
//        }
//        else {
//            System.out.println("This number is not a palindrome " + originalNum);
//            return false;
//        }
//    }
//------------------------------------------------------------------------------------------
    //


    static void main() {

//        // print the digit of the number
//        int num = 546231;
//        printDigit(num);
//-------------------------------------------------------
//        // count the digit of a number
//        int num = 254637;
//        int ans = countDigit(num);
//        System.out.println(ans);
//-----------------------------------------------------------
//        // print the sum of the digit in a number
//        int num = 123456789;
//        int ans = sumOfDigit(num);
//        System.out.println(ans);
//    }
//-----------------------------------------------------------
//        // reverse a number
//        int num = -12345;
//        int ans = reverseNum(num);
//        System.out.println(ans);
//------------------------------------------------------
//        // check the number is palindrome or not
//        boolean ans = isPalindrome(-121);
//        System.out.println(ans);
//------------------------------------------------------
        //


    }
}
