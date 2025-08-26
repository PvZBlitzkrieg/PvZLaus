package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Rectx {
	public float rn_3666 = -1.0F;
	public float rn_3667 = -1.0F;
	public float rn_3668 = -1.0F;
	public float rn_3669 = -1.0F;
	public int rn_3670 = -1;
	public boolean rn_3671 = false;
	public boolean rn_3672 = false;

	public static final Rectx rn_3673(float rn_3674, float rn_3675, float rn_3676, float rn_3677) {
		Rectx rn_3678 = new Rectx();
		rn_3678.rn_3666 = rn_3674;
		rn_3678.rn_3667 = rn_3675;
		rn_3678.rn_3668 = rn_3676;
		rn_3678.rn_3669 = rn_3677;
		return rn_3678;
	}

	public final boolean rn_3679(float rn_3680, float rn_3681) {
		if (rn_3666 <= rn_3680 && rn_3680 < rn_3666 + rn_3668 && rn_3667 <= rn_3681 && rn_3681 < rn_3667 + rn_3669) {
			return true;
		}
		return false;
	}

	public final boolean rn_3682(float rn_3683, float rn_3684, float rn_3685) {
		if (rn_3666 + rn_3684 < rn_3683 + rn_3685 && rn_3683 + rn_3685 < rn_3666 + rn_3684 + rn_3668) {
			return true;
		}
		return false;
	}

	public final boolean rn_3686(Rectx rn_3687, int rn_3688, int rn_3689) {
		float rn_3690 = rn_3666 + rn_3688;
		float rn_3691 = rn_3687.rn_3666 + rn_3689;
		if (rn_3690 + rn_3668 < rn_3691 + rn_3687.rn_3668 && rn_3691 < rn_3690 + rn_3668) {
			return true;
		} else if (rn_3691 < rn_3690 && rn_3690 < rn_3691 + rn_3687.rn_3668) {
			return true;
		}
		return false;
	}
}