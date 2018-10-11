package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Heart extends Application {
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
		Polygon polygon = new Polygon(130, 200, 200, 300, 270, 200);
		Circle circle = new Circle(170, 185, 42);
		Circle circle2 = new Circle(230, 185, 42);
		pane.getChildren().add(polygon);
		pane.getChildren().add(circle);
		pane.getChildren().add(circle2);
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.RED);
		circle.setFill(Color.RED);
		circle.setStroke(Color.RED);
		circle2.setFill(Color.RED);
		circle2.setStroke(Color.RED);
	}

}
