package bk.pvz;
import bk.pvz.ZombieList;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_7317;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.Particle;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ParticleList;
import bk.pvz.Zombie;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Rectx;
import bk.pvz.Nirvana;
import bk.pvz.op;

public class Proj {
	public float rn_2740 = 0.0F;
	public float rn_2741 = 0.0F;
	public float rn_2742 = 0.0F;
	public float rn_2743 = 0.0F;
	public float rn_2744 = 0.0F;
	public float rn_2745 = 0.0F;
	public String rn_2746 = "";
	public Nirvana rn_2747 = null;
	public String rn_2748 = "";
	public int rn_2749 = 0;
	public String[] rn_2750 = {"Melonpult_melon", "WinterMelon_projectile"};
	public int rn_2752 = 0;
	public int rn_2754 = 0;
	public float rn_2755 = 1.0F;

	public static final Proj rn_2756(Nirvana rn_2757, String rn_2758, int rn_2759, float rn_2760, float rn_2761) {
		Proj rn_2762 = new Proj();
		rn_2762.rn_2747 = rn_2757;
		rn_2762.rn_2740 = rn_2760;
		rn_2762.rn_2741 = rn_2761 + op.rn_1242(rn_7317.rn_7331(-5.0F, 5.0F));
		rn_2762.rn_2742 = 4.0F;
		rn_2762.rn_2763(rn_2758);
		rn_2762.rn_2749 = rn_2759;
		return rn_2762;
	}

	public final Proj rn_2763(String rn_2764) {
		rn_2746 = rn_2764;
		if (op.rn_1406(rn_2750, rn_2764)) {
			rn_2748 = "reanim";
		} else if (rn_3289.rn_6850(rn_2746, "ProjectilePea")) {
			rn_2748 = "image";
			rn_2752 = 20;
		} else if (rn_3289.rn_6850(rn_2746, "ProjectileSnowPea")) {
			rn_2748 = "image";
			rn_2752 = 20;
			rn_2754 = 500;
		} else if (rn_3289.rn_6850(rn_2746, "PuffShroom_puff1")) {
			rn_2752 = 20;
			rn_2748 = "image";
			rn_2755 = 0.0F;
		}
		return Proj.this;
	}

	public final boolean rn_2765() {
		if (rn_2740 < 0 || rn_2740 > 1400 || rn_2741 < 0 || rn_2741 > 600) {
			return true;
		}
		if (rn_3289.rn_6850(rn_2746, "PuffShroom_puff1") && rn_2755 < 1.0F) {
			rn_2755 = rn_2755 + 0.05F;
		} else {
			rn_2755 = 1;
		}
		rn_2740 = rn_2740 + rn_2742;
		rn_2741 = rn_2741 + rn_2743;
		rn_2742 = rn_2742 + rn_2744;
		rn_2743 = rn_2743 + rn_2745;
		for (int rn_10564 = 0;rn_10564 < ZombieList.rn_1225(rn_2747.rn_477);rn_10564 += 1) {
			Zombie rn_2766 = ZombieList.rn_2366((rn_2747.rn_477), rn_10564);
			if (rn_2766.rn_2174 == rn_2749) {
				if (rn_2766.rn_2219.rn_3682(rn_2740 + 20, rn_2766.rn_2329(), 0) && rn_2766.rn_2186 == false) {
					if (rn_3289.rn_6850(rn_2746, "ProjectileSnowPea")) {
						rn_2766.rn_2330(rn_2752, 2);
					} else {
						rn_2766.rn_2330(rn_2752, 0);
						ParticleList.rn_2530(rn_2747.rn_481, Particle.rn_2852("PeaSplat", rn_2740, rn_2741, rn_2749, rn_2747));
					}
					return true;
				}
			}
		}
		return false;
	}
}