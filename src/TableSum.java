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

        int[] sumArr = new int[3];
        int n = 0;

        do {
            for (int i = 0; i < numbers[n].length; i++) {
                sumArr[n] += numbers[n][i];
            }
            n++;
        } while (n < numbers.length);

        /*int table1 = IntStream.of(numbers[0]).sum();
        int table2 = IntStream.of(numbers[1]).sum();
        int table3 = IntStream.of(numbers[2]).sum();*/


        //int maxTable = max(table1, max(table2, table3));

        int maxValue = sumArr[0];
        int x = 1;
        do{
            if (maxValue < sumArr[x]){
                maxValue = sumArr[x];
            }
            x++;
        }while(x < sumArr.length);


        int noTable = 0;

        if(maxValue == sumArr[0]){
            noTable = 1;
        } else if (maxValue == sumArr[1]){
            noTable = 2;
        } else {
            noTable = 3;
        }

        System.out.println("Największa suma liczb jest w wierszu nr: " + noTable + " i wynosi: " + maxValue);

    }

}
