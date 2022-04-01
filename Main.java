public class Main {
    public static void main(String args[]){

        Masini masina1 = new Masini(27);
        masina1.getIndicativ();
        masina1.setIndicativ(27);
        masina1.AvNotAv(false);
        System.out.println(masina1.indicativ);
        System.out.println(masina1.status);
    }
}
