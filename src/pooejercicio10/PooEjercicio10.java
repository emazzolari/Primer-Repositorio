package pooejercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class PooEjercicio10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double[] va = new double[50];
        double[] vb = new double[20];
        System.out.println("Hola");
        for (int i = 0; i < 50; i++) {
            va[i] = Math.random() * 50;
            int cont = i + 1;
            System.out.println("Arreglo a[" + cont + "]: [" + va[i] + "]");

        }

        System.out.println("");

      

        System.out.println("");

        Arrays.sort(va);
        {
            for (int i = 0; i < 50; i++) {
                double cont = i + 1;
                System.out.println("Arreglo a[" + cont + "]: [" + va[i] + "]");
            }
        }
        System.out.println("");

        System.arraycopy(va, 0, vb, 0, 10);
        {

            for (int i = 0; i < vb.length; i++) {
               // System.out.println("array b " + i + ": " + vb[i]);
            }
        }
        Arrays.fill(vb, 10, 20, 0.5);
        {
            for (int i = 0, n = vb.length; i < n; i++) {
                System.out.println("Arreglo b "+vb[i]);
            }
        }
    }
}
