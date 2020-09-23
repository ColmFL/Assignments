package MediaCatalogue.model;

import java.util.ArrayList;

public class Catalogue {
	
	private ArrayList<BroadcastMedia> broad = new ArrayList<BroadcastMedia>();
	private ArrayList<Film> films = new ArrayList<Film>();
	private ArrayList<TVShow> tvseries = new ArrayList<TVShow>();
	private ArrayList<Profile> profiles = new ArrayList<Profile>();
	private ArrayList<Genre> genres = new ArrayList<Genre>();
	
	public ArrayList<Genre> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<Genre> genres) {
		this.genres = genres;
	}

	private ArrayList<People> people = new ArrayList<People>();
	
	public void addFilm(Film film) {
		films.add(film);
	}
	
	public void addShow(TVShow show) {
		tvseries.add(show);
	}
	
	public void addPeople(People people) {
		this.people.add(people);
	}
	
	public void addGenre(Genre genre) {
		this.genres.add(genre);
	}
	
	public void addProfile(Profile profile) {
		this.profiles.add(profile);
	}
	

	public ArrayList<BroadcastMedia> getBroad() {
		return broad;
	}
	
	public void setBroad(ArrayList<BroadcastMedia> broad) {
		this.broad = broad;
	}
	
	public ArrayList<Film> getFilms() {
		return films;
	}
	
	public void setFilms(ArrayList<Film> films) {
		this.films = films;
	}
	
	public ArrayList<Profile> getProfiles() {
		return profiles;
	}
	
	public void setProfiles(ArrayList<Profile> profiles) {
		this.profiles = profiles;
	}
	
	public ArrayList<People> getPeople() {
		return people;
	}
	
	public void setPeople(ArrayList<People> people) {
		this.people = people;
	}

	public ArrayList<TVShow> getTvseries() {
		return tvseries;
	}

	public void setTvseries(ArrayList<TVShow> tvseries) {
		this.tvseries = tvseries;
	}
}