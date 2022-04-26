public class Vip extends Conto{
    private int interesse;
    public Vip(int n, String nome, int interesse){
      super(n, nome);
      this.interesse=interesse;
    }
  
    public void app_int(){
      super.saldo= super.saldo+(int)(this.interesse*super.saldo);
    }
  }