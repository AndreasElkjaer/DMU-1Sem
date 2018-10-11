package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test1 extends Application {
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
		int moveRight = 100;
		Color farve = Color.YELLOW;
		// Line (StartX, StartY, EndX, EndY)
		// Rectangle (x, y, width, height)
		Circle circle = new Circle(moveRight, 200, 30);
		Line line = new Line(moveRight, 50, 150, 10);
		Rectangle rectangle = new Rectangle(moveRight, 75, 60, 60);
		pane.getChildren().add(circle);
		pane.getChildren().add(line);
		pane.getChildren().add(rectangle);
		circle.setFill(farve);
		circle.setStroke(Color.BLACK);
		line.setFill(farve);
		line.setStroke(Color.BLACK);
		rectangle.setFill(farve);
		rectangle.setStroke(Color.BLACK);
	}

}
