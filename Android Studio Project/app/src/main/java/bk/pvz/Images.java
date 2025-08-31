package bk.pvz;
import bk.pvz.Stringk;
import bk.pvz.Nirvana;
import bk.pvz.STSL;
import bk.pvz.String_Nlimage;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_9755;
import bk.pvz.String_Nlimagesm;

public class Images {
	public String_Nlimage rn_3462 = new String_Nlimage();

	public final void rn_3463(Stringk rn_3464, STSL rn_3465) {
		String[] rn_3466 = {"/storage/emulated/0/.pvz/pvz/", "/storage/emulated/0/.pvz/main/", "/storage/emulated/0/.pvz/pvz/particles/", "/storage/emulated/0/.pvz/main/particles/"};
		rn_3464.rn_2863 = "image";
		String[] rn_3467 = rn_9755.rn_9845(rn_3466 [0] + "images/");
		String[] rn_3468 = rn_9755.rn_9845(rn_3466 [1] + "images/");
		String[] rn_3469 = rn_9755.rn_9845(rn_3466 [2]);
		String[] rn_3470 = rn_9755.rn_9845(rn_3466 [3]);
		rn_3464.rn_2862 = rn_3467.length;
		rn_3471(rn_3464, rn_3467, 0, rn_3466 [0], rn_3465);
		rn_3464.rn_2862 = rn_3467.length + rn_3468.length;
		rn_3471(rn_3464, rn_3468, rn_3467.length, rn_3466 [1], rn_3465);
		rn_3471(rn_3464, rn_3469, rn_3467.length, rn_3466 [2], rn_3465);
		rn_3471(rn_3464, rn_3470, rn_3467.length, rn_3466 [3], rn_3465);
	}

	public final void rn_3471(Stringk rn_3472, String[] rn_3473, int rn_3474, String rn_3475, STSL rn_3476) {
		rn_3475 = rn_3475;
		for (int rn_10483 = 0;rn_10483 < rn_3473.length;rn_10483 += 1) {
			if (rn_3081.rn_6696(rn_3473 [rn_10483], ".png") || rn_3081.rn_6696(rn_3473 [rn_10483], ".jpg")) {
				String rn_3477 = rn_9755.rn_9767(rn_9755.rn_9769(rn_3473 [rn_10483]));
				String_Nlimagesm.rn_3123(rn_3462, rn_3477, Nirvana.loadPic("", rn_3473 [rn_10483]));
				rn_3476.rn_3480("IMAGE_REANIM_" + rn_3081.rn_6711(rn_3477), rn_3477);
			}
			rn_3472.rn_2860 = "索引场景图:" + rn_6760.rn_6765((rn_3474 + rn_10483 + 1)) + "/" + rn_3472.rn_2862;
			rn_3472.rn_2861 = rn_3474 + rn_10483 + 1;
		}
	}
}