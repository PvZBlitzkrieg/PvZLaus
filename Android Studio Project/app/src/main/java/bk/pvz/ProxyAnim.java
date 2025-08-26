package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Animed;
import bk.pvz.POSLIST;
import bk.pvz.POS;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4294.rn_4295.rn_4296.rn_4366;
import bk.pvz.Anim;
import bk.pvz.Boolarray;
import bk.pvz.ints;

public class ProxyAnim {
	public ints rn_3403 = new ints();
	public java.util.ArrayList<String> rn_3404 = new java.util.ArrayList<String>();
	public java.util.ArrayList<Anim> rn_3405 = new java.util.ArrayList<Anim>();
	public java.util.ArrayList<POS> rn_3406 = new java.util.ArrayList<POS>();
	public Boolarray rn_3407 = new Boolarray();

	public final void rn_3408(int rn_3409, String rn_3410, Anim rn_3411, POS rn_3412, boolean rn_3413) {
		rn_3403.rn_1423(rn_3409);
		rn_4366.rn_4377(rn_3404, rn_3410);
		Animed.rn_3382(rn_3405, rn_3411);
		POSLIST.rn_3137(rn_3406, rn_3412);
		rn_3407.rn_1205(rn_3413);
	}

	public final Anim rn_3416(int rn_3417) {
		for (int rn_10591 = 0;rn_10591 < rn_3403.rn_1225();rn_10591 += 1) {
			if (rn_3403.rn_1418(rn_10591) == rn_3417) {
				return Animed.rn_3374(rn_3405, rn_10591);
			}
		}
		return null;
	}

	public final int rn_3418(int rn_3419) {
		for (int rn_10592 = 0;rn_10592 < rn_3403.rn_1225();rn_10592 += 1) {
			if (rn_3403.rn_1418(rn_10592) == rn_3419) {
				return rn_10592;
			}
		}
		return -1;
	}

	public final POS rn_3420(int rn_3421) {
		for (int rn_10593 = 0;rn_10593 < rn_3403.rn_1225();rn_10593 += 1) {
			if (rn_3403.rn_1418(rn_10593) == rn_3421) {
				return POSLIST.rn_3129(rn_3406, rn_10593);
			}
		}
		return null;
	}

	public final Anim rn_3424(String rn_3425) {
		for (int rn_10595 = 0;rn_10595 < rn_4366.rn_1225(rn_3404);rn_10595 += 1) {
			if (rn_3289.rn_6850(rn_4366.rn_4369(rn_3404, rn_10595), rn_3425)) {
				return Animed.rn_3374(rn_3405, rn_10595);
			}
		}
		return null;
	}
}