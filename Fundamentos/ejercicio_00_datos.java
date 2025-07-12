import java.util.Scanner;

public class ejercicio_00_datos{

    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        System.out.println("Ingresa temperatura:");
        System.out.println("[1] Ceslsius -> Franheit \n[2] Franheit -> Ceslsius ");

        switch (scan.nextInt()) {
            case 1:
                System.out.println("Ingrsa los grados [C]:");
                
                break;
            case 2:
                System.out.println("Ingrsa los grados [F]:");
            break;
            default:
                System.out.println("Error.");
                break;
        }
    }


} 