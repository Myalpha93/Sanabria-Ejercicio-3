import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Scanner lector = new Scanner(System.in);
        System.out.println("********");
        System.out.println("Benvenido");
        System.out.println("********");

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ingrese un vehiculo");
            System.out.println("2. Mostrar Vehiculos");
            System.out.println("3. Salir");
            int opcion = LectorDatos.solicitarEntero("Ingrese una opcion: ");
            switch (opcion){
                case 1:
                    System.out.println("Creado nuevo registro ");
                    System.out.printf("Ingrese el color: ");
                    String color = lector.next();
                    int año = LectorDatos.solicitarEntero("Ingrese el año: ");
                    double precio = LectorDatos.solicitarDouble("Ingrese el precio: ");
                    boolean eleccion=true;
                    while (eleccion){
                        System.out.println("Tipos de vehiculos");
                        System.out.println("1. Ford");
                        System.out.println("2. Toyota");
                        System.out.println("3. Honda");
                        System.out.println("4. Nissan");
                        int tipo= LectorDatos.solicitarEntero("Ingrese cual tipo de auto es: ");
                        switch (tipo){
                            case 1:
                                Ford vehiculoNuevo1= new Ford();
                                vehiculoNuevo1.color=color;
                                vehiculoNuevo1.año=año;
                                vehiculoNuevo1.precio=precio;
                                vehiculos.add(vehiculoNuevo1);
                                eleccion=false;
                                break;
                            case 2:
                                Toyota vehiculoNuevo2= new Toyota();
                                vehiculoNuevo2.color=color;
                                vehiculoNuevo2.año=año;
                                vehiculoNuevo2.precio=precio;
                                vehiculos.add(vehiculoNuevo2);
                                eleccion=false;
                                break;
                            case 3:
                                Honda vehiculoNuevo3= new Honda();
                                vehiculoNuevo3.color=color;
                                vehiculoNuevo3.año=año;
                                vehiculoNuevo3.precio=precio;
                                vehiculos.add(vehiculoNuevo3);
                                eleccion=false;
                                break;
                            case 4:
                                Nissan vehiculoNuevo4= new Nissan();
                                vehiculoNuevo4.color=color;
                                vehiculoNuevo4.año=año;
                                vehiculoNuevo4.precio=precio;
                                vehiculos.add(vehiculoNuevo4);
                                eleccion=false;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }



                    break;
                case 2:
                    if (vehiculos.isEmpty()){
                        System.out.println("No hay vehiculos registrados");
                    } else
                    {
                        System.out.println("Mostrando los vehiculos de Toyota y Nissan");
                        for (Vehiculo c:vehiculos) {
                            String marca = "";
                            System.out.println("Auto:");
                            if(c instanceof Toyota){
                                marca= "Toyota";
                                System.out.println("el color de: " + marca + "-" +c.color);
                                System.out.println("el año de: "  + marca + "-" + c.año);
                                System.out.println("el precio de: " + marca + "-" +c.precio );
                            } else if (c instanceof Nissan){
                                marca= "Nissan";
                                System.out.println("el color de: " + marca  + "-" +c.color );
                                System.out.println("el año de: " + marca + "-" +c.año );
                                System.out.println("el precio de: " + marca + "-" +c.precio);
                            }
                        }
                    }

                    break;
                case 3:
                    continuar =false;
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
