package sample;

import javafx.application.Application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {

    @Override // Redefiniše se start metod u klasi Application
    public void start(Stage primaryStage) {
        // Kreira okno sa granicom e
        BorderPane pane = new BorderPane();

        // Postavljanje čvorova u okbu
        pane.setTop(getHBox());
        pane.setLeft(getVBox());

        // Kreira scenu i stavlja je na pozornicu
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowHBoxVBox"); // Unos naziva pozornice
        primaryStage.setScene(scene); // Postavlja scenu
        primaryStage.show(); // Prikazuje pozornicu
    }

    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        Button button = new Button("JavaFX");
        hBox.getChildren().add(button);
        return hBox;
    }

    private VBox getVBox() {
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5, 5, 5));
        vBox.getChildren().add(new Label("Courses"));

        Label[] courses = {new Label("CSCI 1301"), new Label("CSCI 1302"),
                new Label("CSCI 2410"), new Label("CSCI 3720")};

        for (Label course : courses) {
            VBox.setMargin(course, new Insets(0, 0, 0, 15));
            vBox.getChildren().add(course);
        }

        return vBox;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}