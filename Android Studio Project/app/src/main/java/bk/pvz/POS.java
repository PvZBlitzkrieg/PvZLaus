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

public class POS {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public float rn_3050 = -1719.0F;
	public float rn_3051 = -1719.0F;
	public float rn_3052 = -1719.0F;
	public float rn_3053 = -1719.0F;
	public float rn_3054 = -1719.0F;
	public float rn_3055 = -1719.0F;
	public int rn_3056 = -1719;
	public int rn_3057 = -1719;
	public String rn_3058 = "";
	public int rn_3059 = 0;
	public int rn_3060 = 0;

	public final void rn_3062(float rn_3063) {
		if (rn_3063 == -1719.0F) {
			rn_3050 = 0.0F;
			rn_3051 = 0.0F;
			rn_3052 = 1.0F;
			rn_3053 = 1.0F;
			rn_3054 = 0.0F;
			rn_3055 = 0.0F;
			rn_3056 = 0;
		} else {
			rn_3050 = rn_3063;
			rn_3051 = rn_3063;
			rn_3052 = rn_3063;
			rn_3053 = rn_3063;
			rn_3054 = rn_3063;
			rn_3055 = rn_3063;
		}
	}

	public final boolean rn_3064(POS rn_3065) {
		if (rn_3050 == -1719.0F) {
			rn_3050 = rn_3065.rn_3050;
		}
		if (rn_3051 == -1719.0F) {
			rn_3051 = rn_3065.rn_3051;
		}
		if (rn_3052 == -1719.0F) {
			rn_3052 = rn_3065.rn_3052;
		}
		if (rn_3053 == -1719.0F) {
			rn_3053 = rn_3065.rn_3053;
		}
		if (rn_3054 == -1719.0F) {
			rn_3054 = rn_3065.rn_3054;
		}
		if (rn_3055 == -1719.0F) {
			rn_3055 = rn_3065.rn_3055;
		}
		if (rn_3056 == -1719.0F) {
			rn_3056 = rn_3065.rn_3056;
		}
		if (rn_3081.rn_6682(rn_3058, "")) {
			rn_3058 = rn_3065.rn_3058;
			return true;
		}
		return false;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_3068 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_3069 = rn_8084.rn_8126(rn_4133.rn_6676(POS.this));
		for (int rn_10450 = 0;rn_10450 < rn_3069.length;rn_10450 += 1) {
			java.lang.reflect.Field rn_3070 = rn_3069 [rn_10450];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_3070));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana")) {
			} else {
				rn_3070.setAccessible(true);
				Object rn_3071 = rn_8150.rn_8165(rn_3070, POS.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_3071), "{", 0)) {
					org.json.JSONObject rn_3072 = rn_4577.rn_4578(rn_4133.rn_6675(rn_3071));
					rn_4577.rn_4607(rn_3068, rn_8150.rn_7729(rn_3070), rn_3072);
				} else {
					rn_4577.rn_4607(rn_3068, rn_8150.rn_7729(rn_3070), rn_4133.rn_6675(rn_3071));
				}
			}
		}
		return rn_4577.rn_4614(rn_3068, 0);
	}

	public static final POS FromJSON(String rn_3073, Nirvana rn_3074) {
		org.json.JSONObject rn_3075 = rn_4577.rn_4578(rn_3073);
		POS rn_3076 = new POS();
		java.lang.Class rn_3077 = rn_4133.rn_6676(rn_3076);
		for (int rn_10451 = 0;rn_10451 < rn_4577.rn_4619(rn_3075).length;rn_10451 += 1) {
			String rn_3078 = rn_8084.rn_8094(rn_8150.rn_8161(rn_8084.rn_8127(rn_3077, (rn_4577.rn_4619(rn_3075)) [rn_10451])));
			String rn_3079 = (rn_4577.rn_4619(rn_3075)) [rn_10451];
			java.lang.reflect.Field rn_3080 = rn_8084.rn_8127(rn_3077, (rn_4577.rn_4619(rn_3075)) [rn_10451]);
			if (rn_3081.rn_6682(rn_3078, "int")) {
				rn_8150.rn_8193(rn_3080, rn_3076, rn_3081.rn_6726(rn_4577.rn_4593(rn_3075, rn_3079), 10));
			} else if (rn_3081.rn_6682(rn_3078, "float")) {
				rn_8150.rn_8199(rn_3080, rn_3076, rn_3081.rn_6731(rn_4577.rn_4593(rn_3075, rn_3079)));
			} else if (rn_3081.rn_6682(rn_3078, "boolean")) {
				rn_8150.rn_8184(rn_3080, rn_3076, rn_3081.rn_6732(rn_4577.rn_4593(rn_3075, rn_3079)));
			} else if (rn_3081.rn_6682(rn_3078, "java.lang.String")) {
				rn_8150.rn_8181(rn_3080, rn_3076, rn_4577.rn_4593(rn_3075, rn_3079));
			}
		}
		return rn_3076;
	}
}