package com.sist.project.data;

public class BugsVO {
	private int mno;
	private int cno;
	private String poster;
	private String title;
	private String artist;
	private String albumtitle;
	private String genre;

	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}

	
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbumtitle() {
		return albumtitle;
	}
	public void setAlbumtitle(String albumtitle) {
		this.albumtitle = albumtitle;
	}


}