package exercise11;

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

	private void drawCross(GraphicsContext gc, int x, int y, int w) {
		int x2 = x - w;
		int y2 = y + w;
		gc.strokeLine(x - w, y + w, x + w, y + w); // Draws a horizontal line
		gc.strokeLine(x2 + w, y2 - w, x2 + w, y2 + w); // Draws a vertical line
	}

	private void drawShapes(GraphicsContext gc) {
		int x = 50;
		for (int count = 1; count <= 5; count++) {
			this.drawCirle(gc, x, 100, 40);
			this.drawCross(gc, x, 90, 10);
			x = x + 25;
		}
	}
}
