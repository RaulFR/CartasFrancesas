/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaspokertema4;

/**
 *
 * @author Raul
 */
public class MainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CartaFrancesa carta0 = new CartaFrancesa(CartaFrancesa.CORAZONES, 5);
        CartaFrancesa carta1 = new CartaFrancesa(CartaFrancesa.COMODIN, 1);
        CartaFrancesa carta2 = new CartaFrancesa(CartaFrancesa.PICAS, 6);
        CartaFrancesa carta3 = new CartaFrancesa(CartaFrancesa.CORAZONES, 11);
        
        System.out.println(carta0.toString());
        System.out.println(carta0.toCodigo());
        System.out.println();
        
        System.out.println(carta1.toString());
        System.out.println(carta1.toCodigo());
        System.out.println();
        
        System.out.println(carta2.toString());
        System.out.println(carta2.toCodigo());
        System.out.println();
        
        System.out.println(carta3.toString());
        System.out.println(carta3.toCodigo());
        System.out.println();
    }
}
