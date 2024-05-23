# Bootcamp Java Developer - Projeto de POO

## Descrição

Este projeto foi desenvolvido como parte do Bootcamp Java Developer da Digital Innovation One. O objetivo principal é aplicar os conceitos de Programação Orientada a Objetos (POO) em Java, criando um sistema que gerencia um Bootcamp, incluindo cursos, mentorias e desenvolvedores inscritos.

## Conceitos Utilizados

- **Abstração**: Representação das entidades principais do sistema, como `Bootcamp`, `Curso`, `Mentoria` e `Dev`.
- **Encapsulamento**: Proteção dos atributos das classes, acessados e modificados apenas por meio de métodos getters e setters.
- **Herança**: Utilização de classes base (`Conteudo`) e especialização em classes derivadas (`Curso` e `Mentoria`).
- **Polimorfismo**: Implementação de métodos abstratos na classe `Conteudo` e sua sobrescrita nas classes derivadas.

## Funcionalidades

- **Gerenciamento de Cursos**: Adição, visualização e remoção de cursos.
- **Gerenciamento de Mentorias**: Adição, visualização e remoção de mentorias.
- **Gerenciamento de Desenvolvedores**: Inscrição de desenvolvedores em cursos e mentorias, visualização do progresso e cálculo do total de XP adquirido.
- **Interface Gráfica**: Interface desenvolvida com JavaFX para facilitar a interação do usuário com o sistema.

## Estrutura do Projeto

O projeto está organizado nas seguintes classes:

- **Avaliacao.java**: Representa uma avaliação de um conteúdo.
- **Bootcamp.java**: Representa o Bootcamp, contendo listas de cursos, mentorias e desenvolvedores inscritos.
- **Conteudo.java**: Classe abstrata que representa um conteúdo do Bootcamp.
- **Curso.java**: Representa um curso, derivada de `Conteudo`.
- **Desafio.java**: Representa um desafio, derivada de `Conteudo`.
- **Dev.java**: Representa um desenvolvedor inscrito no Bootcamp.
- **Mentoria.java**: Representa uma mentoria, derivada de `Conteudo`.
- **BootcampApp.java**: Interface gráfica desenvolvida com JavaFX para gerenciar o Bootcamp.

## Estrutura de Diretórios

```bash
BootcampJavaOO/
├── lib/
│   ├── Avaliacao.class
│   ├── Bootcamp.class
│   ├── BootcampApp.class
│   ├── Conteudo.class
│   ├── Curso.class
│   ├── Desafio.class
│   ├── Dev.class
│   ├── Mentoria.class
│   └── ...
├── src/
│   ├── Avaliacao.java
│   ├── Bootcamp.java
│   ├── BootcampApp.java
│   ├── Conteudo.java
│   ├── Curso.java
│   ├── Desafio.java
│   ├── Dev.java
│   ├── Mentoria.java
│   └── ...
└── README.md
Como Executar
Pré-requisitos

    Java 8 ou superior instalado
    JavaFX SDK instalado

Passo a Passo

1. Clonar o Repositório

git clone https://github.com/IOVASCON/BootcampJavaOO.git
cd BootcampJavaOO

2. Compilar o Projeto

javac --module-path "C:\\Caminho\\Para\\JavaFX\\lib" --add-modules javafx.controls -d lib src/*.java

3. Executar o Projeto
java --module-path "C:\\Caminho\\Para\\JavaFX\\lib" --add-modules javafx.controls -cp lib BootcampApp

Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.
Licença

Este projeto é licenciado sob os termos da licença MIT. Veja o arquivo LICENSE para mais detalhes.


### Explicação do Conteúdo

- **Descrição**: Breve introdução sobre o projeto e seus objetivos.
- **Conceitos Utilizados**: Descrição dos conceitos de POO aplicados no projeto.
- **Funcionalidades**: Lista das principais funcionalidades implementadas.
- **Estrutura do Projeto**: Descrição das classes que compõem o projeto e suas responsabilidades.
- **Estrutura de Diretórios**: Representação da estrutura de diretórios do projeto.
- **Como Executar**: Instruções detalhadas sobre como compilar e executar o projeto, incluindo pré-requisitos.
- **Contribuições**: Orientação sobre como contribuir para o projeto.
- **Licença**: Informações sobre a licença do projeto.

Esse README.md deve fornecer uma visão clara e abrangente do projeto, facilitando a compreensão e execução do mesmo por outros desenvolvedores.

Contribuição: Izairton Oliveira de Vasconcelos
E-mail: iovascon@gmail.com
