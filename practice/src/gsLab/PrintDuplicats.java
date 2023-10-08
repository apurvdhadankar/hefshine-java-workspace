package gsLab;

import java.util.Scanner;

public class PrintDuplicats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int x = sc.nextInt();
        int[] arr = new int[x];

        System.out.print("Enter " + x + " values: ");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            int numDups = 0;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    numDups++;
                }
            }
            if (numDups == 1) {
                System.out.print(" " + arr[i]);
            }
        }
        System.out.println();
    }
}




