package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class House extends Application {
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
		Polygon polygon = new Polygon(75, 200, 160, 150, 245, 200);
		Line line = new Line(75, 320, 245, 320);
		Rectangle rectangle = new Rectangle(100, 200, 120, 120);
		Rectangle window = new Rectangle(125, 225, 30, 30);
		Circle circle = new Circle(300, 100, 30);
		pane.getChildren().add(polygon);
		pane.getChildren().add(line);
		pane.getChildren().add(rectangle);
		pane.getChildren().add(circle);
		pane.getChildren().add(window);
		polygon.setFill(Color.GREEN);
		polygon.setStroke(Color.BLACK);
		line.setFill(Color.BLACK);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.BLACK);
		circle.setFill(Color.YELLOW);
		circle.setStroke(Color.BLACK);
		window.setFill(Color.BLACK);
		window.setStroke(Color.BLACK);
	}

}
