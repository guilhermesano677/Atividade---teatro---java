public class Pagamento {

    public static double dinheiro = 0.0;
    public static double troco = 0.0;
    public static double total = 0.0;

    
    public static void pagamento(int andar, int linha, int coluna, String Status) {
        int forma_pagamento;

        do {
            System.out.println("\nEscolha uma das opções: \n1 - Pix\n2 - Cartão de Débito\n3 - Cartão de Crédito\n4 - Dinheiro");
            System.out.print("Resposta: ");
            forma_pagamento = Entrada.entrada_pagamento();

            switch (forma_pagamento) {
                case 1:
                    pagamentoPix(andar, linha, coluna, Status);
                    break;
                case 2:
                    pagamentoDebito(andar, linha, coluna, Status);
                    break;
                case 3:
                    pagamentoCredito(andar, linha, coluna, Status);
                    break;
                case 4:
                    pagamentoDinheiro(andar, linha, coluna, Status);
                    break;
                default:
                    System.out.println("\nErro!!!\nEscolha uma opção de 1 a 4!");
            }
        } while (forma_pagamento < 1 || forma_pagamento > 4);
    }

    
    public static void pagamentoPix(int andar, int linha, int coluna, String Status) {
        if (Status.equals("Comprar")) {
            dinheiro = 20;
            total += dinheiro;
            System.out.println("\nVocê selecionou o Pix como forma de pagamento!");
            System.out.println("Escaneie a chave Pix abaixo para o pagamento");
            System.out.println("(41)99924-8834");
            Logs.valor_teatro("Compra", "Pix", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Comprar", "Pix");
        } else if (Status.equals("Desistência")) {
            dinheiro = -20;
            total += dinheiro;
            System.out.println("\nVocê selecionou o Pix como forma de devolução!");
            System.out.println("Devolução realizada com sucesso!");
            Logs.valor_teatro("Desistência", "Pix", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Desistência", "Pix");
        }
    }

    
    public static void pagamentoDebito(int andar, int linha, int coluna, String Status) {
        System.out.println("\nVocê selecionou o Cartão de Débito como forma de pagamento!");
        if (!validarSenha()) {
            System.out.println("Senha inválida!");
            return;
        }

        if (Status.equals("Comprar")) {
            dinheiro = 20;
            total += dinheiro;
            System.out.println("Pagamento realizado com sucesso!");
            Logs.valor_teatro("Compra", "Cartão de Débito", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Comprar", "Cartão de Débito");
        } else if (Status.equals("Desistência")) {
            dinheiro = -20;
            total += dinheiro;
            System.out.println("Devolução realizada com sucesso!");
            Logs.valor_teatro("Desistência", "Cartão de Débito", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Desistência", "Cartão de Débito");
        }
    }

    
    public static void pagamentoCredito(int andar, int linha, int coluna, String Status) {
        System.out.println("\nVocê selecionou o Cartão de Crédito como forma de pagamento!");
        if (!validarSenha()) {
            System.out.println("Senha inválida!");
            return;
        }

        if (Status.equals("Comprar")) {
            dinheiro = 20;
            total += dinheiro;
            System.out.println("Pagamento realizado com sucesso!");
            Logs.valor_teatro("Compra", "Cartão de Crédito", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Comprar", "Cartão de Crédito");
        } else if (Status.equals("Desistência")) {
            dinheiro = -20;
            total += dinheiro;
            System.out.println("Devolução realizada com sucesso!");
            Logs.valor_teatro("Desistência", "Cartão de Crédito", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Desistência", "Cartão de Crédito");
        }
    }

    
    public static void pagamentoDinheiro(int andar, int linha, int coluna, String Status) {
        if (Status.equals("Comprar")) {
            System.out.println("\nVocê selecionou o Dinheiro como forma de pagamento!");
            System.out.println("\nInforme o valor do pagamento");
            System.out.print("Resposta: ");
            dinheiro = Entrada.entrada_pagamento_dinheiro();

            if (dinheiro > 20) {
                total += dinheiro;
                troco = dinheiro - 20;
                System.out.println("Pagamento realizado com sucesso");
                System.out.println("Troco do pagamento: " + troco);
                Logs.valor_teatro("Compra", "Dinheiro", dinheiro, troco, total);
                Logs.logs(andar, linha, coluna, "Compra", "Dinheiro");
            } else if (dinheiro == 20) {
                System.out.println("Pagamento realizado com sucesso");
                Logs.valor_teatro("Compra", "Dinheiro", dinheiro, troco, total);
                Logs.logs(andar, linha, coluna, "Compra", "Dinheiro");
            } else {
                System.out.println("Erro!!!");
                System.out.println("Falha no pagamento");
                System.out.println("Tente novamente");
                Compra.compra(); 
            }
        } else if (Status.equals("Desistência")) {
            dinheiro = -20;
            total += dinheiro;
            System.out.println("Você selecionou o Dinheiro como forma de devolução!");
            System.out.println("\nDinheiro devolvido com sucesso");
            Logs.valor_teatro("Desistência", "Dinheiro", dinheiro, troco, total);
            Logs.logs(andar, linha, coluna, "Desistência", "Dinheiro");
        }
    }

    private static boolean validarSenha() {
        int senha = Entrada.entrada_pagamento_debito();  
        return senha == 1234;
    }
}
