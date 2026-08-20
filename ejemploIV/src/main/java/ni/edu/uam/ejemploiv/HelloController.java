package ni.edu.uam.ejemploiv;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloController {

    @FXML
    private TextField txtSalario;

    @FXML
    private Label lblCantidad;

    @FXML
    private Label lblAlto;

    @FXML
    private Label lblBajo;

    @FXML
    private Label lblPromedio;

    @FXML
    private Label lblModa;

    private final List<Double> salarios = new ArrayList<>();

    @FXML
    protected void onAgregarClick() {
        try {
            double salario = Double.parseDouble(txtSalario.getText());
            if (salario < 0) throw new NumberFormatException();

            salarios.add(salario);
            txtSalario.clear();
            calcularEstadisticas();

        } catch (NumberFormatException e) {
            lblCantidad.setText("Ingrese un número válido");
        }
    }

    @FXML
    protected void onReiniciarClick() {
        salarios.clear();
        txtSalario.clear();
        lblCantidad.setText("Empleados registrados: 0");
        lblAlto.setText("Más alto: $0.0");
        lblBajo.setText("Más bajo: $0.0");
        lblPromedio.setText("Promedio: $0.0");
        lblModa.setText("Moda: $0.0");
    }

    private void calcularEstadisticas() {
        if (salarios.isEmpty()) return;

        int n = salarios.size();
        double suma = 0;
        double alto = salarios.get(0);
        double bajo = salarios.get(0);
        Map<Double, Integer> frecuencias = new HashMap<>();

        for (double s : salarios) {
            suma += s;
            if (s > alto) alto = s;
            if (s < bajo) bajo = s;
            frecuencias.put(s, frecuencias.getOrDefault(s, 0) + 1);
        }

        double promedio = suma / n;

        double moda = salarios.get(0);
        int maxFreq = 0;
        for (Map.Entry<Double, Integer> entry : frecuencias.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                moda = entry.getKey();
            }
        }

        lblCantidad.setText("Empleados registrados: " + n);
        lblAlto.setText("Más alto: $" + alto);
        lblBajo.setText("Más bajo: $" + bajo);
        lblPromedio.setText(String.format("Promedio: $%.2f", promedio));
        lblModa.setText("Moda: $" + moda);
    }
}