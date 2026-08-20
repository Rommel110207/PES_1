package ni.edu.uam.ejemplo3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtSalario;

    @FXML
    private Label lblSeguro;

    @FXML
    private Label lblBono;

    @FXML
    private Label lblNeto;

    @FXML
    protected void onCalcularClick() {
        try {
            double salario = Double.parseDouble(txtSalario.getText());

            double seguro = salario * 0.07;
            double bono;

            if (salario < 12000) {
                bono = salario * 0.10;
            } else if (salario <= 20000) {
                bono = salario * 0.05;
            } else {
                bono = salario * 0.03;
            }

            double neto = salario - seguro + bono;

            lblSeguro.setText("Seguro (7%): $" + seguro);
            lblBono.setText("Bono: $" + bono);
            lblNeto.setText("Salario Neto: $" + neto);

        } catch (NumberFormatException e) {
            lblNeto.setText("Ingrese un número válido");
        }
    }
}