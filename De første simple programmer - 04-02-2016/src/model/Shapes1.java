package model;

import javafx.scene.shape.Circle;

public class Shapes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		private void drawShaoes(Pane pane)
		{
			Circle circle = new Circle(100, 100, 30);
			pane.getChrildren().add(circle);
			circle.setFill(Color.CORNFLOWERBLUE);
			circle.setStroke(Color.BLACK);
	 }
	}

}
