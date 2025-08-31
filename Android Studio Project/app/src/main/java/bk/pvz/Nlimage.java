package bk.pvz;
import rn_4126.rn_4127.rn_4128.rn_6025;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4413.rn_4414.rn_4415.rn_9755;
import rn_4413.rn_4414.rn_4415.rn_8937;
import bk.pvz.ope;
import rn_6672.rn_6673.rn_6674.rn_6757;
import bk.pvz.Colorset;

public class Nlimage extends Colorset {
	public boolean rn_3450 = false;
	public String rn_3451 = "";

	public final Nlimage rn_3453() {
		if (rn_3450 == false) {
			rn_1904(rn_8937.rn_8940(rn_3451));
			if (rn_3081.rn_6696(rn_3451, "jpg")) {
				java.io.File rn_3454 = new java.io.File(rn_3451);
				String rn_3455 = rn_6025.rn_6038(rn_3454) + "/" + rn_9755.rn_9767(rn_9755.rn_9769(rn_3451)) + "_.png";
				if (rn_9755.rn_9791(rn_3455)) {
					rn_3456(rn_3455);
				} else {
					rn_3455 = rn_3081.rn_6698(rn_4133.rn_6675(rn_6025.rn_6038(rn_3454)), "main", "pvz") + "/" + rn_9755.rn_9767(rn_9755.rn_9769(rn_3451)) + "_.png";
					if (rn_9755.rn_9791(rn_3455)) {
						rn_3456(rn_3455);
					}
				}
			}
			rn_3450 = true;
		}
		ope.rn_1796(rn_1891);
		return Nlimage.this;
	}

	public final void rn_3456(String rn_3457) {
		Colorset rn_3458 = Colorset.rn_1901(rn_8937.rn_8940(rn_3457));
		for (int rn_10482 = 0;rn_10482 < rn_3458.rn_1891.length;rn_10482 += 1) {
			int rn_3459 = (rn_3458.rn_1891) [rn_10482];
			int[] rn_3460 = ope.rn_1736(rn_1891 [rn_10482]);
			int[] rn_3461 = ope.rn_1736(rn_3459);
			if (rn_3461 [3] < 5) {
				rn_1891 [rn_10482] = 0;
			} else {
				rn_3460 [0] = rn_3461 [3];
				rn_1891 [rn_10482] = ope.rn_1738(rn_3460);
			}
		}
		rn_3458.rn_1891 = null;
		ope.rn_1796(rn_3458);
	}
}