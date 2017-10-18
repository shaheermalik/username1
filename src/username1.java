import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class username1 extends Application {
    @Override

    public void start (Stage primaryStage) {
        TextInputDialog textinputdialog = new TextInputDialog();
        textinputdialog.setTitle("AUTHENTICATION!!!");
        textinputdialog.setContentText("Enter your username and password");
        Optional<String> input = textinputdialog.showAndWait();
        String option = input.get();

        if (option.equals( "Shaheer,dfg")){
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Welcome Shaheer");
            alert.showAndWait();
        } else {
            Alert s = new Alert(AlertType.INFORMATION);
            s.setContentText("Wrong username or password" );
            s.showAndWait();
        }

    }
}
