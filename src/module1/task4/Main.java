package module1.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yokuras on 13.06.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите размерность массива: ");
        int a = Integer.parseInt(br.readLine());
        double [] arr = new double[a];

        System.out.println("Введите числа в массиве");
        for (int i = 0; i < a; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        double max = Double.MIN_VALUE;
        for (int i = 0; i < (a + 1) / 2; i++) {
            if (arr[i] + arr[a - i - 1] > max) {
                max = arr[i] + arr[a - i - 1];
            }
        }

        System.out.printf("Max = %f", max);

    }
}
