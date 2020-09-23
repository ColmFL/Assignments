package MediaCatalogue.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import MediaCatalogue.controller.AppController;
import java.awt.*;

//This is the main view class. This will be displayed when the application is started.
	public class VideoCatalogue extends JFrame implements ActionListener{ 
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JLabel profile;
		private JButton button;
		private JButton button2;
		private JButton button3;
		private JButton button4;
		private JLabel titleLink = new JLabel();
		private JLabel titleLink2 = new JLabel();
		private JLabel titleLink3 = new JLabel();
		private JLabel titleLink4 = new JLabel();
		private JLabel titleLink5 = new JLabel();
		private JLabel year = new JLabel();
		private JLabel year2 = new JLabel();
		private JLabel year3 = new JLabel();
		private JLabel year4 = new JLabel();
		private JLabel year5 = new JLabel();
		private JLabel PGenre = new JLabel();
		private JLabel PGenre2 = new JLabel();
		private JLabel PGenre3 = new JLabel();
		private JLabel PGenre4 = new JLabel();
		private JLabel PGenre5 = new JLabel();


		AppController controller;
		
		public VideoCatalogue(AppController c){
			
			super("Video Catalogue");
			this.controller = c;
			
		this.setLayout(null);
		this.pack();
		this.setSize(700, 300);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocation(400, 200);
		this.setVisible(false);

		profile = new JLabel("User Profile: DEFAULT_USER");
		this.add(profile);
		profile.setFont(new Font("Dialog", Font.BOLD, 16));
		profile.setForeground(Color.GREEN.darker());
		profile.setSize(300, 40);
		profile.setLocation(300, 10);
		
		year = new JLabel("1995");
		this.add(year);
		year.setSize(80, 40);
		year.setLocation(350, 50);
		
		year2 = new JLabel("1999");
		this.add(year2);
		year2.setSize(80, 40);
		year2.setLocation(350, 80);
		
		year3 = new JLabel("2000");
		this.add(year3);
		year3.setSize(80, 40);
		year3.setLocation(350, 110);
		
		year4 = new JLabel("2019");
		this.add(year4);
		year4.setSize(80, 40);
		year4.setLocation(350, 140);
		
		year5 = new JLabel("2001");
		this.add(year5);
		year5.setSize(80, 40);
		year5.setLocation(350, 170);
		
		
		PGenre = new JLabel("Animation | Adventure | Comedy");
		this.add(PGenre);
		PGenre.setSize(200, 40);
		PGenre.setLocation(450, 50);
		
		PGenre2 = new JLabel("Animation | Adventure | Comedy");
		this.add(PGenre2);
		PGenre2.setSize(200, 40);
		PGenre2.setLocation(450, 80);
		
		PGenre3 = new JLabel("Animation | Adventure | Comedy");
		this.add(PGenre3);
		PGenre3.setSize(200, 40);
		PGenre3.setLocation(450, 110);
		
		PGenre4 = new JLabel("Animation | Adventure | Comedy");
		this.add(PGenre4);
		PGenre4.setSize(200, 40);
		PGenre4.setLocation(450, 140);
		
		PGenre5 = new JLabel("Animation | Adventure | Comedy");
		this.add(PGenre5);
		PGenre5.setSize(200, 40);
		PGenre5.setLocation(450, 170);
		
		
		JButton button = new JButton("Switch Profile");
		this.add(button);
		button.setBackground(Color.GRAY);
		button.setSize(170, 50);
		button.setLocation(10, 10);
		
		
		JButton button2 = new JButton("Add New");
		this.add(button2);
		button2.setBackground(Color.GRAY);
		button2.setSize(170, 50);
		button2.setLocation(10, 70);

		
		
		JButton button3 = new JButton("List by Year");
		this.add(button3);
		button3.setBackground(Color.GRAY);
		button3.setSize(170, 50);
		button3.setLocation(10, 130);


		JButton button4 = new JButton("List by Genre");
		this.add(button4);
		button4.setBackground(Color.GRAY);
		button4.setSize(170, 50);
		button4.setLocation(10, 190);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.switchUser();				
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.addNew();				
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			controller.listByYear();
		}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.listByGenre();				
			}
		});
		
		titleLink = new JLabel("Toy Story");
		titleLink.setForeground(Color.BLUE.darker());
		this.add(titleLink);
		titleLink.setSize(170, 40);
		titleLink.setLocation(230, 50);
		
		titleLink2 = new JLabel("Toy Story 2");
		titleLink2.setForeground(Color.BLUE.darker());
		this.add(titleLink2);
		titleLink2.setSize(170, 40);
		titleLink2.setLocation(230, 80);
		
		titleLink3 = new JLabel("Toy Story 3");
		titleLink3.setForeground(Color.BLUE.darker());
		this.add(titleLink3);
		titleLink3.setSize(170, 40);
		titleLink3.setLocation(230, 110);
		
		titleLink4 = new JLabel("Toy Story 4");
		titleLink4.setForeground(Color.BLUE.darker());
		this.add(titleLink4);
		titleLink4.setSize(170, 40);
		titleLink4.setLocation(230, 140);
		
		titleLink5 = new JLabel("Monsters, Inc.");
		titleLink5.setForeground(Color.BLUE.darker());
		this.add(titleLink5);
		titleLink5.setSize(170, 40);
		titleLink5.setLocation(230, 170);
		}

		public JButton getButton() {
			return button;
		}

		public void setButton(JButton button) {
			this.button = button;
		}

		public JButton getButton2() {
			return button2;
		}

		public void setButton2(JButton button2) {
			this.button2 = button2;
		}

		public JButton getButton3() {
			return button3;
		}

		public void setButton3(JButton button3) {
			this.button3 = button3;
		}

		public JButton getButton4() {
			return button4;
		}

		public void setButton4(JButton button4) {
			this.button4 = button4;
		}

		@Override
		public void actionPerformed(ActionEvent e) {			
		}

		public JLabel getTitleLink() {
			return titleLink;
		}

		public JLabel getProfile() {
			return profile;
		}

		public void setProfile(String profile) {
			this.profile.setText(profile); 
		}
		
		//This method will be called in the controller and will ensure
		//that the correct film will be rendered in the Video Catalogue view
		//when a profile is selected.
		public void setTitleLink(String titleLink, int i) {
			
			if(i == 0) {
				this.titleLink.setText(titleLink);
			}
			if(i == 1) {
				this.titleLink2.setText(titleLink);
			}
			if(i == 2) {
				this.titleLink3.setText(titleLink);
			}
			if(i == 3) {
				this.titleLink4.setText(titleLink);
			}
			if(i == 4) {
				this.titleLink5.setText(titleLink);
			}			
		}

		//This method is called in the controller class and
		//ensures that when a profile is selected, the Video
		//Catalogue view is cleared and ready for the selected profile's
		//info to be rendered.
		public void clear() {
			titleLink.setText(" ");
			titleLink2.setText(" ");
			titleLink3.setText(" ");
			titleLink4.setText(" ");
			titleLink5.setText(" ");
			year.setText(" ");
			year2.setText(" ");
			year3.setText(" ");
			year4.setText(" ");
			year5.setText(" ");
			PGenre.setText(" ");
			PGenre2.setText(" ");
			PGenre3.setText(" ");
			PGenre4.setText(" ");
			PGenre5.setText(" ");
		}
		
		//This method will be called in the controller to 
		//render the correct year of the film based on the profile selected.
		public void setYear(String year, int i) {
			if(i == 0) {
				this.year.setText(year);
			}
			if(i == 1) {
				this.year2.setText(year);
			}
			if(i == 2) {
				this.year3.setText(year);
			}
			if(i == 3) {
				this.year4.setText(year);
			}
			if(i == 4) {
				this.year5.setText(year);
			}
		}

		//This method will be called in controller and will ensure that the 
		//corresponding genres will be rendered with the specified film.
		public void setGenre(String listString, int i) {
			if(i == 0) {
				this.PGenre.setText(listString);
			}
			if(i == 1) {
				this.PGenre2.setText(listString);
			}
			if(i == 2) {
				this.PGenre3.setText(listString);
			}
			if(i == 3) {
				this.PGenre4.setText(listString);
			}
			if(i == 4) {
				this.PGenre5.setText(listString);
			}
		}
		
}
