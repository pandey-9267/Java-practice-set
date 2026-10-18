import java.util.Scanner;

public class arrays {

    static void main() {
        // declartion
        int array[];

        // alloction
        array = new int[5];

        // initialization
        int brr[] = {1,2,3};
//------------------------------------------------------------------
        // accessing the elements
        System.out.println("Value at 0 index : " + brr[0]);
        System.out.println("Value at 1 index : " + brr[1]);
        System.out.println("Value at 2 index : " + brr[2]);
//----------------------------------------------------------------------
        // access by for loop
        System.out.println("access by for loop");
        int n = brr.length;
        for (int index = 0; index <= n-1; index++) {
            System.out.println(brr[index]);
        }
//----------------------------------------------------------------------------
        // access by for loop
        System.out.println("access by for each loop");
        for (int val : brr) {
            System.out.println(val);
        }
//------------------------------------------------------------------------------------------
        // takingInput in array
        // creating array
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("takingInput in array: ");
        int num = arr.length;
        // input
        for (int i=0; i<num; i++) {
            System.out.println("Provide input for index " + i);
            arr[i] = sc.nextInt();
        }
        // print
        for (int val : arr) {
            System.out.println(val);
        }

    }
}
