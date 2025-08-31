package bk.pvz;
import bk.pvz.Stringk;
import bk.pvz.rubie;
import bk.pvz.reflect;
import rn_6672.rn_6673.rn_6674.rn_6677;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.XMLRED;
import rn_6672.rn_6673.rn_6674.rn_6781;
import bk.pvz.Dint;
import bk.pvz.reflected;
import rn_6672.rn_6673.rn_6674.rn_6757;
import bk.pvz.POS;

public class XMLR extends rubie {
	public Dint rn_2801 = new Dint();
	public Dint rn_2802 = new Dint();
	public java.util.ArrayList<reflect> rn_2803 = new java.util.ArrayList<reflect>();
	public java.util.ArrayList<XMLR> rn_2804 = new java.util.ArrayList<XMLR>();
	public boolean rn_2805 = true;
	public String rn_2806 = "";

	public final String rn_2807() {
		return rn_2799(rn_2801);
	}

	public final String rn_2808() {
		return rn_2799(rn_2802);
	}

	public final void rn_2807(Dint rn_2809) {
		rn_2801 = rn_2809;
	}

	public final void rn_2808(Dint rn_2810) {
		rn_2802 = rn_2810;
	}

	public XMLR rn_2811(String rn_2812) {
		return rn_2824(rn_2812);
	}

	public final XMLR rn_2813(int rn_2814) {
		return XMLRED.rn_2990(rn_2804, rn_2814);
	}

	public final String rn_2815(String rn_2816) {
		for (int rn_10434 = 0;rn_10434 < XMLRED.rn_1021(rn_2804);rn_10434 += 1) {
			if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2804, rn_10434).rn_2807(), rn_2816)) {
				return XMLRED.rn_2990(rn_2804, rn_10434).rn_2808();
			}
		}
		return "";
	}

	public final String rn_2817(String rn_2818) {
		for (int rn_10435 = 0;rn_10435 < reflected.rn_1021(rn_2803);rn_10435 += 1) {
			if (rn_3081.rn_6682(reflected.rn_3037(rn_2803, rn_10435).rn_2984(), rn_2818)) {
				return reflected.rn_3037(rn_2803, rn_10435).rn_2986();
			}
		}
		return "";
	}

	public final XMLR rn_2819(String rn_2820, String rn_2821) {
		for (int rn_10436 = 0;rn_10436 < XMLRED.rn_1021(rn_2804);rn_10436 += 1) {
			XMLR rn_2822 = XMLRED.rn_2990(rn_2804, rn_10436);
			for (int rn_10437 = 0;rn_10437 < reflected.rn_1021(rn_2822.rn_2803);rn_10437 += 1) {
				reflect rn_2823 = reflected.rn_3021((rn_2822.rn_2803), rn_10437);
				if (rn_3081.rn_6682(rn_2823.rn_2984(), rn_2820) && rn_3081.rn_6682(rn_2823.rn_2986(), rn_2821)) {
					return rn_2822;
				}
			}
		}
		return null;
	}

	public final XMLR rn_2824(String rn_2825) {
		for (int rn_10438 = 0;rn_10438 < XMLRED.rn_1021(rn_2804);rn_10438 += 1) {
			if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2804, rn_10438).rn_2807(), rn_2825)) {
				return XMLRED.rn_2990(rn_2804, rn_10438);
			}
		}
		return null;
	}

	public final int rn_2826() {
		return XMLRED.rn_1021(rn_2804);
	}

	public final POS rn_2830(int rn_2831) {
		POS rn_2832 = new POS();
		java.util.ArrayList<XMLR> rn_2833 = rn_2813(rn_2831 + 1).rn_2804;
		for (int rn_10440 = 0;rn_10440 < XMLRED.rn_1021(rn_2833);rn_10440 += 1) {
			if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "x")) {
				rn_2832.rn_3050 = rn_3081.rn_6731(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808());
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "y")) {
				rn_2832.rn_3051 = rn_3081.rn_6731(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808());
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "sx")) {
				rn_2832.rn_3052 = rn_3081.rn_6731(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808());
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "sy")) {
				rn_2832.rn_3053 = rn_3081.rn_6731(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808());
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "kx")) {
				rn_2832.rn_3054 = rn_3081.rn_6731(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808());
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "ky")) {
				rn_2832.rn_3055 = rn_3081.rn_6731(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808());
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "f")) {
				rn_2832.rn_3056 = rn_3081.rn_6726(XMLRED.rn_2990(rn_2833, rn_10440).rn_2808(), 10);
			} else if (rn_3081.rn_6682(XMLRED.rn_2990(rn_2833, rn_10440).rn_2807(), "i")) {
				rn_2832.rn_3058 = XMLRED.rn_2990(rn_2833, rn_10440).rn_2808();
			}
		}
		return rn_2832;
	}

	public final int rn_2834() {
		return XMLRED.rn_1021(rn_2804) - 1;
	}

	public static final int rn_2835(XMLR rn_2836, Stringk rn_2837, int rn_2838) {
		rn_2836.rn_2798 = rn_2837;
		char rn_2839 = ' ';
		Dint rn_2840 = new Dint();
		rn_2840.rn_3657(rn_2838);
		int rn_2841 = 0;
		Dint rn_2842 = new Dint();
		boolean rn_2843 = false;
		boolean rn_2844 = false;
		char rn_2845 = (rn_3081.rn_6735("\n")) [0];
		for (int rn_10441 = rn_2838;rn_10441 < rn_6677.rn_1021(rn_2837.rn_2860);rn_10441 += 1) {
			rn_2839 = rn_3081.rn_6690((rn_2837.rn_2860), rn_10441);
			if (rn_2841 == 1) {
				if (rn_2839 == '>') {
					rn_2841 = 2;
				}
			} else if (rn_2839 == '<') {
				if (rn_2841 == 7) {
					rn_2836.rn_2808(rn_2840);
					rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
				}
				rn_2841 = 3;
				rn_2843 = true;
				rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
			} else if (rn_2839 == ' ') {
				if (rn_2841 == 0) {
					rn_2836.rn_2807(rn_2840);
					rn_2841 = 6;
					rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
				} else if (rn_2841 == 4) {
					reflect rn_2846 = new reflect();
					rn_2846.rn_2798 = rn_2837;
					rn_2846.rn_2984(rn_2842);
					rn_2846.rn_2986(rn_2840);
					reflected.rn_3029(rn_2836.rn_2803, rn_2846);
					rn_2841 = 6;
					rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
				}
			} else if (rn_2839 == '=') {
				rn_2842 = rn_2840;
				rn_2841 = 4;
				rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
			} else if (rn_2839 == '"') {
				if (rn_2841 == 4) {
					Dint rn_2847 = new Dint();
					rn_10441 = XMLR.rn_2850(rn_2837, rn_10441 + 1, rn_2847);
					rn_2840 = rn_2847;
				}
			} else if (rn_2839 == '/') {
				rn_2844 = true;
				if (rn_2843) {
					rn_2841 = 5;
				}
			} else if (rn_2839 == '>') {
				if (rn_2841 == 5) {
					return rn_10441;
				} else {
					if (rn_2841 == 4) {
						reflect rn_2848 = new reflect();
						rn_2848.rn_2798 = rn_2837;
						rn_2848.rn_2984(rn_2842);
						rn_2848.rn_2986(rn_2840);
						rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
						reflected.rn_3029(rn_2836.rn_2803, rn_2848);
					} else if (rn_2841 == 0) {
						rn_2836.rn_2807(rn_2840);
						rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
					}
					if (rn_2844) {
						return rn_10441;
					} else {
						rn_2841 = 6;
						rn_2840 = rn_2840.rn_3661().rn_3657(rn_10441 + 1);
					}
					rn_2841 = 7;
				}
			} else if (rn_2839 == '!' || rn_2839 == '?') {
				if (rn_2843) {
					rn_2841 = 1;
				}
			} else if (rn_2841 != 2 && rn_2841 != 5 && rn_2839 != ' ' && rn_2839 != rn_2845) {
				if (rn_2843) {
					XMLR rn_2849 = new XMLR();
					rn_10441 = XMLR.rn_2835(rn_2849, rn_2837, rn_10441);
					XMLRED.rn_2998(rn_2836.rn_2804, rn_2849);
				}
				rn_2840.rn_3655 = rn_10441;
				if (rn_2840.rn_3656) {
					rn_2840.rn_3654 = rn_10441;
					rn_2840.rn_3656 = false;
				}
				rn_2843 = false;
			}
		}
		return rn_6677.rn_1021(rn_2837.rn_2860);
	}

	public static final int rn_2850(Stringk rn_2851, int rn_2852, Dint rn_2853) {
		boolean rn_2854 = false;
		String rn_2855 = "";
		rn_2853.rn_3657(rn_2852);
		for (int rn_10442 = rn_2852;rn_10442 < rn_6677.rn_1021(rn_2851.rn_2860);rn_10442 += 1) {
			rn_2855 = rn_6781.rn_6791(rn_3081.rn_6690((rn_2851.rn_2860), rn_10442));
			if (rn_2854) {
				rn_2853.rn_3655 = rn_2853.rn_3655 + 1;
				rn_2854 = false;
			} else if (rn_3081.rn_6682(rn_2855, "\"")) {
				rn_2853.rn_3655 = rn_10442 - 1;
				return rn_10442;
			} else {
				rn_2853.rn_3655 = rn_2853.rn_3655 + 1;
			}
		}
		return rn_6677.rn_1021(rn_2851.rn_2860);
	}
}