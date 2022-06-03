package Componentes;

import java.time.LocalTime;

public class Mensagem {
    public static LocalTime horasManha6 = LocalTime.of(6, 0, 0);
    public static LocalTime horasTarde12 = LocalTime.of(12, 0, 0);
    public static LocalTime horasNoite18 = LocalTime.of(18,0, 0);

    public static String mandaMensagemBoasVindas(LocalTime horaQueLogou) {
        if (horaQueLogou.isAfter(horasManha6.minusNanos(1)) && horaQueLogou.isBefore(horasTarde12.plusNanos(1))) {
            return Mensagem.mensagemBomDia();
        }
        if (horaQueLogou.isAfter(horasTarde12) && horaQueLogou.isBefore(horasNoite18.plusNanos(1))) {
            return Mensagem.mensagemBoaTarde();
        }
        if (horaQueLogou.isAfter(horasNoite18)) {
            return Mensagem.mensagemBoaNoite();
        }
        if (horaQueLogou.isBefore(horasManha6)) {
            return Mensagem.mensagemBoaMadrugada();
        }
        return "Bom dia,";
    }

    public static String mensagemBomDia() {
        return "Bom dia, você se logou ao nosso sistema";
    }

    public static String mensagemBoaTarde() {
        return "Boa tarde, você se logou ao nosso sistema";
    }

    public static String mensagemBoaNoite() {
        return "Boa noite, você se logou ao nosso sistema";
    }

    public static String mensagemBoaMadrugada() {
        return "Boa madrugada, você se logou ao nosso sistema";
    }
}
