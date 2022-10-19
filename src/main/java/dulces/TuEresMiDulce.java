package dulces;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class TuEresMiDulce {

    public static void main(String[] args) {
        double manoObra;
        double materiaPrima;
        String pedido = "";
        String menu = """
                      **********************************
                                    MENU
                        M1 -> Mantecados de Limón
                        P1 -> Polvorones
                        T1 -> Turrón de chocolate
                        T2 -> Turrón clásico
                        M2 -> Mazapanes
                      
                      **********************************
                      """;

        pedido = (JOptionPane.showInputDialog(menu));

        //COSTE MANO DE OBRA
        switch (pedido) {
            case "M1","P1":
                manoObra = 0.15;
                break;

            case "T1","T2","M2":
                manoObra = 0.22;
                break;

            default:
                System.out.println("Has introducido un codigo erroneo");
        }

        //SACAR MATERIA PRIMA PARA CALCULAR EL COSTE DE PRODUCCION
        //(coste producción = materia prima + mano de obra)
        materiaPrima = Double.parseDouble(JOptionPane.showInputDialog
        ("¿Cuál será el coste de la materia prima?"));
        
        if (materiaPrima>0.1 && materiaPrima<=1 ) {
            
        }else{
            JOptionPane.showInputDialog("LA MATERIA DEBE ESTAR ENTRE 0.1 Y 1");
        }
        
        
        
        //VENTA UNITARIO
        switch (pedido) {
            case "M1","P2","P1":

                //Precio de venta unitario = coste de producción + 50 % del coste de producción
                break;

            case "T1","T2","M2":

                //Precio de venta unitario = coste de producción + 65 % del coste de producción
                break;

            default:
                System.out.println("Has introducido un codigo erroneo");
        }

    }
}
