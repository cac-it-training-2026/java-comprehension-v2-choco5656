package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		//TODO ここから実装する

		int id = 0;
		String password = "";

		try {
			System.out.println("input id>>");
			id = cr.inputNumber();//IOExeption NumberFOrmatExceptionの可能性あり
		} catch (NumberFormatException e) {
			//数字に変換できない文字列が入力された場合の対処
			System.out.println("error!");
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		Member member = new Member(id, password, "Miura Manabu", 28, 2);

		System.out.println("---SHOW MEMBER---");

		member.showMember();

	}

}
