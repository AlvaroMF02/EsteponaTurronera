package dulces;

import javax.swing.JOptionPane;

/**
 *
 * @author alvaro
 */
public class TuEresMiDulce {
    public static void main(String[] args) {
        double manoObra;
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
        

        pedido =  (JOptionPane.showInputDialog(menu));
        
        //(coste producción = materia prima + mano de obra)
        
        
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
        
        
        
        
        
        
        
        
        
    }
}
