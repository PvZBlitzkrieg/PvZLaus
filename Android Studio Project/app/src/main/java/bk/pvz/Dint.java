package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Dint {
	public int rn_3822 = 0;
	public int rn_3823 = 0;
	public boolean rn_3824 = true;

	public final Dint rn_3825(int rn_3826) {
		rn_3822 = rn_3826;
		rn_3823 = rn_3826 - 1;
		rn_3824 = true;
		return Dint.this;
	}

	public final Dint rn_3829() {
		Dint rn_3830 = new Dint();
		rn_3830.rn_3822 = rn_3822;
		rn_3830.rn_3823 = rn_3823;
		return rn_3830;
	}
}