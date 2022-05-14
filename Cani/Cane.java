import java.time.LocalDateTime;
import java.util.LocalDate;

public class Cane {
    private String nome;
    private String razza;
    private LocalDate datan;

    public Cane(String nome, String razza, LocalData datan){
        this.nome=nome;
        this.razza=razza;
        this.datan=datan;
    }

    public String getNome(){
        return this.nome;
    }
    public String getRazza(){
        return this.razza;
    }
    public LocalDate getData(){
        return this.datan;
    }
}