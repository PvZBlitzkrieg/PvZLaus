package bk.pvz;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4126.rn_4127.rn_4128.rn_8150;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;

public class Renderinfo {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public float[] rn_3236 = {1.0F, 1.0F, 1.0F, 1.0F};
	public float rn_3237 = 0.0F;
	public float rn_3238 = 0.0F;
	public String rn_3239 = "";
	public float[] rn_3240 = {1.0F, 1.0F, 1.0F, 1.0F};
	public boolean rn_3241 = false;
	public boolean rn_3242 = false;
	public boolean rn_3243 = false;
	public boolean rn_3244 = false;

	public final void rn_3245(float[] rn_3246, float rn_3247) {
		rn_3236 = rn_3246;
		rn_3238 = rn_3247;
		rn_3237 = rn_3238;
		rn_3241 = true;
		rn_3243 = true;
	}

	public final void rn_3251(float[] rn_3252) {
		rn_3240 = rn_3252;
		rn_3243 = true;
		rn_3244 = true;
	}

	public final float[] rn_3253() {
		if (rn_3241) {
			float[] rn_3254 = (float[]) (new float[rn_3236.length]);
			float rn_3255 = (rn_3238 / rn_3237);
			for (int rn_10460 = 0;rn_10460 < rn_3254.length;rn_10460 += 1) {
				if (rn_10460 < rn_3254.length - 1) {
					rn_3254 [rn_10460] = 1.0F + (rn_3236 [rn_10460] - 1.0F) * rn_3255;
				} else {
					rn_3254 [rn_10460] = rn_3236 [rn_10460];
				}
			}
			return rn_3259(rn_3254);
		} else if (rn_3242) {
			float[] rn_3256 = (float[]) (new float[rn_3236.length]);
			float rn_3257 = (rn_3238 / (rn_3237 / 2));
			if (rn_3238 > rn_3237 / 2) {
				rn_3257 = 2 - rn_3257;
			}
			for (int rn_10461 = 0;rn_10461 < rn_3256.length;rn_10461 += 1) {
				if (rn_10461 < rn_3256.length - 1) {
					rn_3256 [rn_10461] = 1.0F + (rn_3236 [rn_10461] - 1.0F) * rn_3257;
				} else {
					rn_3256 [rn_10461] = rn_3236 [rn_10461];
				}
			}
			return rn_3259(rn_3256);
		} else {
			return rn_3259(rn_3236);
		}
	}

	public final float[] rn_3259(float[] rn_3260) {
		if (rn_3238 <= 0) {
			rn_3241 = false;
			rn_3242 = false;
			rn_3236 = new float[]{1.0F, 1.0F, 1.0F, 1.0F};
		}
		for (int rn_10462 = 0;rn_10462 < rn_3260.length;rn_10462 += 1) {
			rn_3260 [rn_10462] = rn_3260 [rn_10462] * rn_3240 [rn_10462];
		}
		return rn_3260;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_3261 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_3262 = rn_8084.rn_8126(rn_4133.rn_6676(Renderinfo.this));
		for (int rn_10463 = 0;rn_10463 < rn_3262.length;rn_10463 += 1) {
			java.lang.reflect.Field rn_3263 = rn_3262 [rn_10463];
			String rn_3264 = rn_8084.rn_8094(rn_8150.rn_8161(rn_3263));
			if (false) {
			} else {
				rn_3263.setAccessible(true);
				Object rn_3265 = rn_8150.rn_8165(rn_3263, Renderinfo.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_3265), "{", 0)) {
					org.json.JSONObject rn_3266 = rn_4577.rn_4578(rn_4133.rn_6675(rn_3265));
					rn_4577.rn_4607(rn_3261, rn_8150.rn_7729(rn_3263), rn_3266);
				} else if (rn_3081.rn_6682(rn_3264, "[F")) {
					float[] rn_3267 = (float[]) ((float[]) (rn_3265));
					rn_4577.rn_4607(rn_3261, rn_8150.rn_7729(rn_3263), op.rn_1246(rn_3267));
				} else {
					rn_4577.rn_4607(rn_3261, rn_8150.rn_7729(rn_3263), rn_4133.rn_6675(rn_3265));
				}
			}
		}
		return rn_4577.rn_4614(rn_3261, 0);
	}
}