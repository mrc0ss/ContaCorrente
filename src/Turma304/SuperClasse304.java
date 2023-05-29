package Turma304;

public class SuperClasse304 {
    private String nome=null;
    private double saldo;
    
    
public void ExibirSaldo() {
    System.out.println("O saldo atual de " + this.nome + " é: "+getSaldo());
}

public void DepositarValor(double valor) { 
      if( valor > 0 ) {
         this.setSaldo(this.getSaldo() + valor);
         System.out.println("Foi feito um deposito de: " + valor + " para "+this.nome);
      } else {
        System.out.println("Nenhum valor depositado, valor invalido: "+valor);
      }
 }

public void SacarValor(double valor) {
    double xsaldo = this.getSaldo();
    if (xsaldo > (this.getSaldo() - valor)) { 
         if( valor > 0 ) {
             this.setSaldo(xsaldo - valor);
              System.out.println("Foi feito um saque de: "+valor);
         } else {
            System.out.println("Nenhum saque, valor invalido: "+valor);
         }  
    } else {
            System.out.println("Nenhum saque, saldo insuficiente: "+this.getSaldo());
   }   
}

public void TransferirValor(ContaCorrente304 destino, double valor) {
        double saldoAnterior = this.getSaldo();
        if (valor > 0) {
           if ((saldoAnterior - valor) >= 0 ) {
               this.setSaldo((saldoAnterior - valor));
               System.out.println("Saquei ["+valor+"] de "+this.getNome());
               destino.setSaldo((destino.getSaldo() + valor));
               System.out.println("Foi transferido para " + destino.getNome() + " O valor de "+valor);
           } else {
               System.out.println("Saque inválido"); 
           }
        } else {
            System.out.println("O valor é inválido!");           
        }    
   }

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
