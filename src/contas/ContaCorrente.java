package contas;

public class ContaCorrente extends Conta{
    private final static double limite = 3000;
    
    @Override
    public void saque(double valor){
        if(valor <= limite){
            super.saque(valor);
        } else {
            System.out.println("Valor ultrapassa o limite para saque.");
            System.out.println("O limite para saque é:"+limite);
            System.out.println("Valor solicitado de:"+valor);
        }
    }
    
    @Override
    public void transferencia(double valor, Conta conta){
        if(valor <= limite){
            super.transferencia(valor, conta);
        } else {
            System.out.println("Valor ultrapassa o limite para transferência.");
            System.out.println("O limite para transferência é:"+limite);
            System.out.println("Valor solicitado de:"+valor);
        }
    }
}
