package mapa;
import contas.ContaCorrente;
import contas.ContaPoupanca;
/**
 *
 * @author Lucas Felipe Costa da Mata
 */
public class MAPA {

    public static void main(String[] args) {
        ContaCorrente cont = new ContaCorrente();
        cont.setAgencia(001);
        cont.setNumero(1234);
        cont.setDigito(5);
        cont.setSaldo(5000);
        cont.saldo();
        cont.saque(500);
        cont.saldo();
        cont.deposito(500);
        cont.saldo();
        
        ContaCorrente cont2 = new ContaCorrente();
        cont2.setAgencia(002);
        cont2.setNumero(4321);
        cont2.setDigito(0);
        cont2.setSaldo(2000);
        cont2.saldo();
        
        cont.transferencia(500, cont2);
        cont.saldo();
        cont2.saldo();
        
        ContaPoupanca cont3 = new ContaPoupanca();
        cont3.setSaldo(1000);
        cont3.saldo();
        cont3.rendimento(0.10);
        cont3.saldo();
    }
    
}
