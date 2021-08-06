
package trajeto;


public class Carreta extends Carro {
    private float pesoBruto, pesoLiquido, pesoMaxCarga; //em Toneladas
    private String tipoCarga, codANTT;
    private int numEixos;
    
    
    public Carreta(String nome, String nrDeModelos, String anoLancamento, 
            String codigoIdentificador, String modelo, String cor, String chassi, 
            String proprietario, int ano, String direcaoTrajeto, int velocidadeMax, 
            int capacidadeTanque, float pesoBruto, float pesoLiquido, 
            float pesoMaxCarga, String tipoCarga,String codANTT, int numEixos) {
        
        super(nome, nrDeModelos, anoLancamento, codigoIdentificador, modelo, 
                cor, chassi, proprietario, ano, direcaoTrajeto, velocidadeMax, 
                capacidadeTanque);
        
        this.pesoBruto = pesoBruto;
        this.pesoLiquido = pesoLiquido;
        this.pesoMaxCarga = pesoMaxCarga;
        this.tipoCarga = tipoCarga;
        this.codANTT = codANTT;
        this.numEixos = numEixos;
    }
    
    public void carregarCarga (float pesoCarga){
        if(pesoCarga > this.pesoMaxCarga){
            System.out.println("ultrapassando " + (pesoCarga - this.pesoMaxCarga) +
                    " Toneladas");
        }
    }
    
}
