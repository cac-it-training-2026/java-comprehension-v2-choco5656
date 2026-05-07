package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {

	public static void main(String[] args) {

		LoginService loginService = new LoginService(new MemberStorage());
		System.out.println("ログイン情報を入力してください");
		boolean isLogin = false;
		//TODO ここから実装する

		ConsoleReader reader = new ConsoleReader();

		Member loginUser = null;

		while (!isLogin) {
			try {
				System.out.print("input id>>");
				int id = reader.inputNumber();

				System.out.print("input password>>");
				String password = reader.inputString();

				loginUser = loginService.doLogin(id, password);

				//ユーザーを取得できなかった場合
				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました");

					//次のループ判定で外に抜け出す
					isLogin = true;
				}

			} catch (NumberFormatException e) {
				//int型変換失敗時の例外処理
				System.out.println("不正な入力です。再度入力してください");
			} catch (IOException e) {
				//入力時の例外処理 (スタックトレース出力)
				e.printStackTrace();
			}
		}

		//ループを抜けた後ユーザー情報を出力
		System.out.println("ログインユーザ情報を表示します。");
		System.out.println(loginUser.toString());
	}

}
