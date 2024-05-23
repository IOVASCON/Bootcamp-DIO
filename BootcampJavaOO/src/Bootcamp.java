
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final List<Conteudo> conteudos = new ArrayList<>();
    private final List<Dev> devsInscritos = new ArrayList<>();

    // Método getter para o nome
    public String getNome() {
        return nome;
    }

    // Método setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para a descrição
    public String getDescricao() {
        return descricao;
    }

    // Método setter para a descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a lista de conteúdos
    public List<Conteudo> getConteudos() {
        return conteudos;
    }

    // Método para obter a lista de desenvolvedores inscritos
    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    @Override
    public String toString() {
        return "Bootcamp{"
                + "nome='" + nome + '\''
                + ", descricao='" + descricao + '\''
                + ", conteudos=" + conteudos
                + ", devsInscritos=" + devsInscritos
                + '}';
    }
}
