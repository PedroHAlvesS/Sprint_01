import Componentes.Mensagem;
import Security.Autenticacao;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {


        while (Autenticacao.naoLogadoNoSistema()) {
            Autenticacao.naoLogadoNoSistema();
        }

        LocalTime horaQueLogou = LocalTime.now();
        System.out.println(Mensagem.mandaMensagemBoasVindas(horaQueLogou));


    }
}
