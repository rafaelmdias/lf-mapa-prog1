package mapa;
import contas.Conta;
/**
 *
 * @author Lucas Felipe Costa da Mata
 */
public class MAPA {

    public static void main(String[] args) {
        Conta cont = new Conta();
        cont.setAgencia(001);
        cont.setNumero(1234);
        cont.setDigito(5);
        cont.setSaldo(5000);
        cont.saldo();
        
        Conta cont2 = new Conta();
        cont2.setAgencia(002);
        cont2.setNumero(4321);
        cont2.setDigito(0);
        cont2.setSaldo(2000);
        cont2.saldo();
        
        cont.transferencia(2000, cont2);
        cont.saldo();
        cont2.saldo();
    }
    
}
