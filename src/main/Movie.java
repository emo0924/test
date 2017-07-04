package main;

public class Movie {

	private String name;
	private String length;

	// 席番号
	private String[] seats = new String[] { "1", "2", "3" };

	// 埋まってる席番号
	private int[] setted = new int[3];

//	public Movie() {
//	}

	// nameをgetする
	public String getName() {
		return name;
	}

	// nameをセットする
	public void setName(final String movieName) {
		name = movieName;
	}

	// lengthをgetする
	public String getLength() {
		return length;
	}

	// 説明付きlengthをgetする
	public String getLength2() {
		return "上映時間は" + length + "分です";
	}

	// lengthをsetする
	public void setLength(final String movieLength) {
		length = movieLength;
	}

	public int[] getSetted() {
		return setted;
	}

	public void setSetted(int[] setted) {
		this.setted = setted;
	}

	public String[] getSeats() {
		return seats;
	}

	public void setSeats(String[] seats) {
		this.seats = seats;
	}
}
