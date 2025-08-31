package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4126.rn_4127.rn_4128.rn_4198;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class STSL {
	public java.util.ArrayList<String> rn_3478 = new java.util.ArrayList<String>();
	public java.util.ArrayList<String> rn_3479 = new java.util.ArrayList<String>();

	public final STSL rn_3480(String rn_3481, String rn_3482) {
		rn_4198.rn_4209(rn_3478, rn_3481);
		rn_4198.rn_4209(rn_3479, rn_3482);
		return STSL.this;
	}

	public final String rn_3483(String rn_3484) {
		for (int rn_10484 = 0;rn_10484 < rn_4198.rn_1021(rn_3478);rn_10484 += 1) {
			if (rn_3081.rn_6682(rn_4198.rn_4201(rn_3478, rn_10484), rn_3484)) {
				return rn_4198.rn_4201(rn_3479, rn_10484);
			}
		}
		return null;
	}
}