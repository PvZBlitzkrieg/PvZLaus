package bk.pvz;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4126.rn_4127.rn_4128.rn_8150;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;

public class Rectx {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public float rn_3485 = -1.0F;
	public float rn_3486 = -1.0F;
	public float rn_3487 = -1.0F;
	public float rn_3488 = -1.0F;
	public int rn_3489 = -1;
	public boolean rn_3490 = false;
	public boolean rn_3491 = false;

	public static final Rectx rn_3492(float rn_3493, float rn_3494, float rn_3495, float rn_3496) {
		Rectx rn_3497 = new Rectx();
		rn_3497.rn_3485 = rn_3493;
		rn_3497.rn_3486 = rn_3494;
		rn_3497.rn_3487 = rn_3495;
		rn_3497.rn_3488 = rn_3496;
		return rn_3497;
	}

	public final boolean rn_3498(float rn_3499, float rn_3500) {
		if (rn_3485 <= rn_3499 && rn_3499 < rn_3485 + rn_3487 && rn_3486 <= rn_3500 && rn_3500 < rn_3486 + rn_3488) {
			return true;
		}
		return false;
	}

	public final boolean rn_3501(float rn_3502, float rn_3503, float rn_3504) {
		if (rn_3485 + rn_3503 < rn_3502 + rn_3504 && rn_3502 + rn_3504 < rn_3485 + rn_3503 + rn_3487) {
			return true;
		}
		return false;
	}

	public final boolean rn_3505(Rectx rn_3506, int rn_3507, int rn_3508) {
		float rn_3509 = rn_3485 + rn_3507;
		float rn_3510 = rn_3506.rn_3485 + rn_3508;
		if (rn_3509 + rn_3487 < rn_3510 + rn_3506.rn_3487 && rn_3510 < rn_3509 + rn_3487) {
			return true;
		} else if (rn_3510 < rn_3509 && rn_3509 < rn_3510 + rn_3506.rn_3487) {
			return true;
		}
		return false;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_3511 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_3512 = rn_8084.rn_8126(rn_4133.rn_6676(Rectx.this));
		for (int rn_10485 = 0;rn_10485 < rn_3512.length;rn_10485 += 1) {
			java.lang.reflect.Field rn_3513 = rn_3512 [rn_10485];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_3513));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana") || rn_3081.rn_6693(rn_8150.rn_7729(rn_3513), "zombie", 0)) {
			} else {
				rn_3513.setAccessible(true);
				Object rn_3514 = rn_8150.rn_8165(rn_3513, Rectx.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_3514), "{", 0)) {
					org.json.JSONObject rn_3515 = rn_4577.rn_4578(rn_4133.rn_6675(rn_3514));
					rn_4577.rn_4607(rn_3511, rn_8150.rn_7729(rn_3513), rn_3515);
				} else {
					rn_4577.rn_4607(rn_3511, rn_8150.rn_7729(rn_3513), rn_4133.rn_6675(rn_3514));
				}
			}
		}
		return rn_4577.rn_4614(rn_3511, 0);
	}

	public static final Rectx FromJSON(String rn_3516, Nirvana rn_3517) {
		org.json.JSONObject rn_3518 = rn_4577.rn_4578(rn_3516);
		Rectx rn_3519 = new Rectx();
		java.lang.Class rn_3520 = rn_4133.rn_6676(rn_3519);
		for (int rn_10486 = 0;rn_10486 < rn_4577.rn_4619(rn_3518).length;rn_10486 += 1) {
			String rn_3521 = rn_8084.rn_8094(rn_8150.rn_8161(rn_8084.rn_8127(rn_3520, (rn_4577.rn_4619(rn_3518)) [rn_10486])));
			String rn_3522 = (rn_4577.rn_4619(rn_3518)) [rn_10486];
			java.lang.reflect.Field rn_3523 = rn_8084.rn_8127(rn_3520, (rn_4577.rn_4619(rn_3518)) [rn_10486]);
			if (rn_3081.rn_6682(rn_3521, "int")) {
				rn_8150.rn_8193(rn_3523, rn_3519, rn_3081.rn_6726(rn_4577.rn_4593(rn_3518, rn_3522), 10));
			} else if (rn_3081.rn_6682(rn_3521, "float")) {
				rn_8150.rn_8199(rn_3523, rn_3519, rn_3081.rn_6731(rn_4577.rn_4593(rn_3518, rn_3522)));
			} else if (rn_3081.rn_6682(rn_3521, "boolean")) {
				rn_8150.rn_8184(rn_3523, rn_3519, rn_3081.rn_6732(rn_4577.rn_4593(rn_3518, rn_3522)));
			} else if (rn_3081.rn_6682(rn_3521, "java.lang.String")) {
				rn_8150.rn_8181(rn_3523, rn_3519, rn_4577.rn_4593(rn_3518, rn_3522));
			}
		}
		return rn_3519;
	}
}