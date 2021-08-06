
package trajeto;


public class Carro {
    String modelo, cor, chassi, proprietario;
    int ano, velocidadeMax, numMarchas, capacidadeTanque, marchaAtual;
    float velocidadeAtual, volCombustivel;
    String direcaoTrajeto;
    Marca marca;
    
    //Construtor inicializando todos os atributos da classe
    public Carro(String nome, String nrDeModelos, String anoLancamento, String codigoIdentificador,
                 String modelo, String cor, String chassi, String proprietario, int ano,
                 String direcaoTrajeto, int velocidadeMax, int capacidadeTanque){
        
        //inicializando a class marca
        marca = new Marca(nome, nrDeModelos, anoLancamento, codigoIdentificador);
        
        //inicializando os atributos
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.proprietario = proprietario;
        this.direcaoTrajeto = direcaoTrajeto;
        this.ano = ano;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeTanque = capacidadeTanque;
        
        this.numMarchas = 6;
        this.velocidadeAtual = 0;
        this.marchaAtual = 1;  //ré = 0
        this.volCombustivel = 50;
    }
    
    //metodo set para aumentar a velocidade em 5km/h
    //metodo get para ver a velocidade atual
    public void setVelocidade(){
        if(this.velocidadeAtual <= (this.velocidadeMax -5)) this.velocidadeAtual += 5;
        else this.velocidadeAtual = this.velocidadeMax;
        
    }
    public String getVelocidade(){
        return "velocidade atual: " + this.velocidadeAtual + "km/h";
    }
    
    //metodo que reduz a velocidade do veículo em 4km/h
    public void setFrear(){
        if(this.velocidadeAtual >= 4) this.velocidadeAtual -= 4;
        else this.velocidadeAtual = 0;
    }
    
    //modifica o trajeto
    public void setTrajeto(String direcaoTrajeto){
        this.direcaoTrajeto = direcaoTrajeto;
    }
    
    //modifica a velocidade atual
    public void dirigir(float velocidadeAtual, String direcaoTrajeto){
        if(velocidadeAtual <= this.velocidadeMax) this.velocidadeAtual = velocidadeAtual;
        setTrajeto(direcaoTrajeto); //para modificar a direção
    }
    
    //modifica a marcha
    public void setMarcha(int newMarcha){
        int abs = Math.abs(newMarcha - this.marchaAtual);
        //ou seja, a marcha só pode variar, no MAXIMO em 2 unidades.
        if(abs <= 2) if(newMarcha <= 12 && newMarcha >= 0) this.marchaAtual = newMarcha;
    }
    
    //autonomia nesse caso, seria o quanto o veículo poderia percorrer com a quantidade
    //de gasolina ainda disponível no tanque
    public String autonomiaViagem(float consumoMedio){
        return "tanque: " + this.volCombustivel + "L\n" + 
                "autonomia: " + (consumoMedio*this.volCombustivel) + "km";
    }
    
    public String getPrint(){
        return "volume: " + this.volCombustivel + "L\n" +
               "capacidade: " + this.capacidadeTanque + "L";
    }
}
