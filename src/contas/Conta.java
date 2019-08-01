package contas;

public class Conta {
    protected int agencia;
    protected int numero;
    protected int digito;
    protected double saldo;
    
    public void saque(double valor){
        saldo -= valor;
    }
    
    public void deposito(double valor){
        saldo += valor;
    }
    
    public void transferencia(double valor, Conta conta){
        saldo -= valor;
        conta.saldo += valor;
    }
    
    public void saldo(){
        System.out.println("Agencia:"+agencia+" Numero: "+numero+" Digito:"+digito+" Saldo:"+saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
