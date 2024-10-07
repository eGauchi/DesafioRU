package classe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioRU {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        CardapioSemanal cardapioSemanal = new CardapioSemanal();
        List<Alimento> alimentos = new ArrayList<>();

        // Cadastrar alimentos
        System.out.println("Cadastrar Alimentos (Saladas, Prato principal e Acompanhamentos), digite 'continuar' para prosseguir com cardapio:");
        while (true) {
            System.out.print("Nome do alimento: ");
            String nomeAlimento = entrada.nextLine();
            if (nomeAlimento.equalsIgnoreCase("continuar")) {
                break;
            }
            alimentos.add(new Alimento(nomeAlimento));
        }

        // Criar menus para cada dia da semana
        String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"};
        String[] turnos = {"Almoço", "Jantar"};

        for (String dia : dias) {
            for (String turno : turnos) {
                System.out.println("\nCriar menu para " + dia + " - " + turno + ":");

                // Escolher Salada
                System.out.println("Escolha uma Salada:");
                for (int i = 0; i < alimentos.size(); i++) {
                    System.out.println((i + 1) + ". " + alimentos.get(i).obterNome());
                }
                System.out.print("Escolha o número do alimento: ");
                int escolhaSalada = entrada.nextInt() - 1;
                entrada.nextLine();  // Consumir a nova linha
                Alimento salada = alimentos.get(escolhaSalada);

                // Escolher Prato Principal
                System.out.println("Escolha um Prato Principal:");
                for (int i = 0; i < alimentos.size(); i++) {
                    System.out.println((i + 1) + ". " + alimentos.get(i).obterNome());
                }
                System.out.print("Escolha o número do alimento: ");
                int escolhaPrato = entrada.nextInt() - 1;
                entrada.nextLine();  // Consumir a nova linha
                Alimento pratoPrincipal = alimentos.get(escolhaPrato);

                // Escolher Acompanhamento
                System.out.println("Escolha um Acompanhamento:");
                for (int i = 0; i < alimentos.size(); i++) {
                    System.out.println((i + 1) + ". " + alimentos.get(i).obterNome());
                }
                System.out.print("Escolha o número do alimento: ");
                int escolhaAcompanhamento = entrada.nextInt() - 1;
                entrada.nextLine();  // Consumir a nova linha
                Alimento acompanhamento = alimentos.get(escolhaAcompanhamento);

                Refeicao refeicao = new Refeicao(salada, pratoPrincipal, acompanhamento);
                Menu menu = new Menu(dia, turno, refeicao);
                cardapioSemanal.adicionarMenu(dia, menu);
            }
        }

        // Imprimir o cardápio semanal
        cardapioSemanal.imprimirCardapio();
        entrada.close();
    }
}