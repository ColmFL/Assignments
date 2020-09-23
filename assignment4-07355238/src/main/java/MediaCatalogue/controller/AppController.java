package MediaCatalogue.controller;

import javax.swing.JLabel;

import MediaCatalogue.model.BroadcastMedia;
import MediaCatalogue.model.Catalogue;
import MediaCatalogue.model.Film;
import MediaCatalogue.model.Genre;
import MediaCatalogue.model.Profile;
import MediaCatalogue.view.AddItem;
import MediaCatalogue.view.ItemDetails;
import MediaCatalogue.view.ListByGenre;
import MediaCatalogue.view.ListByYear;
import MediaCatalogue.view.ProfileSelection;
import MediaCatalogue.view.VideoCatalogue;

public class AppController {
	
	//The controller takes action events from the view classes and uses its own methods to maipulate the views.
	
	private AppController controller;
	
	private Catalogue catalogue;
	
	private ProfileSelection select;
	private JLabel profile;
	private ItemDetails details;
	private AddItem add;
	private ListByGenre listG;
	private ListByYear listY;
	private VideoCatalogue vc;
	
	public AppController(Catalogue c) {
		
		catalogue = c;
		vc = new VideoCatalogue(this);
		select = new ProfileSelection(this, catalogue.getProfiles());
		listY = new ListByYear(this);
		listG = new ListByGenre(this);
		details = new ItemDetails(this);
		add = new AddItem(this);
		
		initController();	
	}
	
	public void initController() {
		vc.setVisible(true);
	}
	
	public void switchUser() {
		select.setVisible(true);
	}
	
	public void addNew() {
		add.setVisible(true);
	}
	
	public void listByYear() {
		listY.setVisible(true);
	}
	
	public void listByGenre() {
		listG.setVisible(true);
	}
	
	public void closeItemDetails() {
		details.setVisible(false);
	}
	
	//This block ensures that when a profile is selected in the Profile select gui, 
	//the correct user data will be display in the Video Catalogue view.
	
	public void profileSelect(Profile p) {
		int i = 0;
		vc.clear();
		vc.setProfile(p.getName());
		for(Film broad : catalogue.getFilms()) {
			String listString = " ";
			for(Genre g: broad.getGenre()){
				
				if (p.getPreferredGenre() == g) {
					for(Genre ge: broad.getGenre()) {
					 listString = listString + ge.getName();
				}
					
					vc.setTitleLink(broad.getTitle(), i);
					vc.setYear(broad.getYear(), i);
					vc.setGenre(listString, i);
					i++;
				}
			}
		}				
		select.setVisible(false);
	}
	
	/*
	public void addItem(BroadcastMedia broad) {
		int i = 0;
		
	}
	*/
	
	public Catalogue getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}

	public ProfileSelection getSelect() {
		return select;
	}

	public void setSelect(ProfileSelection select) {
		this.select = select;
	}

	public ItemDetails getDetails() {
		return details;
	}

	public void setDetails(ItemDetails details) {
		this.details = details;
	}

	public AddItem getAdd() {
		return add;
	}

	public void setAdd(AddItem add) {
		this.add = add;
	}

	public ListByGenre getListG() {
		return listG;
	}

	public void setListG(ListByGenre listG) {
		this.listG = listG;
	}

	public ListByYear getListY() {
		return listY;
	}

	public void setListY(ListByYear listY) {
		this.listY = listY;
	}

	public VideoCatalogue getVc() {
		return vc;
	}

	public void setMc(VideoCatalogue vc) {
		this.vc = vc;
	}

	public AppController getController() {
		return controller;
	}

	public void setController(AppController controller) {
		this.controller = controller;
	}

	public JLabel getProfile() {
		return profile;
	}

	public void setProfile(JLabel profile) {
		this.profile = profile;
	}	
}