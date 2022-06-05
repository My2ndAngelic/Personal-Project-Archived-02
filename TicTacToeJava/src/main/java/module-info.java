module me.my2ndangelic.tictactoejava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens me.my2ndangelic.tictactoejava to javafx.fxml;
    exports me.my2ndangelic.tictactoejava;
}