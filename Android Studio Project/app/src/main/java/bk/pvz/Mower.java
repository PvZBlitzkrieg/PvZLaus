package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ZombieList;
import bk.pvz.Zombie;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Anim;
import bk.pvz.Nirvana;

public class Mower {
	public float rn_2595 = 0.0F;
	public boolean rn_2596 = false;
	public float rn_2597 = 0.0F;
	public int rn_2598 = 0;
	public int rn_2599 = 0;
	public Anim rn_2600 = new Anim();
	public Nirvana rn_2601 = null;
	public boolean rn_2602 = false;
	public float rn_2603 = 0.9F;
	public int rn_2604 = 0;

	public static final Mower rn_2605(int rn_2606, int rn_2607, Nirvana rn_2608) {
		Mower rn_2609 = new Mower();
		rn_2609.rn_2598 = rn_2606;
		rn_2609.rn_2599 = rn_2607;
		rn_2609.rn_2601 = rn_2608;
		if (rn_2609.rn_2598 == 0) {
			rn_2609.rn_2600 = Anim.rn_3508("LawnMower", rn_2608);
			rn_2609.rn_2600.rn_3562("anim_normal", false);
			rn_2609.rn_2600.rn_3498 = true;
		} else if (rn_2609.rn_2598 == 1) {
			rn_2609.rn_2600 = Anim.rn_3508("PoolCleaner", rn_2608);
			rn_2609.rn_2600.rn_3562("anim_landsuck", false);
			rn_2609.rn_2600.rn_3498 = true;
		} else if (rn_2609.rn_2598 == 2) {
			rn_2609.rn_2600 = Anim.rn_3508("RoofCleaner", rn_2608);
			rn_2609.rn_2600.rn_3498 = true;
		}
		return rn_2609;
	}

	public final float rn_2610() {
		return rn_2601.rn_1143(rn_2599, rn_2595) - rn_2601.rn_1149() + 35;
	}

	public final boolean rn_2611() {
		if (rn_2596) {
			rn_2595 = rn_2595 + rn_2597;
		}
		if (rn_2595 > 1400) {
			return true;
		}
		for (int rn_10560 = 0;rn_10560 < ZombieList.rn_1225(rn_2601.rn_477);rn_10560 += 1) {
			Zombie rn_2612 = ZombieList.rn_2382(rn_2601.rn_477, rn_10560);
			if (rn_2612.rn_2174 == rn_2599 && rn_2613(rn_2612)) {
				rn_2612.rn_2276();
				rn_2604 = rn_2604 + 1;
				if (rn_2596 == false) {
					rn_2600.rn_3498 = false;
					rn_2596 = true;
					rn_2597 = 3;
					(rn_2601.rn_542) [rn_2599] = 3000;
				} else if (rn_2604 > 5) {
					rn_2597 = 2;
				}
			}
		}
		return false;
	}

	public final boolean rn_2613(Zombie rn_2614) {
		if (rn_2595 < rn_2614.rn_2170 && rn_2614.rn_2170 < rn_2595 + 50) {
			return true;
		}
		return false;
	}
}