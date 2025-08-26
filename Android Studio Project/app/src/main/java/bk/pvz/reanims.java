package bk.pvz;
import bk.pvz.ope;
import bk.pvz.POSLIST;
import bk.pvz.String_Nlimage;
import bk.pvz.POS;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4294.rn_4295.rn_4296.rn_4366;
import bk.pvz.Reanimed;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_9923;
import bk.pvz.Stringk;
import bk.pvz.Reanim;
import bk.pvz.XMLRED;
import bk.pvz.XMLR;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Reanimeds;
import bk.pvz.Nirvana;
import bk.pvz.Nlimage;
import bk.pvz.op;

public class reanims {
	public java.util.ArrayList<String> rn_3097 = new java.util.ArrayList<String>();
	public java.util.ArrayList<XMLR> rn_3098 = new java.util.ArrayList<XMLR>();
	public Reanimeds rn_3099 = new Reanimeds();
	public Nirvana rn_3100 = null;

	public static final reanims rn_3101(Stringk rn_3102, Nirvana rn_3103) {
		rn_3102.rn_3084 = "anim";
		reanims rn_3104 = new reanims();
		rn_3104.rn_3100 = rn_3103;
		String[] rn_3105 = rn_9923.rn_10013("/storage/emulated/0/.pvz/pvz/compiled/reanim/finished_xml/");
		for (int rn_10585 = 0;rn_10585 < rn_3105.length;rn_10585 += 1) {
			XMLR rn_3106 = new XMLR();
			rn_3106.rn_3026 = false;
			rn_3106.rn_3027 = rn_3105 [rn_10585];
			rn_4366.rn_4377(rn_3104.rn_3097, rn_9923.rn_9937(rn_3105 [rn_10585]));
			XMLRED.rn_3219(rn_3104.rn_3098, rn_3106);
			rn_3104.rn_3099.rn_3199(new java.util.ArrayList<Reanim>());
			if (op.rn_1406(new String[]{"Zombie", "SelectorScreen", "CrazyDave"}, rn_9923.rn_9935(rn_9923.rn_9937(rn_3105 [rn_10585])))) {
				rn_3104.rn_3109(rn_10585);
			}
			rn_3102.rn_3081 = "加载动画信息:" + rn_6928.rn_6933((rn_10585 + 1)) + "/" + rn_3105.length + "   " + rn_9923.rn_9935(rn_9923.rn_9937(rn_3105 [rn_10585]));
			rn_3102.rn_3082 = rn_10585 + 1;
			rn_3102.rn_3083 = rn_3105.length;
		}
		return rn_3104;
	}

	public final java.util.ArrayList<Reanim> rn_3107(String rn_3108) {
		for (int rn_10586 = 0;rn_10586 < XMLRED.rn_1225(rn_3098);rn_10586 += 1) {
			if (rn_3289.rn_6850(rn_4366.rn_4369(rn_3097, rn_10586), rn_3108 + ".reanim")) {
				if (XMLRED.rn_3211(rn_3098, rn_10586).rn_3026 == false) {
					rn_3109(rn_10586);
				}
				return rn_3099.rn_3194(rn_10586);
			}
		}
		return null;
	}

	public final void rn_3109(int rn_3110) {
		rn_3100.rn_514 = "Processing " + rn_9923.rn_9935(rn_9923.rn_9937(XMLRED.rn_3211(rn_3098, rn_3110).rn_3027));
		XMLR.rn_3056(XMLRED.rn_3211(rn_3098, rn_3110), Stringk.rn_3085(rn_9923.rn_9963(XMLRED.rn_3211(rn_3098, rn_3110).rn_3027, "UTF-8")), 0);
		rn_3099.rn_3196(rn_3110, reanims.rn_3111(XMLRED.rn_3211(rn_3098, rn_3110), rn_3100));
		XMLRED.rn_3211(rn_3098, rn_3110).rn_3026 = true;
		rn_3100.rn_514 = "Processing completed";
	}

	public static final java.util.ArrayList<Reanim> rn_3111(XMLR rn_3112, Nirvana rn_3113) {
		java.util.ArrayList<Reanim> rn_3114 = new java.util.ArrayList<Reanim>();
		for (int rn_10587 = 1;rn_10587 < rn_3112.rn_3047();rn_10587 += 1) {
			XMLR rn_3115 = rn_3112.rn_3034(rn_10587);
			Reanim rn_3116 = new Reanim();
			rn_3116.rn_3124 = rn_3115.rn_3034(0).rn_3029();
			String rn_3117 = rn_3115.rn_3034(1).rn_3036("i");
			if (rn_3289.rn_6850(rn_3117, "")) {
			} else {
				Nlimage rn_3118 = String_Nlimage.rn_3336(rn_3113.rn_446, rn_3117);
				if (rn_3118 == null) {
					try {;
					rn_3113.rn_576(rn_3117).rn_3634();
					} catch (Exception e) {;
					ope.rn_1925("error:ubi  " + rn_3117 + " len:" + String_Nlimage.rn_1225(rn_3113.rn_446));
					};
				} else {
					rn_3116.rn_3123 = rn_3118.rn_3634();
				}
			}
			rn_3116.rn_3125 = rn_3115;
			POS rn_3119 = new POS();
			rn_3119.rn_3283(-1719.0F);
			rn_3119.rn_3279 = rn_3117;
			for (int rn_10588 = 0;rn_10588 < rn_3116.rn_3125.rn_3055();rn_10588 += 1) {
				POS rn_3120 = rn_3116.rn_3125.rn_3051(rn_10588);
				rn_3120.rn_3285(rn_3119);
				POSLIST.rn_3137(rn_3116.rn_3126, rn_3120);
				rn_3119 = rn_3120;
			}
			Reanimed.rn_3351(rn_3114, rn_3116);
		}
		return rn_3114;
	}
}