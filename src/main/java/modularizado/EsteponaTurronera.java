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
        //SE CREAN BUCLES EN LA MATERIA PRIMA Y EN LA MANO DE OBRA

        //VARIABLES
        String opcPrimerMenu = "";

        do {
            //MOSTRAR MENU INICIAL
            mostrarMenuPrincipal();

            //LEER CODIGOS
            opcPrimerMenu = leerCodigos(opcPrimerMenu);

            //FILTRAR CODIGOS
            filtrarCodigosPrimerMenu(opcPrimerMenu);

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
        String codigo = "";
        double materiaPrima = 0.0;
        double manoObra = 0.0;
        double costeProduccion = 0.0;
        double precioUnitario = 0.0;
        double unidadesAVender = 0.0;
        String resultado = """
      **********************************
                     TOTAL
       -> PRECIO VENTA UNIDAD: %.2f
       -> COSTE DE PRODUCCIÓN: %.2f
       -> PARA LLEGAR A 2500€ SE DEBEN VENDER %.2f
      **********************************
      """.formatted(precioUnitario, costeProduccion, unidadesAVender);

        eleccion = eleccion.toLowerCase();

        switch (eleccion) {
            case "iniciar":

                System.out.println("\nINICIO DEL PROGRAMA");
                //MENU PRODUCTOS
                mostrarMenuProductos();
                //LEER CODIGO PRODUCTOS
                do {
                    codigo = leerCodigoProducto(codigo);
                    //FILTRAR CODIGO
                } while (!filtrarCodigosMenu(codigo));

                //LECTURA DE LA MATERIA PRIMA 
                materiaPrima = leerMateriaPrima(materiaPrima);
                //FILTRADO DE LA MATERIA PRIMA             HAY QUE FILTRAR AQUI O SE REPETIRA SIEMPRE
                filtrarMateriaPrima(materiaPrima);

                //LECTURA DE LA MANO DE OBRA
                manoObra = leerManoDeObra(manoObra);
                //FILTRADO DE LA MANO DE OBRA             HAY QUE FILTRAR AQUI O SE REPETIRA SIEMPRE
                filtrarManoDeObra(manoObra);

                //CALCULAR COSTE DE PRODUCCION
                costeProduccion = calcCosteProduccion(materiaPrima, manoObra);

                //CALCULAR PRECIO VENTA UNITARIA
                precioUnitario = calcPrecioVentaUnit(costeProduccion, codigo);

                //CALCULAR UNIDADES A VENDER SI QUIERO GANAR 2500€
                unidadesAVender = calcBeneficio(precioUnitario, costeProduccion);

                //SALIDA DE LOS DATOS
                System.out.println(resultado);
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
    public static boolean filtrarCodigosMenu(String codigo) {
        boolean repetir = false;

        if (codigo.equalsIgnoreCase("m1")
                || codigo.equalsIgnoreCase("p1")
                || codigo.equalsIgnoreCase("t1")
                || codigo.equalsIgnoreCase("t2")
                || codigo.equalsIgnoreCase("m2")) {
            System.out.println("\n");
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
        boolean repetir = true;
        do {
            try {

                System.out.println("\nINDIQUE EL COSTE DE LA MATERIA PRIMA");
                materiaPrima = teclado.nextDouble();
                repetir = false;

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("ESCRIBA BIEN LA MATERIA PRIMA");
            }

        } while (repetir);

        return materiaPrima;
    }

    //FILTRAR MATERIA PRIMA
    public static double filtrarMateriaPrima(double materiaPrima) {
        do {
            leerMateriaPrima(materiaPrima);
            //AVISO PARA PONER BIEN LA MATERIA
            if (materiaPrima < 0.1 || materiaPrima > 1) {
                System.out.println("LA MATERIA DEBE ESTAR ENTRE 0.1 Y 1");
            }
        } while (materiaPrima < 0.1 || materiaPrima > 1);

        return materiaPrima;
    }

    //LEER MANO DE OBRA
    public static double leerManoDeObra(double manoObra) {
        boolean repetir = true;
        do {
            try {

                System.out.println("\nINDIQUE EL COSTE DE LA MANO DE OBRA");
                manoObra = teclado.nextDouble();
                repetir = false;

            } catch (InputMismatchException ime) {
                teclado.nextLine();
                System.out.println("DEBES ESCRIBIR NUMEROS");
            }

        } while (repetir);

        return manoObra;
    }

    //FILTRAR MANO DE OBRA
    public static double filtrarManoDeObra(double manoObra) {
        do {
            leerManoDeObra(manoObra);
            //AVISO PARA PONER BIEN LA MANO DE OBRA
            if (manoObra < 0.5 || manoObra > 0.9) {
                System.out.println("LA MANO DE OBRA DEBE ESTAR ENTRE 0.5 Y 9");
            }
        } while (manoObra < 0.5 || manoObra > 0.9);

        return manoObra;
    }

    //CALCULAR COSTE PRODUCCION
    public static double calcCosteProduccion(double matPrima, double manoObra) {
        double costeProduccion;

        costeProduccion = matPrima + manoObra;

        return costeProduccion;
    }

    //CALCULAR PRECIO VENTA UNITARIA
    public static double calcPrecioVentaUnit(double costeProduc, String codigo) {
        double precioVentaUnit;
        if (codigo.equalsIgnoreCase("M1")
                || codigo.equalsIgnoreCase("T1")
                || codigo.equalsIgnoreCase("M2")) {

            precioVentaUnit = costeProduc + (costeProduc * 0.5);
        } else {
            precioVentaUnit = costeProduc + (costeProduc * 0.65);
        }
        return precioVentaUnit;
    }

    //CALCULAR UNIDADES BENEFICIO
    public static double calcBeneficio(double precVentaUnit, double costeProduc) {
        double cantidadVender;

        cantidadVender = 2500 / (precVentaUnit - costeProduc);

        return cantidadVender;
    }

}
