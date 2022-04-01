import java.util.ArrayList;

public class Sediu extends BaseEntity {


        int nrTel;

    public Sediu(){}

        ArrayList<Masini> masini = new ArrayList<Masini>();
        ArrayList<Sofer> soferi = new ArrayList<Sofer>();
        ArrayList<Client> clienti = new ArrayList<Client>();



        public int getNrTel(){
            return nrTel;
        }

        public void setNrTel(int nrTel){
            this.nrTel=nrTel;
        }

        public Sediu(int nrTel){
            this.nrTel=nrTel;
        }

}
