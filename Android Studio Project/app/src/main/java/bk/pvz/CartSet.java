package bk.pvz;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.op;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.MowerList;
import rn_4126.rn_4127.rn_4128.rn_8150;
import bk.pvz.ope;
import rn_4126.rn_4127.rn_4128.rn_4132;
import bk.pvz.Mower;
import rn_4126.rn_4127.rn_4128.rn_8084;

public class CartSet {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public java.util.ArrayList<Mower> rn_2334 = new java.util.ArrayList<Mower>();
	public Nirvana rn_2338 = null;

	public final void initi(int rn_2339, int[] rn_2340, float rn_2341, Nirvana rn_2342) {
		MowerList.rn_2384(rn_2334);
		CartSet.this.rn_2338 = rn_2342;
		if (rn_2339 == 0) {
		} else {
			for (int rn_10409 = 0;rn_10409 < rn_2339;rn_10409 += 1) {
				if (rn_2340 [rn_10409] != -1) {
					Mower rn_2343 = Mower.rn_2401(rn_2340 [rn_10409], rn_10409, rn_2342);
					rn_2343.rn_2391 = rn_2341;
					MowerList.rn_2370(rn_2334, rn_2343);
				}
			}
		}
	}

	public final void rn_2344() {
		for (int rn_10410 = 0;rn_10410 < MowerList.rn_1021(rn_2334);rn_10410 += 1) {
			Mower rn_2345 = MowerList.rn_2362(rn_2334, MowerList.rn_1021(rn_2334) - rn_10410 - 1);
			if (rn_2345.rn_2392 == false) {
			}
			if (rn_2345.rn_2407()) {
				rn_2345.rn_2398 = true;
			}
		}
	}

	public final String ToJSON() {
		org.json.JSONObject rn_2346 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_2347 = rn_8084.rn_8126(rn_4133.rn_6676(CartSet.this));
		for (int rn_10411 = 0;rn_10411 < rn_2347.length;rn_10411 += 1) {
			java.lang.reflect.Field rn_2348 = rn_2347 [rn_10411];
			String classname = rn_8084.rn_8094(rn_8150.rn_8161(rn_2348));
			if (rn_3081.rn_6682(classname, "bk.pvz.Nirvana")) {
			} else if (rn_3081.rn_6682(rn_8150.rn_7729(rn_2348), "anim")) {
				try {;
				Anim[] rn_2349 = (Anim[]) (rn_8150.rn_8165(rn_2348, CartSet.this));
				org.json.JSONObject rn_2350 = new org.json.JSONObject();
				for (int rn_10412 = 0;rn_10412 < rn_2349.length;rn_10412 += 1) {
					org.json.JSONObject rn_2351 = rn_4577.rn_4578(rn_4133.rn_6675(rn_2349 [rn_10412]));
					rn_4577.rn_4607(rn_2350, "i" + rn_6760.rn_6765(rn_10412), rn_2351);
				}
				rn_4577.rn_4607(rn_2346, rn_8150.rn_7729(rn_2348), rn_2350);
				} catch (Exception e) {;
				ope.rn_1798(android.util.Log.getStackTraceString(e));;
				};
			} else {
				rn_2348.setAccessible(true);
				Object rn_2352 = rn_8150.rn_8165(rn_2348, CartSet.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_2352), "{", 0)) {
					org.json.JSONObject rn_2353 = rn_4577.rn_4578(rn_4133.rn_6675(rn_2352));
					rn_4577.rn_4607(rn_2346, rn_8150.rn_7729(rn_2348), rn_2353);
				} else if (rn_3081.rn_6682(classname, "java.util.ArrayList")) {
					java.util.ArrayList<Object> rn_2354 = (java.util.ArrayList<Object>) (rn_2352);
					rn_4577.rn_4607(rn_2346, rn_8150.rn_7729(rn_2348), ope.rn_1698(rn_2354));
				} else {
					rn_4577.rn_4607(rn_2346, rn_8150.rn_7729(rn_2348), rn_4133.rn_6675(rn_2352));
				}
			}
		}
		return rn_4577.rn_4614(rn_2346, 0);
	}

	public static final CartSet FromJSON(String rn_2355, Nirvana rn_2356) {
		org.json.JSONObject rn_2357 = rn_4577.rn_4578(rn_2355);
		CartSet rn_2358 = new CartSet();
		op.rn_1194(rn_2358, rn_2357, rn_2356);
		rn_2358.rn_2338 = rn_2356;
		return rn_2358;
	}
}