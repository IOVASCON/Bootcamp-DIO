
/**
 * Projeto: APRENDENDO NA PRÁTICA O PARADIGMA DE ORIENTAÇÃO A OBJETOS
 *
 * Este projeto tem como objetivo demonstrar a aplicação dos conceitos de
 * Abstração, Encapsulamento, Herança e Polimorfismo em Java através de um
 * exemplo de um Bootcamp.
 *
 * Funcionalidades implementadas:
 * 1. Abstração: Representação das entidades Bootcamp, Curso, Mentoria, Dev e Conteudo.
 * 2. Encapsulamento: Proteção dos atributos das classes, acessados via getters e setters.
 * 3. Herança: Uso de classes base (superclasse) como Conteudo e classes derivadas como Curso e Mentoria.
 * 4. Polimorfismo: Implementação de métodos abstratos na classe Conteudo e sobrescritos nas classes Curso e Mentoria.
 */

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Criação de instâncias de Curso e Mentoria, que são exemplos de Abstração.
        Curso curso1 = new Curso(); // Instancia um novo objeto Curso.
        curso1.setTitulo("Curso Java"); // Define o título do curso.
        curso1.setDescricao("Descrição curso Java"); // Define a descrição do curso.
        curso1.setCargaHoraria(8); // Define a carga horária do curso.

        Curso curso2 = new Curso(); // Instancia um novo objeto Curso.
        curso2.setTitulo("Curso JS"); // Define o título do curso.
        curso2.setDescricao("Descrição curso JS"); // Define a descrição do curso.
        curso2.setCargaHoraria(4); // Define a carga horária do curso.

        Mentoria mentoria = new Mentoria(); // Instancia um novo objeto Mentoria.
        mentoria.setTitulo("Mentoria de Java"); // Define o título da mentoria.
        mentoria.setDescricao("Descrição mentoria Java"); // Define a descrição da mentoria.
        mentoria.setData(LocalDate.now()); // Define a data da mentoria como a data atual.

        // Criação de uma instância de Bootcamp, que agrega Cursos e Mentorias.
        Bootcamp bootcamp = new Bootcamp(); // Instancia um novo objeto Bootcamp.
        bootcamp.setNome("Bootcamp Java Developer"); // Define o nome do Bootcamp.
        bootcamp.setDescricao("Descrição Bootcamp Java Developer"); // Define a descrição do Bootcamp.
        bootcamp.getConteudos().add(curso1); // Adiciona o curso1 ao conteúdo do Bootcamp.
        bootcamp.getConteudos().add(curso2); // Adiciona o curso2 ao conteúdo do Bootcamp.
        bootcamp.getConteudos().add(mentoria); // Adiciona a mentoria ao conteúdo do Bootcamp.

        // Criação de instâncias de Dev e inscrição no Bootcamp.
        Dev devCamila = new Dev(); // Instancia um novo objeto Dev.
        devCamila.setNome("Camila"); // Define o nome do Dev.
        devCamila.inscreverBootcamp(bootcamp); // Inscreve o Dev no Bootcamp.
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos()); // Exibe os conteúdos inscritos de Camila.
        devCamila.progredir(); // Faz o Dev progredir no Bootcamp.
        devCamila.progredir(); // Faz o Dev progredir novamente no Bootcamp.
        System.out.println("-"); // Imprime um separador.
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos()); // Exibe os conteúdos restantes inscritos de Camila.
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos()); // Exibe os conteúdos concluídos de Camila.
        System.out.println("XP:" + devCamila.calcularTotalXp()); // Exibe o XP total de Camila.

        System.out.println("-------");

        Dev devJoao = new Dev(); // Instancia um novo objeto Dev.
        devJoao.setNome("Joao"); // Define o nome do Dev.
        devJoao.inscreverBootcamp(bootcamp); // Inscreve o Dev no Bootcamp.
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos()); // Exibe os conteúdos inscritos de Joao.
        devJoao.progredir(); // Faz o Dev progredir no Bootcamp.
        System.out.println("-"); // Imprime um separador.
        System.out.println("Conteúdos Inscritos Joao:" + devJoao.getConteudosInscritos()); // Exibe os conteúdos restantes inscritos de Joao.
        System.out.println("Conteúdos Concluídos Joao:" + devJoao.getConteudosConcluidos()); // Exibe os conteúdos concluídos de Joao.
        System.out.println("XP:" + devJoao.calcularTotalXp()); // Exibe o XP total de Joao.
    }
}
