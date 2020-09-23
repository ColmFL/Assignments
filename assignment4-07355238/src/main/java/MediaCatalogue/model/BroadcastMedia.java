package MediaCatalogue.model;

import java.util.ArrayList;

public abstract class BroadcastMedia {

	public abstract String getTitle();
	public abstract void setTitle(String title);
	
	public abstract String getYear();
	public abstract void setYear(String year);
	
	public abstract ArrayList<Genre> getGenre();
	public abstract void setGenre(ArrayList<Genre> genre);
	
	public abstract ArrayList<People> getCast();
	public abstract void setCast(ArrayList<People> cast);
	
	public abstract String getDescription();
	public abstract void setDescription(String description);
	
}
