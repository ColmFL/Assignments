package MediaCatalogue.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.WindowConstants;

import MediaCatalogue.controller.AppController;

public class ListByGenre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AppController controller;
	
	public ListByGenre(AppController c) {
		
		super("List By Genre");
		this.controller = c;
		
		this.setLayout(null);	
		this.pack();
		this.setSize(290, 400);
		this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		this.setLocation(100, 200);
		this.setVisible(false);
		
		JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL);
		scrollBar.setSize(30, 400);
		scrollBar.setLocation(240, 0);
		this.add(scrollBar);
		

		JLabel genre = new JLabel("Action");
		this.add(genre);
		genre.setForeground(Color.RED.darker());
		genre.setFont(new Font("Dialog", Font.BOLD, 15));
		genre.setSize(80, 40);
		genre.setLocation(10, 10);
		
		
		JLabel title = new JLabel("Jumanji: The Next Level");
		this.add(title);
		title.setForeground(Color.BLUE.darker());
		title.setSize(200, 40);
		title.setLocation(10, 40);
		
		JLabel year = new JLabel("2019");
		this.add(year);
		year.setSize(50, 40);
		year.setLocation(200, 40);
		
		JLabel title2 = new JLabel("Toy Story 4");
		this.add(title2);
		title2.setForeground(Color.BLUE.darker());
		title2.setSize(200, 40);
		title2.setLocation(10, 60);
		
		JLabel year2 = new JLabel("2019");
		this.add(year2);
		year2.setSize(50, 40);
		year2.setLocation(200, 60);
		
		JLabel genre2 = new JLabel("Adventure");
		this.add(genre2);
		genre2.setForeground(Color.RED.darker());
		genre2.setFont(new Font("Dialog", Font.BOLD, 15));
		genre2.setSize(80, 40);
		genre2.setLocation(10, 90);
		
		
		JLabel title3 = new JLabel("Jumanji: The Next Level");
		this.add(title3);
		title3.setForeground(Color.BLUE.darker());
		title3.setSize(200, 40);
		title3.setLocation(10, 120);
		
		JLabel year3 = new JLabel("2019");
		this.add(year3);
		year3.setSize(50, 40);
		year3.setLocation(200, 120);
		
		JLabel title4 = new JLabel("Monsters, Inc.");
		this.add(title4);
		title4.setForeground(Color.BLUE.darker());
		title4.setSize(200, 40);
		title4.setLocation(10, 140);
		
		JLabel year4 = new JLabel("2001");
		this.add(year4);
		year4.setSize(50, 40);
		year4.setLocation(200, 140);
		
		JLabel title5 = new JLabel("Toy Story");
		this.add(title5);
		title5.setForeground(Color.BLUE.darker());
		title5.setSize(200, 40);
		title5.setLocation(10, 160);
		
		JLabel year5 = new JLabel("1995");
		this.add(year5);
		year5.setSize(50, 40);
		year5.setLocation(200, 160);
		
		JLabel title6 = new JLabel("Toy Story 2");
		this.add(title6);
		title6.setForeground(Color.BLUE.darker());
		title6.setSize(200, 40);
		title6.setLocation(10, 180);
		
		
		JLabel year6 = new JLabel("1999");
		this.add(year6);
		year6.setSize(50, 40);
		year6.setLocation(200, 180);
		
		JLabel title7 = new JLabel("Toy Story 3");
		this.add(title7);
		title7.setForeground(Color.BLUE.darker());
		title7.setSize(200, 40);
		title7.setLocation(10, 200);
		
		JLabel year7 = new JLabel("2000");
		this.add(year7);
		year7.setSize(50, 40);
		year7.setLocation(200, 200);
		
		JLabel title8 = new JLabel("Toy Story 4");
		this.add(title8);
		title8.setForeground(Color.BLUE.darker());
		title8.setSize(200, 40);
		title8.setLocation(10, 220);
		
		JLabel year8 = new JLabel("2019");
		this.add(year8);
		year8.setSize(50, 40);
		year8.setLocation(200, 220);
		
		JLabel genre3 = new JLabel("Comedy");
		this.add(genre3);
		genre3.setForeground(Color.RED.darker());
		genre3.setFont(new Font("Dialog", Font.BOLD, 15));
		genre3.setSize(80, 40);
		genre3.setLocation(10, 250);
		
		JLabel title9 = new JLabel("Jumanji: The Next Level");
		this.add(title9);
		title9.setForeground(Color.BLUE.darker());
		title9.setSize(200, 40);
		title9.setLocation(10, 280);
		
		JLabel year9 = new JLabel("2019");
		this.add(year9);
		year9.setSize(50, 40);
		year9.setLocation(200, 280);
		
		JLabel title10 = new JLabel("Toy Story 4");
		this.add(title10);
		title10.setForeground(Color.BLUE.darker());
		title10.setSize(200, 40);
		title10.setLocation(10, 300);
		
		JLabel year10 = new JLabel("2019");
		this.add(year10);
		year10.setSize(50, 40);
		year10.setLocation(200, 300);
			
	}	
}