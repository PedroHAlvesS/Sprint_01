import Componentes.LerArquivoComPerguntas;
import Domain.Perguntas;
import Domain.Usuario;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Olá está pronto para um quiz ?");
        Usuario usuario = new Usuario();
        usuario.criarUsuario();
        ArrayList<Perguntas> perguntas = LerArquivoComPerguntas.lerPerguntasNoTxt();
        Perguntas.mostraPerguntasProUsuario(perguntas, usuario);
        usuario.lerResultadoDoUsuario();
    }
}
