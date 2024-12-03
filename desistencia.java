public class Desistencia {

    public static void realizarDesistencia() {

        int numeroDeLinha = 0;
        int numeroDeColuna = 0;
        int andarEscolhido = 0;

        
        do {
            System.out.println("\nSelecione o andar para desistir da compra: ");
            System.out.println("1 - 1° Andar");
            System.out.println("2 - 2° Andar");
            System.out.println("3 - 3° Andar");
            System.out.print("Resposta: ");
            andarEscolhido = Entrada.obterAndarParaDesistencia(); 

            if (andarEscolhido != 1 && andarEscolhido != 2 && andarEscolhido != 3) {
                Erros.mensagemErroAndarInvalido("Desistência");
            }
        } while (andarEscolhido != 1 && andarEscolhido != 2 && andarEscolhido != 3);

        
        if (andarEscolhido == 1) {
            do {
                System.out.println("\nDigite o assento que deseja cancelar: ");
                System.out.println("Linha -> 1 - 30");
                System.out.print("Resposta: ");
                numeroDeLinha = Entrada.obterNumeroLinhaParaDesistencia(); 

                if (numeroDeLinha < 1 || numeroDeLinha > 30) {
                    Erros.mensagemErroLinhaInvalida("Desistência");
                }
            } while (numeroDeLinha < 1 || numeroDeLinha > 30);

            do {
                System.out.print("Coluna -> 1 - 50: ");
                numeroDeColuna = Entrada.obterNumeroColunaParaDesistencia(); 

                if (numeroDeColuna < 1 || numeroDeColuna > 50) {
                    Erros.mensagemErroColunaInvalida("Desistência");
                }
            } while (numeroDeColuna < 1 || numeroDeColuna > 50);
        }

        
        else if (andarEscolhido == 2) {
            do {
                System.out.println("\nDigite o assento que deseja cancelar: ");
                System.out.println("Linha -> 1 - 20");
                System.out.print("Resposta: ");
                numeroDeLinha = Entrada.obterNumeroLinhaParaDesistencia();

                if (numeroDeLinha < 1 || numeroDeLinha > 20) {
                    Erros.mensagemErroLinhaInvalida("Desistência");
                }
            } while (numeroDeLinha < 1 || numeroDeLinha > 20);

            do {
                System.out.print("Coluna -> 1 - 30: ");
                numeroDeColuna = Entrada.obterNumeroColunaParaDesistencia();

                if (numeroDeColuna < 1 || numeroDeColuna > 30) {
                    Erros.mensagemErroColunaInvalida("Desistência");
                }
            } while (numeroDeColuna < 1 || numeroDeColuna > 30);
        }

        
        else {
            do {
                System.out.println("\nDigite o assento que deseja cancelar: ");
                System.out.println("Linha -> 1 - 10");
                System.out.print("Resposta: ");
                numeroDeLinha = Entrada.obterNumeroLinhaParaDesistencia();

                if (numeroDeLinha < 1 || numeroDeLinha > 10) {
                    Erros.mensagemErroLinhaInvalida("Desistência");
                }
            } while (numeroDeLinha < 1 || numeroDeLinha > 10);

            do {
                System.out.print("Coluna -> 1 - 15: ");
                numeroDeColuna = Entrada.obterNumeroColunaParaDesistencia();

                if (numeroDeColuna < 1 || numeroDeColuna > 15) {
                    Erros.mensagemErroColunaInvalida("Desistência");
                }
            } while (numeroDeColuna < 1 || numeroDeColuna > 15);
        }

        andarEscolhido--;

        Status.cancelarReserva(andarEscolhido, numeroDeLinha, numeroDeColuna);

        System.out.println();
        System.out.println("O que você deseja fazer agora?");
        System.out.println();
        Menu.exibirOpcoesMenu(); 
    }
}
