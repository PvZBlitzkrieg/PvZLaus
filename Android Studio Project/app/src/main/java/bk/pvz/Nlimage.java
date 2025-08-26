package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_9923;
import rn_4294.rn_4295.rn_4296.rn_6193;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ope;
import rn_4581.rn_4582.rn_4583.rn_9105;
import bk.pvz.Colorset;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Nlimage extends Colorset {
	public boolean rn_3631 = false;
	public String rn_3632 = "";

	public final Nlimage rn_3634() {
		if (rn_3631 == false) {
			rn_2031(rn_9105.rn_9108(rn_3632));
			if (rn_3289.rn_6864(rn_3632, "jpg")) {
				java.io.File rn_3635 = new java.io.File(rn_3632);
				String rn_3636 = rn_6193.rn_6206(rn_3635) + "/" + rn_9923.rn_9935(rn_9923.rn_9937(rn_3632)) + "_.png";
				if (rn_9923.rn_9959(rn_3636)) {
					rn_3637(rn_3636);
				} else {
					rn_3636 = rn_3289.rn_6866(rn_4301.rn_6843(rn_6193.rn_6206(rn_3635)), "main", "pvz") + "/" + rn_9923.rn_9935(rn_9923.rn_9937(rn_3632)) + "_.png";
					if (rn_9923.rn_9959(rn_3636)) {
						rn_3637(rn_3636);
					}
				}
			}
			rn_3631 = true;
		}
		ope.rn_1923(rn_2018);
		return Nlimage.this;
	}

	public final void rn_3637(String rn_3638) {
		Colorset rn_3639 = Colorset.rn_2028(rn_9105.rn_9108(rn_3638));
		for (int rn_10613 = 0;rn_10613 < rn_3639.rn_2018.length;rn_10613 += 1) {
			int rn_3640 = (rn_3639.rn_2018) [rn_10613];
			int[] rn_3641 = ope.rn_1863(rn_2018 [rn_10613]);
			int[] rn_3642 = ope.rn_1863(rn_3640);
			if (rn_3642 [3] < 5) {
				rn_2018 [rn_10613] = 0;
			} else {
				rn_3641 [0] = rn_3642 [3];
				rn_2018 [rn_10613] = ope.rn_1865(rn_3641);
			}
		}
		rn_3639.rn_2018 = null;
		ope.rn_1923(rn_3639);
	}
}