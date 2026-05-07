package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int id, String password) {
		boolean isFound = false;

		for (Member member : members) {
			if (member.getId() == id) {
				member.setPassword(password);
				isFound = true;
				break;
			}
		}

		if (!isFound) {
			System.out.println("該当者はいませんでした。");
		}
	}

}
