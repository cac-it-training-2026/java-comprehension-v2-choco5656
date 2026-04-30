package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
	public int inputNumber() throws NumberFormatException, IOException {
		System.out.println("input number>>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		//文字列を整数に変換する（"a"などが入力されるとNonberFormatExceptionが発生）
		return Integer.parseInt(input);
	}

}
