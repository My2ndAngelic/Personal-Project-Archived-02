module me.my2ndangelic {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.apache.commons.lang3;
    requires com.google.common;

    opens TicTacToe.GUI to javafx.fxml;
    exports TicTacToe.GUI;
}