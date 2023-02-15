import java.util.Scanner;
import java.util.*;


class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];


        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }


        //print the numbers in array
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}


