package MediaCatalogue.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import MediaCatalogue.controller.AppController;

//This class produces the item details view.
public class ItemDetails extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AppController controller;
	
	public ItemDetails(AppController c) {
		
		super("Item Details");
		this.controller = c;
		
		this.setLayout(null);
		this.pack();
		this.setSize(400, 500);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setLocation(100, 200);
		this.setVisible(false);
		
		JLabel label = new JLabel("Title: ");
		this.add(label);
		JTextField text = new JTextField("Toy Story 4");
		this.add(text);
		text.setEditable(false);
		text.setBackground(Color.LIGHT_GRAY);
		label.setSize(100, 20);
		label.setLocation(10, 10);
		text.setSize(250, 30);
		text.setLocation(120, 10);
		
		JLabel label2 = new JLabel("Description: ");
		this.add(label2);
		JTextArea text2 = new JTextArea("When a toy called 'Forky' joins Woody and the\ngang...");
		this.add(text2);
		text2.setEditable(false);
		text2.setBackground(Color.LIGHT_GRAY);
		label2.setSize(100, 20);
		label2.setLocation(10, 50);
		text2.setSize(250, 60);
		text2.setLocation(120, 50);
		
		JLabel label3 = new JLabel("Year: ");
		this.add(label3);
		JFormattedTextField text3 = new JFormattedTextField("2019");
		this.add(text3);
		text3.setEditable(false);
		text3.setBackground(Color.LIGHT_GRAY);
		label3.setSize(100, 20);
		label3.setLocation(10, 130);
		text3.setSize(250, 30);
		text3.setLocation(120, 130);
		
		JLabel label4 = new JLabel("Genre: ");
		this.add(label4);
		JTextArea text4 = new JTextArea("Animation | Adventure | Comedy | Family |\nFantasy ");
		this.add(text4);
		text4.setEditable(false);
		text4.setBackground(Color.LIGHT_GRAY);
		label4.setSize(100, 20);
		label4.setLocation(10, 170);
		text4.setSize(250, 60);
		text4.setLocation(120, 170);
		
		JLabel label5 = new JLabel("Director: ");
		this.add(label5);
		JFormattedTextField text5 = new JFormattedTextField("Josh Cooley");
		this.add(text5);
		text5.setEditable(false);
		text5.setBackground(Color.LIGHT_GRAY);
		label5.setSize(100, 20);
		label5.setLocation(10, 250);
		text5.setSize(250, 30);
		text5.setLocation(120, 250);
		
		JLabel label6 = new JLabel("Cast: ");
		this.add(label6);
		JTextArea text6 = new JTextArea("Tom Hanks\n Tim Allen\n Annie Potts\n Madeleine McGraw");
		this.add(text6);
		text6.setEditable(false);
		text6.setBackground(Color.LIGHT_GRAY);
		label6.setSize(100, 20);
		label6.setLocation(10, 290);
		text6.setSize(250, 90);
		text6.setLocation(120, 290);
		
		JButton button = new JButton("Back");
		this.add(button);
		button.setBackground(Color.GRAY);
		button.setSize(150, 40);
		button.setLocation(200, 400);
		
		//ActionListener to administer the button which closes the view.
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.closeItemDetails();				
			}
		});
	}	
}