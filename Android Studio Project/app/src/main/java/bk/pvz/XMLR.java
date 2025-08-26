package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6845;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Stringk;
import bk.pvz.XMLRED;
import bk.pvz.reflect;
import bk.pvz.Dint;
import bk.pvz.POS;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_6840.rn_6841.rn_6842.rn_6949;
import bk.pvz.rubie;
import bk.pvz.reflected;

public class XMLR extends rubie {
	public Dint rn_3022 = new Dint();
	public Dint rn_3023 = new Dint();
	public java.util.ArrayList<reflect> rn_3024 = new java.util.ArrayList<reflect>();
	public java.util.ArrayList<XMLR> rn_3025 = new java.util.ArrayList<XMLR>();
	public boolean rn_3026 = true;
	public String rn_3027 = "";

	public final String rn_3028() {
		return rn_3020(rn_3022);
	}

	public final String rn_3029() {
		return rn_3020(rn_3023);
	}

	public final void rn_3028(Dint rn_3030) {
		rn_3022 = rn_3030;
	}

	public final void rn_3029(Dint rn_3031) {
		rn_3023 = rn_3031;
	}

	public XMLR rn_3032(String rn_3033) {
		return rn_3045(rn_3033);
	}

	public final XMLR rn_3034(int rn_3035) {
		return XMLRED.rn_3211(rn_3025, rn_3035);
	}

	public final String rn_3036(String rn_3037) {
		for (int rn_10574 = 0;rn_10574 < XMLRED.rn_1225(rn_3025);rn_10574 += 1) {
			if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3025, rn_10574).rn_3028(), rn_3037)) {
				return XMLRED.rn_3211(rn_3025, rn_10574).rn_3029();
			}
		}
		return "";
	}

	public final String rn_3038(String rn_3039) {
		for (int rn_10575 = 0;rn_10575 < reflected.rn_1225(rn_3024);rn_10575 += 1) {
			if (rn_3289.rn_6850(reflected.rn_3258(rn_3024, rn_10575).rn_3205(), rn_3039)) {
				return reflected.rn_3258(rn_3024, rn_10575).rn_3207();
			}
		}
		return "";
	}

	public final XMLR rn_3040(String rn_3041, String rn_3042) {
		for (int rn_10576 = 0;rn_10576 < XMLRED.rn_1225(rn_3025);rn_10576 += 1) {
			XMLR rn_3043 = XMLRED.rn_3211(rn_3025, rn_10576);
			for (int rn_10577 = 0;rn_10577 < reflected.rn_1225(rn_3043.rn_3024);rn_10577 += 1) {
				reflect rn_3044 = reflected.rn_3242((rn_3043.rn_3024), rn_10577);
				if (rn_3289.rn_6850(rn_3044.rn_3205(), rn_3041) && rn_3289.rn_6850(rn_3044.rn_3207(), rn_3042)) {
					return rn_3043;
				}
			}
		}
		return null;
	}

	public final XMLR rn_3045(String rn_3046) {
		for (int rn_10578 = 0;rn_10578 < XMLRED.rn_1225(rn_3025);rn_10578 += 1) {
			if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3025, rn_10578).rn_3028(), rn_3046)) {
				return XMLRED.rn_3211(rn_3025, rn_10578);
			}
		}
		return null;
	}

	public final int rn_3047() {
		return XMLRED.rn_1225(rn_3025);
	}

	public final POS rn_3051(int rn_3052) {
		POS rn_3053 = new POS();
		java.util.ArrayList<XMLR> rn_3054 = rn_3034(rn_3052 + 1).rn_3025;
		for (int rn_10580 = 0;rn_10580 < XMLRED.rn_1225(rn_3054);rn_10580 += 1) {
			if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "x")) {
				rn_3053.rn_3271 = rn_3289.rn_6899(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029());
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "y")) {
				rn_3053.rn_3272 = rn_3289.rn_6899(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029());
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "sx")) {
				rn_3053.rn_3273 = rn_3289.rn_6899(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029());
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "sy")) {
				rn_3053.rn_3274 = rn_3289.rn_6899(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029());
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "kx")) {
				rn_3053.rn_3275 = rn_3289.rn_6899(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029());
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "ky")) {
				rn_3053.rn_3276 = rn_3289.rn_6899(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029());
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "f")) {
				rn_3053.rn_3277 = rn_3289.rn_6894(XMLRED.rn_3211(rn_3054, rn_10580).rn_3029(), 10);
			} else if (rn_3289.rn_6850(XMLRED.rn_3211(rn_3054, rn_10580).rn_3028(), "i")) {
				rn_3053.rn_3279 = XMLRED.rn_3211(rn_3054, rn_10580).rn_3029();
			}
		}
		return rn_3053;
	}

	public final int rn_3055() {
		return XMLRED.rn_1225(rn_3025) - 1;
	}

	public static final int rn_3056(XMLR rn_3057, Stringk rn_3058, int rn_3059) {
		rn_3057.rn_3019 = rn_3058;
		char rn_3060 = ' ';
		Dint rn_3061 = new Dint();
		rn_3061.rn_3825(rn_3059);
		int rn_3062 = 0;
		Dint rn_3063 = new Dint();
		boolean rn_3064 = false;
		boolean rn_3065 = false;
		char rn_3066 = (rn_3289.rn_6903("\n")) [0];
		for (int rn_10581 = rn_3059;rn_10581 < rn_6845.rn_1225(rn_3058.rn_3081);rn_10581 += 1) {
			rn_3060 = rn_3289.rn_6858((rn_3058.rn_3081), rn_10581);
			if (rn_3062 == 1) {
				if (rn_3060 == '>') {
					rn_3062 = 2;
				}
			} else if (rn_3060 == '<') {
				if (rn_3062 == 7) {
					rn_3057.rn_3029(rn_3061);
					rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
				}
				rn_3062 = 3;
				rn_3064 = true;
				rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
			} else if (rn_3060 == ' ') {
				if (rn_3062 == 0) {
					rn_3057.rn_3028(rn_3061);
					rn_3062 = 6;
					rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
				} else if (rn_3062 == 4) {
					reflect rn_3067 = new reflect();
					rn_3067.rn_3019 = rn_3058;
					rn_3067.rn_3205(rn_3063);
					rn_3067.rn_3207(rn_3061);
					reflected.rn_3250(rn_3057.rn_3024, rn_3067);
					rn_3062 = 6;
					rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
				}
			} else if (rn_3060 == '=') {
				rn_3063 = rn_3061;
				rn_3062 = 4;
				rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
			} else if (rn_3060 == '"') {
				if (rn_3062 == 4) {
					Dint rn_3068 = new Dint();
					rn_10581 = XMLR.rn_3071(rn_3058, rn_10581 + 1, rn_3068);
					rn_3061 = rn_3068;
				}
			} else if (rn_3060 == '/') {
				rn_3065 = true;
				if (rn_3064) {
					rn_3062 = 5;
				}
			} else if (rn_3060 == '>') {
				if (rn_3062 == 5) {
					return rn_10581;
				} else {
					if (rn_3062 == 4) {
						reflect rn_3069 = new reflect();
						rn_3069.rn_3019 = rn_3058;
						rn_3069.rn_3205(rn_3063);
						rn_3069.rn_3207(rn_3061);
						rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
						reflected.rn_3250(rn_3057.rn_3024, rn_3069);
					} else if (rn_3062 == 0) {
						rn_3057.rn_3028(rn_3061);
						rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
					}
					if (rn_3065) {
						return rn_10581;
					} else {
						rn_3062 = 6;
						rn_3061 = rn_3061.rn_3829().rn_3825(rn_10581 + 1);
					}
					rn_3062 = 7;
				}
			} else if (rn_3060 == '!' || rn_3060 == '?') {
				if (rn_3064) {
					rn_3062 = 1;
				}
			} else if (rn_3062 != 2 && rn_3062 != 5 && rn_3060 != ' ' && rn_3060 != rn_3066) {
				if (rn_3064) {
					XMLR rn_3070 = new XMLR();
					rn_10581 = XMLR.rn_3056(rn_3070, rn_3058, rn_10581);
					XMLRED.rn_3219(rn_3057.rn_3025, rn_3070);
				}
				rn_3061.rn_3823 = rn_10581;
				if (rn_3061.rn_3824) {
					rn_3061.rn_3822 = rn_10581;
					rn_3061.rn_3824 = false;
				}
				rn_3064 = false;
			}
		}
		return rn_6845.rn_1225(rn_3058.rn_3081);
	}

	public static final int rn_3071(Stringk rn_3072, int rn_3073, Dint rn_3074) {
		boolean rn_3075 = false;
		String rn_3076 = "";
		rn_3074.rn_3825(rn_3073);
		for (int rn_10582 = rn_3073;rn_10582 < rn_6845.rn_1225(rn_3072.rn_3081);rn_10582 += 1) {
			rn_3076 = rn_6949.rn_6959(rn_3289.rn_6858((rn_3072.rn_3081), rn_10582));
			if (rn_3075) {
				rn_3074.rn_3823 = rn_3074.rn_3823 + 1;
				rn_3075 = false;
			} else if (rn_3289.rn_6850(rn_3076, "\"")) {
				rn_3074.rn_3823 = rn_10582 - 1;
				return rn_10582;
			} else {
				rn_3074.rn_3823 = rn_3074.rn_3823 + 1;
			}
		}
		return rn_6845.rn_1225(rn_3072.rn_3081);
	}
}