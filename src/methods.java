import org.w3c.dom.ls.LSOutput;

public class methods {

//        example of methods working
//    this is the declarition of the method
        static void print_2_table(){
            for(int i = 1; i <= 10; i++) {
                int ans =  2 * i;
                System.out.println(ans);
            }
        }

//        what is parameters and this is also a example of void type
        static void sum(int x, int y) { // this is parameters
            System.out.println("SUM = " + (x + y));
        }

//        non-void return type example
        static int add(int q, int w) {
            int sum = q + w;
            return sum;
        }

        static void main () {
            System.out.println("this is the table of 2");
//            this is the calling of the method
            print_2_table();
            System.out.println("this is the end to the table");

//            calling the parameter example
            sum(4,14);  // this arguments

            //        calling the non-void return type
            int result = add(5,6);
            System.out.println("Sum = " + result);
        }


}
