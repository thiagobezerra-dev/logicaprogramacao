import java.util.Scanner;

public class RevestimentoPiscina {
	public static void main (String [] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double comprimento = 0;
		double largura = 0;
		double profundidade= 0;
		double tamanhoAzulejo = 0;
		double quantidadeDeAzulejos = 0;
		
		// Entrada de dados
		System.out.print("Digite o comprimento da piscina: ");
		 comprimento = leitor.nextDouble();
		 
		System.out.print("Digite a largura da piscina: ");
		 largura = leitor.nextDouble();
		 
		System.out.print("Digite o profundidade da piscina: ");
		 profundidade = leitor.nextDouble();
		 
		System.out.print("Digite o tamanho do azulejo: ");
		 tamanhoAzulejo = leitor.nextDouble();
		 
		 leitor.close();
		 
		 // Processamento
		 quantidadeDeAzulejos = (((2 * profundidade * largura) + (2 * profundidade * comprimento) + (largura * comprimento)) / Math.pow(tamanhoAzulejo, 2));
	
		 // Saída de dados
		 System.out.println("A quantidade de azuleojos necessária " + " para construir a piscina é: " + quantidadeDeAzulejos);		 
		
		  
			
		 
		 
		 
		 
		 
		
		
	}

}
