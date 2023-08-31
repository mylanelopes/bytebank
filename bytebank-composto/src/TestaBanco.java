
public class TestaBanco {
	
	    public static void main(String[] args) { 
	        Cliente mylane = new Cliente(); 
	        mylane.nome = "MylaneLopes";
	        mylane.cpf = "222.222.222-22";
	        mylane.profissao = "programador";
	            
	        Conta contaDaMylane = new Conta(); 
	        contaDaMylane.deposita(100);
	        
	        
	        contaDaMylane.titular = mylane;
	        System.out.println(contaDaMylane.titular.nome);
	        
	    }
	
}
