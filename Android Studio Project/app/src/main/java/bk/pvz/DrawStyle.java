package bk.pvz;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Matrix_;

public class DrawStyle {
	public Anim rn_3605 = null;
	public float rn_3606 = 1.0F;
	public float rn_3607 = 1.0F;
	public float rn_3608 = 0.0F;
	public float rn_3609 = 0.0F;
	public float rn_3610 = 0.0F;
	public float rn_3611 = 0.0F;
	public int rn_3612 = 0;
	public float rn_3613 = 0.0F;
	public float rn_3614 = 0.0F;
	public android.graphics.Matrix rn_3615 = null;

	public final void rn_3616(DrawStyle rn_3617) {
		rn_3606 = rn_3606 * rn_3617.rn_3606;
		rn_3607 = rn_3607 * rn_3617.rn_3607;
		rn_3608 = rn_3608 + rn_3617.rn_3608;
		rn_3610 = rn_3610 + rn_3617.rn_3610;
		rn_3611 = rn_3611 + rn_3617.rn_3611;
		rn_3609 = rn_3609 + rn_3617.rn_3609;
		rn_3612 = rn_3612 + rn_3617.rn_3612;
		rn_3613 = rn_3613 + rn_3617.rn_3613;
		rn_3614 = rn_3614 + rn_3617.rn_3614;
		rn_3615 = rn_3617.rn_3615;
	}
}