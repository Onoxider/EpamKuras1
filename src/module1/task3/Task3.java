package module1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by yokuras on 09.06.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        Double a, b, h;
        a = b = h = 0.0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите по очереди a, b и h: ");
            a = Double.parseDouble(br.readLine());
            b = Double.parseDouble(br.readLine());
            h = Double.parseDouble(br.readLine());
        } catch (IOException ex) {}

       do{
            double f = Math.tan(a*2) - 3;
           System.out.printf("F(%f) = %f\n", a, f);

       }while ((a+=h)<=b);
    }
}
