module ni.edu.uam.ejemplo1g2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemplo1g2 to javafx.fxml;
    exports ni.edu.uam.ejemplo1g2;
}