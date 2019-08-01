package mapa;
import contas.ContaCorrente;
import contas.ContaPoupanca;
/**
 *
 * @author Lucas Felipe Costa da Mata
 */
public class MAPA {

    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(1111, 1234, 5, 5000, 3000);
        ContaCorrente contaCorrente2 = new ContaCorrente(2222, 4321, 0, 10000, 5000);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(3333, 5678, 9, 4000);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(4444, 9876, 5, 8000);
        
        contaCorrente2.saque(2000);
        contaCorrente2.saldo();
        
        contaPoupanca2.saque(2000);
        contaPoupanca2.saldo();
        
        contaCorrente1.transferencia(2500, contaCorrente2);
        contaCorrente1.saldo();
        contaCorrente2.saldo();
        
        contaPoupanca1.transferencia(1000, contaPoupanca2);
        contaPoupanca1.saldo();
        contaPoupanca2.saldo();
        
        contaCorrente1.saque(3000);
        contaCorrente1.transferencia(3000, contaPoupanca1);
        
        contaPoupanca1.saque(3050);
        contaPoupanca1.transferencia(3050, contaPoupanca2);
    }
    
}
