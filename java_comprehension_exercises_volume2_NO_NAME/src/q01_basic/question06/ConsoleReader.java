package q01_basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 標準入力を制御するクラス
 */
class ConsoleReader {

	/**
	 * 文字列の標準入力。
	 * 
	 * @return 入力文字列
	 * @throws IOException
	 */

	public String inputString() throws IOException {
		//TODO ここから実装する
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}

	/**
	 * 整数の標準入力。
	 * 
	 * @return 入力整数b　入力されて数値に変換された値
	 * @throws IOException　入出力処理でエラーが発生した場合
	 * @throws NumberFormatException　入力値が数値に変換できない場合
	 */
	public int inputNumber() throws IOException, NumberFormatException {
		//TODO ここから実装する
		String line = inputString();//自身のinputStringメソッドを呼び出す
		return Integer.parseInt(line);

	}

}
