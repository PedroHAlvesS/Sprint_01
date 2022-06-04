package Domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Perguntas {
    private String pergunta;
    private String resposta1;
    private String resposta2;
    private String resposta3;
    private String resposta4;
    private int respostaCertaId;

    public Perguntas(String pergunta, String resposta1,
                     String resposta2, String resposta3, String resposta4, int respostaCertaId) {
        this.pergunta = pergunta;
        this.resposta1 = resposta1;
        this.resposta2 = resposta2;
        this.resposta3 = resposta3;
        this.resposta4 = resposta4;
        this.respostaCertaId = respostaCertaId;
    }

    public boolean acertouRespostaDaPergunta(int respostaDoUsuario) {
        return respostaDoUsuario == this.respostaCertaId;
    }

    public void imprimirPergunta() {
        System.out.println("------");
        System.out.println(this.pergunta);
        System.out.println(this.resposta1);
        System.out.println(this.resposta2);
        System.out.println(this.resposta3);
        System.out.println(this.resposta4);
        System.out.println("------");
    }

    public static void mostraPerguntasProUsuario(ArrayList<Perguntas> perguntas, Usuario usuario) {
        Scanner teclado = new Scanner(System.in);
        for (Perguntas perguntaTemp : perguntas) {
            perguntaTemp.imprimirPergunta();
            System.out.println("Sr(a) " + usuario.getNome() + " informe o número da resposta que você acha correta: ");
            int respostaUsuario = Integer.parseInt(teclado.nextLine());
            if (perguntaTemp.acertouRespostaDaPergunta(respostaUsuario)) {
                usuario.acertouPergunta();
            } else {
                usuario.errouPergunta();
            }
        }
    }


}
