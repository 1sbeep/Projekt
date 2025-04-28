module pacman {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens pacman to javafx.fxml;
    exports pacman;
}
