/**
 * 
 */
package com.hlcui.main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author Administrator
 *
 */
public class JPanelDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setAutoscrolls(true);
		JButton button = new JButton("∑¢ÀÕ");
		panel.add(button);
		frame.add(panel);
		frame.setName("”Œœ∑");
		frame.setBounds(100, 100, 200, 200);
		frame.setBackground(Color.cyan);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
