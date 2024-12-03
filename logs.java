import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    
    private static List<String[]> contador = new ArrayList<>();
    private static List<String[]> cont = new ArrayList<>();

    
    private static void adicionarLog(String[] logList, String... logData) {
        logList.add(logData);
    }

    
    public static void logs(int andar, int linha, int coluna, String Status, String Pagamento) {
        String[] log = new String[4];
        log[0] = "a " + (andar + 1) + " | l " + linha + " | c " + coluna;
        log[1] = Status;
        log[2] = Pagamento;
        log[3] = data();
        adicionarLog(contador, log);
    }

    
    public static void valorTeatro(String Status, String Pagamento, double dinheiro, double troco, double total) {
        String[] log = new String[5];
        log[0] = Status;
        log[1] = Pagamento;
        log[2] = String.format("Pagamento: R$ %.2f Troco: R$ %.2f", dinheiro, troco);
        log[3] = String.format("Total: R$ %.2f", total);
        log[4] = data();
        adicionarLog(cont, log);
    }

    
    private static String data() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return agora.format(formatoDataHora);
    }

    
    public static void imprimir() {
        System.out.println();
        System.out.println("Histórico de compra:");
        System.out.println();

        for (String[] log : contador) {
            if (log == null) break;
            System.out.println("Local: " + log[0]);
            System.out.println("Status: " + log[1]);
            System.out.println("Pagamento: " + log[2]);
            System.out.println("Data e hora: " + log[3]);
            System.out.println();
        }
        Menu.menu();
    }


    public static void imprimirValorTeatro() {
        System.out.println();
        System.out.println("Lucro do teatro:");
        System.out.println();

        for (String[] log : cont) {
            if (log == null) break;
            System.out.println("Status: " + log[0]);
            System.out.println("Pagamento: " + log[1]);
            System.out.println("Detalhes do pagamento: " + log[2]);
            System.out.println("Total: " + log[3]);
            System.out.println("Data e hora: " + log[4]);
            System.out.println();
        }
        Menu.menu();
    }
}
