package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Matrix_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Anim;

public class DrawStyle {
	public Anim rn_3773 = null;
	public float rn_3774 = 1.0F;
	public float rn_3775 = 1.0F;
	public float rn_3776 = 0.0F;
	public float rn_3777 = 0.0F;
	public float rn_3778 = 0.0F;
	public float rn_3779 = 0.0F;
	public int rn_3780 = 0;
	public float rn_3781 = 0.0F;
	public float rn_3782 = 0.0F;
	public android.graphics.Matrix rn_3783 = null;

	public final void rn_3784(DrawStyle rn_3785) {
		rn_3774 = rn_3774 * rn_3785.rn_3774;
		rn_3775 = rn_3775 * rn_3785.rn_3775;
		rn_3776 = rn_3776 + rn_3785.rn_3776;
		rn_3777 = rn_3777 + rn_3785.rn_3777;
		rn_3780 = rn_3780 + rn_3785.rn_3780;
		rn_3781 = rn_3781 + rn_3785.rn_3781;
		rn_3782 = rn_3782 + rn_3785.rn_3782;
	}
}