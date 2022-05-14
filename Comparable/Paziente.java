public class Paziente implements Comparable {
    private String nome;
    private int eta;

    public Paziente(String nome, int eta){
        this.nome=nome;
        this.eta=eta;
    }

    public String getNome(){return this.nome;}
    public String getEta(){return this.eta;}

    public int compareTo(Object o){
        if(this.eta>(((Paziente)o).getEta())){
            return 1;
        }
        else if(this.eta==(((Paziente)o).getEta())){
            return 0;
        }
        else{
            return -1;
        }
    }
}
