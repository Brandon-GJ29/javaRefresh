import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class introduccion{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for (int i=0;i <3;i++ ){
            int myInt = scan.nextInt();
            numeros.add(myInt);
        }
        scan.close();

        for (int i = 0; i < 3; i++) {
            System.out.print(numeros.get(i)+"\n");
        }

    }
}