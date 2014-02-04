/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cartaspokertema4;

/**
 *
 * @author Raul
 */
public class CartaFrancesa {

    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;
    private int numCarta = 0;
    private int palo = 0;

    public CartaFrancesa(int palo, int numero) {
        this.palo = palo;
        this.numCarta = numero;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public int getPalo() {
        return palo;
    }

    public String toString() {
        String nombre = "";
        
        if(!(palo == COMODIN))
        switch (numCarta) {
            case 0:
                nombre += "As";
                break;
            case 10:
                nombre += "J";
                break;
            case 11:
                nombre += "Q";
                break;
            case 12:
                nombre += "K";
                break;
            default:
                nombre += numCarta+1;
        } else {
            nombre += numCarta+1;
        }
        

        switch (palo) {
            case TREBOLES:
                nombre += " de Treboles";
                break;
            case DIAMANTES:
                nombre += " de Diamantes";
                break;
            case CORAZONES:
                nombre += " de Corazones";
                break;
            case PICAS:
                nombre += " de Picas";
                break;
            case COMODIN:
                nombre += " de Comodin";
                break;
        }
        return nombre;
    }

    public String toCodigo() {
        String codigo = "";
        
        switch (palo) {
            case TREBOLES:
                codigo += "T";
                break;
            case DIAMANTES:
                codigo += "D";
                break;
            case CORAZONES:
                codigo += "C";
                break;
            case PICAS:
                codigo += "P";
                break;
            case COMODIN:
                codigo += "J";
                break;
        }

        codigo += numCarta;

        return codigo;
    }
}
