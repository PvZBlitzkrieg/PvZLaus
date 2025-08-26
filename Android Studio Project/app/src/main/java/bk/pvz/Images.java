package bk.pvz;
import bk.pvz.Stringk;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_9923;
import bk.pvz.String_Nlimage;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Nirvana;
import bk.pvz.STSL;

public class Images {
	public java.util.HashMap<String, Nlimage> rn_3643 = new java.util.HashMap<String, Nlimage>();

	public final void rn_3644(Stringk rn_3645, STSL rn_3646) {
		String[] rn_3647 = {"/storage/emulated/0/.pvz/pvz/", "/storage/emulated/0/.pvz/main/", "/storage/emulated/0/.pvz/pvz/particles/", "/storage/emulated/0/.pvz/main/particles/"};
		rn_3645.rn_3084 = "image";
		String[] rn_3648 = rn_9923.rn_10013(rn_3647 [0] + "images/");
		String[] rn_3649 = rn_9923.rn_10013(rn_3647 [1] + "images/");
		String[] rn_3650 = rn_9923.rn_10013(rn_3647 [2]);
		String[] rn_3651 = rn_9923.rn_10013(rn_3647 [3]);
		rn_3645.rn_3083 = rn_3648.length;
		rn_3652(rn_3645, rn_3648, 0, rn_3647 [0], rn_3646);
		rn_3645.rn_3083 = rn_3648.length + rn_3649.length;
		rn_3652(rn_3645, rn_3649, rn_3648.length, rn_3647 [1], rn_3646);
		rn_3652(rn_3645, rn_3650, rn_3648.length, rn_3647 [2], rn_3646);
		rn_3652(rn_3645, rn_3651, rn_3648.length, rn_3647 [3], rn_3646);
	}

	public final void rn_3652(Stringk rn_3653, String[] rn_3654, int rn_3655, String rn_3656, STSL rn_3657) {
		rn_3656 = rn_3656;
		for (int rn_10614 = 0;rn_10614 < rn_3654.length;rn_10614 += 1) {
			if (rn_3289.rn_6864(rn_3654 [rn_10614], ".png") || rn_3289.rn_6864(rn_3654 [rn_10614], ".jpg")) {
				String rn_3658 = rn_9923.rn_9935(rn_9923.rn_9937(rn_3654 [rn_10614]));
				String_Nlimage.rn_3331(rn_3643, rn_3658, Nirvana.rn_1061("", rn_3654 [rn_10614]));
				rn_3657.rn_3661("IMAGE_REANIM_" + rn_3289.rn_6879(rn_3658), rn_3658);
			}
			rn_3653.rn_3081 = "索引场景图:" + rn_6928.rn_6933((rn_3655 + rn_10614 + 1)) + "/" + rn_3653.rn_3083;
			rn_3653.rn_3082 = rn_3655 + rn_10614 + 1;
		}
	}
}