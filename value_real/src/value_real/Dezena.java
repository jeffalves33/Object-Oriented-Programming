
package value_real;

/**
 * @author Jeferson Alves (@jeffalves33)
 */
public enum Dezena {
    Dez(1), Vinte(2), Trinta(3), Quarenta(4), Cinquenta(5), Sessenta(6), 
    Setenta(7), Oitenta(8), Noventa(9);
    
    private int value;
    
    Dezena(int value){
        this.value = value;
    }
    public int getValue(){
        return this.value;
    }
}
