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
//        // add this is the number is less then 0 or goes in the negative it show false
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
    //check the number is prime or not
    static boolean isPrimeOrNot(int num){
        for (int i = 2; i <= num-1; i++) {
         //   se this for better time complexity
         // for (int i = 2 ; i * i <= num; i ++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
//--------------------------------------------------------------------
//    // GCD of number (HCF)
//    static int getGCD(int a, int b) {
//
//        while(b != 0) {
//            int ofValueOfb = b;
//            b = a%b;
//            a = ofValueOfb;
//        }
//        int ans = a;
//        return ans;
//    }
//-------------------------------------------------------------
//    static int getLCM(int a, int b) {
//        int gcd = getGCD(a,b);
//        int prod = a*b;
//        int lcm = prod/gcd;
//        return lcm;
//    }
//-------------------------------------------------------------
//       // Armstrong number
//      static boolean armstrongNo(int num) {
//
//          int originalNO = num;
//          int sum = 0;
//
//          if (num < 0){
//              return false;
//          }
//
//          while (num != 0) {
//              int digit = num % 10;
//              sum = sum + (digit*digit*digit);
//              num = num / 10;
//          }
//
//          if (originalNO == sum) {
//              return true;
//          }
//          else {
//              return false;
//          }
//      }
//-------------------------------------------------------------
//        // find all divisors or perfect number
//        static boolean checkPerfectNumber(int num) {
//            int sum = 1;
//            for (int i = 2; i * i <= num; i ++) {
//                if (num % i == 0) {
//                    int firstFactor = i;
//                    int secondFactor = num/i;
//                    sum = sum + firstFactor + secondFactor;
//                }
//            }
//            if (sum == num) {
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
//-------------------------------------------------------------
        // count primes




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
        //check the number is prime or not
        int num = 3;
        System.out.println(isPrimeOrNot(num));
//------------------------------------------------------
//        // GCD of number
//        System.out.println(getGCD(18,12));
//------------------------------------------------------
//        // GCD of number
//        System.out.println(getLCM(18,12));
//------------------------------------------------------
//        // Armstrong number
//        System.out.println(armstrongNo(-153));
//------------------------------------------------------
//        // find all divisors or perfect number
//        System.out.println(checkPerfectNumber(1));
//------------------------------------------------------
        // count primes


    }

}
