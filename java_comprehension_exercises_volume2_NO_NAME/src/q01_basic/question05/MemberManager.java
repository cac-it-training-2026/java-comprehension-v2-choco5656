package q01_basic.question05;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember abstMember : members) {
			abstMember.showMember();

		}
	}

}
