package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;

public class POS {
	public float rn_3271 = -1719.0F;
	public float rn_3272 = -1719.0F;
	public float rn_3273 = -1719.0F;
	public float rn_3274 = -1719.0F;
	public float rn_3275 = -1719.0F;
	public float rn_3276 = -1719.0F;
	public int rn_3277 = -1719;
	public int rn_3278 = -1719;
	public String rn_3279 = "";
	public int rn_3280 = 0;
	public int rn_3281 = 0;

	public final void rn_3283(float rn_3284) {
		if (rn_3284 == -1719.0F) {
			rn_3271 = 0.0F;
			rn_3272 = 0.0F;
			rn_3273 = 1.0F;
			rn_3274 = 1.0F;
			rn_3275 = 0.0F;
			rn_3276 = 0.0F;
			rn_3277 = 0;
		} else {
			rn_3271 = rn_3284;
			rn_3272 = rn_3284;
			rn_3273 = rn_3284;
			rn_3274 = rn_3284;
			rn_3275 = rn_3284;
			rn_3276 = rn_3284;
		}
	}

	public final boolean rn_3285(POS rn_3286) {
		if (rn_3271 == -1719.0F) {
			rn_3271 = rn_3286.rn_3271;
		}
		if (rn_3272 == -1719.0F) {
			rn_3272 = rn_3286.rn_3272;
		}
		if (rn_3273 == -1719.0F) {
			rn_3273 = rn_3286.rn_3273;
		}
		if (rn_3274 == -1719.0F) {
			rn_3274 = rn_3286.rn_3274;
		}
		if (rn_3275 == -1719.0F) {
			rn_3275 = rn_3286.rn_3275;
		}
		if (rn_3276 == -1719.0F) {
			rn_3276 = rn_3286.rn_3276;
		}
		if (rn_3277 == -1719.0F) {
			rn_3277 = rn_3286.rn_3277;
		}
		if (rn_3289.rn_6850(rn_3279, "")) {
			rn_3279 = rn_3286.rn_3279;
			return true;
		}
		return false;
	}
}