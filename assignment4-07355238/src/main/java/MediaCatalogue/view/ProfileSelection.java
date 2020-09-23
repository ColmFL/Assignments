package MediaCatalogue.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

import MediaCatalogue.controller.AppController;
import MediaCatalogue.model.Profile;

//This class produces the profile select view. 
public class ProfileSelection extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton button;
	AppController controller;

	
	public ProfileSelection(AppController c, ArrayList<Profile>profiles){
		
		super("Select User");
		this.controller = c;

	this.setLayout(null);	
	this.pack();
	this.setSize(250, 320);
	this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	this.setLocation(400, 200);
	this.setVisible(false);
	
	JButton button = new JButton("MewTwo");
	this.add(button);
	button.setBackground(Color.PINK);
	button.setSize(200, 50);
	button.setLocation(10, 10);
	
	JButton button2 = new JButton("Pikachu");
	this.add(button2);
	button2.setBackground(Color.BLUE);
	button2.setSize(200, 50);
	button2.setLocation(10, 70);
	
	JButton button3 = new JButton("Charizard");
	this.add(button3);
	button3.setBackground(Color.ORANGE);
	button3.setSize(200, 50);
	button3.setLocation(10, 140);
	
	JButton button4 = new JButton("Decidueye");
	this.add(button4);
	button4.setBackground(Color.GREEN);
	button4.setSize(200, 50);
	button4.setLocation(10, 210);
	
	
	//ActionListeners ensure that when a profile button is clicked, the 
	//relevant profile is rendered.
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			controller.profileSelect(profiles.get(0));				
		}
	});
	
	button2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			controller.profileSelect(profiles.get(1));				
		}
	});
	
	button3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		controller.profileSelect(profiles.get(2));
	}
	});
	
	button4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			controller.profileSelect(profiles.get(3));				
		}
	});
	
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
}
