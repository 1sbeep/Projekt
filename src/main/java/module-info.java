module pacman {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens pacman to javafx.fxml;
    exports pacman;
}
