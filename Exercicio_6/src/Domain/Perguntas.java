package Domain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Perguntas {
    private String pergunta;
    private String resposta1;
    private String resposta2;
    private String resposta3;
    private String resposta4;
    private int respostaCertaId;


    public void criarPergunta(String pergunta, String resposta1,
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

    public void lerPergunta() {
        System.out.println(this.pergunta);
        System.out.println(this.resposta1);
        System.out.println(this.resposta2);
        System.out.println(this.resposta3);
        System.out.println(this.resposta4);
    }

    public static ArrayList<Perguntas> lerPerguntasNoTxt() throws IOException {
        ArrayList<Perguntas> perguntas = new ArrayList<Perguntas>();
        FileReader arquivo = new FileReader("src/perguntas.txt");
        BufferedReader leitor = new BufferedReader(arquivo);
        int contadorDeLinhas = 0;
        String tituloTemp = "";
        String pergunta1Temp = "";
        String pergunta2Temp = "";
        String pergunta3Temp = "";
        String pergunta4Temp = "";
        int respostaCertaIdTemp;
        while (leitor.ready()) {
            String linha = leitor.readLine();
            if (linha.charAt(0) == '/') {
                continue;
            }
            if (linha.charAt(0) == '-') {
                continue;
            }
            if (contadorDeLinhas == 0) {
                tituloTemp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (contadorDeLinhas == 1) {
                pergunta1Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (contadorDeLinhas == 2) {
                pergunta2Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (contadorDeLinhas == 3) {
                pergunta3Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (contadorDeLinhas == 4) {
                pergunta4Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (contadorDeLinhas == 5) {
                respostaCertaIdTemp = Integer.parseInt(linha);
                contadorDeLinhas = 0;
                Perguntas perguntaTemp = new Perguntas();
                perguntaTemp.criarPergunta(tituloTemp, pergunta1Temp, pergunta2Temp, pergunta3Temp, pergunta4Temp, respostaCertaIdTemp);
                perguntas.add(perguntaTemp);
            }
        }
        return perguntas;
    }
}
