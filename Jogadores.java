package candicional;

import java.util.Scanner;

public class Jogadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Declaração das variáveis
	        int totalJogadores = 5 * 11; // 5 times com 11 jogadores cada
	        int totalMenores18 = 0;
	        double totalIdades = 0;
	        double totalAlturas = 0;
	        int totalJogadoresMais80Kg = 0;

	        // Loop para cada time
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Time " + i + ":");

	            // Variáveis para armazenar média do time
	            int totalJogadoresTime = 0;
	            double totalIdadesTime = 0;
	            double totalAlturasTime = 0;

	            // Loop para cada jogador do time
	            for (int j = 1; j <= 11; j++) {
	                System.out.println("Jogador " + j + ":");
	                System.out.print("Idade: ");
	                int idade = scanner.nextInt();
	                System.out.print("Peso (kg): ");
	                double peso = scanner.nextDouble();
	                System.out.print("Altura (metros): ");
	                double altura = scanner.nextDouble();

	                // Questão A: Contagem de jogadores com menos de 18 anos
	                if (idade < 18) {
	                    totalMenores18++;
	                }

	                // Questão D: Contagem de jogadores com mais de 80 kg
	                if (peso > 80) {
	                    totalJogadoresMais80Kg++;
	                }

	                // Acumular idade e altura para calcular médias
	                totalIdades += idade;
	                totalAlturas += altura;
	                totalIdadesTime += idade;
	                totalAlturasTime += altura;
	                totalJogadoresTime++;
	            }

	            // Questão B: Média de idade do time
	            double mediaIdadeTime = totalIdadesTime / totalJogadoresTime;
	            System.out.println("Média de idade do time " + i + ": " + mediaIdadeTime);

	            // Questão C: Média de altura do time
	            double mediaAlturaTime = totalAlturasTime / totalJogadoresTime;
	            System.out.println("Média de altura do time " + i + ": " + mediaAlturaTime);
	        }

	        // Questão A: Quantidade de jogadores com menos de 18 anos
	        System.out.println("Quantidade de jogadores com menos de 18 anos: " + totalMenores18);

	        // Questão D: Porcentagem de jogadores com mais de 80 kg
	        double porcentagemMais80Kg = (double) totalJogadoresMais80Kg / totalJogadores * 100;
	        System.out.println("Porcentagem de jogadores com mais de 80 kg: " + porcentagemMais80Kg + "%");

	        scanner.close();
	    }
	

	}


