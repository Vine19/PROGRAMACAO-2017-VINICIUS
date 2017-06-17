
import java.util.ArrayList;

public class Pais {

    private String nome;
    private String nomeCap;
    private Double dimensao;
    private ArrayList<Pais> paisesVizinhos;

    public Pais(String nome, String nomeCap, Double dimensao, ArrayList<Pais> paisesVizinhos) {
        this.nome = nome;
        this.nomeCap = nomeCap;
        this.dimensao = dimensao;
        this.paisesVizinhos = paisesVizinhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }
    
    public String getNomeCap() {
        return nomeCap;
    }

    public void setNomeCap(String nomeCap) {
        this.nomeCap = nomeCap;
    }

    public ArrayList<Pais> getPaisesVizinhos() {
        return paisesVizinhos;
    }

    public void setPaisesVizinhos(ArrayList<Pais> paisesVizinhos) {
        this.paisesVizinhos = paisesVizinhos;
    }

    public boolean equals(final Pais outro) {
        return this.nome.equals(outro.getNome()) && this.nomeCap.equals(outro.getNomeCap());
    }
    
   public ArrayList<Pais> paisesVizinhosEmComum(Pais pais) {
    ArrayList<Pais> paisesEmComum = new ArrayList<Pais>();

    if (this.paisesVizinhos != null && pais.getPaisesVizinhos() != null) {

        this.paisesVizinhos.stream().filter((paisAtual) -> (pais.getPaisesVizinhos().contains(paisAtual))).forEachOrdered((paisAtual) -> {
            paisesEmComum.add(paisAtual);
        });
    }
    return paisesEmComum;
  }
    
}

