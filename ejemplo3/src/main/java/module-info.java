module ni.edu.uam.ejemplo3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.ejemplo3 to javafx.fxml;
    exports ni.edu.uam.ejemplo3;
}