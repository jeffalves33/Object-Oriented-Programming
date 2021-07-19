
package designing_a_car;

/**
 *
 * @author Jeferson Alves (@jeffalves33)
 */
public class Designing_a_car {
    public static void main(String[] args) {
        //primeiro vamos instanciar um carro
        Carro corsa = new Carro("corsa", "4", "2019", "123",
                 "XML", "roxao", "chassi", "jeferson", 
                 "reto", 100, 50);
        
    //agora vamos percorrer o mapa de interlagos:   
    
    /*1)      O início do teste deverá ser no começo do seguimento B, 
    onde a soma das distâncias dos seguimentos B e M necessitam de uma 
    velocidade de pelo menos 20 km/h, de modo a garantir*/
    System.out.print("\n\n\n(1)");
    corsa.setVelocidade();  //5km/h
    corsa.setVelocidade();  //10km/h
    corsa.setMarcha(2);     //marcha 2
    corsa.setVelocidade();  //15km/h
    corsa.setVelocidade();  //20km/h
    corsa.volCombustivel -= 0.5; //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    
    
    
    /*2)      No início do seguimento D, curva a esquerda, necessita de uma 
    velocidade de pelo menos 16 km/h, de modo a garantir percorrer todo o trajeto 
    em um tempo mínimo;*/
    System.out.print("\n\n\n(2)");
    corsa.setFrear();               //16km/h
    corsa.setMarcha(1);             //marcha 1
    corsa.dirigir(16,"esquerda");   //16km/h virando a esquerda
    corsa.volCombustivel -= 0.5;  //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    
    
    
    /*3)      Para o seguimento E (Fim do D e início de E), assumindo curva a 
    direita, é necessária uma velocidade de pelo menos 20 km/h, de modo a 
    garantir percorrer todo o trajeto em um tempo mínimo;*/
    System.out.print("\n\n\n(3)");
    corsa.setMarcha(2);             //marcha 2
    corsa.dirigir(20,"direita");    //20km/h virando a direita
    corsa.volCombustivel -= 0.5;  //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    
    
    
    /*4)      Para os seguimentos N e H, assumindo em linha reta é necessária 
    uma velocidade de pelo menos  24 km/h, de modo a garantir percorrer todo o 
    trajeto em um tempo mínimo;*/
    System.out.print("\n\n\n(4)");
    corsa.dirigir(24,"reto");       //24km/h virando reto
    corsa.volCombustivel -= 0.5;  //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    
    
    
    /*5)      Referente ao seguimento K, curva a esquerda, é necessária uma 
    velocidade de pelo menos 20 km/h, de modo a garantir percorrer todo o 
    trajeto em um tempo mínimo;*/
    System.out.print("\n\n\n(5)");
    corsa.setFrear();              //20km/h
    corsa.dirigir(20, "esquerda"); //20km.h a esquerda
    corsa.volCombustivel -= 0.5; //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    
    
    
    /*6)      A somatória dos seguimentos F, Q e G, em linha reta, é necessária 
    uma velocidade de pelo menos 40 km/h, de modo a garantir percorrer todo o 
    trajeto em um tempo mínimo;*/
    System.out.print("\n\n\n(6)");
    corsa.setMarcha(3);             //40km/h 
    corsa.setVelocidade();          //25km/h
    corsa.setVelocidade();          //30km/h
    corsa.setVelocidade();          //35km/h
    corsa.setMarcha(4);             //marcha 4
    corsa.setVelocidade();          //40km/h
    corsa.volCombustivel -= 0.5;  //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    
    
    
    /*7)      Por fim, assumindo o final do teste, no seguimento S deverá haver 
    uma redução da velocidade até chegar a zero.*/
    System.out.print("\n\n\n(7)");
    corsa.setFrear();           //36km/h
    corsa.setFrear();           //32km/h
    corsa.setFrear();           //28km/h
    corsa.setMarcha(3);         //marcha 3
    corsa.setFrear();           //24km/h
    corsa.setFrear();           //20km/h
    corsa.setMarcha(2);         //marcha 2
    corsa.setFrear();           //16km/h
    corsa.setFrear();           //12km/h
    corsa.setMarcha(1);         //marcha 1
    corsa.setFrear();           //8km/h
    corsa.setFrear();           //4km/h
    corsa.setFrear();           //0km/h
    corsa.volCombustivel -= 0.5; //tanque diminuindo
    System.out.print(corsa.autonomiaViagem(1) + "\n");
    System.out.print(corsa.getPrint() + "\n");
    System.out.print(corsa.getVelocidade() + "\n");
    }    
}
