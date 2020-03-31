package ASUEpicsStardust;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML private TextField voltageInput;
	@FXML private TextField currentInput;
	@FXML private TextField panelAreaInput;
	@FXML protected Label resultText;
	
	@FXML protected void handleCalculateButtonPressed(ActionEvent event) {
		try {
			double voltageIn = new Double(voltageInput.getText());
			double currentIn = new Double(currentInput.getText());
			double panelArea = new Double(panelAreaInput.getText());
			
			double powerOut = voltageIn * currentIn / 1000;
			
			//TODO: Use DNI reading from online database to calculate power input and compare it to power out
			
			resultText.setText("Calculated power out: " + powerOut + " watts for a panel with area " + panelArea);
		} catch (NumberFormatException e) {
			resultText.setText("Please enter valid values.");
		}
	}
}
