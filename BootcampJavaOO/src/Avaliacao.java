
public class Avaliacao {

    private String descricao;
    private int nota;

    // Construtor para inicializar os atributos da avaliação
    public Avaliacao(String descricao, int nota) {
        this.descricao = descricao;
        this.nota = nota;
    }

    // Método getter para a descrição
    public String getDescricao() {
        return descricao;
    }

    // Método setter para a descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método getter para a nota
    public int getNota() {
        return nota;
    }

    // Método setter para a nota
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Avaliacao{"
                + "descricao='" + descricao + '\''
                + ", nota=" + nota
                + '}';
    }
}
