package com.weibomovie.model;
 

public class Movie {
	
	private int id;
	private String name ;
	private String genre;
	private String intro;
	private String poster_url;
	private String large_poster_url;
	private float score;
	private int score_count;
	private int page_list_id;
	private int is_showing;
	private int is_coming;
	private String release_date;
	private int is_Like;
	
	
	
	public int getIs_Like() {
		return is_Like;
	}

	public void setIs_Like(int is_Like) {
		this.is_Like = is_Like;
	}

	public Movie(int id, String name, String poster_url, float score,
			int page_list_id) {
		super();
		this.id = id;
		this.name = name;
		this.poster_url = poster_url;
		this.score = score;
		this.page_list_id = page_list_id;
	}

	public Movie(int id, String name, String genre, String intro,
			String poster_url, String large_poster_url, float score,
			int score_count , int is_showing , int is_coming, String release_date) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.intro = intro;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score;
		this.score_count = score_count;
		this.is_showing = is_showing;
		this.is_coming = is_coming;
		this.release_date = release_date;
	}
	
	public int getIs_coming() {
		return is_coming;
	}

	public void setIs_coming(int is_coming) {
		this.is_coming = is_coming;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public Movie(int id, String name, String genre, String intro,
			String poster_url, float score,String large_poster_url, 
			int score_count , int page_list_id,int is_coming, String release_date) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.intro = intro;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score;
		this.score_count = score_count;
		this.page_list_id = page_list_id;
		this.is_coming = is_coming;
		this.release_date = release_date;
	}
	public Movie() { 
	}
	
 

	public Movie(int id, String name, String genre, String intro,
			String poster_url, String large_poster_url, float score,
			 int page_list_id) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.intro = intro;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score; 
		this.page_list_id = page_list_id;
	}

	public Movie(int int1, String string, String string2, String string3,
			String string4, int int2, String string5, int i, Integer integer) { 
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public String getPoster_url() {
		return poster_url;
	}
	public void setPoster_url(String poster_url) {
		this.poster_url = poster_url;
	}
	public String getLarge_poster_url() {
		return large_poster_url;
	}
	public void setLarge_poster_url(String large_poster_url) {
		this.large_poster_url = large_poster_url;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public int getScore_count() {
		return score_count;
	}
	public void setScore_count(int score_count) {
		this.score_count = score_count;
	}
	
	
	public int getPage_list_id() {
		return page_list_id;
	}
	public void setPage_list_id(int page_list_id) {
		this.page_list_id = page_list_id;
	}

	public int getIs_showing() {
		return is_showing;
	}

	public void setIs_showing(int is_showing) {
		this.is_showing = is_showing;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", genre=" + genre
				+ ", intro=" + intro + ", poster_url=" + poster_url
				+ ", large_poster_url=" + large_poster_url + ", score=" + score
				+ ", score_count=" + score_count + ", page_list_id="
				+ page_list_id + ", is_showing=" + is_showing + ", is_coming="
				+ is_coming + ", release_date=" + release_date + "]";
	}

	
	
	
}