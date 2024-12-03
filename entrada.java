import java.util.Scanner;

public class Entrada {

    
    private static int obterInteiroValido(String mensagemErro) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        if (scanner.hasNextInt()) {
            valor = scanner.nextInt();
            return valor;
        } else {
            System.out.println();
            System.out.println("Opção inválida!!!");
            System.out.println(mensagemErro);
            System.out.println();
            return -1; 
        }
    }

    public static int entrada_menu() {
        System.out.print("Escolha uma opção do menu: ");
        int opcao = obterInteiroValido("Esse valor é inválido para o menu!");
        if (opcao != -1) {
            return opcao;
        } else {
            Menu.menu(); 
            return -1;
        }
    }

    public static int entrada_andar() {
        System.out.print("Escolha um andar: ");
        int andar = obterInteiroValido("Esse valor é inválido para o andar!");
        if (andar != -1) {
            return andar;
        } else {
            Erros.andar_invalido("Andar inválido"); 
            Status.status();  
            return -1;
        }
    }

    public static int entrada_andar_compra() {
        System.out.print("Escolha um andar para compra: ");
        int andar = obterInteiroValido("Esse valor é inválido para o andar!");
        if (andar != -1) {
            return andar;
        } else {
            Compra.compra(); 
            return -1;
        }
    }

    public static int entrada_andar_desistencia() {
        System.out.print("Escolha um andar para desistência: ");
        int andar = obterInteiroValido("Esse valor é inválido para o andar!");
        if (andar != -1) {
            return andar;
        } else {
            Desistencia.desistencia(); 
            return -1;
        }
    }

    public static int entrada_linha_compra() {
        System.out.print("Escolha a linha para a compra: ");
        int linha = obterInteiroValido("Esse valor é inválido para a linha!");
        if (linha != -1) {
            return linha;
        } else {
            Compra.compra(); 
            return -1;
        }
    }

    public static int entrada_linha_desistencia() {
        System.out.print("Escolha a linha para desistir: ");
        int linha = obterInteiroValido("Esse valor é inválido para a linha!");
        if (linha != -1) {
            return linha;
        } else {
            Desistencia.desistencia(); 
            return -1;
        }
    }

    public static int entrada_coluna_compra() {
        System.out.print("Escolha a coluna para a compra: ");
        int coluna = obterInteiroValido("Esse valor é inválido para a coluna!");
        if (coluna != -1) {
            return coluna;
        } else {
            Compra.compra();
            return -1;
        }
    }

    public static int entrada_coluna_desistencia() {
        System.out.print("Escolha a coluna para desistir: ");
        int coluna = obterInteiroValido("Esse valor é inválido para a coluna!");
        if (coluna != -1) {
            return coluna;
        } else {
            Desistencia.desistencia(); 
            return -1;
        }
    }

    public static int entrada_pagamento() {
        System.out.print("Escolha a forma de pagamento: ");
        int formaPagamento = obterInteiroValido("Esse valor é inválido para a forma de pagamento!");
        if (formaPagamento != -1) {
            return formaPagamento;
        } else {
            Compra.compra(); 
            return -1;
        }
    }

    public static int entrada_pagamento_debito() {
        System.out.print("Digite sua senha para pagamento com débito: ");
        int senha = obterInteiroValido("Esse valor é inválido para a senha!");
        if (senha != -1) {
            return senha;
        } else {
            Compra.compra(); 
            return -1;
        }
    }

    public static int entrada_pagamento_credito() {
        System.out.print("Digite sua senha para pagamento com crédito: ");
        int senha = obterInteiroValido("Esse valor é inválido para a senha!");
        if (senha != -1) {
            return senha;
        } else {
            Compra.compra(); 
            return -1;
        }
    }

    public static Double entrada_pagamento_dinheiro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor para pagamento em dinheiro: ");
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println();
            System.out.println("Opção inválida!!!");
            System.out.println("Esse valor é inválido para o pagamento em dinheiro!");
            System.out.println("Tente novamente!");
            System.out.println();
            Compra.compra(); 
            return -1.0; 
        }
    }
}
