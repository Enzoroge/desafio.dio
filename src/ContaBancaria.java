
public class ContaBancaria {
	int numero;
	String agencia;
	String nomeCliente;
	double saldo = 0.0;
	
	
	public ContaBancaria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContaBancaria(int numero, String agencia, String nomeCliente, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Ol�, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � "
				+ agencia + ", conta " + numero + " e seu saldo " + "R$" +saldo + " j� esta dispon�vel para saque"
				
				;
	}
	
	
	
	

}
