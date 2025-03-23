import java.time.LocalDate;

public class CodificadorAltera implements Codificador {
    //altera entre maiusculo e minisculo 

    public String getNome() {
        return "Codificador Embaralha";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 23);
    }

    public int getNivelSeguranca() {
        return 30;
    }

    public String codifica(String str) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            //par maiuscula, impar minuscula
            if (Character.isLetter(c)) {
                c = (i % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c);
            }
            resultado.append(c);
        }
        resultado.toString();
    }

    public String decodifica(String str) {
        return str.toLowerCase();
    }
}