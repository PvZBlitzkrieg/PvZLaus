package bk.pvz;
import bk.pvz.Nirvana;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.static_;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Tracle {
	public float rn_2627 = 0.0F;
	public float rn_2628 = 0.0F;
	public float rn_2629 = 0.0F;
	public float rn_2630 = 0.0F;
	public float rn_2631 = 0.0F;
	public float rn_2632 = 0.0F;
	public float rn_2633 = 0.0F;
	public float rn_2634 = 0.0F;
	public float rn_2637 = -1713.0F;
	public Nirvana rn_2638 = null;
	public int rn_2639 = 0;
	public Anim rn_2640 = null;
	public int rn_2642 = 0;
	public int rn_2643 = 0;
	public String rn_2644 = "";

	public static final Tracle rn_2645(Nirvana rn_2646, int rn_2647, float rn_2648, float rn_2649) {
		Tracle rn_2650 = new Tracle();
		rn_2650.rn_2638 = rn_2646;
		rn_2650.rn_2639 = rn_2647;
		if (rn_2647 == static_.rn_2623) {
			rn_2650.rn_2640 = Anim.rn_3310("Zombie_charred", rn_2646);
			rn_2650.rn_2640.pauseAfterBroadcasting = true;
			rn_2650.rn_2640.prohibitReturnedEvolution = true;
			rn_2650.rn_2642 = 50;
		} else if (rn_2647 == static_.rn_2625) {
		} else if (rn_2647 == static_.rn_2624) {
		}
		rn_2650.rn_2627 = rn_2648;
		rn_2650.rn_2628 = rn_2649;
		rn_2650.rn_2643 = rn_2650.rn_2642;
		return rn_2650;
	}

	public final boolean rn_2651() {
		rn_2627 = rn_2627 + rn_2629;
		rn_2628 = rn_2628 + rn_2630;
		rn_2629 = rn_2629 + rn_2631;
		rn_2630 = rn_2630 + rn_2632;
		rn_2633 = rn_2633 + rn_2634;
		if (rn_2637 < rn_2628 && rn_2637 != static_.rn_2626) {
			rn_2628 = rn_2637;
			if (rn_2639 == -1) {
				rn_2630 = -0.5F;
				rn_2632 = 0.01F;
			}
		}
		if (rn_2639 == static_.rn_2623) {
			if (rn_2640.pause) {
				return rn_2654();
			}
		} else if (rn_2639 == -1) {
			if (rn_3081.rn_6682(rn_2644, "dido")) {
				return rn_2654();
			} else {
				if (rn_2642 <= 0) {
					rn_2644 = "dido";
					rn_2652(20);
				} else {
					rn_2642 = rn_2642 - 1;
				}
			}
		} else if (rn_2639 == static_.rn_2622) {
			if (rn_2640.pause == true) {
				return true;
			}
		}
		return false;
	}

	public final Tracle rn_2652(int rn_2653) {
		rn_2642 = rn_2653;
		rn_2643 = rn_2653;
		return Tracle.this;
	}

	public final boolean rn_2654() {
		if (rn_2642 <= 0) {
			return true;
		} else {
			rn_2642 = rn_2642 - 1;
			rn_2640.rn_3323("", new float[]{1.0F, 1.0F, 1.0F, rn_2642 * 1.0F / rn_2643});
		}
		return false;
	}
}