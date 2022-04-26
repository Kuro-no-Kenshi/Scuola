public class Standard extends Conto{
    public Standard(int n, String nome){
      super(n, nome);
    }
  
    public void app_int(){
      super.saldo= super.saldo+(int)(0.001*super.saldo);
    }
  }