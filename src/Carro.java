import java.util.Scanner;

public class Carro {
        // Campos da classe
        public static int Acelerador = 1;
        public static int Velocidade = 0;
        public static int Freio = -1;

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Loop principal do programa
                while (true) {
                        // Impressão do velocímetro e opções
                        System.out.println("Velocímetro: " + Velocidade + "\n1 - Acelerador\n2 - Freio");

                        int decisao = scanner.nextInt();

                        // Chamar o método correspondente à decisão do usuário
                        if (decisao == 1) {
                                pisarAcelerador();
                        } else if (decisao == 2) {
                                freio();
                        }

                        // Verificar se a velocidade voltou a zero para encerrar o loop
                        if (Velocidade == 0) {
                                break;
                        }
                }

                // Fechar o Scanner após sair do loop
                scanner.close();
        }

        // Método para acelerar
        public static void pisarAcelerador() {
                Velocidade += Acelerador;
                System.out.println("Velocímetro: " + Velocidade);
        }

        // Método para frear
        public static void freio() {
                Velocidade += Freio; // Reduz a velocidade
                System.out.println("Velocímetro: " + Velocidade);
        }
}