public class Lavatrice {
    private String marca;
    private String modello;
    private float prezzo;

    public Lavatrice(String marca, String modello, float prezzo){
        this.marca=marca;
        this.modello=modello;
        this.prezzo=modello;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public float getPrezzo(){
        return this.prezzo;
    }

    public void sconta(int perc){
        prezzo-=(prezzo/100*perc);
    }

    public void aumenta(int perc){
        prezzo+=(prezzo/100*perc);
    }
}
