package application;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button hello;
	Button howdy; 
	Button chinese; 
	Button clear; 
	Button exit; 
	Button amharic;
	Label firstLabel;
	TextField textSpace;
	//  declare two HBoxes
	HBox h1Box;
	HBox h2Box;
	//student Task #4:
	//  declare an instance of DataManager
	DataManager dataEHandler;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		hello = new Button("Hello");
		howdy = new Button("Howdy");
		chinese = new Button("Chinese");
		clear = new Button("Clear");
		amharic = new Button("Amharic");
		exit = new Button("Exit");
		firstLabel = new Label("Feedback");
		textSpace = new TextField();
		//  instantiate the HBoxes
		h1Box = new HBox();
		h2Box = new HBox();
		//student Task #4:
		//  instantiate the DataManager instance
		dataEHandler = new DataManager();
		
		//  set margins and set alignment of the components
		h1Box.setAlignment(Pos.CENTER);
		HBox.setMargin(hello,new Insets(10,10,10,10));
		HBox.setMargin(chinese, new Insets(10,10,10,10));
		HBox.setMargin(howdy, new Insets(10,10,10,10));
		HBox.setMargin(clear, new Insets(10,10,10,10));
		HBox.setMargin(exit, new Insets(10,10,10,10));
		HBox.setMargin(amharic, new Insets(10, 10, 10, 10));
		h2Box.setAlignment(Pos.CENTER);
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
	h1Box.getChildren().addAll(amharic, hello, howdy, chinese, clear, exit);
		//  add the buttons to the other HBox
	h2Box.getChildren().addAll(firstLabel, textSpace);
		//  add the HBoxes to this FXMainPanel (a VBox)
		getChildren().addAll(h1Box, h2Box);
		hello.setOnAction(new ButtonHandler());
		howdy.setOnAction(new ButtonHandler());
		chinese.setOnAction(new ButtonHandler());
		clear.setOnAction(new ButtonHandler());
		exit.setOnAction(new ButtonHandler());
		amharic.setOnAction(new ButtonHandler());
		
	}
	
	//Task #4:
	
	class ButtonHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle (ActionEvent event) {
			
			if (event.getTarget() == hello) {
			
				textSpace.setText(dataEHandler.getHello());
		
	}
			else if (event.getTarget() == howdy) {
				textSpace.setText(dataEHandler.getHowdy());
			}
			else if(event.getTarget() == chinese)
			{
				textSpace.setText(dataEHandler.getChinese());
			}
			else if (event.getTarget() == clear) {
				textSpace.setText("");
			}
			else if (event.getTarget() == exit) {
				Platform.exit();
				System.exit(0);
			}
			else if (event.getTarget() == amharic) {
				textSpace.setText(dataEHandler.getAmharic());
			}
		}

		}
}

	


	
