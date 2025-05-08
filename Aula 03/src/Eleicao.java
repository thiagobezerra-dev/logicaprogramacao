import java.util.Scanner;

public class Eleicao {
	public static void main (String [] args) {
		// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double qtdVotoA = 0;
		double qtdVotoB = 0;
		double qtdVotoC = 0;
		double qtdVotoBranco = 0;
		double qtdVotoNulo = 0;
		
		double totalVotos = 0;
		double totalVotosValidos = 0;
		
		double percentualVotoA = 0;
		double percentualVotoB = 0;
		double percentualVotoC = 0;
		double percentualVotoBranco = 0;
		double percentualVotoNulo = 0;
		
		// Entrada de dados
		System.out.print("Quantidade de votos candidato A: ");
		qtdVotoA = leitor.nextDouble();
		
		System.out.print("Quantidade de votos candidato B: ");
		qtdVotoB = leitor.nextDouble();
		
		System.out.print("Quantidade de votos candidato C: ");
		qtdVotoC = leitor.nextDouble();
		
		System.out.print("Quantidade de votos em branco: ");
		qtdVotoBranco = leitor.nextDouble();
		
		System.out.print("Quantidade de votos nulos: ");
		qtdVotoNulo = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		totalVotos = (qtdVotoA + qtdVotoB + qtdVotoC + qtdVotoBranco + qtdVotoNulo); 
		totalVotosValidos = (qtdVotoA + qtdVotoB + qtdVotoC);
		
		percentualVotoA = (( 100 * qtdVotoA) / totalVotosValidos);
		percentualVotoB = (( 100 * qtdVotoA) / totalVotosValidos);
		percentualVotoC = (( 100 * qtdVotoA) / totalVotosValidos);
		percentualVotoBranco = (( 100 * qtdVotoBranco) / totalVotos);
		percentualVotoNulo = (( 100 * qtdVotoNulo) / totalVotos);
		
		// Saída de dados
		 System.out.println("Candidato A: " + percentualVotoA + "%");
		 System.out.println("Candidato B: " + percentualVotoB + "%");
		 System.out.println("Candidato C: " + percentualVotoC + "%");
		 System.out.println("Branco: " + percentualVotoBranco + "%");
		 System.out.println("Nulo " + percentualVotoNulo + "%");
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
