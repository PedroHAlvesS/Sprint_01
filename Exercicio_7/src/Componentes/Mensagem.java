package Componentes;

import java.time.LocalTime;

public class Mensagem {
    private static LocalTime horasManha6 = LocalTime.of(6, 0, 0);
    private static LocalTime horasTarde12 = LocalTime.of(12, 0, 0);
    private static LocalTime horasNoite18 = LocalTime.of(18,0, 0);

    public static String mandaMensagemBoasVindas(LocalTime horaQueLogou) {
        if (Mensagem.logouPelaManha(horaQueLogou)) {
            return Mensagem.mensagemBomDia();
        }
        if (Mensagem.logouPelaTarde(horaQueLogou)) {
            return Mensagem.mensagemBoaTarde();
        }
        if (Mensagem.logouPelaNoite(horaQueLogou)) {
            return Mensagem.mensagemBoaNoite();
        }
        if (Mensagem.logouPelaMadrugada(horaQueLogou)) {
            return Mensagem.mensagemBoaMadrugada();
        }
        return "Bom dia,";
    }

    private static String mensagemBomDia() {
        return "Bom dia, você se logou ao nosso sistema";
    }

    private static String mensagemBoaTarde() {
        return "Boa tarde, você se logou ao nosso sistema";
    }

    private static String mensagemBoaNoite() {
        return "Boa noite, você se logou ao nosso sistema";
    }

    private static String mensagemBoaMadrugada() {
        return "Boa madrugada, você se logou ao nosso sistema";
    }

    public static void limparTela() {
        for (int i = 0; i < 120; i++) {
            System.out.println("");
        }
    }

    private static boolean logouPelaManha(LocalTime horaQueLogou) {
        return (horaQueLogou.isAfter(horasManha6) && horaQueLogou.isBefore(horasTarde12) || horaQueLogou.equals(horasManha6));
    }

    private static boolean logouPelaTarde(LocalTime horaQueLogou) {
        return (horaQueLogou.isAfter(horasTarde12) && horaQueLogou.isBefore(horasNoite18) || horaQueLogou.equals(horasTarde12));
    }

    private static boolean logouPelaNoite(LocalTime horaQueLogou) {
        return (horaQueLogou.isAfter(horasNoite18) || horaQueLogou.equals(horasNoite18));
    }

    private static boolean logouPelaMadrugada(LocalTime horaQueLogou) {
        return horaQueLogou.isBefore(horasManha6);
    }
}
