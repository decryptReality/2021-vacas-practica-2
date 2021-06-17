package src.tienda;

import java.util.Scanner;

public class IngresoDatos {
    static Scanner scanner = new Scanner(System.in);

    private static void imprimirMensaje(String mensaje){
        System.out.print("\n"+mensaje+" ");
    }

    public static int getEntero(String mensaje, boolean negativo){
        imprimirMensaje(mensaje);
        int tmp = scanner.nextInt();
        scanner.nextLine();

        if( negativo ){
            return tmp;
        }

        if (tmp<0){
            do{
                imprimirMensaje("\n\n No puede ingresar números negativos\n");
                imprimirMensaje(mensaje);
                tmp = scanner.nextInt();
            } while(tmp<0);
        }

        return tmp;
    }

    public static String getTexto(String mensaje){
        imprimirMensaje(mensaje);
        String res = scanner.nextLine();
        return res;
    }

    public static String getNext(String mensaje)
    {
        System.out.println(mensaje);
        String texto = scanner.next();
        return texto;
    }

    public static int getNextInt(String mensaje)
    {
        System.out.println(mensaje);
        int numero = scanner.nextInt();
        return numero;
    }

}
