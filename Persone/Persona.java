public class Persona {
    protected String nome;
    protected String cognome;
    protected String codfis;
    protected int a, m, g;

    public Persona(String nome, String cognome, String codfis, int a, int m, int g){
        this.nome=nome;
        this.cognome=cognome;
        this.codfis=codfis;
        this.a=a;
        this.m=m;
        this.g=g;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){
        return this.cognome;
    }
    public String getCodice(){
        return this.codfis;
    }
    public String toString(){
        output ("giorno, mese, anno: "+g+m+a+"\nnome, cognome, codice fiscale: "+nome+cognome+codfis);
    }
}