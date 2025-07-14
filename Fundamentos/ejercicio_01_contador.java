import java.util.Scanner;

public class ejercicio_01_contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el numero de repeticiones.");
        int rango = scan.nextInt();
        int aux=1;
        int resultado=0;
        for (int i=0; i<rango;i++){
           System.out.println(resultado);
           int siguiente=resultado+aux;
           aux=resultado;
           resultado=siguiente;
        }
    }

}
