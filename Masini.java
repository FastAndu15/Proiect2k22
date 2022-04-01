import java.util.ArrayList;

public class Masini extends Sediu {

    int indicativ;
    boolean available;
    String status= "white";

    public Masini(int indicativ){
        this.indicativ=indicativ;
    }

        public int getIndicativ(){
            return indicativ;
        }

        public void setIndicativ(int indicativ){
            this.indicativ=indicativ;
        }

        public void AvNotAv(boolean available){
        if(available)
            status="green";
        else
            status="red";
        }
}
