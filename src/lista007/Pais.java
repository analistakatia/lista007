import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String codigoIso;
    private String nome;
    private int populacao;
    private double dimensao;
    private Set<Pais> listaDePaises = new HashSet<>();

    public Pais(String codigoIso, String nome, double dimensao) {
        this.setCodigoIso(codigoIso);
        this.setNome(nome);
        this.setDimensao(dimensao);
    }
    public void verificarVizinho(Pais pais){
        if (this.listaDePaises.contains(pais)){
            System.out.println(pais.getNome() + " é vizinho.");
        }else {
            System.out.println(pais.getNome() + " não é vizinho");
        }
    }
    public void adicionarPais(Pais pais){
        this.listaDePaises.add(pais);
    }

    public void listarPais(){
        System.out.println("Os países vizinhos do " + this.getNome() + " são: ");
        for (Pais pais : listaDePaises){
            System.out.println(pais.getNome());
        }
    }
    public double calcularDensidade(){
        return this.getPopulacao() / this.getDimensao();
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Set<Pais> getListaDePais() {
        return listaDePaises;
    }

    public void setListaDePais(Set<Pais> listaDePais) {
        this.listaDePaises = listaDePais;
    }
}
