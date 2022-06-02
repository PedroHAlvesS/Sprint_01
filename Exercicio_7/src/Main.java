import Domain.Mensagem;
import Domain.Usuario;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[2];
        usuarios[0] = new Usuario("teste", "123");
        usuarios[1] = new Usuario("teste5", "123");

        boolean naoEstaLogado = true;
        while (naoEstaLogado) {
            System.out.println("Informe o usuário:");
            String login = teclado.nextLine();
            System.out.println("Informe a senha: ");
            String password = teclado.nextLine();
            for (Usuario usuario : usuarios) {
                if (usuario.confereAutenticacao(login, password)) {
                    naoEstaLogado = false;
                }
            }
            if (naoEstaLogado) {
                System.out.println("Usuário ou senha incorretos!");
            }
        }
        LocalTime horaQueLogou = LocalTime.now();

        System.out.println(Mensagem.mandaMensagemBoasVindas(horaQueLogou));

    }
}
