public class App {
    public static void main(String[] args) throws Exception {
        String texto = "Este e o string a ser codificado";
        
        Codificador[] codificadores = {
            new CodificadorSimples(),
            new CodificadorAltera(),
            new CodificadorVogais()
        };

        CodificadorFactory fabrica = new CodificadorFactory();
        Codificador novo = fabrica.criarCodificador(40);
        System.out.println(novo.getNome());

        for (Codificador cod : codificadores) {
            System.out.println("Codificador: "+cod.getNome());
            System.out.println("Versao: "+cod.getDataCriacao());
            System.out.println("Nivel de segurança: "+cod.getNivelSeguranca());
            
            String codificado = cod.codifica(texto);
            String decodificado = cod.decodifica(codificado);

            System.out.println("Texto original: "+texto);
            System.out.println("Texto codificado: "+codificado);
            System.out.println("Texto decodificado: "+decodificado);
        }
    }
}
