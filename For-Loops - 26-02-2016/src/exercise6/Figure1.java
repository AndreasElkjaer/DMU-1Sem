package exercise6;

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
		// Axis
		int axis_start = 0; // sets the start position of the x-coordinate of
							// the axis
		int axis_end = 180; // sets the end position of the x-coordinate of the
							// axis

		// Ticks
		int tick_count = 11; // sets the amount of ticks
		int tick_start = 170; // sets the start position of the y-coordinate of
								// the ticks
		int tick_end = 180; // sets the end position of the y-coordinate of the
							// ticks
		int tick2_start = 167; // sets the start position of the y-coordinate of
								// the ticks
		int tick2_end = 183; // sets the end position of the y-coordinate of the
								// ticks
		int axis_vertical = (tick_start + tick_end) / 2;
		int tick_space = 14; // calculates the space between ticks

		// Arrow
		int arrow_x = axis_end;
		int arrow_vertical = axis_vertical;
		int arrow_length = -10;
		int arrow_height = 4;

		gc.strokeLine(axis_start, axis_vertical, axis_end, axis_vertical);

		gc.strokeLine(arrow_x, arrow_vertical, arrow_x + arrow_length, arrow_vertical - arrow_height);
		gc.strokeLine(arrow_x, arrow_vertical, arrow_x + arrow_length, arrow_vertical + arrow_height);

		for (int counter = 1; counter <= tick_count; counter++) {
			int tick_x = counter * tick_space;
			gc.strokeLine(tick_x, tick_start, tick_x, tick_end);

			if (counter == 1 || counter % 5 == 1) {
				gc.strokeLine(tick_x, tick2_start, tick_x, tick2_end);
			}

			gc.fillText("0", 15, 195);
			gc.fillText("5", 85, 195);
			gc.fillText("10", 155, 195);
		}
	}
}
