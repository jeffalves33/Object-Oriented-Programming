
package value_real;


/**
 * @author Jeferson Alves (@jeffalves33)
 */
public class Moeda {
    
    private float value;
    
    //construtor padrão
    public Moeda(){ this.value = 0; }
    
    //construtor para inciar todos os atribustos da classe
    public Moeda(float value){ trataError(value); }
    
    //imprime o valor no dispositivo de saída padrão
    public void imprimir(){ System.out.println("R$ " + this.value); }
    
    //imprime o valor por extenso
    public void imprimirPorExtenso(){
        int real, centavos;
        Unidade[] unidade = new Unidade[19];
        Dezena[] dezena   = new Dezena[9];
        Centena[] centena = new Centena[10];
        String text = "";
        String text_Real = "";
        String text_Centavos = "";
        initializeUnit(unidade);
        initializeTen(dezena);
        initializeHundred(centena);
        
        real      = (int) (Math.abs(this.value));
        centavos  = (int) (this.value*100 - real*100);
        
        //parte real        
        text_Real = createTextReal(real, unidade, dezena, centena);
        
        //parte centavos
        text_Centavos = createTextCentavos(centavos, unidade, dezena);
        
        text += text_Real + "\n" + text_Centavos;
        
        System.out.println(text + "\n");
        
    }
    
    //retorna o valor armazenado
    public float getValor(){ return this.value; }
    
    //recebe um valor como parâmetro e armazena na classe
    public void setValor(float value){ trataError(value); }
    
    //usado para tratar numero excedente
    private void trataError(float value){
        String text;
        
        try{ //tratamento de erro
            if(value < -1000){
                this.value = -1000;
                throw new Exception("< -1000");
            }else if(value > 1000){
                this.value = 1000;
                throw new Exception("> 1000");
            }else this.value = value;
        }
        catch(Exception e){
            System.out.print("numero excedido: ");
            if(value < -1000) System.out.println("o valor -1000 será atribuido");
            if(value > 1000) System.out.println("o valor 1000 será atribuido");
        }
    }
    
    //inicializa Enum de unidades
    private void initializeUnit(Unidade[] unidade){
        unidade[0]  = Unidade.Um;
        unidade[1]  = Unidade.Dois;
        unidade[2]  = Unidade.Tres;
        unidade[3]  = Unidade.Quatro;
        unidade[4]  = Unidade.Cinco;
        unidade[5]  = Unidade.Seis;
        unidade[6]  = Unidade.Sete;
        unidade[7]  = Unidade.Oito;
        unidade[8]  = Unidade.Nove;
        unidade[9]  = Unidade.Dez;
        unidade[10] = Unidade.Onze;
        unidade[11] = Unidade.Doze;
        unidade[12] = Unidade.Treze;
        unidade[13] = Unidade.Quatorze;
        unidade[14] = Unidade.Quinze;
        unidade[15] = Unidade.Dezesseis;
        unidade[16] = Unidade.Dezessete;
        unidade[17] = Unidade.Dezoito;
        unidade[18] = Unidade.Dezenove;
    }
    
    //inicializa Enum de dezenas
    private void initializeTen(Dezena[] dezena){
        dezena[0] = Dezena.Dez;
        dezena[1] = Dezena.Vinte;
        dezena[2] = Dezena.Trinta;
        dezena[3] = Dezena.Quarenta;
        dezena[4] = Dezena.Cinquenta;
        dezena[5] = Dezena.Sessenta;
        dezena[6] = Dezena.Setenta;
        dezena[7] = Dezena.Oitenta;
        dezena[8] = Dezena.Noventa;
    }
    
    //inicializa Enum de centena
    private void initializeHundred(Centena[] centena){
        centena[0] = Centena.Cem;
        centena[1] = Centena.Cento;
        centena[2] = Centena.Duzentos;
        centena[3] = Centena.Trezentos;
        centena[4] = Centena.Quatrocentos;
        centena[5] = Centena.Quinhentos;
        centena[6] = Centena.Seiscentos;
        centena[7] = Centena.Setecentos;
        centena[8] = Centena.Oitocentos;
        centena[9] = Centena.Novecentos;
    }
    
    //cria o texto da parte real
    private String createTextReal(int real, Unidade[] unidade, Dezena[] dezena, Centena[] centena){
        
        int i_centena = (int) (real/100);
        int i_dezena  = (int) ((real%100)/10);
        int i_unidade = (int) (real%10);
        String aux = "";
        
        //000 (só centavos)
        if(real == 0 || real == 1000){
            if(real == 0)return "zero reais";
            return "mil reais";}
        //00X
        else if(real < 10){
            if(real == 1)return unidade[i_unidade - 1] + " real";
            return unidade[i_unidade - 1] + " reais";}
        //0XY
        else if(real >= 10 && real < 20){return unidade[i_unidade + 9] + " reais";}
        //0X0
        else if(real < 99 && i_unidade == 0){return dezena[i_dezena - 1] + " reais";}
        //0XY
        else if(real >= 20 && real <= 99){return dezena[i_dezena - 1] + " e " + unidade[i_unidade - 1] + " reais";}
        //X00
        else if(real >= 100 && i_dezena == 0 && i_unidade == 0){ 
            if(real == 100){return centena[0] + " reais";}
            else return centena[i_centena] + " reais";}
        //XYZ
        else if(real > 100){ //poderia usar recursividade aqui
            aux += centena[i_centena] + " e ";
            if(real%100 >= 10 && real%100 < 20){aux += unidade[i_unidade + 9] + " reais";}
            else if(real%100 < 99 && i_unidade == 0){aux += dezena[i_dezena - 1] + " reais";}
            else aux += dezena[i_dezena - 1] + " e " + unidade[i_unidade - 1] + " reais";
            return aux;
        }
        return "";
    }
    
    //cria o texto da parte dos centavos
    private String createTextCentavos(int centavos, Unidade[] unidade, Dezena[] dezena){
        int i_dezena  = (int) (centavos/10);
        int i_unidade = (int) (centavos%10);
        String aux = "";
        
        //00
        if(centavos == 0){return "zero centavos";}
        //0X
        else if(i_dezena == 0){
            if(i_unidade == 1) return unidade[i_unidade - 1] + " centavo";
            return unidade[i_unidade - 1] + " centavos";}
        //XY
        else if(centavos >= 10 && centavos < 20){return unidade[i_unidade + 9] + " centavos";}
        else if(centavos < 99 && i_unidade == 0){return dezena[i_dezena - 1] + " centavos";}
        else return dezena[i_dezena - 1] + " e " + unidade[i_unidade - 1] + " centavos";
    }
}
