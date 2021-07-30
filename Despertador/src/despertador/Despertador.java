package despertador;

import java.util.Scanner;

/*
Crie uma classe chamada Relogio com os atributos segundo, minuto e hora. 
A hora deverá ser configurada por dois métodos com mesmo nome: setHorario.
Estes permitindo informar apenas minutos e hora, bem como, os três valores.
Outro método chamado atualizaHorario deve ser implementado. Adicionalmente, 
crie um método chamado despertador para avisar um determinado horário. Esses 
métodos garantem que o relógio seja operacional. Métodos construtores devem ser 
implementados.

Crie um menu na void main de maneira a permitir o usuário Informar o horário do
relógio, Mostrar o horário atualizado e Programar um despertador. Lembre-se de
que após o usuário informar o horário do relógio o programa deverá ser capaz de
atualizar o horário (método atualizaHorario) a cada segundo.
 */
public class Despertador {
    public static void main(String[] args) throws InterruptedException{
        int checker = 0;
        Scanner entry = new Scanner(System.in);
        Relogio relogio = new Relogio();
        
        System.out.println("hora atual");
        System.out.print("hour: ");
        int hour = entry.nextInt();
        System.out.print("minutes: ");
        int minutes = entry.nextInt();
        System.out.print("seconds: ");
        int seconds = entry.nextInt();
        relogio.setHorario(hour, minutes, seconds);
        
        System.out.println("\ndespertador");
        System.out.print("hour: ");
        int DHour = entry.nextInt();
        System.out.print("minutes: ");
        int DMinutes = entry.nextInt();
        System.out.print("seconds: ");
        int DSeconds = entry.nextInt();
        relogio.setDespertador(DHour, DMinutes, DSeconds);
        
        System.out.println();
        while(checker == 0){
            Thread.sleep(1000);
            checker = relogio.atualizaHorario(hour, minutes, seconds);
        }
        
        /*
        System.out.println(relogio.hour);
        System.out.println(relogio.minutes);
        System.out.println(relogio.seconds);
        System.out.println(relogio.DHour);
        System.out.println(relogio.DMinutes);
        System.out.println(relogio.DSeconds);*/
    }
    
}
