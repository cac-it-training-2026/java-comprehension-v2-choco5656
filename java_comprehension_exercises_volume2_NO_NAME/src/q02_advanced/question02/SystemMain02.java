package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する
		ConsoleReader reader = new ConsoleReader();

		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> memberList = new ArrayList<>();
		memberList.add(member1);
		memberList.add(member2);

		System.out.println("===会員情報を表示します===");
		//現在の会員情報を出力
		MemberManager.showAllMembers(memberList);

		System.out.println("===パスワードを変更します===");

		int targetId = 0;
		String newPassword = "";

		try {
			System.out.print("input target id>>");
			targetId = reader.inputNumber();

			System.out.print("input new password>>");
			newPassword = reader.inputString();

		} catch (NumberFormatException | IOException e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return; //処理を止める
		}

		//パスワードの変更処理
		MemberManager.updatePassword(memberList, targetId, newPassword);

		System.out.println("---SHOW DATA---");
		//現在の会員情報を再出力
		MemberManager.showAllMembers(memberList);

	}

}
