import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        output("Benvenuto!");
        String marca, modello;
        float prezzo;
        int s;

        do{
            output("scegli cosa fare: ");
            output("Aggiungere una voce al listino se non è presente ");
            output("Eliminare una voce dal listino ");
            output("Aumentare il prezzo di un prodotto dati marca, modello e % di aumento ");
            output("Scontare di una data % tutti i prodotti di una marca ");
            output("Uscire dal programa ");

            switch(s){
                case 1:
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;
                
            }

        }while(s=0);
    }
    public static void output(String s){
        System.out.println(s);
    }
}
