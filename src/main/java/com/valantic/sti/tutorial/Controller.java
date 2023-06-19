package com.valantic.sti.tutorial;

import javafx.scene.control.Button;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Controller {

    public Button button;

    public void handleButtonClick() {
        log.info("Run some code the user doesn't see");
        button.setText("Stop touching me!");
    }
}
