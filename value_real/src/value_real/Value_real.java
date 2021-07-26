
package value_real;

/**
 * @author Jeferson Alves (@jeffalves33)
 */
public class Value_real {
    public static void main(String[] args) {
        Moeda value = new Moeda();
     
        value.setValor((float)0.00);
        value.imprimir();
        value.imprimirPorExtenso();
        
        value.setValor((float)100.00);
        value.imprimir();
        value.imprimirPorExtenso();
        
        value.setValor((float)200.30);
        value.imprimir();
        value.imprimirPorExtenso();
        
        value.setValor((float)191.02);
        value.imprimir();
        value.imprimirPorExtenso();
        
        value.setValor((float)25.25);
        value.imprimir();
        value.imprimirPorExtenso();
        
        value.setValor((float)5.12);
        value.imprimir();
        value.imprimirPorExtenso();
        
        value.setValor((float)123.45);
        value.imprimir();
        value.imprimirPorExtenso();
        
        
    }
    
}
