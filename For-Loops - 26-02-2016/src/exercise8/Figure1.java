package exercise8;

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

	private void drawShapes(GraphicsContext gc) {
		int x1 = 16; // start point: (x1,y1)
		int y1 = 80;
		int x2 = 16; // end point: (x2,y2)
		int y2 = 160;
		int lines = 10;
		for (int count = 1; count <= lines; count++) {
			gc.strokeLine(x1, y1, x2, y2);
			x1 = x1 + 16;
			x2 = x2 + 16;
			y1 = y1 - 4;
			y2 = y2 - 12;
			System.out.println(count);
		}
	}

}
