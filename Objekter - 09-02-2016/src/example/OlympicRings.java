package example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class OlympicRings extends Application {
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
		Circle circle = new Circle(50, 200, 50);
		Circle circle2 = new Circle(100, 250, 50);
		Circle circle3 = new Circle(150, 200, 50);
		Circle circle4 = new Circle(200, 250, 50);
		Circle circle5 = new Circle(250, 200, 50);
		pane.getChildren().add(circle);
		pane.getChildren().add(circle2);
		pane.getChildren().add(circle3);
		pane.getChildren().add(circle4);
		pane.getChildren().add(circle5);
		circle.setFill(Color.TRANSPARENT);
		circle.setStroke(Color.BLUE);
		circle.setStrokeWidth(7);
		circle2.setFill(Color.TRANSPARENT);
		circle2.setStroke(Color.YELLOW);
		circle2.setStrokeWidth(7);
		circle3.setFill(Color.TRANSPARENT);
		circle3.setStroke(Color.BLACK);
		circle3.setStrokeWidth(7);
		circle4.setFill(Color.TRANSPARENT);
		circle4.setStroke(Color.GREEN);
		circle4.setStrokeWidth(7);
		circle5.setFill(Color.TRANSPARENT);
		circle5.setStroke(Color.RED);
		circle5.setStrokeWidth(7);
	}

}
