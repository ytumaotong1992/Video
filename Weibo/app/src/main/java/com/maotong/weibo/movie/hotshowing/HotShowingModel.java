package com.maotong.weibo.movie.hotshowing;

public class HotShowingModel {
	
	private int id;
	private String name ;
	private String genre;
	private String intro;
	private String poster_url;
	private String large_poster_url;
	private float score;
	private int score_count;
	
	
	
	public HotShowingModel(int id, String name, String genre, String intro,
						   String poster_url, String large_poster_url, float score,
						   int score_count) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.intro = intro;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score;
		this.score_count = score_count;
	}
	public HotShowingModel() {
		// TODO Auto-generated constructor stub
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
	
	
}
