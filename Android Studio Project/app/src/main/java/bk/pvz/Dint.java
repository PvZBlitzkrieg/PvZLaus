package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Dint {
	public int rn_3654 = 0;
	public int rn_3655 = 0;
	public boolean rn_3656 = true;

	public final Dint rn_3657(int rn_3658) {
		rn_3654 = rn_3658;
		rn_3655 = rn_3658 - 1;
		rn_3656 = true;
		return Dint.this;
	}

	public final Dint rn_3661() {
		Dint rn_3662 = new Dint();
		rn_3662.rn_3654 = rn_3654;
		rn_3662.rn_3655 = rn_3655;
		return rn_3662;
	}
}