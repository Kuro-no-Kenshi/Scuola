public class Main {
    public static void main(String[] args) {
        Paziente p1=new Paziente("matteo", 17);
        Paziente p2=new Paziente("edoardo", 18);
        Paziente p3=new Paziente("giuseppe", 14);

        int ris;
        ris=p1.compareTo(p2);
        output(ris);
        ris=p2.compareTo(p3);
        output(ris);
        ris=p1.compareTo(p3);
        output(ris);
    }
    public static void output(String s){
        System.out.println(s);
    }
}
