public class Client {

    String nume;
    String prenume;
    int numar;

        public Client(String nume, String prenume){
            this.nume = nume;
            this.prenume = prenume;
        }

        public String getNume(){
            return nume;
        }

        public void setNume(String nume){
            this.nume=nume;
        }

        public String getPrenume(){
            return prenume;
        }

        public void setPrenume(String prenume){
            this.prenume=prenume;
        }

        public int getNumar(){
            return numar;
        }

        public void setNumar(int numar){
            this.numar=numar;
        }
}
