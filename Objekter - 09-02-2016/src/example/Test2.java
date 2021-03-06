package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Test2 extends Application {
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
		Circle circle = new Circle(100, 200, 30);
		Line line = new Line(50, 50, 10, 10);
		Rectangle rectangle = new Rectangle(20, 75, 20, 20);
		pane.getChildren().add(circle);
		pane.getChildren().add(line);
		pane.getChildren().add(rectangle);
		circle.setFill(Color.CORNFLOWERBLUE);
		circle.setStroke(Color.BLACK);
		line.setFill(Color.GREEN);
		line.setStroke(Color.BLACK);
		rectangle.setFill(Color.RED);
		rectangle.setStroke(Color.BLACK);
	}

}
