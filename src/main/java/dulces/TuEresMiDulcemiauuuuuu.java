package dulces;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class TuEresMiDulcemiauuuuuu {

    public static void main(String[] args) {
        
        //DUDAS
        //¿POR QUE EL PRIMER IF NO ME VA?
        //¿QUE QUIERE DECIR CON MOSTRAR COSTE DE PRODUCCION UNITARIO?
        
        
        //QUEDA ARREGLAR ESTO Y HACER LO DE LOS 2500
        
        

        //VARIABLES
        double costeManoObra;
        double materiaPrima;
        double precioVentaUnit;
        double costeProduccion;
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

        //MOSTRAR EL MENU
        pedido = (JOptionPane.showInputDialog(menu));

        if (pedido != "M1" || pedido != "P1" || pedido != "T1" || pedido != "T2" || pedido != "M2") {
            JOptionPane.showMessageDialog(null, "DEBE ESCRIBIR EL CÓDIGO IGUAL");
            
        } else {
            //SACAR MATERIA PRIMA PARA CALCULAR EL COSTE DE PRODUCCION
            materiaPrima = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál será el coste de la materia prima?"));

            if (materiaPrima > 0.1 && materiaPrima <= 1) {

                switch (pedido) {
                    case "M1" -> {
                        costeManoObra = 0.15;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                        Math.round(precioVentaUnit * 10);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + precioVentaUnit);
                    }
                    case "P1" -> {
                        costeManoObra = 0.22;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                        Math.round(precioVentaUnit * 10);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + precioVentaUnit);
                    }
                    case "T1" -> {
                        costeManoObra = 0.15;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                        Math.round(precioVentaUnit * 10);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + precioVentaUnit);
                    }
                    case "T2" -> {
                        costeManoObra = 0.22;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                        Math.round(precioVentaUnit * 10);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + precioVentaUnit);
                    }
                    case "M2" -> {
                        costeManoObra = 0.22;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                        Math.round(precioVentaUnit * 10);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + precioVentaUnit);
                    }

                    default ->
                        JOptionPane.showMessageDialog(null, "ESCRIBA BIEN SU PEDIDO");

                }

            } else {
                JOptionPane.showMessageDialog(null, "LA MATERIA DEBE ESTAR ENTRE 0.1 Y 1");
            }
        }

    }

}
