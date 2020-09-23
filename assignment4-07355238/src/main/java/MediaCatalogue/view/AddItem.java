package MediaCatalogue.view;


import javax.swing.*;
import MediaCatalogue.controller.AppController;
import java.awt.*;

//This class produces the add item view.
public class AddItem extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AppController controller;
	
	public AddItem(AppController c) {
		
		super("Add Item");
		this.controller = c;
		
		this.setLayout(null);
		this.pack();
		this.setSize(400, 500);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setLocation(100, 200);
		this.setVisible(false);
		
		JLabel label = new JLabel("Title: ");
		this.add(label);
		JTextField text = new JTextField();
		this.add(text);
		label.setSize(100, 20);
		label.setLocation(10, 10);
		text.setSize(250, 30);
		text.setLocation(120, 10);
		
		JLabel label2 = new JLabel("Description: ");
		this.add(label2);
		JFormattedTextField text2 = new JFormattedTextField();
		this.add(text2);
		label2.setSize(100, 20);
		label2.setLocation(10, 50);
		text2.setSize(250, 60);
		text2.setLocation(120, 50);
		
		String[] choices = {"2019", "2000", "1999", "1995", "2001"};
		
		JLabel label3 = new JLabel("Year: ");
		this.add(label3);
		JFormattedTextField text3 = new JFormattedTextField();
		JComboBox <String> yearSelect = new JComboBox<String>(choices);
		this.add(yearSelect);
		this.add(text3);
		label3.setSize(100, 20);
		label3.setLocation(10, 130);
		yearSelect.setSize(250, 30);
		yearSelect.setLocation(120, 130);
		text3.setSize(250, 30);
		text3.setLocation(120, 130);
		
		JLabel label4 = new JLabel("Genre: ");
		this.add(label4);
		JFormattedTextField text4 = new JFormattedTextField();
		this.add(text4);
		label4.setSize(100, 20);
		label4.setLocation(10, 170);
		text4.setSize(250, 60);
		text4.setLocation(120, 170);
		
		JLabel label5 = new JLabel("Director: ");
		this.add(label5);
		JFormattedTextField text5 = new JFormattedTextField();
		this.add(text5);
		label5.setSize(100, 20);
		label5.setLocation(10, 250);
		text5.setSize(250, 30);
		text5.setLocation(120, 250);
		
		JLabel label6 = new JLabel("Cast: ");
		this.add(label6);
		JTextField text6 = new JTextField();
		this.add(text6);
		label6.setSize(100, 20);
		label6.setLocation(10, 290);
		text6.setSize(250, 90);
		text6.setLocation(120, 290);
		
		JLabel label7 = new JLabel("TV Series: ");
		this.add(label7);
		JCheckBox cb = new JCheckBox();
		this.add(cb);
		cb.setSize(100, 50);
		cb.setLocation(100, 400);
		label7.setSize(100, 50);
		label7.setLocation(10, 400);
		
		JButton button = new JButton("Save");
		this.add(button);
		button.setBackground(Color.GRAY);
		button.setSize(150, 40);
		button.setLocation(200, 400);
	}
	
}
