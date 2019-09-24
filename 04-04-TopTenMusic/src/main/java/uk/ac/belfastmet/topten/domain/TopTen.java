package uk.ac.belfastmet.topten.domain;

public class TopTen {

	private String artist;
	private String album;
	private String image;

	/**
	 * 
	 * @param number in order of top ten
	 * @param Artist or album name
	 * @param img    of artist or album
	 */
	public TopTen(String number, String Artist, String img) {

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
