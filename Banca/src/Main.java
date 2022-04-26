import java.time.LocalDate;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner t=new Scanner(System.in);
        int s;
        ArrayList<Conto> c=new ArrayList<>();
        Conto st;
        Conto v;
        
        do{
            output("cosa vuoi fare? \n[1] inserisci un nuovo conto standard \n[2] inserisci un nuovo conto vip \n[3] esegui un versamento \n[4] esegui un prelievo \n[0] esci dal programma ");
            s=t.nextInt();
            switch(s){
                case 1:
                output("inserisci il nome del proprietario del conto: ");
                String nome1=t.next();
                output("Inserisci il numero del conto: ");
                int num1=t.nextInt();
                st= new Standard(num1, nome1);
                c.add(st);
                break;
                
                case 2:
                output("inserisci il nome del proprietario del conto: ");
                String nome2=t.next();
                output("Inserisci il numero del conto: ");
                int num2=t.nextInt();
                output("INserisci l'interesse: ");
                int interesse=t.nextInt();
                v= new Vip(num2, nome2, interesse);
                c.add(v);
                break;

                case 3:
                output("Inserisci quanto vuoi versare: ");
                int vers=t.nextInt();
                c.versamento(vers);
                break;

                case 4:
                output("inserisci quanto vuoi prelevare: ");
                int prel=t.nextInt();
                c.prelievo(prel);
                break;
            }
        }while(s>=1 && s<=3);
        output("Arrivederci!");
    }
    public static void output(String s){
        System.out.println(s);
    }
}