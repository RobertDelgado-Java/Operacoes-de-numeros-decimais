package operações_números_decimais;

public class MediaDeNotasDecimais {
	
	public static void main(String[] args) {
		
		/*Usando a variavel double, para poder calcular com números decimais*/
		
		/*Dados*/
		double nota1 = 25.6;
		double nota2 = 25.8;
		double nota3 = 50.9;
		double nota4 = 98.9;
	 
	    /*Calculo*/
		double somaNotas = (nota1 + nota2 + nota3 + nota4);
		double media = somaNotas / 4;
		
		System.out.println("A média das notas informadas é: " + media);
		
		
	}

}
