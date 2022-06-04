package Componentes;

import Domain.Perguntas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivoComPerguntas {
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
            if (LerArquivoComPerguntas.leitorNoTituloDaPergunta(contadorDeLinhas)) {
                tituloTemp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (LerArquivoComPerguntas.leitorNaAlternativa1(contadorDeLinhas)) {
                pergunta1Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (LerArquivoComPerguntas.leitorNaAlternativa2(contadorDeLinhas)) {
                pergunta2Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (LerArquivoComPerguntas.leitorNaAlternativa3(contadorDeLinhas)) {
                pergunta3Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (LerArquivoComPerguntas.leitorNaALternativa4(contadorDeLinhas)) {
                pergunta4Temp = linha;
                contadorDeLinhas++;
                continue;
            }
            if (LerArquivoComPerguntas.leitorNaAlternativaCorreta(contadorDeLinhas)) {
                respostaCertaIdTemp = Integer.parseInt(linha);
                contadorDeLinhas = 0;
                Perguntas perguntaTemp = new Perguntas(tituloTemp, pergunta1Temp, pergunta2Temp,
                        pergunta3Temp, pergunta4Temp, respostaCertaIdTemp);
                perguntas.add(perguntaTemp);
            }
        }
        return perguntas;
    }

    private static boolean leitorNoTituloDaPergunta(int contadorDeLinhas) {
        return contadorDeLinhas == 0;
    }

    private static boolean leitorNaAlternativa1(int contadorDeLinhas) {
        return contadorDeLinhas == 1;
    }

    private static boolean leitorNaAlternativa2(int contadorDeLinhas) {
        return contadorDeLinhas == 2;
    }

    private static boolean leitorNaAlternativa3(int contadorDeLinhas) {
        return contadorDeLinhas == 3;
    }

    private static boolean leitorNaALternativa4(int contadorDeLinhas) {
        return contadorDeLinhas == 4;
    }

    private static boolean leitorNaAlternativaCorreta(int contadorDeLinhas) {
        return contadorDeLinhas == 5;
    }
}
