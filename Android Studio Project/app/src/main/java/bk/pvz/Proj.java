package bk.pvz;
import bk.pvz.ParticleList;
import bk.pvz.Nirvana;
import bk.pvz.Zombie;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4413.rn_4414.rn_4415.rn_7149;
import bk.pvz.ZombieList;
import bk.pvz.Rectx;
import bk.pvz.Particle;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Proj {
	public float rn_2556 = 0.0F;
	public float rn_2557 = 0.0F;
	public float rn_2558 = 0.0F;
	public float rn_2559 = 0.0F;
	public float rn_2560 = 0.0F;
	public float rn_2561 = 0.0F;
	public String rn_2562 = "";
	public Nirvana rn_2563 = null;
	public String rn_2564 = "";
	public int rn_2565 = 0;
	public String[] rn_2566 = {"Melonpult_melon", "WinterMelon_projectile"};
	public int rn_2568 = 0;
	public int effect = 0;
	public float scale = 1.0F;
	public int partdtime = 0;
	public int pdtmax = 0;

	public static final Proj rn_2569(Nirvana rn_2570, String rn_2571, int rn_2572, float rn_2573, float rn_2574) {
		Proj rn_2575 = new Proj();
		rn_2575.rn_2563 = rn_2570;
		rn_2575.rn_2556 = rn_2573;
		rn_2575.rn_2557 = rn_2574 + op.rn_1038(rn_7149.rn_7163(-5.0F, 5.0F));
		rn_2575.rn_2558 = 4.0F;
		rn_2575.rn_2576(rn_2571);
		rn_2575.rn_2565 = rn_2572;
		return rn_2575;
	}

	public final Proj rn_2576(String rn_2577) {
		rn_2562 = rn_2577;
		if (op.rn_1268(rn_2566, rn_2577)) {
			rn_2564 = "reanim";
		} else if (rn_3081.rn_6682(rn_2562, "ProjectilePea")) {
			rn_2564 = "image";
			rn_2568 = 20;
		} else if (rn_3081.rn_6682(rn_2562, "ProjectileSnowPea")) {
			rn_2564 = "image";
			rn_2568 = 20;
			effect = 500;
			pdtmax = 8;
		} else if (rn_3081.rn_6682(rn_2562, "PuffShroom_puff1")) {
			rn_2568 = 20;
			rn_2564 = "image";
			scale = 0.0F;
		}
		return Proj.this;
	}

	public final boolean rn_2578() {
		if (pdtmax != 0 && partdtime <= 0) {
			partdtime = pdtmax;
			if (rn_3081.rn_6682(rn_2562, "ProjectileSnowPea")) {
				ParticleList.rn_2313(rn_2563.particleList, Particle.rn_2665("SnowPeaTrail", rn_2556, rn_2557 + rn_7149.rn_7160(0, 5), rn_2565, rn_2563));
			}
		}
		partdtime = partdtime - 1;
		if (rn_2556 < 0 || rn_2556 > 1400 || rn_2557 < 0 || rn_2557 > 600) {
			return true;
		}
		if (rn_3081.rn_6682(rn_2562, "PuffShroom_puff1") && scale < 1.0F) {
			scale = scale + 0.05F;
		} else {
			scale = 1;
		}
		rn_2556 = rn_2556 + rn_2558;
		rn_2557 = rn_2557 + rn_2559;
		rn_2558 = rn_2558 + rn_2560;
		rn_2559 = rn_2559 + rn_2561;
		for (int rn_10421 = 0;rn_10421 < ZombieList.rn_1021(rn_2563.zombieList);rn_10421 += 1) {
			Zombie rn_2579 = ZombieList.rn_2149((rn_2563.zombieList), rn_10421);
			if (rn_2579.row == rn_2565) {
				if (rn_2579.cv.rn_3501(rn_2556 + 20, rn_2579.x(), 0) && rn_2579.IsIntangible == false) {
					if (rn_3081.rn_6682(rn_2562, "ProjectileSnowPea")) {
						rn_2579.damage(rn_2568, 2);
					} else {
						rn_2579.damage(rn_2568, 0);
						ParticleList.rn_2313(rn_2563.particleList, Particle.rn_2665("PeaSplat", rn_2556, rn_2557, rn_2565, rn_2563));
					}
					return true;
				}
			}
		}
		return false;
	}
}