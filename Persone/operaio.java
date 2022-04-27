public class operaio extends Persona {
    String settore;
    String turno;

    public operaio(String nome, String cognome, String codfis, int a, int m, int g, String settore, String turno){
        super(nome,  cognome,  codfis,  a,  m,  g);
        this.settore=settore;
        this.turon=turno;
    }
}
