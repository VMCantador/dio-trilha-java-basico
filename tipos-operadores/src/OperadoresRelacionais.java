
public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		String nome1 = "VMC";
		String nome2 = "VMC";
		
		//System.out.println(nome1 == nome2);
		
		System.out.println(nome1.equals(nome2)); // para objetos é interessante utilizar o equals para comparações.
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		System.out.println("numero1 é igual a numero2? " + simNao);
		
		simNao = numero1 != numero2;
		
		System.out.println("numero1 é diferente ao numero2? " + simNao);
		
		simNao = numero1 > numero2;
		
		System.out.println("numero1 é maior que o numero2? " + simNao);
		
		if(numero1 < numero2) {
			System.out.println("A nossa condição é verdadeira");
		} else {
			System.out.println("A nossa condição é falsa");
		}
	}

}
