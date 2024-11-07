package com.javaex.practice;

class Song {
	// field
	private String _title = "";
	private String _artist = "";
	private String _album = "";
	private String _composer = "";
	private int _year = 0;
	private int _track = 0;
	
	// constructor
	public Song() {
		
	}
	
	public Song(String title, String artist) {
		this._title = title;
		this._artist = artist;
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist);
		
		this._album = album;
		this._composer = composer;
		this._year = year;
		this._track = track;
	}
	
	// methods
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %d번 track, %s 작곡 )%n", _artist, _title, _album, _year, _track, _composer);
	}
	
}

public class SongApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song song1 = new Song("좋은날", "아이유", "Real", "이민수", 2010, 3);
		Song song2 = new Song("거짓말", "BIGBANG", "Always", "G-DRAGON", 2007, 2);
		Song song3 = new Song("벚꽃엔딩", "버스커버스커", "버스커버스커1집", "장범준", 2012, 4);
		
		Song[] songs = new Song[] { song1, song2, song3 };
		
		for(Song song: songs) {
			song.showInfo();
		}
	}

}
