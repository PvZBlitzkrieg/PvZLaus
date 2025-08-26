package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Rectx;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4294.rn_4295.rn_4296.rn_4366;
import bk.pvz.RectList;
import bk.pvz.op;

public class String2RectList {
	public java.util.ArrayList<String> rn_3692 = new java.util.ArrayList<String>();
	public java.util.ArrayList<Rectx> rn_3693 = new java.util.ArrayList<Rectx>();

	public final int rn_1225() {
		return op.rn_1236(rn_4366.rn_1225(rn_3692), RectList.rn_1225(rn_3693));
	}

	public final Rectx rn_3696(int rn_3697) {
		return RectList.rn_3713(rn_3693, rn_3697);
	}

	public final Rectx rn_3698(String rn_3699) {
		for (int rn_10616 = 0;rn_10616 < op.rn_1236(rn_4366.rn_1225(rn_3692), RectList.rn_1225(rn_3693));rn_10616 += 1) {
			if (rn_3289.rn_6850(rn_4366.rn_4369(rn_3692, rn_10616), rn_3699)) {
				return RectList.rn_3713(rn_3693, rn_10616);
			}
		}
		return null;
	}

	public final String2RectList rn_3700(String rn_3701, Rectx rn_3702) {
		rn_4366.rn_4377(rn_3692, rn_3701);
		RectList.rn_3721(rn_3693, rn_3702);
		return String2RectList.this;
	}

	public final Rectx rn_3703(String rn_3704, float rn_3705, float rn_3706, float rn_3707, float rn_3708, int rn_3709) {
		Rectx rn_3710 = rn_3698(rn_3704);
		if (rn_3710 == null) {
			rn_3710 = Rectx.rn_3673(rn_3705, rn_3706, rn_3707, rn_3708);
			rn_3710.rn_3670 = rn_3709;
			rn_3700(rn_3704, rn_3710);
		}
		return rn_3710;
	}
}