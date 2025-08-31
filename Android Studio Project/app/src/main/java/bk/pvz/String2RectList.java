package bk.pvz;
import bk.pvz.Rectx;
import bk.pvz.RectList;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_4126.rn_4127.rn_4128.rn_4198;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;

public class String2RectList {
	public java.util.ArrayList<String> rn_3524 = new java.util.ArrayList<String>();
	public java.util.ArrayList<Rectx> rn_3525 = new java.util.ArrayList<Rectx>();

	public final int rn_1021() {
		return op.rn_1032(rn_4198.rn_1021(rn_3524), RectList.rn_1021(rn_3525));
	}

	public final Rectx rn_3528(int rn_3529) {
		return RectList.rn_3545(rn_3525, rn_3529);
	}

	public final Rectx rn_3530(String rn_3531) {
		for (int rn_10487 = 0;rn_10487 < op.rn_1032(rn_4198.rn_1021(rn_3524), RectList.rn_1021(rn_3525));rn_10487 += 1) {
			if (rn_3081.rn_6682(rn_4198.rn_4201(rn_3524, rn_10487), rn_3531)) {
				return RectList.rn_3545(rn_3525, rn_10487);
			}
		}
		return null;
	}

	public final String2RectList rn_3532(String rn_3533, Rectx rn_3534) {
		rn_4198.rn_4209(rn_3524, rn_3533);
		RectList.rn_3553(rn_3525, rn_3534);
		return String2RectList.this;
	}

	public final Rectx rn_3535(String rn_3536, float rn_3537, float rn_3538, float rn_3539, float rn_3540, int rn_3541) {
		Rectx rn_3542 = rn_3530(rn_3536);
		if (rn_3542 == null) {
			rn_3542 = Rectx.rn_3492(rn_3537, rn_3538, rn_3539, rn_3540);
			rn_3542.rn_3489 = rn_3541;
			rn_3532(rn_3536, rn_3542);
		}
		return rn_3542;
	}
}