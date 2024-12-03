public class Menu {
    public static void exibirMenu() {

        int opcaoEscolhida;

        do {
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Comprar Ingresso");
            System.out.println("2 - Cancelar Ingresso");
            System.out.println("3 - Visualizar Assentos");
            System.out.println("4 - Histórico de Compras");
            System.out.println("5 - Ver Lucros do Teatro");
            System.out.println("6 - Sair");
            System.out.print("Digite sua escolha: ");
            opcaoEscolhida = Entrada.obterOpcaoMenu();

            switch (opcaoEscolhida) {
                case 1:
                    Compra.realizarCompra();
                    break;
                case 2:
                    Desistencia.realizarCancelamento();
                    break;
                case 3:
                    Status.exibirStatus();
                    break;
                case 4:
                    Logs.exibirHistoricoCompras();
                    break;
                case 5:
                    Logs.exibirLucrosTeatro();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Encerrando o programa, até logo!");
                    System.out.println("Finalizando...");
                    System.out.println();
                    Erros.encerrarSistema("Encerramento do sistema");
                    Erros.exibirErros();
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Erro!!!");
                    System.out.println("Por favor, escolha uma opção válida de 1 a 6!");
                    System.out.println();
            }
        } while (opcaoEscolhida < 1 || opcaoEscolhida > 6);
    }
}
