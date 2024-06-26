
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
        // Construtor padrão sem argumentos
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{"
                + "titulo='" + getTitulo() + '\''
                + ", descricao='" + getDescricao() + '\''
                + ", cargaHoraria=" + cargaHoraria
                + '}';
    }
}
