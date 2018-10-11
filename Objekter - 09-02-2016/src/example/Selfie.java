package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Selfie extends Application {
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
		// Line (StartX, StartY, EndX, EndY)
		Circle circle = new Circle(200, 200, 100);
		Circle eye1 = new Circle(175, 150, 10);
		Circle eye2 = new Circle(225, 150, 10);
		Line line = new Line(150, 250, 250, 250);
		pane.getChildren().add(circle);
		pane.getChildren().add(line);
		pane.getChildren().add(eye1);
		pane.getChildren().add(eye2);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		eye1.setFill(Color.WHITE);
		eye1.setStroke(Color.BLACK);
		eye2.setFill(Color.WHITE);
		eye2.setStroke(Color.BLACK);
		line.setFill(Color.BLACK);
	}

}
