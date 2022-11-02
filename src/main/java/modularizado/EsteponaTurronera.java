package modularizado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class EsteponaTurronera {

    /*
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //VARIABLES
        String opcion;
        String opcionProduct = "";
        double costeManoObra;
        double costeProduccion;
        double materiaPrima;
        double precioVentaUnit;
        double unidadesBeneficio;
        String menu = """
                      **********************************
                        -> INICIAR PROGRAMA
                        -> SALIR
                      **********************************
                      """;
        String menuProductos = """
                      **********************************
                                  PRODUCTOS
                                
                        M1 -> Mantecados de Limón
                        P1 -> Polvorones
                        T1 -> Turrón de chocolate
                        T2 -> Turrón clásico
                        M2 -> Mazapanes
                               
                        (escriba bien el codigo)
                      **********************************
                      """;

        //PRIMER BUCLE CON TODO EL PROGRAMA
        do {
            System.out.println(menu);
            opcion = teclado.nextLine();

            if (!opcion.equalsIgnoreCase("salir")) { //SALIDA

                //BUCLE PARA VER LOS PRODUCTOS
                do {
                    System.out.println(menuProductos);
                    opcionProduct = teclado.nextLine();
                    //PASARLO A MAYUSCULAS PARA Q ENTRE EN EL SWITCH
                    opcionProduct = opcionProduct.toUpperCase();
                    if (opcionProduct.equalsIgnoreCase("m1")
                            || opcionProduct.equalsIgnoreCase("p1")
                            || opcionProduct.equalsIgnoreCase("t1")
                            || opcionProduct.equalsIgnoreCase("t2")
                            || opcionProduct.equalsIgnoreCase("m2")) {

                        //BUCLE PARA CONTROLAR LA MATERIA PRIMA
                        do {
                            System.out.println("\nINDIQUE EL PRECIO DE LA MATERIA PRIMA");
                            materiaPrima = teclado.nextDouble();

                            if (materiaPrima >= 0.1 && materiaPrima <= 1) {

                                //BUCLE COSTE MANO DE OBRA
                                do {
                                    System.out.println("\nINDIQUE EL COSTE DE LA MANO DE OBRA");
                                    costeManoObra = teclado.nextDouble();

                                    if (costeManoObra >= 0.5 && costeManoObra <= 0.9) {
                                        //OPERACIÓN COSTE DE PRODUCCIÓN
                                        costeProduccion = materiaPrima + costeManoObra;

                                        //OPERACIÓN DE PRECIO VENTA UNIDAD
                                        if (opcionProduct.equalsIgnoreCase("M1")
                                                || opcionProduct.equalsIgnoreCase("T1")
                                                || opcionProduct.equalsIgnoreCase("M2")) {

                                            precioVentaUnit = costeProduccion
                                                    + (costeProduccion * 0.5);
                                        } else {
                                            precioVentaUnit = costeProduccion
                                                    + (costeProduccion * 0.65);
                                        }

                                        //OPERACIÓN PARA LOS 2500
                                        unidadesBeneficio = 2500
                                                / (precioVentaUnit - costeProduccion);
                                        String resultado = """
                                      **********************************
                                                     TOTAL
                                       -> PRECIO VENTA UNIDAD: %.2f
                                       -> COSTE DE PRODUCCIÓN: %.2f
                                       -> PARA LLEGAR A 2500€ SE DEBEN VENDER %.2f
                                      **********************************
                                      """.formatted(precioVentaUnit,
                                                costeProduccion,
                                                unidadesBeneficio);
                                        switch (opcionProduct) {
                                            case "M1" -> {

                                                System.out.println(resultado);
                                                teclado.nextLine();
                                                break;
                                            }
                                            case "P1" -> {
                                                System.out.println(resultado);
                                                teclado.nextLine();
                                                break;
                                            }
                                            case "T1" -> {
                                                System.out.println(resultado);
                                                teclado.nextLine();
                                                break;
                                            }
                                            case "T2" -> {
                                                System.out.println(resultado);
                                                teclado.nextLine();
                                                break;
                                            }
                                            case "M2" -> {
                                                System.out.println(resultado);
                                                teclado.nextLine();
                                                break;
                                            }

                                        }
                                        //MANO DE OBRA
                                    } else {
                                        System.out.println("ESCRIBA UN VALOR ENTRE 0.5 Y 0.9\n");
                                    }
                                    //MANO DE OBRA
                                } while (costeManoObra < 0.5 || costeManoObra > 0.9);

                                //MATERIA PRIMA    
                            } else {
                                System.out.println("LA MATERIA PRIMA DEBE ESTAR ENTRE 0.1 Y 1\n");
                            }
                            //MATERIA PRIMA
                        } while (materiaPrima < 0.1 || materiaPrima > 1);

                    } //CODIGOS MENU
                    //CODIGOS MENU
                } while (!(opcionProduct.equalsIgnoreCase("m1")
                        || opcionProduct.equalsIgnoreCase("p1")
                        || opcionProduct.equalsIgnoreCase("t1")
                        || opcionProduct.equalsIgnoreCase("t2")
                        || opcionProduct.equalsIgnoreCase("m2")
                        || opcionProduct.equalsIgnoreCase("salir")));
            }//PRIMER MENU
            //PRIMER MENU
        } while (!opcion.equalsIgnoreCase("salir")
                && (!opcionProduct.equalsIgnoreCase("salir")));
    }
     */
    public static void main(String[] args) {
        //VARIABLES
        String codPrimerMenu = "";

        do {
            //MOSTRAR MENU INICIAL
            mostrarMenuPrincipal();

            //LEER CODIGOS
            codPrimerMenu = leerCodigos(codPrimerMenu);

            //FILTRAR CODIGOS
            filtrarCodigosPrimerMenu(codPrimerMenu);

        } while (!codPrimerMenu.equalsIgnoreCase("salir"));

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
    //FILTRAR MATERIA PRIMA
    //LEER MANO DE OBRA
    //FILTRAR MANO DE OBRA
    //CALCULAR COSTE PRODUCCION
    //CALCULAR PRECIO VENTA UNITARIA
    //CALCULAR UNIDADES BENEFICIO
}
