package Domain;

import java.util.Objects;

public class Usuario {
    private String login;
    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean confereAutenticacao(String login, String password) {
        return Objects.equals(this.login, login) && Objects.equals(this.password, password);
    }
}
