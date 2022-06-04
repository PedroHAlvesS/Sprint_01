package Domain;
import java.util.Scanner;

public class Usuario {
    private String nome;
    private int acertos;
    private int erros;

    public void criarUsuario() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        this.nome = teclado.nextLine();
        this.acertos = 0;
        this.erros = 0;
    }

    public void acertouPergunta() {
        this.acertos++;
    }

    public void errouPergunta() {
        this.erros++;
    }

    public void lerResultadoDoUsuario() {
        System.out.println("Usuario: " + this.nome);
        System.out.println("Acertos: " + this.acertos);
        System.out.println("Erros: " + this.erros);
    }

    public String getNome() {
        return nome;
    }
}
