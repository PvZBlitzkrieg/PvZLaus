package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.ope;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Grain {
	public float x = 0.0F;
	public float y = 0.0F;
	public float xv = 0.0F;
	public float yv = 0.0F;
	public float xa = 0.0F;
	public float ya = 0.0F;
	public String xf = "0-0 100-0";
	public String yf = "0-0 100-0";
	public String alpha = "0-1 100-1";
	public String scale = "0-1 100-1";
	public String red = "0-1 100-1";
	public String green = "0-1 100-1";
	public String blue = "0-1 100-1";
	public float rotate = 0;
	public float spinspeed = 0;
	public float shake = 0;
	public int dtime = 0;
	public int dtimemax = 0;
	public String pic = "";
	public int cutn = 1;
	public int cutp = 0;
	public int row = 1;
	public boolean isCarousel = false;
	public float starte = 0;
	public float ende = -1;
	public int alivecd = -1;
	public int activecd = 0;

	public static final Grain create(float rn_2750, float rn_2751, float rn_2752, float rn_2753, float rn_2754, float rn_2755) {
		Grain rn_2756 = new Grain();
		rn_2756.x = rn_2750;
		rn_2756.y = rn_2751;
		rn_2756.xv = rn_2752;
		rn_2756.yv = rn_2753;
		rn_2756.xa = rn_2754;
		rn_2756.ya = rn_2755;
		return rn_2756;
	}

	public final Grain setdtime(int rn_2757) {
		dtime = 0;
		dtimemax = rn_2757;
		return Grain.this;
	}

	public final boolean Update() {
		if (activecd <= 0) {
			if (alivecd != -1) {
				alivecd = alivecd - 1;
				if (alivecd <= 0) {
					return true;
				}
			}
			if (dtime >= dtimemax) {
				return true;
			}
			if (starte <= dtime && ((ende == -1) || dtime <= ende)) {
				xv = xv + xa;
				yv = yv + ya;
				x = x + xv;
				y = y + yv;
				float rn_2758 = getValue(xf);
				if (xv > rn_2758) {
					xv = xv - rn_2758 * ope.rn_1726(xv) / 3;
				} else if (xv < -1 * rn_2758) {
					xv = xv + rn_2758 * ope.rn_1726(xv) / 3;
				} else {
					xv = 0;
				}
				float rn_2759 = getValue(yf);
				if (yv > rn_2759) {
					yv = yv - rn_2759 * ope.rn_1726(yv) / 3;
				} else if (yv < -1 * rn_2759) {
					yv = yv + rn_2759 * ope.rn_1726(yv) / 3;
				} else {
					yv = 0;
				}
				rotate = rotate + spinspeed;
			}
			if (isCarousel) {
				int rn_2760 = dtimemax / cutn;
				cutp = (dtime - (dtime % rn_2760) - 1) / rn_2760;
			}
			dtime = dtime + 1;
		} else {
			activecd = activecd - 1;
		}
		return false;
	}

	public static final String fullvalue(float rn_2761) {
		return "0-" + rn_2761 + " 1-" + rn_2761;
	}

	public final float getValue(String rn_2762) {
		float rn_2763 = dtime * 100.0F / dtimemax;
		String[] rn_2764 = rn_3081.rn_6724(rn_2762, " ");
		for (int rn_10433 = 0;rn_10433 < rn_2764.length;rn_10433 += 1) {
			String[] rn_2765 = rn_3081.rn_6724(rn_2764 [rn_10433], "-");
			if (rn_2763 < rn_3081.rn_6731(rn_2765 [0])) {
				if (rn_10433 == 0) {
					return rn_3081.rn_6731(rn_2765 [1]);
				} else {
					String[] rn_2766 = rn_3081.rn_6724(rn_2764 [rn_10433 - 1], "-");
					return rn_3081.rn_6731(rn_2766 [1]) + (rn_3081.rn_6731(rn_2765 [1]) - rn_3081.rn_6731(rn_2766 [1])) * (rn_2763 - rn_3081.rn_6731(rn_2766 [0])) / (rn_3081.rn_6731(rn_2765 [0]) - rn_3081.rn_6731(rn_2766 [0]));
				}
			}
		}
		return rn_3081.rn_6731((rn_3081.rn_6724(rn_2764 [rn_2764.length - 1], "-")) [1]);
	}
}