package ni.edu.uam.ejemplo2g2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();


        root.setPadding(new Insets(30));
        root.setSpacing(15);

        Label lblTitle = new Label("Calculadora");

        root.getChildren().add(lblTitle);

        Scene scene = new Scene(root, 600, 400);


        stage.setScene(scene);
        stage.setTitle("UAM");
        stage.show();


        Label lblNumber1 = new Label("Number 1");



        Label lblNumber2 = new Label("Number 2");

        TextField tfNumber1 = new TextField();
        TextField tfNumber2 = new TextField();
        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnMultiplicacion = new Button("*");
        Button btnDivision = new Button("/");

        Label lblResultado = new Label("Resultado");



        btnSuma.setOnAction(e -> {


            try
            {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                int resultado = num1 + num2;
                lblResultado.setText(String.valueOf(resultado));


            }
            catch (NumberFormatException ex)
            {
                lblResultado.setText("Error: Entrada no válida");
            }
        });

        btnResta.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = num1 - num2;
            lblResultado.setText(String.valueOf(resultado));
        });

        btnMultiplicacion.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());
            int resultado = num1 * num2;
            lblResultado.setText(String.valueOf(resultado));

        });

        btnDivision.setOnAction(e -> {
            int num1 = Integer.parseInt(tfNumber1.getText());
            int num2 = Integer.parseInt(tfNumber2.getText());

            if (num2 != 0) {
                double resultado = (double) num1 / num2;
                lblResultado.setText(String.valueOf(resultado));
            } else {
                lblResultado.setText("Error: División por cero");
            }



        });

        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(10));
        buttons.getChildren().addAll(btnSuma, btnResta, btnMultiplicacion, btnDivision);

        root.getChildren().addAll(lblNumber1, tfNumber1, lblNumber2, tfNumber2,  lblResultado, buttons);












    }
}
