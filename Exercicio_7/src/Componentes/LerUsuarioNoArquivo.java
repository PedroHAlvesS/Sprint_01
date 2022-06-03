package Componentes;

import Domain.Usuario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerUsuarioNoArquivo {

    //public static ArrayList<Usuario> leUsuariosNoArquivoTxt() throws IOException {
    public static void leUsuariosNoArquivoTxt() throws IOException {
        ArrayList<Usuario> usuariosLista = new ArrayList<Usuario>();
        FileReader arquivo = new FileReader("src/usuarios.txt");
        BufferedReader leitor = new BufferedReader(arquivo);
        int contadorDeLinhas = 0;

        while (leitor.ready()) {
            System.out.println(leitor.readLine());
        }

    }

}
