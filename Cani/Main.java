import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String nome;
        String razza;
        int g, m, a;
        LocalDate dataN;

        Scanner t=new Scanner(System.in);
        ArrayList <Cane> c1=new ArrayList <Cane>();

        do{
            output("Scegli cosa fare: ");
            output("[1] Aggiungi un nuovo cane (nome, razza, data) ");
            output("[2] Elimina un cane dal file ");
            output("[3] Scrivi un altro file con i cani nati dopo una certa data ");

            int s=t.nextInt();

            switch(s){
                case 1:
                output("Inserisci il nome del cane: ");
                nome=t.next();
                output("Inserisci la razza del cane: ");
                razza=t.next();
                output("Inserisci la data di nascita del cane (g, m, a): ");
                g=t.nextInt();
                m=t.nextInt();
                a=t.nextInt();
                dataN=LocalDate.of(a,m,g);

                c1.add(nome, razza, dataN);
                break;

                case 2:
                output("Inserire il nome del cane dal eliminare adl file: ");
                String cerca=t.next();
                for(int i=0;i<c1.size;i++){
                    if(cerca.equals(c1.get(i).nome)){
                        output("Il cane è stato trovato! ");
                        c1.remove(i);
                    }
                }
                break;

                case 3:
                output("Inserire l'anno: ");
                int anno=t.nextInt();
                for(int i=0;i<c1.size;i++){
                    if(dataN(isAfter)){
                        
                    }
                }
            }
        }while(s!=0);

    }
    public static void output(String s){
        System.out.println(s);
    }
}
