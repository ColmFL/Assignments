package MediaCatalogue.model;

import java.util.ArrayList;

public class TVShow extends BroadcastMedia{

	private int tid;
	private String title;
	private String year;
	private ArrayList<Genre> genre;
	private People creator;
	private ArrayList<People> cast;
	private String description;
	
	private ArrayList<TVShow> shows;
	
	public void addShow(TVShow show) {
		shows.add(show);
	}
	
	public void addGenre(Genre genre) {
		this.genre.add(genre);
	}
	
	public void addCast(People cast) {
		this.cast.add(cast);
	}
	
	public TVShow() {
		
	}
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public ArrayList<Genre> getGenre() {
		return genre;
	}

	public void setGenre(ArrayList<Genre> genre) {
		this.genre = genre;
	}

	public ArrayList<People> getCast() {
		return cast;
	}

	public void setCast(ArrayList<People> cast) {
		this.cast = cast;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public People getCreator() {
		return creator;
	}

	public void setCreator(People creator) {
		this.creator = creator;
	}	
}
