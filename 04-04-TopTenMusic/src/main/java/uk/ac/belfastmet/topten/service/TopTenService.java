package uk.ac.belfastmet.topten.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import uk.ac.belfastmet.topten.domain.*;

@Service
public class TopTenService {

	private ArrayList<TopTen> artistTopTen;
	private ArrayList<TopTen> albumTopTen;

	public ArrayList<TopTen> getArtistTopTen() {

		this.artistTopTen = new ArrayList<TopTen>();

		this.artistTopTen.add(new TopTen("one", "Artist1", "Artist1.png"));
		this.artistTopTen.add(new TopTen("two", "Artist2", "Artist2.png"));
		this.artistTopTen.add(new TopTen("three", "Artist3", "Artist3.png"));
		this.artistTopTen.add(new TopTen("four", "Artist4", "Artist4.png"));
		this.artistTopTen.add(new TopTen("five", "Artist5", "Artist5.png"));
		this.artistTopTen.add(new TopTen("six", "Artist6", "Artist6.png"));
		this.artistTopTen.add(new TopTen("seven", "Artist7", "Artist7.png"));
		this.artistTopTen.add(new TopTen("eight", "Artist8", "Artist8.png"));
		this.artistTopTen.add(new TopTen("nine", "Artist9", "Artist9.png"));
		this.artistTopTen.add(new TopTen("ten", "Artist10", "Artist10.png"));

		return this.artistTopTen;
	}

	public ArrayList<TopTen> getAlbumTopTen() {

		this.albumTopTen = new ArrayList<TopTen>();

		this.albumTopTen.add(new TopTen("one", "Album1", "Album1.png"));
		this.albumTopTen.add(new TopTen("two", "Album2", "Album2.png"));
		this.albumTopTen.add(new TopTen("three", "Album3", "Album3.png"));
		this.albumTopTen.add(new TopTen("four", "Album4", "Album4.png"));
		this.albumTopTen.add(new TopTen("five", "Album5", "Album5.png"));
		this.albumTopTen.add(new TopTen("six", "Album6", "Album6.png"));
		this.albumTopTen.add(new TopTen("seven", "Album7", "Album7.png"));
		this.albumTopTen.add(new TopTen("eight", "Album8", "Album8.png"));
		this.albumTopTen.add(new TopTen("nine", "Album9", "Album9.png"));
		this.albumTopTen.add(new TopTen("ten", "Album10", "Album10.png"));

	}
}