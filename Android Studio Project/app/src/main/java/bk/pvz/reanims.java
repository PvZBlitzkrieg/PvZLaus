package bk.pvz;
import bk.pvz.Reanimed;
import bk.pvz.Nirvana;
import bk.pvz.Stringk;
import bk.pvz.POSLIST;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.XMLRED;
import rn_4413.rn_4414.rn_4415.rn_9755;
import bk.pvz.String_Nlimagesm;
import bk.pvz.POS;
import bk.pvz.XMLR;
import bk.pvz.Nlimage;
import bk.pvz.Reanim;
import rn_4126.rn_4127.rn_4128.rn_4198;
import bk.pvz.Reanimeds;
import bk.pvz.ope;

public class reanims {
	public java.util.ArrayList<String> rn_2876 = new java.util.ArrayList<String>();
	public java.util.ArrayList<XMLR> rn_2877 = new java.util.ArrayList<XMLR>();
	public Reanimeds rn_2878 = new Reanimeds();
	public Nirvana rn_2879 = null;

	public static final reanims rn_2880(Stringk rn_2881, Nirvana rn_2882) {
		rn_2881.rn_2863 = "anim";
		reanims rn_2883 = new reanims();
		rn_2883.rn_2879 = rn_2882;
		String[] rn_2884 = rn_9755.rn_9845("/storage/emulated/0/.pvz/pvz/compiled/reanim/finished_xml/");
		for (int rn_10445 = 0;rn_10445 < rn_2884.length;rn_10445 += 1) {
			XMLR rn_2885 = new XMLR();
			rn_2885.rn_2805 = false;
			rn_2885.rn_2806 = rn_2884 [rn_10445];
			rn_4198.rn_4209(rn_2883.rn_2876, rn_9755.rn_9769(rn_2884 [rn_10445]));
			XMLRED.rn_2998(rn_2883.rn_2877, rn_2885);
			rn_2883.rn_2878.rn_2978(new java.util.ArrayList<Reanim>());
			rn_2883.rn_2888(rn_10445);
			rn_2881.rn_2860 = "加载动画信息:" + rn_6760.rn_6765((rn_10445 + 1)) + "/" + rn_2884.length + "   " + rn_9755.rn_9767(rn_9755.rn_9769(rn_2884 [rn_10445]));
			rn_2881.rn_2861 = rn_10445 + 1;
			rn_2881.rn_2862 = rn_2884.length;
		}
		return rn_2883;
	}

	public final java.util.ArrayList<Reanim> rn_2886(String rn_2887) {
		for (int rn_10446 = 0;rn_10446 < XMLRED.rn_1021(rn_2877);rn_10446 += 1) {
			if (rn_3081.rn_6682(rn_4198.rn_4201(rn_2876, rn_10446), rn_2887 + ".reanim")) {
				if (XMLRED.rn_2990(rn_2877, rn_10446).rn_2805 == false) {
					rn_2888(rn_10446);
				}
				return rn_2878.rn_2973(rn_10446);
			}
		}
		return null;
	}

	public final void rn_2888(int rn_2889) {
		rn_2879.loadinfo = "Processing " + rn_9755.rn_9767(rn_9755.rn_9769(XMLRED.rn_2990(rn_2877, rn_2889).rn_2806));
		XMLR.rn_2835(XMLRED.rn_2990(rn_2877, rn_2889), Stringk.rn_2864(rn_9755.rn_9795(XMLRED.rn_2990(rn_2877, rn_2889).rn_2806, "UTF-8")), 0);
		rn_2878.rn_2975(rn_2889, reanims.rn_2890(XMLRED.rn_2990(rn_2877, rn_2889), rn_2879));
		XMLRED.rn_2990(rn_2877, rn_2889).rn_2805 = true;
		rn_2879.loadinfo = "Processing completed";
	}

	public static final java.util.ArrayList<Reanim> rn_2890(XMLR rn_2891, Nirvana rn_2892) {
		java.util.ArrayList<Reanim> rn_2893 = new java.util.ArrayList<Reanim>();
		for (int rn_10447 = 1;rn_10447 < rn_2891.rn_2826();rn_10447 += 1) {
			XMLR rn_2894 = rn_2891.rn_2813(rn_10447);
			Reanim rn_2895 = new Reanim();
			rn_2895.rn_2903 = rn_2894.rn_2813(0).rn_2808();
			String rn_2896 = rn_2894.rn_2813(1).rn_2815("i");
			if (rn_3081.rn_6682(rn_2896, "")) {
			} else {
				Nlimage rn_2897 = String_Nlimagesm.rn_3128(rn_2892.resall, rn_2896);
				if (rn_2897 == null) {
					try {;
					rn_2892.getres(rn_2896).rn_3453();
					} catch (Exception e) {;
					ope.rn_1798("error:ubi  " + rn_2896 + " len:" + String_Nlimagesm.rn_1021(rn_2892.resall));
					};
				} else {
					rn_2895.rn_2902 = rn_2897.rn_3453();
				}
			}
			rn_2895.rn_2904 = rn_2894;
			POS rn_2898 = new POS();
			rn_2898.rn_3062(-1719.0F);
			rn_2898.rn_3058 = rn_2896;
			for (int rn_10448 = 0;rn_10448 < rn_2895.rn_2904.rn_2834();rn_10448 += 1) {
				POS rn_2899 = rn_2895.rn_2904.rn_2830(rn_10448);
				rn_2899.rn_3064(rn_2898);
				POSLIST.rn_2916(rn_2895.rn_2905, rn_2899);
				rn_2898 = rn_2899;
			}
			Reanimed.rn_3146(rn_2893, rn_2895);
		}
		return rn_2893;
	}
}