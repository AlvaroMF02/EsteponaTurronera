package modularizado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class EsteponaTurronera {

    public static void main(String[] args) {
        //NO MUESTRA EL MENU DE PRODUCTOS AL REPETIRSE EL PROGRAMA
        
        
        //VARIABLES
        String opcPrimerMenu = "";
        double materiaPrima = 0.0;

        do {
            //MOSTRAR MENU INICIAL
            mostrarMenuPrincipal();

            //LEER CODIGOS
            opcPrimerMenu = leerCodigos(opcPrimerMenu);

            //FILTRAR CODIGOS
            filtrarCodigosPrimerMenu(opcPrimerMenu);

            //LEER MATERIA PRIMA
            materiaPrima = leerMateriaPrima(materiaPrima);

        } while (!opcPrimerMenu.equalsIgnoreCase("salir"));

    }

    //**************************************************************************
    //                              METODOS
    //**************************************************************************
    private static Scanner teclado = new Scanner(System.in);

    //MOSTRAR MENU INICIAL
    public static void mostrarMenuPrincipal() {
        String menu = """
                      **********************************
                                -> (INICIAR) <-
                                 -> (SALIR) <-
                      **********************************
                      """;
        System.out.println(menu);
    }

    //LEER CODIGOS
    public static String leerCodigos(String eleccion) {
        eleccion = teclado.nextLine();
        return eleccion;
    }

    //FILTRAR CODIGOS
    public static String filtrarCodigosPrimerMenu(String eleccion) {

        eleccion = eleccion.toLowerCase();
        switch (eleccion) {
            case "iniciar":
                String codigo = "";
                System.out.println("\nINICIO DEL PROGRAMA");
                //MENU PRODUCTOS
                mostrarMenuProductos();
                //LEER CODIGO
                do {
                    codigo = leerCodigoProducto(codigo);
                    //FILTRAR CODIGO
                } while (!filtrarCodigosMenu(codigo));

                break;

            case "salir":
                System.out.println("FÍN DEL PROGRAMA");
                break;
            default:
                System.out.println("ESCRIBA (INICIAR) O (SALIR)\n");
        }

        return eleccion;
    }

    //LEER MENU PRODUCTOS
    public static void mostrarMenuProductos() {
        String menuProductos = """
                      **********************************
                                  PRODUCTOS
                                
                        M1 -> Mantecados de Limón
                        P1 -> Polvorones
                        T1 -> Turrón de chocolate
                        T2 -> Turrón clásico
                        M2 -> Mazapanes
                               
                      **********************************
                      """;
        System.out.println(menuProductos);
    }

    //LEER CODIGOS PRODUCTOS
    public static String leerCodigoProducto(String eleccion) {
        eleccion = teclado.nextLine();
        return eleccion;
    }

    //FILTRAR CODIGOS PRODUCTOS
    public static boolean filtrarCodigosMenu(String producto) {
        boolean repetir = false;

        if (producto.equalsIgnoreCase("m1")
                || producto.equalsIgnoreCase("p1")
                || producto.equalsIgnoreCase("t1")
                || producto.equalsIgnoreCase("t2")
                || producto.equalsIgnoreCase("m2")) {
            System.out.println("EL CÓDIGO ESTA BIEN ESCRITO :)\n");
            repetir = true;

        } else {
            System.out.println("EL CÓDIGO ESTA MAL ESCRITO :(\n");
            System.out.println("INTENTE A ESCRIBIR EL CODIGO OTRA VEZ");
            mostrarMenuProductos();

        }

        return repetir;
    }

    //LEER MATERIA PRIMA
    public static double leerMateriaPrima(double materiaPrima) {
        teclado.nextLine();
        boolean repetir = true;

        do {
            try {
                
                System.out.println("\nINDIQUE EL COSTE DE LA MATERIA PRIMA");
                materiaPrima = teclado.nextDouble();
                
                repetir = false;
                
            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("ESCRIBE UN NÚMERO CATETO");
            }
            
        } while (repetir);

        return materiaPrima;
    }
    //FILTRAR MATERIA PRIMA
    //LEER MANO DE OBRA
    //FILTRAR MANO DE OBRA
    //CALCULAR COSTE PRODUCCION
    //CALCULAR PRECIO VENTA UNITARIA
    //CALCULAR UNIDADES BENEFICIO
}
