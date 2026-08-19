package ni.edu.uam.ejemplo1g2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblSaludo;

    @FXML
    private Label lblName;

    @FXML
    private Label lblApellido;

    @FXML

    private Label lblTelefono;



    @FXML
    protected void onHelloButtonClick() {

        lblSaludo.setText("Enviar");
    }
}
