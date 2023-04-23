module junit5demoqs.junit5demoqs {
    requires javafx.controls;
    requires javafx.fxml;


    opens junit5demoqs.junit5demoqs to javafx.fxml;
    exports junit5demoqs.junit5demoqs;
}