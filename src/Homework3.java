import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of lines");
        int lines = scan.nextInt();
        System.out.println("Please enter number of columns");
        int columns = scan.nextInt();
        int[][] array = new int[lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();


        }
        //----------------------------------------------------
        //1.
        int sum = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    if (array[i][j] % 2 == 0) {
                        sum += array[i][j];
                    }
                }
            }
        }
        System.out.println("Sum of even main diagonal elements = " + sum);
        System.out.println("----------------------------------------");

        //2.------------------------------------------------------
        System.out.println("Odd elements under main diagonal:");
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i][j] % 2 != 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("----------------------------------------");

        //3.------------------------------------------------------

        int product = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    product *= array[i][j];
                }
            }
        }
        System.out.println("Product of main diagonal = " + product);
        int product2 = 1;
        for (int i = 0; i < lines; i++) {
            for (int j = columns - 1 - i; j >= 0; j--) {
                product2 *= array[i][j];
                break;
            }
        }
        System.out.println("Product of second diagonal = " + product2);
        if (product > product2) {
            System.out.println("Product of main diagonal is bigger");
        } else {
            System.out.println("Product of second diagonal is bigger");
        }

        //4.------------------------------------------------------
        System.out.println("----------------------------------------");
        System.out.print("Sum of even elements over second diagonal = ");
        int sum3 = 0;
        for (int i = 0; i < lines; i++) {
            for (int j = columns - 2 - i; j >= 0; j--) {
                if (array[i][j] % 2 == 0) {
                    sum3 += array[i][j];
                }
            }
        }
        System.out.println(sum3);
        System.out.println("----------------------------------------");
        //5.------------------------------------------------------
        System.out.println("Transformed matrix:");
        int[][] array2 = new int[lines][columns];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                array2[j][i] = array[i][j];
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }

    }

}
