
package value_real;

/**
 * @author Jeferson Alves (@jeffalvese33) 
 */
public enum Unidade {
    Um(1), Dois(2), Tres(3), Quatro(4), Cinco(5), Seis(6), Sete(7), Oito(8), Nove(9),
    Dez(10), Onze(11), Doze(12), Treze(13), Quatorze(14), Quinze(15), Dezesseis(16),
    Dezessete(17), Dezoito(18), Dezenove(19);
    private int value;
    
    Unidade(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
}
