package despertador;

public class Relogio {
    private int seconds;
    private int minutes;
    private int hour;
    
    private int DSeconds;
    private int DMinutes;
    private int DHour;
    
    //constructor
    public Relogio(){
        this.seconds = 0;
        this.minutes = 0;
        this.hour    = 0;
    }
    
    public void setHorario(int hour, int minutes){
        this.hour = Math.abs(hour);
        if(minutes > 59){ this.minutes = 59; }
        else this.minutes = Math.abs(minutes);
        this.seconds = 0;
    }
    public void setHorario(int hour, int minutes, int seconds){
        this.hour = Math.abs(hour);
        if(minutes > 59){ this.minutes = 59; }
        else this.minutes = Math.abs(minutes);
        if(seconds > 59){ this.seconds = 59; }
        else this.seconds = Math.abs(seconds);
    }
    
    public void setDespertador(int hour, int minutes, int seconds){
        this.DHour = Math.abs(hour);
        if(minutes > 59){ this.DMinutes = 59; }
        else this.DMinutes = Math.abs(minutes);
        if(seconds > 59){ this.DSeconds = 59; }
        else this.DSeconds = Math.abs(seconds);
    }
    
    //att
    public int atualizaHorario(int hour, int minutes, int seconds){
        if(this.seconds == 59){
            if(this.minutes == 59){
                if(this.hour == 23){
                    this.hour = 0;
                    hour = 0;
                }else{
                    this.hour ++;
                    hour ++;
                }
                this.minutes = 0;
                minutes = 0;
            }else{
                this.minutes ++;
                minutes ++; 
            }
            this.seconds = 0;
            seconds = 0;
        }else{
            this.seconds ++;
            seconds ++;
        }
        
        System.out.println(this.hour + ":" + this.minutes + ":" + this.seconds);
        
        return despertador();
    }
    
    private int despertador(){
            if(this.DHour == this.hour && this.DMinutes == this.minutes && this.DSeconds == this.seconds){
                System.out.println("despertador: " + this.hour + ":" + this.minutes + ":" + this.seconds);
                return 1;
            }
            return 0;
                
    }
}
