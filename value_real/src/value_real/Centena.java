
package value_real;

/**
 * @author Jeferson Alves (@jeffalves33)
 */
public enum Centena {
    Cem(0), Cento(1), Duzentos(2), Trezentos(3), Quatrocentos(4), Quinhentos(5), 
    Seiscentos(6), Setecentos(7), Oitocentos(8), Novecentos(9);
    
    private int value;
    
    Centena(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
}
