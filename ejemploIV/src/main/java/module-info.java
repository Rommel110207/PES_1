module ni.edu.uam.ejemploiv {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemploiv to javafx.fxml;
    exports ni.edu.uam.ejemploiv;
}