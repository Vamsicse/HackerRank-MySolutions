import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxHourGlass =  Integer.MIN_VALUE;
        int rowLimit=arr.length;
        int colLimit=arr[0].length;
        for(int i=0;i<rowLimit-2;i++){
            for(int j=0;j<colLimit-2;j++){
                int currMaxHourGlass=arr[i+0][j+0] + arr[i+0][j+1] + arr[i+0][j+2]
                        +arr[i+1][j+1]
                        +arr[i+2][j+0] + arr[i+2][j+1] + arr[i+2][j+2];
                if(currMaxHourGlass>maxHourGlass){
                    maxHourGlass = currMaxHourGlass;
                }
            }
        }
        return maxHourGlass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
