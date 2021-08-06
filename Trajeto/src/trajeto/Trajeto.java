/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trajeto;

/**
 *
 * @author michelangelo
 */
public class Trajeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //primeiro vamos instanciar um carro
        Carreta carretaFuracao = new Carreta("Carreta Furacao","AA12345", 
            "2000", "AA12345B", "AA12345C", "roxao", "12345", "Chico Lapada", 
            2000, "reto", 120, 50, 4, 6, 6, "pinga","54321", 2);
        
        //agora vamos percorrer o mapa de interlagos:   

        /*1)      O início do teste deverá ser no começo do seguimento B, 
        onde a soma das distâncias dos seguimentos B e M necessitam de uma 
        velocidade de pelo menos 20 km/h, de modo a garantir*/
        System.out.print("\n\n\n(1)");
        carretaFuracao.setVelocidade();  //5km/h
        carretaFuracao.setVelocidade();  //10km/h
        carretaFuracao.setMarcha(2);     //marcha 2
        carretaFuracao.setVelocidade();  //15km/h
        carretaFuracao.setVelocidade();  //20km/h
        carretaFuracao.volCombustivel -= 0.5; //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");



        /*2)      No início do seguimento D, curva a esquerda, necessita de uma 
        velocidade de pelo menos 16 km/h, de modo a garantir percorrer todo o trajeto 
        em um tempo mínimo;*/
        System.out.print("\n\n\n(2)");
        carretaFuracao.setFrear();               //16km/h
        carretaFuracao.setMarcha(1);             //marcha 1
        carretaFuracao.dirigir(16,"esquerda");   //16km/h virando a esquerda
        carretaFuracao.volCombustivel -= 0.5;  //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");



        /*3)      Para o seguimento E (Fim do D e início de E), assumindo curva a 
        direita, é necessária uma velocidade de pelo menos 20 km/h, de modo a 
        garantir percorrer todo o trajeto em um tempo mínimo;*/
        System.out.print("\n\n\n(3)");
        carretaFuracao.setMarcha(2);             //marcha 2
        carretaFuracao.dirigir(20,"direita");    //20km/h virando a direita
        carretaFuracao.volCombustivel -= 0.5;  //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");



        /*4)      Para os seguimentos N e H, assumindo em linha reta é necessária 
        uma velocidade de pelo menos  24 km/h, de modo a garantir percorrer todo o 
        trajeto em um tempo mínimo;*/
        System.out.print("\n\n\n(4)");
        carretaFuracao.dirigir(24,"reto");       //24km/h virando reto
        carretaFuracao.volCombustivel -= 0.5;  //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");



        /*5)      Referente ao seguimento K, curva a esquerda, é necessária uma 
        velocidade de pelo menos 20 km/h, de modo a garantir percorrer todo o 
        trajeto em um tempo mínimo;*/
        System.out.print("\n\n\n(5)");
        carretaFuracao.setFrear();              //20km/h
        carretaFuracao.dirigir(20, "esquerda"); //20km.h a esquerda
        carretaFuracao.volCombustivel -= 0.5; //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");



        /*6)      A somatória dos seguimentos F, Q e G, em linha reta, é necessária 
        uma velocidade de pelo menos 40 km/h, de modo a garantir percorrer todo o 
        trajeto em um tempo mínimo;*/
        System.out.print("\n\n\n(6)");
        carretaFuracao.setMarcha(3);             //40km/h 
        carretaFuracao.setVelocidade();          //25km/h
        carretaFuracao.setVelocidade();          //30km/h
        carretaFuracao.setVelocidade();          //35km/h
        carretaFuracao.setMarcha(4);             //marcha 4
        carretaFuracao.setVelocidade();          //40km/h
        carretaFuracao.volCombustivel -= 0.5;  //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");



        /*7)      Por fim, assumindo o final do teste, no seguimento S deverá haver 
        uma redução da velocidade até chegar a zero.*/
        System.out.print("\n\n\n(7)");
        carretaFuracao.setFrear();           //36km/h
        carretaFuracao.setFrear();           //32km/h
        carretaFuracao.setFrear();           //28km/h
        carretaFuracao.setMarcha(3);         //marcha 3
        carretaFuracao.setFrear();           //24km/h
        carretaFuracao.setFrear();           //20km/h
        carretaFuracao.setMarcha(2);         //marcha 2
        carretaFuracao.setFrear();           //16km/h
        carretaFuracao.setFrear();           //12km/h
        carretaFuracao.setMarcha(1);         //marcha 1
        carretaFuracao.setFrear();           //8km/h
        carretaFuracao.setFrear();           //4km/h
        carretaFuracao.setFrear();           //0km/h
        carretaFuracao.volCombustivel -= 0.5; //tanque diminuindo
        System.out.print(carretaFuracao.autonomiaViagem(1) + "\n");
        System.out.print(carretaFuracao.getPrint() + "\n");
        System.out.print(carretaFuracao.getVelocidade() + "\n");
        
        
        //colocando carga no caminhão
        System.out.print("\n\n\n(*)");
        carretaFuracao.carregarCarga(10);
        
        
        
        System.out.print("\n\n\n(end)");
    }    
    
}
