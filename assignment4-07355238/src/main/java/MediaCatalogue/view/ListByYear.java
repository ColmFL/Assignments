package MediaCatalogue.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.WindowConstants;

import MediaCatalogue.controller.AppController;

public class ListByYear extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AppController controller;
	
	public ListByYear(AppController c) {
		
		super("List By Year");
		this.controller = c;
		
		this.setLayout(null);	
		this.pack();
		this.setSize(450, 400);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setLocation(100, 200);
		this.setVisible(false);
		
		JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL);
		scrollBar.setSize(30, 400);
		scrollBar.setLocation(400, 0);
		this.add(scrollBar);
		
		JLabel year = new JLabel("2019");
		this.add(year);
		year.setForeground(Color.RED.darker());
		year.setFont(new Font("Dialog", Font.BOLD, 15));
		year.setSize(80, 40);
		year.setLocation(10, 10);
		
		JLabel title = new JLabel("Jumanji: The Next Level");
		this.add(title);
		title.setForeground(Color.BLUE.darker());
		title.setSize(200, 40);
		title.setLocation(10, 40);
		
		JLabel genres = new JLabel("Action | Adventure | Comedy");
		this.add(genres);
		genres.setSize(200, 40);
		genres.setLocation(200, 40);
		
		JLabel title2 = new JLabel("Toy Story 4");
		this.add(title2);
		title2.setForeground(Color.BLUE.darker());
		title2.setSize(200, 40);
		title2.setLocation(10, 60);
		
		JLabel genres2 = new JLabel("Animation | Adventure | Comedy");
		this.add(genres2);
		genres2.setSize(200, 40);
		genres2.setLocation(200, 60);
		
		
		JLabel year2 = new JLabel("2001");
		this.add(year2);
		year2.setForeground(Color.RED.darker());
		year2.setFont(new Font("Dialog", Font.BOLD, 15));
		year2.setSize(80, 40);
		year2.setLocation(10, 90);
		
		JLabel title3 = new JLabel("Monsters, Inc.");
		this.add(title3);
		title3.setForeground(Color.BLUE.darker());
		title3.setSize(200, 40);
		title3.setLocation(10, 120);
		
		JLabel genres3 = new JLabel("Animation | Adventure | Comedy");
		this.add(genres3);
		genres3.setSize(200, 40);
		genres3.setLocation(200, 120);
		
		JLabel year3 = new JLabel("2000");
		this.add(year3);
		year3.setForeground(Color.RED.darker());
		year3.setFont(new Font("Dialog", Font.BOLD, 15));
		year3.setSize(80, 40);
		year3.setLocation(10, 150);
		
		JLabel title4 = new JLabel("Toy Story 3");
		this.add(title4);
		title4.setForeground(Color.BLUE.darker());
		title4.setSize(200, 40);
		title4.setLocation(10, 180);
		
		JLabel genres4 = new JLabel("Animation | Adventure | Comedy");
		this.add(genres4);
		genres4.setSize(200, 40);
		genres4.setLocation(200, 180);
		
		JLabel year4 = new JLabel("1999");
		this.add(year4);
		year4.setForeground(Color.RED.darker());
		year4.setFont(new Font("Dialog", Font.BOLD, 15));
		year4.setSize(80, 40);
		year4.setLocation(10, 210);
		
		JLabel title5 = new JLabel("Toy Story 2");
		this.add(title5);
		title5.setForeground(Color.BLUE.darker());
		title5.setSize(200, 40);
		title5.setLocation(10, 240);
		
		JLabel genres5 = new JLabel("Animation | Adventure | Comedy");
		this.add(genres5);
		genres5.setSize(200, 40);
		genres5.setLocation(200, 240);
		
		JLabel year5 = new JLabel("1995");
		this.add(year5);
		year5.setForeground(Color.RED.darker());
		year5.setFont(new Font("Dialog", Font.BOLD, 15));
		year5.setSize(80, 40);
		year5.setLocation(10, 270);
		
		JLabel title6 = new JLabel("Toy Story");
		this.add(title6);
		title6.setForeground(Color.BLUE.darker());
		title6.setSize(200, 40);
		title6.setLocation(10,300);
		
		JLabel genres6 = new JLabel("Animation | Adventure | Comedy");
		this.add(genres6);
		genres6.setSize(200, 40);
		genres6.setLocation(200, 300);	
	}
}