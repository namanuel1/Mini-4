module Lab2GUI {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
