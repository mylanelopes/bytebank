
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaMylane = new Conta();
		contaDaMylane.saldo = 100;
		contaDaMylane.deposita(50);
		System.out.println(contaDaMylane.saldo);
		
		boolean conseguiuRetirar = contaDaMylane.saca(20);
		System.out.println(contaDaMylane.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaMylane);
		if(sucessoTransferencia) {
		System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaMylane.saldo);
		
		
		
		contaDaMylane.titular = "mylane lopes";
		System.out.println(contaDaMylane.titular);
		}
}
