import java.util.Scanner;

public class arrays {

    static void main() {
        // declartion
        int array[];

        // alloction
        array = new int[5];
//------------------------------------------------------------------
        // initialization
        int brr[] = {1,2,3};

        // accessing the elements
//        System.out.println("Value at 0 index : " + brr[0]);
//        System.out.println("Value at 1 index : " + brr[1]);
//        System.out.println("Value at 2 index : " + brr[2]);

        // access by for loop
//        System.out.println("access by for loop");
//        int n = brr.length;
//        for (int index = 0; index <= n-1; index++) {
//            System.out.println(brr[index]);
//        }

        // access by for loop
//        System.out.println("access by for each loop");
//        for (int val : brr) {
//            System.out.println(val);
//        }
//------------------------------------------------------------------------------------------
        // takingInput in array
        // creating array
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("takingInput in array: ");
//        int num = arr.length;
//        // input
//        for (int i=0; i<num; i++) {
//            System.out.println("Provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//        // print
//        for (int val : arr) {
//            System.out.println(val);
//        }

//-------------------------------------------------------------------------------
//        practice

//        System.out.println("do the sum of the array elements");
//        int arrs[] = {1,2,3,4,5,6,7,8,9,10};
//        int sum = 0;
//        int n = arrs.length;
//        for (int i=0; i<n; i++) {
//            sum += arrs[i];
//        }
//        System.out.println(sum);

//        System.out.println("do the sum of the array elements");
//        int arrm[] = {6,7,8,9};
//        int mul = 1;
//        int n = arrm.length;
//        for (int val: arrm) {
//            mul *= val;
//        }
//        System.out.println(mul);

//        System.out.println("Find the max value in the array");
//        int arrmax[] = {4,5,-9,7,6,-47,34};
//        int n = arrmax.length;
//        int max  = arrmax[0];
//        for (int i = 0 ; i < n; i++) {
//            if (max < arrmax[i]) {
//                max = arrmax[i];
//            }
//        }
//        System.out.println(max);

        System.out.println("Find the min value in the array");
        int arrmin[] = {4,5,-9,7,1,-47,34};
        int n = arrmin.length;
        int min  = arrmin[0];
        for (int i = 0 ; i < n; i++) {
            if (min > arrmin[i]) {
                min = arrmin[i];
            }
        }
        System.out.println(min);


    }
}
