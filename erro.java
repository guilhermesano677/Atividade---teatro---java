import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Erros {
    private static List<String[]> erros = new ArrayList<>();
    private static int erroCount = 0;  

    
    private static void adicionarErro(String codigoErro, String status, String tipoErro) {
        String[] erro = new String[3];
        erro[0] = codigoErro;
        erro[1] = status;
        erro[2] = data();
        erros.add(erro);
        erroCount++;
        System.out.println(tipoErro + "\n");
    }

    
    public static void andarInvalido(String status) {
        adicionarErro("ERR0035", status, "Andar inválido");
    }

    public static void linhaInvalida(String status) {
        adicionarErro("ERR0055", status, "Linha inválida");
    }

    public static void colunaInvalida(String status) {
        adicionarErro("ERR0045", status, "Coluna inválida");
    }

    public static void poltronaInvalida(String status) {
        adicionarErro("ERR0005", status, "Poltrona inválida");
    }

    public static void compraCadeira(String status) {
        adicionarErro("ERR0015", status, "Compra de cadeira já comprada");
    }

    public static void desistenciaCadeira(String status) {
        adicionarErro("ERR0025", status, "Desistência de cadeira livre");
    }

    public static void iniciarSistema(String status) {
        adicionarErro("SYS0001", status, "Inicialização do sistema");
    }

    public static void encerrarSistema(String status) {
        adicionarErro("SYS0010", status, "Encerramento do sistema");
    }

    
    public static void imprimirErros() {
        for (String[] erro : erros) {
            System.out.println("Código de erro: " + erro[0]);
            System.out.println("Status: " + erro[1]);
            System.out.println("Data e hora: " + erro[2]);
            System.out.println();
        }
    }

    private static String data() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatoDataHora);
    }
}
