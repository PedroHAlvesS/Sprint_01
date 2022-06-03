package Security;

import Componentes.LerUsuarioNoArquivo;
import Componentes.Mensagem;
import Domain.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Autenticacao {

    private static Scanner teclado = new Scanner(System.in);
    private static ArrayList<Usuario> usuarios;



    private static void preencherVetor() {
        try {
            Autenticacao.usuarios = LerUsuarioNoArquivo.leUsuariosNoArquivoTxt();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean naoLogadoNoSistema() {
        Autenticacao.preencherVetor();
        System.out.println("Informe o usuário:");
        String login = teclado.nextLine();
        System.out.println("Informe a senha: ");
        String password = teclado.nextLine();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).confereAutenticacao(login, password)) {
                return false;
            }
        }
        Mensagem.limparTela();
        System.out.println("Usuário ou senha incorretos!");
        return true;
    }

}
