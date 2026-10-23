import java.util.Locale;
import java.util.Scanner;

public class string {
    static void main() {

//        This is how we create a Stirng
//        String firstname = "Abhishek";
//        String lastname = new String("pandey");
//        System.out.println(firstname + " " + lastname);
//-----------------------------------------------------------------------
//        This is how we acces the character of the String
//        System.out.println(firstname.charAt(5));
//---------------------------------------------------------------------------
//        comparing string
//        String n = "Abhi";
//        String n1 = "abhi";
//        System.out.println(n.equals(n1));  // this is case-sensitive
//        System.out.println(n.equalsIgnoreCase(n1));  // this is case-sensitive
//------------------------------------------------------------------------------
//        How to take input
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("provide the string content by using next() we only read the first word");
//        String str = sc.next();
//        System.out.println("value of next() : " + str);
//        sc.nextLine();      // use this when you are using next() first then nextLine()
//        System.out.println("provide the string content by using nextLine() we can read the whole line");
//        String str1 = sc.nextLine();
//        System.out.println("value of next() : " + str1);
//-----------------------------------------------------------------------------------
//        Common String methods
//        String string = "Abhishek pandey";
////        .length()
//        System.out.println("the length of the string : " + string.length());
////        .charAt(int index)
//        System.out.println("The char at 5 : " + string.charAt(5));
////        comparing string
//        String n = "Abhi";
//        String n1 = "abhi";
//        System.out.println(n.equals(n1));
//        System.out.println(n.equalsIgnoreCase(n1));
////        .isempty() means the string have nothing inside but spaces are also count as something in the string
//        String emp = "  ";
//        System.out.println(emp.isEmpty());
////        .isblank()  it means empty or sirf blank ha string
//        System.out.println(emp.isBlank());
////        .trim() it remove the extra spaces from starting and ending
//        String name0 = "  Abhishek PAndey  ";
//        System.out.println(name0);  // how it print if we not use
//        System.out.println(name0.trim());  // and if we use
////        these will help to convert all the chat into upper case and lower case
//        String naam = "Abhishek";
//        System.out.println( naam.toUpperCase());
//        System.out.println(naam.toLowerCase());
////        .subStirng() by this we can get the substring from the string
//        System.out.println(string.substring(4,12));  // but (this is included , and this is excluded)
////        .contains() this is how we find that this word is in the string or not
//        System.out.println(string.contains("hish"));
////        .valueof() how to convert any data in string
//        int nums = 25631;
//        String str = String.valueOf(nums);
//        System.out.println(nums + 1); // here this perform as a int
//        System.out.println(str + 1);  //  but this will work as a concatenation bcoz we convert that into String
////        we can also check is this start with this or not // and also can check its end with or not
//        System.out.println(string.startsWith("Abhoi"));
//        System.out.println(string.endsWith("dey"));
////        How to convert String into a char array
//        char[] crr = string.toCharArray();
////        then print this
//        for (char ch: crr) {
//            System.out.println("Value of char: " + ch);
//        }
////        this is how we split the output into the String array
//        String info = "My,name,is,Abhishek,pandey";
//        String[] strr = info.split(",");
////        then print this
//        for (String val: strr) {
//            System.out.println(val);
//        }
////        replace the old char into new char
//        System.out.println(string.replace('A', 'H'));
//==============================================================================
//        Practice
////        Print each character of the string
//        String str = "Abhishek";
//        for (int i=0; i<str.length(); i++) {
//            System.out.println(str.charAt(i));
//        }
//======================================================================================
////        count the length of the String without .lenght()
//        String str = "Abhishek";
//        char[] arr = str.toCharArray();
//        int count = 0;
//        for (char ch: arr) {
//            count++;
//        }
//        System.out.println("the length of the string : " + count);
//============================================================================================
////        how many vowel in the string count that
//        String str = "Abhishek";
//        int count = 0;
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'
//            || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                count++;
//            }
//        }
//        System.out.println(count);
//======================================================================================================
////        How to reverse a String
//        String str = "Abhishek";
//        for(int i=str.length()-1; i>=0; i--) {
//            System.out.print(str.charAt(i));
//        }
//=====================================================================================================
//        Check the string is palindrome or not
        String str = "RACECAR";
        String rev = "";
        for(int i=str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("this is palindorme");
        } else {
            System.out.println("this is not palindorme");
        }





    }
}
