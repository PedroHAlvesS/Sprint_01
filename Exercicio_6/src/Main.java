import Componentes.LerArquivoComPerguntas;
import Domain.Perguntas;
import Domain.Usuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Olá está pronto para um quiz ?");
        Usuario usuario = new Usuario();
        usuario.criarUsuario();
        ArrayList<Perguntas> perguntas = LerArquivoComPerguntas.lerPerguntasNoTxt();
        for (Perguntas perguntaTemp : perguntas) {
            perguntaTemp.lerPergunta();
            System.out.println("Sr(a) " + usuario.getNome() + " informe o número da resposta que você acha correta: ");
            int respostaUsuario = Integer.parseInt(teclado.nextLine());
            if (perguntaTemp.acertouRespostaDaPergunta(respostaUsuario)) {
                usuario.acertouPergunta();
            } else {
                usuario.errouPergunta();
            }
        }
        usuario.lerResultadoDoUsuario();


    }
}
