package Security;

import Componentes.LerUsuarioNoArquivo;
import Componentes.Mensagem;
import Domain.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
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
        String login = Autenticacao.teclado.nextLine();
        System.out.println("Informe a senha: ");
        String password = Autenticacao.teclado.nextLine();
        for (int i = 0; i < Autenticacao.usuarios.size(); i++) {
            if (Autenticacao.validarLogin(login, password, i)) {
                return false;
            }
        }
        Mensagem.limparTela();
        System.out.println("Usuário ou senha incorretos!");
        return true;
    }
    private static boolean validarLogin(String login, String password, int i) {
        return Objects.equals(Autenticacao.usuarios.get(i).getLogin(), login) &&
                Objects.equals(Autenticacao.usuarios.get(i).getPassword(), password);
    }

}
