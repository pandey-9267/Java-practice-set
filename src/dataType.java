public class dataType {
    static void main() {

        //Numberic data type
        int age = 25;
        System.out.println(age);

        byte num1 = 127;
        System.out.println(num1);

        short num2 = 27152;
        System.out.println(num2);

        long num3 = 74185292;
        System.out.println(num3);


        // floting data type
//   adding f in the nd is mandortory
        float num6 = 25.6f;
        System.out.println(num6);

        double num7 = 3.01457956655245522;
        System.out.println(num7);

        //  non-numeric

        char name  = 'a';
        System.out.println(name);

//        ASCII is the specific value specification to a character
        char ASCII = 65;
        System.out.println("65 is the ASCII value of: " + ASCII);

        boolean eligible_To_Vote = true;
        System.out.println(eligible_To_Vote);

//        how implicit and explicit work
//        implicit
        int num11 = 125;
        long value = num11;
        System.out.println(value);

//        explicit
//        here we have to force the for the conversion bcoz some time there is a loos of data

//        this give an error bcoz the long have to much data than the limit of the int
//        long num13 = 123456789;
//        int val = num13;
//        System.out.println(val);

//        for not getiing error and convert it successfully
/*        by adding the data type in the very left of the variable like this convert
          that forcefully to that data type without data looe    */
        long num14 = 145789993;
        int val1 = (int)num14;
        System.out.println(val1);
    }
}

//there is a table where the data type byte and size are mention