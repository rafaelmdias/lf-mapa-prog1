package contas;

public class ContaPoupanca extends Conta{
    public void rendimento(double perc){
        super.setSaldo((perc*saldo)+saldo);
    }
}
