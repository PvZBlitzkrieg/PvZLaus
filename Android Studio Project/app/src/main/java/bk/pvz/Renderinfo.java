package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;

public class Renderinfo {
	public float[] rn_3426 = {1.0F, 1.0F, 1.0F, 1.0F};
	public float rn_3427 = 0.0F;
	public float rn_3428 = 0.0F;
	public String rn_3429 = "";
	public float[] rn_3430 = {1.0F, 1.0F, 1.0F, 1.0F};
	public boolean rn_3431 = false;
	public boolean rn_3432 = false;
	public boolean rn_3433 = false;
	public boolean rn_3434 = false;

	public final void rn_3435(float[] rn_3436, float rn_3437) {
		rn_3426 = rn_3436;
		rn_3428 = rn_3437;
		rn_3427 = rn_3428;
		rn_3431 = true;
		rn_3433 = true;
	}

	public final void rn_3441(float[] rn_3442) {
		rn_3430 = rn_3442;
		rn_3433 = true;
		rn_3434 = true;
	}

	public final float[] rn_3443() {
		if (rn_3431) {
			float[] rn_3444 = (float[]) (new float[rn_3426.length]);
			float rn_3445 = (rn_3428 / rn_3427);
			for (int rn_10596 = 0;rn_10596 < rn_3444.length;rn_10596 += 1) {
				if (rn_10596 < rn_3444.length - 1) {
					rn_3444 [rn_10596] = 1.0F + (rn_3426 [rn_10596] - 1.0F) * rn_3445;
				} else {
					rn_3444 [rn_10596] = rn_3426 [rn_10596];
				}
			}
			return rn_3449(rn_3444);
		} else if (rn_3432) {
			float[] rn_3446 = (float[]) (new float[rn_3426.length]);
			float rn_3447 = (rn_3428 / (rn_3427 / 2));
			if (rn_3428 > rn_3427 / 2) {
				rn_3447 = 2 - rn_3447;
			}
			for (int rn_10597 = 0;rn_10597 < rn_3446.length;rn_10597 += 1) {
				if (rn_10597 < rn_3446.length - 1) {
					rn_3446 [rn_10597] = 1.0F + (rn_3426 [rn_10597] - 1.0F) * rn_3447;
				} else {
					rn_3446 [rn_10597] = rn_3426 [rn_10597];
				}
			}
			return rn_3449(rn_3446);
		} else {
			return rn_3449(rn_3426);
		}
	}

	public final float[] rn_3449(float[] rn_3450) {
		if (rn_3428 <= 0) {
			rn_3431 = false;
			rn_3432 = false;
			rn_3426 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
		}
		for (int rn_10598 = 0;rn_10598 < rn_3450.length;rn_10598 += 1) {
			rn_3450 [rn_10598] = rn_3450 [rn_10598] * rn_3430 [rn_10598];
		}
		return rn_3450;
	}
}