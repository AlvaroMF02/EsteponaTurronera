package dulces;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class TuEresMiDulce {

    public static void main(String[] args) {

        //VARIABLES
        double manoObra = 0.1;  //LO HE PUESTO EN EL MINIMO PQ SI :)
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

        //SACAR MATERIA PRIMA PARA CALCULAR EL COSTE DE PRODUCCION
        materiaPrima = Double.parseDouble(JOptionPane.showInputDialog
        ("¿Cuál será el coste de la materia prima?"));

        
        
        //AQUI EMPIEZA TODO EL PROGRAMA
        if (materiaPrima > 0.1 && materiaPrima <= 1) {

            
            
            
            
            
            //CALCULAR MANO DE OBRA
            manoObra = (pedido.equalsIgnoreCase("m1")
                    || pedido.equalsIgnoreCase("p1")) ? 0.15 : 0.22;
            
            
            //COSTEPRODUCCION = MATERIAPRIMA + MANOOBRA
            costeProduccion = materiaPrima + manoObra;
            //QUITAR DECIMALES
            Math.round(costeProduccion * 100);
            JOptionPane.showMessageDialog(null, "COSTE PRODUCCIÓN "+costeProduccion);
            
            
            
            
//            //VENTA UNITARIO
//            switch (pedido) {
//                case "M1","P2","P1":
//                    //Precio de venta unitario = coste de producción + 50 % del coste de producción
//                    precioVentaUnit = costeProduccion + (costeProduccion*0.5);
//                    JOptionPane.showMessageDialog(null, precioVentaUnit);
//                    break;
//
//                case "T1","T2","M2":
//                    //Precio de venta unitario = coste de producción + 65 % del coste de producción
//                    precioVentaUnit = costeProduccion + (costeProduccion*0.65);
//                    JOptionPane.showMessageDialog(null, precioVentaUnit);
//                    break;
//            }

            //CON IF ELSE PUEDO ESCRIBIR LOS PEDIDOS EN MINUSCULA
            if (pedido.equalsIgnoreCase("m1") || 
                    pedido.equalsIgnoreCase("p2") || 
                    pedido.equalsIgnoreCase("p1")) {
                    
                    //Precio de venta unitario = coste de producción + 50 % del coste de producción
                    precioVentaUnit = costeProduccion + (costeProduccion*0.5);
                    Math.round(precioVentaUnit * 10);
                    JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD "+ precioVentaUnit);
                
            } else if (pedido.equalsIgnoreCase("t1") || 
                    pedido.equalsIgnoreCase("t2") || 
                    pedido.equalsIgnoreCase("m1")){
                
                    //Precio de venta unitario = coste de producción + 65 % del coste de producción
                    precioVentaUnit = costeProduccion + (costeProduccion*0.65);
                    Math.round(precioVentaUnit * 10);
                    JOptionPane.showMessageDialog(null, "PRECIO VENTA POR UNIDAD "+precioVentaUnit);
            }
            
            
            
            
            
            
        } else {
            JOptionPane.showMessageDialog(null, "LA MATERIA DEBE ESTAR ENTRE 0.1 Y 1");
        }

    }
}
