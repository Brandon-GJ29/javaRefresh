package EstructurasdeDatos;

import java.util.Scanner;

public class arreglo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int[] array = new int[numero];

        for(int i =0; i<numero;i++){
            array[i]=scanner.nextInt();
        }

        for(int i =0; i<numero;i++){
            System.out.println(array[i]);
        }

    }
    
}
