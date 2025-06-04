
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha qual funcionalidade do Iphone você deseja utilizar: \n 0 - Aparelho Telefonico \n 1 - Navegador Internet \n 2 - Reprodutor Musical");

        int n = scanner.nextInt();

        switch(n){
            case 0: 
                System.out.println("Escolha qual funcionalidade do Aparelho Telefonico deseja usar: \n 0 - Ligar \n 1 - Atender \n 2 - Iniciar correio de voz ");

                n = scanner.nextInt();

                switch(n){
                    case 0:
                        System.out.println("Informo o número para qual desejar ligar: ");
                        String numero = scanner.next();
                        iphone.ligar(numero);
                        break;
                    case 1:
                        iphone.atender();
                        break;
                    case 2:
                        iphone.iniciarCorreioVoz();
                        break;
                }
            case 1:
                System.out.println("Escolha qual funcionalidade do Navegador Internet deseja usar: \n 0 - Exibir Pagina \n 1 - Adicionar nova aba \n 2 - Atualizar página ");

                n = scanner.nextInt();

                switch(n){
                    case 0: 
                        System.out.println("Digite a url da página que deseja visualizar: ");
                        String url = scanner.next();
                        iphone.exibirPagina(url);
                        break;
                    case 1:
                        iphone.adicionarNovaAba();
                        break;
                    case 2:
                        iphone.atualizarPagina();
                        break;
                }
            case 2: 
                System.out.println("Escolha qual funcionalidade do Reprodutor Musical deseja usar: \n 0 - Tocar \n 1 - Pausar \n 2 - Selecionar Musica ");

                n = scanner.nextInt();

                switch(n){
                    case 0:
                        iphone.tocar();
                        break;
                    case 1: 
                        iphone.pausar();
                        break;
                    case 2: 
                        System.out.println("Digite o nome da música que desejar selecionar: ");
                        String musica = scanner.next();
                        iphone.selecionarMusica(musica);
                        break;
                }
        }
    }
}
