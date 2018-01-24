import java.util.Scanner;
import java.util.stream.IntStream;
import static java.lang.Math.*;

public class TableSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[3][3];
        System.out.println("Podaj 9 liczb: ");
        numbers[0][0] = sc.nextInt();
        numbers[0][1] = sc.nextInt();
        numbers[0][2] = sc.nextInt();
        numbers[1][0] = sc.nextInt();
        numbers[1][1] = sc.nextInt();
        numbers[1][2] = sc.nextInt();
        numbers[2][0] = sc.nextInt();
        numbers[2][1] = sc.nextInt();
        numbers[2][2] = sc.nextInt();

        int table1 = IntStream.of(numbers[0]).sum();
        int table2 = IntStream.of(numbers[1]).sum();
        int table3 = IntStream.of(numbers[2]).sum();

       // System.out.println(table1);
       // System.out.println(table2);
       // System.out.println(table3);

        int maxTable = max(table1, max(table2, table3));
       // System.out.println(maxTable);

        int noTable = 0;

        if(maxTable == table1){
            noTable = 1;
        } else if (maxTable == table2){
            noTable = 2;
        } else {
            noTable = 3;
        }

        System.out.println("Największa suma liczb jest w wierszu nr: " + noTable + " i wynosi: " + maxTable);

    }

}
