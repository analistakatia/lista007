public class TestePais {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 15000);
        brasil.setPopulacao(3000);
        Pais uruguai = new Pais("URU", "Uruguai", 5000);
        uruguai.setPopulacao(2000);
        Pais argentina = new Pais("ARG", "Argentina", 10000);
        argentina.setPopulacao(3050);
        Pais japao = new Pais("JAP", "Japão", 200000);
        japao.setPopulacao(2500);

        //Adicionando os países vizinhos ao Brasil
        brasil.adicionarPais(uruguai);
        brasil.adicionarPais(argentina);


        //Verificando os paises vizinhos com o Brasil
        brasil.verificarVizinho(uruguai);
        brasil.verificarVizinho(argentina);
        brasil.verificarVizinho(japao);

        //Apresentando a lista de países vizinhos
        brasil.listarPais();

        //Apresentando a densidade demográfica de cada país
        System.out.println("Densidade demográfica é: "+brasil.calcularDensidade());
        System.out.println("Densidade demográfica é: "+uruguai.calcularDensidade());
        System.out.println("Densidade demográfica é: "+argentina.calcularDensidade());
        System.out.println("Densidade demográfica é: "+japao.calcularDensidade());
    }
}
