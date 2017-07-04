package test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import main.Movie;
import main.MovieManager;

public class MovieTest {

	// 映画一覧
	ArrayList<Movie> ml = new ArrayList<Movie>();

	@Before
	public void before() {

		// [システム] 映画を登録
		Movie movie01 = new Movie();
		movie01.setName("銀の弾丸などない");
		movie01.setLength("120");

		Movie movie02 = new Movie();
		movie02.setName("スーツ対ギーク");
		movie02.setLength("90");

		// [システム] 映画一覧
		//// ml = new ArrayList<Movie>();
		ml.add(movie01);
		ml.add(movie02);

	}

	@Test
	public void 映画座席予約() throws Exception {

		// [ユーザ] 映画一覧から選ぶ
		// 時間が無いので、上映時間が100分以内のもの）
		Movie match = null;
		for (int i = 0; i < ml.size(); i++) {
			try {
				Movie tmp = ml.get(i);
				String tmpLstr = tmp.getLength();

				Integer tmpL = new Integer(tmpLstr);

				if (100 >= tmpL) {
					match = tmp;
				}
			} catch (IndexOutOfBoundsException e) {
			}
		}

		// [システム] 選択した映画名を表示
		System.out.println("選択した映画：" + match.getName());
		// => 選択した映画：銀の弾丸などない

		// [システム] 空き座席を表示
		MovieManager mng = new MovieManager(match, match.getSeats(), match.getSetted());
		mng.getEmptySeatShow();
		// => 席番号1番は空いています
		// => 席番号2番は空いています
		// => 席番号3番は空いています

		// [ユーザ] 空き座席を選択
		mng.setSeat(2);

		// [システム] 空き座席を表示
		mng.getEmptySeatShow();
		// => 席番号1番は空いています
		// => 席番号2番は埋まっています
		// => 席番号3番は空いています
	}
}
