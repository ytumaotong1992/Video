package com.maotong.weibo.main;

import java.io.Serializable;

public class MovieModel implements Serializable{
	
	private int id;
	private String name ;
	private String genre;
	private String intro;
	private String poster_url;
	private String large_poster_url;
	private float score;
	private int score_count;
	private int isLike;
	private String release_date;
	private String video_url;
	private String director;
	private String actors;

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public MovieModel(int id, String name, String intro, String genre, String poster_url, String large_poster_url,
					  String release_date , float score, int score_count) {
		this.id = id;
		this.name = name;
		this.intro = intro;
		this.genre = genre;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score;
		this.score_count = score_count;
		this.release_date = release_date;
	}

	public MovieModel(int id, String name, String genre, String intro, String poster_url, String large_poster_url, String release_date, float score, int score_count, int is_like) {
		this.id = id;
		this.name = name;
		this.intro = intro;
		this.genre = genre;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score;
		this.score_count = score_count;
		this.release_date = release_date;
		this.isLike = is_like;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public MovieModel(int id, String name, String genre, String intro,
					  String poster_url, String large_poster_url, float score,
					  int score_count , int isLike) {
		super();
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.intro = intro;
		this.poster_url = poster_url;
		this.large_poster_url = large_poster_url;
		this.score = score;
		this.score_count = score_count;
		this.isLike = isLike;
	}

	@Override
	public String toString() {
		return "MovieModel{" +
				"id=" + id +
				", name='" + name + '\'' +
				", genre='" + genre + '\'' +
				", intro='" + intro + '\'' +
				", poster_url='" + poster_url + '\'' +
				", large_poster_url='" + large_poster_url + '\'' +
				", score=" + score +
				", score_count=" + score_count +
				", isLike=" + isLike +
				", release_date='" + release_date + '\'' +
				", video_url='" + video_url + '\'' +
				", director='" + director + '\'' +
				", actors='" + actors + '\'' +
				'}';
	}

	public int getIsLike() {
		return isLike;
	}

	public void setIsLike(int isLike) {
		this.isLike = isLike;
	}

	public MovieModel() {
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