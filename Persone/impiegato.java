public class impiegato extends Persona {
    String ufficio;

    public impiegato(String nome, String cognome, String codfis, int a, int m, int g, String ufficio){
        super(nome,  cognome,  codfis,  a,  m,  g);
        this.ufficio=ufficio;
    }
}
