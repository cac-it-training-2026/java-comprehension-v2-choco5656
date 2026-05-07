package q01_basic.question07;

public class SystemMain07 {

	public static void main(String[] args) {

		NumberList numberList = new NumberList();
		System.out.println("1-任意の整数をListに代入します");
		System.out.print("input number>>");
		int limit = 0;
		//TODO ここから実装する

		try {
			//ConsoleReaderを生成し、入力を受け取ってlimitに代入
			ConsoleReader reader = new ConsoleReader();
			limit = reader.inputNumber();
		} catch (Exception e) {
			//例外(アルファベットが入力されたなど)が発生した場合は、エラー詳細を出力する
			e.printStackTrace();
		}

		//入力された数値をもとに、NumberListクラスにリストを作ってもらう
		numberList.addFromOneTo(limit);
		//作成されたリストの中身を取得して画面に出力する
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの合計を計算します");
		int sum = 0;
		//TODO ここから実装する
		//NumberListに合計を計算してもらい、結果をsumに代入する
		sum = numberList.calcSumOfList();

		System.out.println("1から" + limit + "までの合計は" + sum + "です。");

		System.out.println("****************");
		System.out.println("Listの各要素を2倍します");
		//TODO ここから実装する

		// NunberListに各要素を2倍してもらう
		numberList.doubleListEachValue();
		// 2倍になったリストの中身を取得して画面に出力する
		System.out.println(numberList.getNumbers());

		System.out.println("****************");
		System.out.println("Listの前半分のインデックスの要素を削除します");
		//TODO ここから実装する

		//
		numberList.removeIndexOfFirstHalf();
		System.out.println(numberList.getNumbers());

	}

}
