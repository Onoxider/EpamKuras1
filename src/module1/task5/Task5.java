package module1.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yokuras on 09.06.2017.
 */
public class Task5 {
    public static void main(String[] args) {

        int a = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите размерность матрицы:");
            a = Integer.parseInt(br.readLine());

        } catch (IOException ex) {
        }

        int[][] matrix = new int[a][a];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j) {
                    matrix[i][j] = 1;
                }else if(i == matrix.length - j - 1) {
                    matrix[i][j] = 1;
                }
                else matrix[i][j] = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }

    }
}
