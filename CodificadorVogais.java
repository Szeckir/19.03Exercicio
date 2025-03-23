import java.time.LocalDate;

public class CodificadorVogais implements Codificador {
//transforma vogais em simbolos

    public String getNome() {
        return "Codificador Vogais";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 23);
    }

    public int getNivelSeguranca() {
        return 35;
    }

    public String codifica(String str) {
        return str.replace("a", "$")
                  .replace("e", "%")
                  .replace("i", "&")
                  .replace("o", "!")
                  .replace("u", "?")
                  .replace("A", "$")
                  .replace("E", "%")
                  .replace("I", "&")
                  .replace("O", "!")
                  .replace("U", "?");
    }

    public String decodifica(String str) {
        return str.replace("$", "a")
                  .replace("%", "e")
                  .replace("&", "i")
                  .replace("!", "o")
                  .replace("?", "u");
    }
}