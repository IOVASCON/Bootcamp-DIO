
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BootcampApp extends Application {

    private Bootcamp bootcamp = new Bootcamp();
    private TableView<Curso> cursoTableView = new TableView<>();
    private TableView<Mentoria> mentoriaTableView = new TableView<>();
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bootcamp Java Developer");

        TabPane tabPane = new TabPane();

        Tab overviewTab = new Tab("Overview", createOverviewTab());
        Tab cursosTab = new Tab("Cursos", createCursosTab());
        Tab mentoriasTab = new Tab("Mentorias", createMentoriasTab());
        Tab devsTab = new Tab("Devs", createDevsTab());

        tabPane.getTabs().addAll(overviewTab, cursosTab, mentoriasTab, devsTab);

        Scene scene = new Scene(tabPane, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox createOverviewTab() {
        Label nameLabel = new Label("Nome: " + bootcamp.getNome());
        Label descriptionLabel = new Label("Descrição: " + bootcamp.getDescricao());

        VBox vbox = new VBox(10, nameLabel, descriptionLabel);
        return vbox;
    }

    private VBox createCursosTab() {
        TextField cursoNomeField = new TextField();
        cursoNomeField.setPromptText("Nome do Curso");

        TextField cursoDescricaoField = new TextField();
        cursoDescricaoField.setPromptText("Descrição do Curso");

        TextField cursoCargaHorariaField = new TextField();
        cursoCargaHorariaField.setPromptText("Carga Horária");

        Button addCursoButton = new Button("Adicionar Curso");
        addCursoButton.setOnAction(e -> {
            String nome = cursoNomeField.getText();
            String descricao = cursoDescricaoField.getText();
            int cargaHoraria = Integer.parseInt(cursoCargaHorariaField.getText());

            Curso curso = new Curso(nome, descricao, cargaHoraria); // Usando o construtor correto
            cursos.add(curso);
            cursoTableView.getItems().add(curso);
        });

        TableColumn<Curso, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));

        TableColumn<Curso, String> descricaoColumn = new TableColumn<>("Descrição");
        descricaoColumn.setCellValueFactory(new PropertyValueFactory<>("descricao"));

        TableColumn<Curso, Integer> cargaHorariaColumn = new TableColumn<>("Carga Horária");
        cargaHorariaColumn.setCellValueFactory(new PropertyValueFactory<>("cargaHoraria"));

        cursoTableView.getColumns().addAll(nomeColumn, descricaoColumn, cargaHorariaColumn);

        VBox vbox = new VBox(10, cursoNomeField, cursoDescricaoField, cursoCargaHorariaField, addCursoButton, cursoTableView);
        return vbox;
    }

    private VBox createMentoriasTab() {
        TextField mentoriaNomeField = new TextField();
        mentoriaNomeField.setPromptText("Nome da Mentoria");

        TextField mentoriaDescricaoField = new TextField();
        mentoriaDescricaoField.setPromptText("Descrição da Mentoria");

        DatePicker mentoriaDataField = new DatePicker();
        mentoriaDataField.setPromptText("Data da Mentoria");

        Button addMentoriaButton = new Button("Adicionar Mentoria");
        addMentoriaButton.setOnAction(e -> {
            String nome = mentoriaNomeField.getText();
            String descricao = mentoriaDescricaoField.getText();
            LocalDate data = mentoriaDataField.getValue();

            Mentoria mentoria = new Mentoria(nome, descricao, data); // Usando o construtor correto
            mentorias.add(mentoria);
            mentoriaTableView.getItems().add(mentoria);
        });

        TableColumn<Mentoria, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("titulo"));

        TableColumn<Mentoria, String> descricaoColumn = new TableColumn<>("Descrição");
        descricaoColumn.setCellValueFactory(new PropertyValueFactory<>("descricao"));

        TableColumn<Mentoria, LocalDate> dataColumn = new TableColumn<>("Data");
        dataColumn.setCellValueFactory(new PropertyValueFactory<>("data"));

        mentoriaTableView.getColumns().addAll(nomeColumn, descricaoColumn, dataColumn);

        VBox vbox = new VBox(10, mentoriaNomeField, mentoriaDescricaoField, mentoriaDataField, addMentoriaButton, mentoriaTableView);
        return vbox;
    }

    private VBox createDevsTab() {
        // Implementar a criação da interface gráfica para gerenciamento de desenvolvedores
        return new VBox();
    }
}
