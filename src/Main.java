
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    private Button confirmationButton;
    private Label inputLabel;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TextGame");

        //Input and labels
        TextField userInput = new TextField();
        userInput.setMaxWidth(200);
        inputLabel = new Label();

        confirmationButton = new Button();
        confirmationButton.setText("Confirm");
        confirmationButton.setOnAction(this); // for the ActionEvent below

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(10, userInput, confirmationButton, hBox);
        vBox.setAlignment(Pos.CENTER);

        inputLabel.textProperty().bind(userInput.textProperty());

        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        String userInput = inputLabel.getText();
        if(event.getSource() == confirmationButton) {
            //do your thing, fiddle about with it.
            //i've made a simple second window to display your input :)

            Stage secondWindow = new Stage();

            Label memes = new Label("Here was your input: " + userInput);
            VBox box = new VBox(20, memes);
            box.setAlignment(Pos.BASELINE_CENTER);

            Scene scene = new Scene(box, 300, 20);
            secondWindow.setScene(scene);
            secondWindow.show();
        }
    }
}
