import java.util.InputMismatchException;
import java.util.Scanner;

public class LectorDatos {
    public static int solicitarEntero(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            int numero= lector.nextInt();
            return numero;
        }catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return solicitarEntero(mensaje);
        }
    }

    public static double solicitarDouble(String mensaje){
        Scanner lector= new Scanner(System.in);
        System.out.printf(mensaje);
        try{
            double numero1= lector.nextDouble();
            return numero1;
        }catch (InputMismatchException e){
            System.out.println("El dato ingresado no es valido");
            return solicitarDouble(mensaje);
        }
    }
}
