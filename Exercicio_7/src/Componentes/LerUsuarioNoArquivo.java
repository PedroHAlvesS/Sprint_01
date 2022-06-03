package Componentes;

import Domain.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerUsuarioNoArquivo {

    public static ArrayList<Usuario> leUsuariosNoArquivoTxt() throws IOException {
        ArrayList<Usuario> usuariosLista = new ArrayList<Usuario>();
        FileReader arquivo = new FileReader("src/usuarios.txt");
        BufferedReader leitor = new BufferedReader(arquivo);
        int contadorDeLinhas = 0;
        String usuarioNoArquivoTemp = "";
        String senhaNoArquivoTemp = "";

        while (leitor.ready()) {
            String linha = leitor.readLine();
            if (linha.charAt(0) == '/') {
                continue;
            }
            if (linha.charAt(0) == '-') {
                continue;
            }
            if (contadorDeLinhas == 2) {
                contadorDeLinhas = 0;
                Usuario usuarioTemp = new Usuario(usuarioNoArquivoTemp, senhaNoArquivoTemp);
                usuariosLista.add(usuarioTemp);
            }
            if (contadorDeLinhas == 1) {
                senhaNoArquivoTemp = linha;
                contadorDeLinhas++;
            }
            if (contadorDeLinhas == 0) {
                usuarioNoArquivoTemp = linha;
                contadorDeLinhas++;
            }
        }

        return usuariosLista;

    }

}
