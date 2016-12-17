package exercise10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Figure1 extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawCirle(GraphicsContext gc, int x, int y, int r) {
		gc.strokeOval(x - r, y - r, 2 * r, 2 * r);
	}

	private void drawShapes(GraphicsContext gc) {
		this.drawCirle(gc, 50, 100, 40);
		this.drawCirle(gc, 75, 100, 40);
		this.drawCirle(gc, 100, 100, 40);
		this.drawCirle(gc, 125, 100, 40);
		this.drawCirle(gc, 150, 100, 40);
	}
}
