package authoring.view.propertiesview;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * @author Kevin Li
 * @author Chris Bernt
 * @author Wesley Valentine
 * @author Arjun Jain
 */
public class PropertyTextField extends PropertyField {

	private TextField myField;

	public PropertyTextField(String name, String information) {
		this.getChildren().add(new Text(name));
		TextField field = new TextField(information);
		myField = field;
		this.getChildren().add(field);
	}

	public String getInformation() {
		return myField.getText();
	}

	public void setString(String s) {
		myField.setText(s);
	}
}
