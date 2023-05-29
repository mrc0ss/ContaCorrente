package Turma304;

import java.util.Scanner;

public class Conta304 {

    public static void main(String[] args) {
        ContaCorrente304 cc1 = new ContaCorrente304();
        ContaCorrente304 cc2 = new ContaCorrente304();
        Poupança304 pp1 = new Poupança304();

        Scanner teclado = new Scanner(System.in);

        double depositar, sacar, transferir;
        

        cc1.setNome("João - Conta Correte");
        cc1.setSaldo(1000);

        cc2.setNome("Paulo - Conta Corrente");
        cc2.setSaldo(500);
        
        pp1.setNome("Marcio - Poupança");
        pp1.setSaldo(25000);
        
        pp1.ExibirSaldo();
        
        

        cc1.ExibirSaldo();
        System.out.println("Digite o valor de deposito para " + cc1.getNome() + ": ");
        depositar = teclado.nextDouble();
        
        cc1.DepositarValor(depositar);    
        cc1.ExibirSaldo();

        System.out.println("Digite o valor do saque de " + cc1.getNome() + ": ");
        sacar = teclado.nextDouble(); 
        cc1.SacarValor(sacar);
        cc1.ExibirSaldo();
        
        cc2.ExibirSaldo();
        System.out.println("Digite o valor de deposito para " + cc2.getNome() + ": ");
        depositar = teclado.nextDouble();
        cc2.DepositarValor(depositar);
        cc2.ExibirSaldo();

        System.out.println("Digite o valor do saque para " + cc2.getNome() + ": ");
        sacar = teclado.nextDouble();
        cc2.SacarValor(sacar);
        cc2.ExibirSaldo();
        
        System.out.println("Digite o valor do PIX de " + cc1.getNome() + " para " + cc2.getNome() + ": ");
        transferir = teclado.nextDouble();
        cc1.TransferirValor(cc2, transferir);
        cc1.ExibirSaldo();
        cc2.ExibirSaldo();
    }

}
