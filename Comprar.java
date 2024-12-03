public class Compra {

    public static void realizarCompra() {

        int numeroLinha = 0;
        int numeroColuna = 0;
        int andarEscolhido = 0;

    
        do {
            System.out.println("\nInforme em qual andar você quer ficar: ");
            System.out.println("1 - 1° Andar");
            System.out.println("2 - 2° Andar");
            System.out.println("3 - 3° Andar");
            System.out.print("Resposta: ");
            andarEscolhido = Entrada.obterAndarCompra(); 

            if (andarEscolhido != 1 && andarEscolhido != 2 && andarEscolhido != 3) {
                Erros.andarInvalido("Compra");
            }
        } while (andarEscolhido != 1 && andarEscolhido != 2 && andarEscolhido != 3);

        
        if (andarEscolhido == 1) {
            do {
                System.out.println("\nInforme o assento escolhido: ");
                System.out.println("Linha -> 1 - 30");
                System.out.print("Resposta: ");
                numeroLinha = Entrada.obterLinhaCompra(); 

                if (numeroLinha < 1 || numeroLinha > 30) {
                    Erros.linhaInvalida("Compra");
                }
            } while (numeroLinha < 1 || numeroLinha > 30);

            do {
                System.out.println("Coluna -> 1 - 50: ");
                System.out.print("Resposta: ");
                numeroColuna = Entrada.obterColunaCompra(); 

                if (numeroColuna < 1 || numeroColuna > 50) {
                    Erros.colunaInvalida("Compra");
                }
            } while (numeroColuna < 1 || numeroColuna > 50);
        }

        
        else if (andarEscolhido == 2) {
            do {
                System.out.println("\nInforme o assento escolhido: ");
                System.out.println("Linha -> 1 - 20: ");
                System.out.print("Resposta: ");
                numeroLinha = Entrada.obterLinhaCompra();

                if (numeroLinha < 1 || numeroLinha > 20) {
                    Erros.linhaInvalida("Compra");
                }
            } while (numeroLinha < 1 || numeroLinha > 20);

            do {
                System.out.println("Coluna -> 1 - 30: ");
                System.out.print("Resposta: ");
                numeroColuna = Entrada.obterColunaCompra();

                if (numeroColuna < 1 || numeroColuna > 30) {
                    Erros.colunaInvalida("Compra");
                }
            } while (numeroColuna < 1 || numeroColuna > 30);
        }

        
        else {
            do {
                System.out.println("\nInforme o assento escolhido: ");
                System.out.println("Linha -> 1 - 10: ");
                System.out.print("Resposta: ");
                numeroLinha = Entrada.obterLinhaCompra();

                if (numeroLinha < 1 || numeroLinha > 10) {
                    Erros.linhaInvalida("Compra");
                }
            } while (numeroLinha < 1 || numeroLinha > 10);

            do {
                System.out.println("Coluna -> 1 - 15: ");
                System.out.print("Resposta: ");
                numeroColuna = Entrada.obterColunaCompra();

                if (numeroColuna < 1 || numeroColuna > 15) {
                    Erros.colunaInvalida("Compra");
                }
            } while (numeroColuna < 1 || numeroColuna > 15);
        }

    
        andarEscolhido--;

        
        Status.registrarCompra(andarEscolhido, numeroLinha, numeroColuna);

    
        System.out.println();
        System.out.println("Deseja realizar outra ação?");
        System.out.println();
        Menu.exibirMenu(); 
    }
}
