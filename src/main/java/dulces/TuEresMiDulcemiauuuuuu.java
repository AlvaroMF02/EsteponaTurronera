package dulces;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class TuEresMiDulcemiauuuuuu {

    public static void main(String[] args) {

        //VARIABLES
        double costeManoObra;
        double materiaPrima;
        double precioVentaUnit;
        double costeProduccion;
        double unidadesBeneficio;
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

        if (pedido.equals("M1") || pedido.equals("P1") || pedido.equals("T1") || pedido.equals("T2") || pedido.equals("M2")) {

            //SACAR MATERIA PRIMA PARA CALCULAR EL COSTE DE PRODUCCION
            materiaPrima = Double.parseDouble(JOptionPane.showInputDialog("¿Cuál será el coste de la materia prima?"));

            if (materiaPrima > 0.1 && materiaPrima <= 1) {

                switch (pedido) {
                    case "M1" -> {
                        costeManoObra = 0.15;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + String.format("%.2f", precioVentaUnit));
                        JOptionPane.showMessageDialog(null, "COSTE DE PRODUCCIÓN " + String.format("%.2f", costeProduccion));
                        //CALCULO PARA LLEGAR A LOS 2500
                        unidadesBeneficio = 2500 / precioVentaUnit;
                        JOptionPane.showMessageDialog(null, "PARA LLEGAR A LOS 2500€ DEBES VENDER " + Math.ceil(unidadesBeneficio) + " UNIDADES");

                    }
                    case "P1" -> {
                        costeManoObra = 0.22;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + String.format("%.2f", precioVentaUnit));
                        JOptionPane.showMessageDialog(null, "COSTE DE PRODUCCIÓN " + String.format("%.2f", costeProduccion));
                        //CALCULO PARA LLEGAR A LOS 2500
                        unidadesBeneficio = 2500 / precioVentaUnit;
                        JOptionPane.showMessageDialog(null, "PARA LLEGAR A LOS 2500€ DEBES VENDER " + Math.ceil(unidadesBeneficio) + " UNIDADES");

                    }
                    case "T1" -> {
                        costeManoObra = 0.15;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + String.format("%.2f", precioVentaUnit));
                        JOptionPane.showMessageDialog(null, "COSTE DE PRODUCCIÓN " + String.format("%.2f", costeProduccion));
                        //CALCULO PARA LLEGAR A LOS 2500
                        unidadesBeneficio = 2500 / precioVentaUnit;
                        JOptionPane.showMessageDialog(null, "PARA LLEGAR A LOS 2500€ DEBES VENDER " + Math.ceil(unidadesBeneficio) + " UNIDADES");

                    }
                    case "T2" -> {
                        costeManoObra = 0.22;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.65);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + String.format("%.2f", precioVentaUnit));
                        JOptionPane.showMessageDialog(null, "COSTE DE PRODUCCIÓN " + String.format("%.2f", costeProduccion));
                        //CALCULO PARA LLEGAR A LOS 2500
                        unidadesBeneficio = 2500 / precioVentaUnit;
                        JOptionPane.showMessageDialog(null, "PARA LLEGAR A LOS 2500€ DEBES VENDER " + Math.ceil(unidadesBeneficio) + " UNIDADES");

                    }
                    case "M2" -> {
                        costeManoObra = 0.22;
                        costeProduccion = materiaPrima + costeManoObra;
                        precioVentaUnit = costeProduccion + (costeProduccion * 0.5);
                        JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD " + String.format("%.2f", precioVentaUnit));
                        JOptionPane.showMessageDialog(null, "COSTE DE PRODUCCIÓN " + String.format("%.2f", costeProduccion));
                        //CALCULO PARA LLEGAR A LOS 2500
                        unidadesBeneficio = 2500 / precioVentaUnit;
                        JOptionPane.showMessageDialog(null, "PARA LLEGAR A LOS 2500€ DEBES VENDER " + Math.ceil(unidadesBeneficio) + " UNIDADES");

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "LA MATERIA DEBE ESTAR ENTRE 0.1 Y 1");
            }
        } else {

            JOptionPane.showMessageDialog(null, "DEBE ESCRIBIR EL CÓDIGO IGUAL");

        }

    }

}
