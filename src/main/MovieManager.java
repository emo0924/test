package main;

public class MovieManager {

	// 映画
	private Movie movie;

	// 席番号
	private String[] seats;

	// 埋まってる席番号
	private int[] setted;

	public MovieManager(Movie movie, String[] seats, int[] setted) {
		this.movie = movie;
		this.seats = seats;
		this.setted = setted;
	}

	public void getEmptySeatShow() {
		for (int i = 0; i < seats.length; i++) {
			String num = seats[i];
			Integer tmp = setted[i];
			System.out.println("席番号" + num + "番は" + (tmp != null && tmp == 1 ? "埋まって" : "空いて") + "います");
		}
	}

	
	
	public void setSeat(int num) {
		setted[num - 1] = 1;
		movie.setSetted(setted);
	}
}