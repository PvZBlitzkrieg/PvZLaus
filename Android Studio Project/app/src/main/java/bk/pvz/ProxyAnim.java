package bk.pvz;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.POSLIST;
import bk.pvz.op;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Animed;
import bk.pvz.POS;
import bk.pvz.ints;
import rn_4126.rn_4127.rn_4128.rn_4198;
import rn_4126.rn_4127.rn_4128.rn_8150;
import bk.pvz.Boolarray;
import bk.pvz.ope;
import rn_4126.rn_4127.rn_4128.rn_4132;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;

public class ProxyAnim {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public ints paTrack = new ints();
	public java.util.ArrayList<String> paName = new java.util.ArrayList<String>();
	public java.util.ArrayList<Anim> panim = new java.util.ArrayList<Anim>();
	public java.util.ArrayList<POS> pos = new java.util.ArrayList<POS>();
	public Boolarray isDbanim = new Boolarray();

	public final void rn_3198(int rn_3199, String rn_3200, Anim rn_3201, POS rn_3202, boolean rn_3203) {
		paTrack.rn_1286(rn_3199);
		rn_4198.rn_4209(paName, rn_3200);
		Animed.rn_3177(panim, rn_3201);
		POSLIST.rn_2916(pos, rn_3202);
		isDbanim.rn_1001(rn_3203);
	}

	public final Anim rn_3206(int rn_3207) {
		for (int rn_10453 = 0;rn_10453 < paTrack.rn_1021();rn_10453 += 1) {
			if (paTrack.rn_1281(rn_10453) == rn_3207) {
				return Animed.rn_3169(panim, rn_10453);
			}
		}
		return null;
	}

	public final int rn_3208(int rn_3209) {
		for (int rn_10454 = 0;rn_10454 < paTrack.rn_1021();rn_10454 += 1) {
			if (paTrack.rn_1281(rn_10454) == rn_3209) {
				return rn_10454;
			}
		}
		return -1;
	}

	public final POS rn_3210(int rn_3211) {
		for (int rn_10455 = 0;rn_10455 < paTrack.rn_1021();rn_10455 += 1) {
			if (paTrack.rn_1281(rn_10455) == rn_3211) {
				return POSLIST.rn_2908(pos, rn_10455);
			}
		}
		return null;
	}

	public final Anim rn_3214(String rn_3215) {
		for (int rn_10457 = 0;rn_10457 < rn_4198.rn_1021(paName);rn_10457 += 1) {
			if (rn_3081.rn_6682(rn_4198.rn_4201(paName, rn_10457), rn_3215)) {
				return Animed.rn_3169(panim, rn_10457);
			}
		}
		return null;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_3216 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_3217 = rn_8084.rn_8126(rn_4133.rn_6676(ProxyAnim.this));
		for (int rn_10458 = 0;rn_10458 < rn_3217.length;rn_10458 += 1) {
			java.lang.reflect.Field rn_3218 = rn_3217 [rn_10458];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_3218));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana")) {
			} else if (rn_3081.rn_6682(classname, "java.util.ArrayList")) {
				Object rn_3219 = rn_8150.rn_8165(rn_3218, ProxyAnim.this);
				rn_4577.rn_4607(rn_3216, rn_8150.rn_7729(rn_3218), ope.rn_1698((java.util.ArrayList<Object>) (rn_3219)));
			} else if (rn_3081.rn_6682(classname, "bk.pvz.ints")) {
				Object rn_3220 = rn_8150.rn_8165(rn_3218, ProxyAnim.this);
				ints rn_3221 = (ints) (rn_3220);
				org.json.JSONObject rn_3222 = op.rn_1191(rn_3221.rn_1305());
				rn_4577.rn_4607(rn_3216, rn_8150.rn_7729(rn_3218), rn_3222);
			} else if (rn_3081.rn_6682(classname, "bk.pvz.Boolarray")) {
				Object rn_3223 = rn_8150.rn_8165(rn_3218, ProxyAnim.this);
				Boolarray rn_3224 = (Boolarray) (rn_3223);
				org.json.JSONObject rn_3225 = op.rn_1237(rn_3224.rn_1020());
				rn_4577.rn_4607(rn_3216, rn_8150.rn_7729(rn_3218), rn_3225);
			} else if (rn_3081.rn_6682(rn_8150.rn_7729(rn_3218), "anim")) {
				try {;
				Anim[] rn_3226 = (Anim[]) (rn_8150.rn_8165(rn_3218, ProxyAnim.this));
				org.json.JSONObject rn_3227 = new org.json.JSONObject();
				for (int rn_10459 = 0;rn_10459 < rn_3226.length;rn_10459 += 1) {
					org.json.JSONObject rn_3228 = rn_4577.rn_4578(rn_4133.rn_6675(rn_3226 [rn_10459]));
					rn_4577.rn_4607(rn_3227, "i" + rn_6760.rn_6765(rn_10459), rn_3228);
				}
				rn_4577.rn_4607(rn_3216, rn_8150.rn_7729(rn_3218), rn_3227);
				} catch (Exception e) {;
				ope.rn_1798(android.util.Log.getStackTraceString(e));;
				};
			} else {
				rn_3218.setAccessible(true);
				Object rn_3229 = rn_8150.rn_8165(rn_3218, ProxyAnim.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_3229), "{", 0)) {
					org.json.JSONObject rn_3230 = rn_4577.rn_4578(rn_4133.rn_6675(rn_3229));
					rn_4577.rn_4607(rn_3216, rn_8150.rn_7729(rn_3218), rn_3230);
				} else {
					rn_4577.rn_4607(rn_3216, rn_8150.rn_7729(rn_3218), rn_4133.rn_6675(rn_3229));
				}
			}
		}
		return rn_4577.rn_4614(rn_3216, 0);
	}

	public static final ProxyAnim FromJSON(String rn_3231, Nirvana rn_3232) {
		org.json.JSONObject rn_3233 = rn_4577.rn_4578(rn_3231);
		ProxyAnim rn_3234 = new ProxyAnim();
		op.rn_1194(rn_3234, rn_3233, rn_3232);
		return rn_3234;
	}
}