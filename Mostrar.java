public class Status {


    static boolean [][][] assentosDisponiveis = new boolean[60][60][3];
    
    public static void exibirStatus() {
        int andarEscolhido = 0;

        do {
            System.out.println();
            System.out.println("Escolha o andar que deseja visualizar: \n1 - 1º Andar\n2 - 2º Andar\n3 - 3º Andar\n");
            andarEscolhido = Entrada.obterAndar();

            
            if (andarEscolhido == 1) {
                for (int i = 1; i <= 30; i++) {
                    System.out.print(i + "A  ");
                    for (int j = 1; j <= 50; j++) {
                        if (assentosDisponiveis[i][j][0] == false) {
                            System.out.print(j + " - L \t"); 
                        } else {
                            System.out.print(j + " - V \t");  
                        }
                    }
                    System.out.println();
                }
            }

            
            if (andarEscolhido == 2) {
                for (int i = 1; i <= 20; i++) {
                    System.out.print(i + "A  ");
                    for (int j = 1; j <= 30; j++) {
                        if (assentosDisponiveis[i][j][1] == false) {
                            System.out.print(j + " - L \t");
                        } else {
                            System.out.print(j + " - V \t");  
                        }
                    }
                    System.out.println();
                }
            }

            
            if (andarEscolhido == 3) {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + "\t");
                    for (int j = 1; j <= 15; j++) {
                        if (assentosDisponiveis[i][j][2] == false) {
                            System.out.print(j + " - L \t");  
                        } else {
                            System.out.print(j + " - V \t");  
                        }
                    }
                    System.out.println();
                }
            }

            
            if (andarEscolhido == 1 || andarEscolhido == 2 || andarEscolhido == 3) {
                System.out.println();
                Menu.exibirMenu();  
            }

        } while (andarEscolhido != 1 && andarEscolhido != 2 && andarEscolhido != 3);

        
        Erros.andarInvalido("Andar não encontrado");
    }

    public static void realizarCompra(int andar, int linha, int coluna) {
        if (assentosDisponiveis[linha][coluna][andar] == false) {
            assentosDisponiveis[linha][coluna][andar] = true;
            Pagamento.processarPagamento(andar, linha, coluna, "Comprar");
            System.out.println("Compra realizada com sucesso para o assento na linha " + linha + ", coluna " + coluna + "!");
        } else {
            Erros.poltronaInvalida("O assento já foi comprado");
            Erros.compraCadeira("Este assento já está ocupado");
            Menu.exibirMenu();
        }
    }

    public static void realizarCancelamento(int andar, int linha, int coluna) {
        if (assentosDisponiveis[linha][coluna][andar] == true) {
            assentosDisponiveis[linha][coluna][andar] = false;  
            Pagamento.processarPagamento(andar, linha, coluna, "Desistência");
            System.out.println("Cancelamento do assento na linha " + linha + ", coluna " + coluna + " realizado com sucesso!");
        } else {
            Erros.desistenciaCadeira("Não há assento reservado para cancelar");
            Menu.exibirMenu();
        }
    }
}
