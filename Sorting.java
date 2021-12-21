import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" dizinin boyutu");
        int num = input.nextInt();
        int[] arr = new int[num];
        System.out.println(" dizinin elemanlarini giriniz");

        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();

        }
        for (int i = 0; i < num; i++) {
            System.out.println(i+1 + ".Elemani:   " + arr[i] );

        }
        Arrays.sort(arr);
        System.out.print("Siralama:" );

        for (int i = 0; i < num; i++) {
            System.out.print( arr[i] + " ");

        }
    }
}
