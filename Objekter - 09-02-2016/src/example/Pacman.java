package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Pacman extends Application {
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
		// Polygon (X1, Y1, X2, Y2, X3, Y3)
		// Line (StartX, StartY, EndX, EndY)
		// Rectangle (x, y, width, height)
		Polygon polygon = new Polygon(300, 200, 200, 200, 300, 300);
		Circle circle = new Circle(200, 200, 100);
		Circle circle2 = new Circle(200, 185, 5);
		pane.getChildren().add(circle);
		pane.getChildren().add(polygon);
		pane.getChildren().add(circle2);
		circle.setFill(Color.ORANGE);
		circle.setStroke(Color.ORANGE);
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.WHITE);
		circle2.setFill(Color.WHITE);
		circle2.setStroke(Color.WHITE);
	}

}
