package model;

import javax.swing.JOptionPane;

public class P116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("What is your name?");
		String message = JOptionPane.showInputDialog("Hi, " + name + "My name is Hal! What would you like me to do?");
		System.out.println("I'm sorry, " + name + ". Im sorry i cant let you do that");

	}

}
