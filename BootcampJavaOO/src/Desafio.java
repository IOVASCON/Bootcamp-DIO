
import java.time.LocalDate;

public class Desafio extends Conteudo {

    private LocalDate dataEntrega;

    public Desafio() {
        // Construtor padrão sem argumentos
    }

    public Desafio(String titulo, String descricao, LocalDate dataEntrega) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.dataEntrega = dataEntrega;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Desafio{"
                + "titulo='" + getTitulo() + '\''
                + ", descricao='" + getDescricao() + '\''
                + ", dataEntrega=" + dataEntrega
                + '}';
    }
}
