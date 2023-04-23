module enigme.enigmemachine {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens enigme.enigmemachine to javafx.fxml;
    opens Controller to javafx.fxml;
    exports Controller;
    exports enigme.enigmemachine;

}