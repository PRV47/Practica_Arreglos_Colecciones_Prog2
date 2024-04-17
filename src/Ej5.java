import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
//        int [] num = new int[10];
        int max = Integer.MIN_VALUE;
        int mem = 0;
        int contador = 0;
        List<Integer> num = new ArrayList<>();



        for (int i = 0; i < 10; i++ ){
            System.out.print("Ingrese un numero: ");
//            num[i] = reader.nextInt();
            num.add(reader.nextInt());

//            if (num[i] > max) {
            if (num.get(i) > max) {
//                max = num[i];
                max = num.get(i);
                mem = i;
            }
        }

        System.out.println("El mayor numero es " + max + " en la posicion " + mem);

        for (int i = 0; i < 10; i++ ){
//            if (num [i] == max) {
            if (num.get(i) == max) {
                contador = contador + 1;
            }
        }
        System.out.println("El numero " + max + " se repite " + contador);

    }
}