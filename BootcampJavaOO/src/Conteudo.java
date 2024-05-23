
import java.util.ArrayList;
import java.util.List;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d; // Adicionando a variável XP_PADRAO

    private String titulo;
    private String descricao;
    private final List<Avaliacao> avaliacoes = new ArrayList<>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public abstract double calcularXp();
}
