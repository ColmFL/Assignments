package MediaCatalogue.model;

import java.util.ArrayList;

public class Film extends BroadcastMedia{

	private int fid;
	private String title;
	private String year;
	private ArrayList<Genre> genre;
	private People director;
	private ArrayList<People> cast;
	private String description;
	
	public void addCast(People cast) {
		this.cast.add(cast);
	}
	
	public void addGenre(Genre genre) {
		this.genre.add(genre);
	}
	
	public Film() {
		genre = new ArrayList<Genre>();
		cast = new ArrayList<People>();	
	}
	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
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

	public People getDirector() {
		return director;
	}

	public void setDirector(People director) {
		this.director = director;
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
}
