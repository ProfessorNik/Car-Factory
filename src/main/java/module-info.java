module ru.nsu.fit.carfactory {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.nsu.fit.carfactory to javafx.fxml;
    exports ru.nsu.fit.carfactory;
}