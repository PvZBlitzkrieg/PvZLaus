package bk.pvz;
import bk.pvz.Nirvana;
import bk.pvz.Zombie;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.op;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.ZombieList;
import rn_4126.rn_4127.rn_4128.rn_8150;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;

public class Mower {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public float rn_2391 = 0.0F;
	public boolean rn_2392 = false;
	public float rn_2393 = 0.0F;
	public int rn_2394 = 0;
	public int rn_2395 = 0;
	public Anim rn_2396 = new Anim();
	public Nirvana rn_2397 = null;
	public boolean rn_2398 = false;
	public float rn_2399 = 0.9F;
	public int rn_2400 = 0;

	public static final Mower rn_2401(int rn_2402, int rn_2403, Nirvana rn_2404) {
		Mower rn_2405 = new Mower();
		rn_2405.rn_2394 = rn_2402;
		rn_2405.rn_2395 = rn_2403;
		rn_2405.rn_2397 = rn_2404;
		if (rn_2405.rn_2394 == 0) {
			rn_2405.rn_2396 = Anim.rn_3310("LawnMower", rn_2404);
			rn_2405.rn_2396.rn_3366("anim_normal", false);
			rn_2405.rn_2396.pause = true;
		} else if (rn_2405.rn_2394 == 1) {
			rn_2405.rn_2396 = Anim.rn_3310("PoolCleaner", rn_2404);
			rn_2405.rn_2396.rn_3366("anim_landsuck", false);
			rn_2405.rn_2396.pause = true;
		} else if (rn_2405.rn_2394 == 2) {
			rn_2405.rn_2396 = Anim.rn_3310("RoofCleaner", rn_2404);
			rn_2405.rn_2396.pause = true;
		}
		return rn_2405;
	}

	public final float rn_2406() {
		return rn_2397.gety(rn_2395, rn_2391) - rn_2397.getRowHeight() + 35;
	}

	public final boolean rn_2407() {
		if (rn_2392) {
			rn_2391 = rn_2391 + rn_2393;
		}
		if (rn_2391 > 1400) {
			return true;
		}
		for (int rn_10413 = 0;rn_10413 < ZombieList.rn_1021(rn_2397.zombieList);rn_10413 += 1) {
			Zombie rn_2408 = ZombieList.rn_2165(rn_2397.zombieList, rn_10413);
			if (rn_2408.row == rn_2395 && rn_2409(rn_2408)) {
				rn_2408.Mower();
				rn_2400 = rn_2400 + 1;
				if (rn_2392 == false) {
					rn_2396.pause = false;
					rn_2392 = true;
					rn_2393 = 3;
					(rn_2397.proline) [rn_2395] = 3000;
				} else if (rn_2400 > 5) {
					rn_2393 = 2;
				}
			}
		}
		return false;
	}

	public final boolean rn_2409(Zombie rn_2410) {
		if (rn_2391 < rn_2410.x && rn_2410.x < rn_2391 + 50) {
			return true;
		}
		return false;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_2411 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_2412 = rn_8084.rn_8126(rn_4133.rn_6676(Mower.this));
		for (int rn_10414 = 0;rn_10414 < rn_2412.length;rn_10414 += 1) {
			java.lang.reflect.Field rn_2413 = rn_2412 [rn_10414];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_2413));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana")) {
			} else {
				rn_2413.setAccessible(true);
				Object rn_2414 = rn_8150.rn_8165(rn_2413, Mower.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_2414), "{", 0)) {
					org.json.JSONObject rn_2415 = rn_4577.rn_4578(rn_4133.rn_6675(rn_2414));
					rn_4577.rn_4607(rn_2411, rn_8150.rn_7729(rn_2413), rn_2415);
				} else {
					rn_4577.rn_4607(rn_2411, rn_8150.rn_7729(rn_2413), rn_4133.rn_6675(rn_2414));
				}
			}
		}
		return rn_4577.rn_4614(rn_2411, 0);
	}

	public static final Mower FromJSON(String rn_2416, Nirvana rn_2417) {
		org.json.JSONObject rn_2418 = rn_4577.rn_4578(rn_2416);
		Mower rn_2419 = new Mower();
		op.rn_1194(rn_2419, rn_2418, rn_2417);
		rn_2419.rn_2397 = rn_2417;
		return rn_2419;
	}
}