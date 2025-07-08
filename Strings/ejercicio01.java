import java.util.Scanner;

public class ejercicio01{
    public static void main(String[] strg){
         Scanner scan= new Scanner(System.in);
         String text1=scan.nextLine();
         String text2=scan.nextLine();

         int longitud = text1.length()+ text2.length();
        //Punto 1
         System.out.println(longitud);
        //Punto 2
         if(text1.length()>text2.length()){
            System.out.println("No");
         }else if(text1.length()<text2.length()){
            System.out.println("Yes");
         }else{
            System.out.println(calcular(text1,text2));
         }
         //Punto 3
        char mayuscula = Character.toUpperCase(text1.charAt(0));
         char mayuscula2 = Character.toUpperCase(text2.charAt(0));
         System.out.println(mayuscula+text1.substring(1)+" "+mayuscula2+text2.substring(1));
    }

    public static String calcular(String text1, String text2){
        String resultado;
        int len1=text1.length();
        int len2=text2.length();

        int min=Math.min(len1, len2);
        int longitudText1=0;
        int longitudText2=0;
        for(int i=0;i<min;i++){
            char caracter=text1.charAt(i);
            char caracter2=text2.charAt(i);
            longitudText1=longitudText1+ caracter;
            longitudText2=longitudText2+ caracter2;
        }

        if (longitudText1>longitudText2) {
            resultado="No";
        }else{
            resultado="Yes";
        }

        return resultado;
    }
}
