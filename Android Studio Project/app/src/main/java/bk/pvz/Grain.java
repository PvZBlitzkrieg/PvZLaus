package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ope;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;

public class Grain {
	public float rn_2924 = 0.0F;
	public float rn_2925 = 0.0F;
	public float rn_2926 = 0.0F;
	public float rn_2927 = 0.0F;
	public float rn_2928 = 0.0F;
	public float rn_2929 = 0.0F;
	public String rn_2930 = "0-0 100-0";
	public String rn_2931 = "0-0 100-0";
	public String rn_2932 = "0-1 100-1";
	public String rn_2933 = "0-1 100-1";
	public String rn_2934 = "0-1 100-1";
	public String rn_2935 = "0-1 100-1";
	public String rn_2936 = "0-1 100-1";
	public float rn_2937 = 0;
	public float rn_2938 = 0;
	public float rn_2939 = 0;
	public int rn_2940 = 0;
	public int rn_2941 = 0;
	public String rn_2942 = "";
	public int rn_2943 = 1;
	public int rn_2944 = 0;
	public int rn_2945 = 1;
	public boolean rn_2947 = false;
	public float rn_2949 = 0;
	public float rn_2950 = -1;
	public int rn_2951 = -1;
	public int rn_2952 = 0;

	public static final Grain rn_2953(float rn_2954, float rn_2955, float rn_2956, float rn_2957, float rn_2958, float rn_2959) {
		Grain rn_2960 = new Grain();
		rn_2960.rn_2924 = rn_2954;
		rn_2960.rn_2925 = rn_2955;
		rn_2960.rn_2926 = rn_2956;
		rn_2960.rn_2927 = rn_2957;
		rn_2960.rn_2928 = rn_2958;
		rn_2960.rn_2929 = rn_2959;
		return rn_2960;
	}

	public final Grain rn_2961(int rn_2962) {
		rn_2940 = 0;
		rn_2941 = rn_2962;
		return Grain.this;
	}

	public final boolean rn_2963() {
		if (rn_2952 <= 0) {
			if (rn_2951 != -1) {
				rn_2951 = rn_2951 - 1;
				if (rn_2951 <= 0) {
					return true;
				}
			}
			if (rn_2940 >= rn_2941) {
				return true;
			}
			if (rn_2949 <= rn_2940 && ((rn_2950 == -1) || rn_2940 <= rn_2950)) {
				rn_2926 = rn_2926 + rn_2928;
				rn_2927 = rn_2927 + rn_2929;
				rn_2924 = rn_2924 + rn_2926;
				rn_2925 = rn_2925 + rn_2927;
				float rn_2964 = rn_2969(rn_2930);
				if (rn_2926 > rn_2964) {
					rn_2926 = rn_2926 - rn_2964 * ope.rn_1853(rn_2926) / 3;
				} else if (rn_2926 < -1 * rn_2964) {
					rn_2926 = rn_2926 + rn_2964 * ope.rn_1853(rn_2926) / 3;
				} else {
					rn_2926 = 0;
				}
				float rn_2965 = rn_2969(rn_2931);
				if (rn_2927 > rn_2965) {
					rn_2927 = rn_2927 - rn_2965 * ope.rn_1853(rn_2927) / 3;
				} else if (rn_2927 < -1 * rn_2965) {
					rn_2927 = rn_2927 + rn_2965 * ope.rn_1853(rn_2927) / 3;
				} else {
					rn_2927 = 0;
				}
				rn_2937 = rn_2937 + rn_2938;
			}
			if (rn_2947) {
				int rn_2966 = rn_2941 / rn_2943;
				rn_2944 = (rn_2940 - (rn_2940 % rn_2966) - 1) / rn_2966;
			}
			rn_2940 = rn_2940 + 1;
		} else {
			rn_2952 = rn_2952 - 1;
		}
		return false;
	}

	public static final String rn_2967(float rn_2968) {
		return "0-" + rn_2968 + " 1-" + rn_2968;
	}

	public final float rn_2969(String rn_2970) {
		float rn_2971 = rn_2940 * 100.0F / rn_2941;
		String[] rn_2972 = rn_3289.rn_6892(rn_2970, " ");
		for (int rn_10573 = 0;rn_10573 < rn_2972.length;rn_10573 += 1) {
			String[] rn_2973 = rn_3289.rn_6892(rn_2972 [rn_10573], "-");
			if (rn_2971 < rn_3289.rn_6899(rn_2973 [0])) {
				if (rn_10573 == 0) {
					return rn_3289.rn_6899(rn_2973 [1]);
				} else {
					String[] rn_2974 = rn_3289.rn_6892(rn_2972 [rn_10573 - 1], "-");
					return rn_3289.rn_6899(rn_2974 [1]) + (rn_3289.rn_6899(rn_2973 [1]) - rn_3289.rn_6899(rn_2974 [1])) * (rn_2971 - rn_3289.rn_6899(rn_2974 [0])) / (rn_3289.rn_6899(rn_2973 [0]) - rn_3289.rn_6899(rn_2974 [0]));
				}
			}
		}
		return rn_3289.rn_6899((rn_3289.rn_6892(rn_2972 [rn_2972.length - 1], "-")) [1]);
	}
}