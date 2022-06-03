import Componentes.LerUsuarioNoArquivo;
import Componentes.Mensagem;
import Domain.Usuario;

import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Usuario> usuarios = LerUsuarioNoArquivo.leUsuariosNoArquivoTxt();

        boolean naoEstaLogado = true;
        while (naoEstaLogado) {
            System.out.println("Informe o usuário:");
            String login = teclado.nextLine();
            System.out.println("Informe a senha: ");
            String password = teclado.nextLine();
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).confereAutenticacao(login, password)) {
                    naoEstaLogado = false;
                    break;
                }
            }
            if (naoEstaLogado) {
                // loop para limpar console
                for (int i = 0; i < 120; i++) {
                    System.out.println("");
                }
                System.out.println("Usuário ou senha incorretos!");
            }
        }
        LocalTime horaQueLogou = LocalTime.now();
        System.out.println(Mensagem.mandaMensagemBoasVindas(horaQueLogou));


    }
}
