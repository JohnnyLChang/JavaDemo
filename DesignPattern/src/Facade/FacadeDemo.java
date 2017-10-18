package Facade;

import java.math.BigInteger;

/*
Name：Facade
Context：
當一個系統越來越龐大的時候，如果沒有好好規劃系統結構，整個系統內部物件之間的關聯性很容易變得過於複雜，
最後導致牽一髮而動全身；除了影響開發速度，也很容易導致不預期的程式錯誤。一種常見的結構化方式是將系統依據功能劃分
為若干個子系統，子系統內部的物件允許較緊密的關聯，而子系統之間則應該要儘量降低其相依性。

Problem：如何使用子系統？

Force：
一個子系統可能會有很多個客戶端使用它，我們不希望子系統內部的改變，即使是非常輕微的異動，將會導致客戶端需要跟著改變。
如果子系統的使用方式過於複雜，客戶端會被迫必須了解很多子系統的細節，這樣將會增加客戶端的學習曲線、提高客戶端與子系統
內部的相依性，甚至可能會導致客戶端拒絕使用子系統而走向自行開發的道路。

Solution：
提供一個存取子系統內部各項服務的單一介面，讓子系統變得更容易使用，並且可隔離客戶端程式對子系統內部元件的相依性。
 * */

public class FacadeDemo {
	public static void main(String[] args) {
		// 3. Client uses the Facade
		Line lineA = new Line(new Point(2, 4), new Point(5, 7));
		lineA.move(-2, -4);
		System.out.println("after move:  " + lineA);
		lineA.rotate(45);
		System.out.println("after rotate: " + lineA);
		Line lineB = new Line(new Point(2, 1), new Point(2.866, 1.5));
		lineB.rotate(30);
		System.out.println("30 degrees to 60 degrees: " + lineB);
		Double dnan = Double.NaN;
		BigInteger t = BigInteger.ONE;
		BigInteger u = new BigInteger("1");
		try {
			BigInteger v = t.divide(u);
			System.out.println(v.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
