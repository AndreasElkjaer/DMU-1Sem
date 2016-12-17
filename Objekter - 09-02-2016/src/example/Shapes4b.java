package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Shapes4b extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Pane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Shapes");
		stage.setScene(scene);
		stage.show();
	}

	private Pane initContent() {
		Pane pane = new Pane();
		pane.setPrefSize(400, 400);
		this.drawShapes(pane);
		return pane;
	}

	private void drawShapes(Pane pane) {
		// Circle (X, Y, Radius)
		Circle circle = new Circle(200, 200, 125);
		Circle circle1 = new Circle(200, 200, 100);
		Circle circle2 = new Circle(200, 200, 75);
		Circle circle3 = new Circle(200, 200, 50);
		Circle circle4 = new Circle(200, 200, 25);
		pane.getChildren().add(circle);
		pane.getChildren().add(circle1);
		pane.getChildren().add(circle2);
		pane.getChildren().add(circle3);
		pane.getChildren().add(circle4);
		circle.setFill(Color.BLACK);
		circle.setStroke(Color.BLACK);
		circle1.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);
		circle2.setFill(Color.BLACK);
		circle2.setStroke(Color.BLACK);
		circle3.setFill(Color.WHITE);
		circle3.setStroke(Color.BLACK);
		circle4.setFill(Color.BLACK);
		circle4.setStroke(Color.BLACK);
	}

}
