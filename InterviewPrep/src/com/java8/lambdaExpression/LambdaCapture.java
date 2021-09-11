package com.java8.lambdaExpression;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LambdaCapture {

	private final static int FIELD_WIDTH = 20;
	private static JTextField staticTextField;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
 
		staticTextField = new JTextField(FIELD_WIDTH);
		staticTextField.setText("Static Field");

		JTextField localTextField = new JTextField(FIELD_WIDTH);
		localTextField.setText("Local variable");

		JButton helloButton = new JButton("SayHello");

		// Regular Anonymous class
		helloButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				staticTextField.setText("Hello World");
				localTextField.setText("Hello World");
			}
		});

		// Lambda Expression
		JButton goodbyeButton = new JButton("Saygoodbye");
		goodbyeButton.addActionListener(event -> {
			staticTextField.setText("GoodBye World");
			localTextField.setText("GoodBye World");
		});
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(staticTextField);
		contentPane.add(localTextField);
		contentPane.add(helloButton);
		contentPane.add(goodbyeButton);
		
		staticTextField = null;
		//localTextField = null;
		
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
