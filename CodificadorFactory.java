public class CodificadorFactory {

    public static Codificador criarCodificador(int nivelSeguranca) {
        Codificador[] codificadores = {
            new CodificadorSimples(),
            new CodificadorAltera(),
            new CodificadorVogais()
        };

        int aux = Integer.MAX_VALUE;
        int posicao = 0;

        for(int i = 0; i < codificadores.length; i++) {
            int numProximo = Math.abs(codificadores[i].getNivelSeguranca() - nivelSeguranca);
            
            if(numProximo < aux) {
                aux = numProximo;
                posicao = i;
            }
        }

        return codificadores[posicao];
    }
}