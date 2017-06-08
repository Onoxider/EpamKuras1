package module1.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;


public class Main {
    public static void main(String[] args)  {

        Double e=0.0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите значение эпсилон: ");
            e = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        int index = 1;
        double a = 0.0;

        do {
            a = 1 / (Math.pow(index + 1, 2));
            index++;
            System.out.println(a);
        } while (a >= e);
    }
}

