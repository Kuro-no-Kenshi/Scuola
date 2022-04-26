public abstract class Conto{
    protected int num, saldo;
    protected String nome;
    public Conto(int n, String nome){
      num=n;
      saldo=0;
      this.nome=nome;
    }
  
    public int getNumero(){return this.num;}
    public int getSaldo(){return this.saldo;}
    public String getNome(){return this.nome;}
  
    public void versamento(int soldi){
      saldo=saldo+soldi;
    }
    public boolean prelievo(int prendo){
      if(prendo<=saldo){
        saldo=saldo-prendo;
        return true;
      }
      else{
        return false;
      }
    }
    public abstract void app_int();
  }