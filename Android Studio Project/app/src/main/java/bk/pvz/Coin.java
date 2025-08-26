package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.static_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Rectx;
import bk.pvz.Anim;
import bk.pvz.Nirvana;

public class Coin {
	public float rn_2767 = 0.0F;
	public float rn_2768 = 0.0F;
	public float rn_2769 = 0.0F;
	public float rn_2770 = 0.0F;
	public float rn_2771 = 0.0F;
	public float rn_2772 = 0.0F;
	public float rn_2773 = 0.0F;
	public Rectx rn_2774 = new Rectx();
	public Nirvana rn_2775 = null;
	public int rn_2776 = 0;
	public Anim rn_2777 = new Anim();
	public float rn_2778 = -1713.0F;
	public float rn_2779 = -1713.0F;
	public float rn_2780 = -1713.0F;
	public float rn_2781 = 0.0F;
	public float rn_2782 = 0.0F;
	public int rn_2783 = 0;
	public int rn_2784 = 0;
	public float rn_2785 = 1.0F;
	public float rn_2786 = 1.0F;
	public float rn_2787 = 0.0F;

	public static final Coin rn_2788(Nirvana rn_2789, int rn_2790, float rn_2791, float rn_2792) {
		Coin rn_2793 = new Coin();
		rn_2793.rn_2775 = rn_2789;
		rn_2793.rn_2776 = rn_2790;
		rn_2793.rn_2797(25);
		if (rn_2790 == static_.rn_2805) {
			rn_2793.rn_2777 = Anim.rn_3508("Sun", rn_2789).rn_3562("Sun1", false).rn_3515(true);
			rn_2793.rn_2777.rn_3487 = 0.5F;
		} else if (rn_2790 == static_.rn_2802) {
			rn_2793.rn_2777 = Anim.rn_3508("Coin_silver", rn_2789);
		} else if (rn_2790 == static_.rn_2803) {
			rn_2793.rn_2777 = Anim.rn_3508("Coin_gold", rn_2789);
		} else if (rn_2790 == static_.rn_2806) {
			rn_2793.rn_2777 = Anim.rn_3508("LawnMower", rn_2789).rn_3562("anim_normal", false);
			rn_2793.rn_2785 = 0.75F;
			rn_2793.rn_2786 = rn_2793.rn_2785;
			rn_2793.rn_2794(-30, 0);
		} else if (rn_2790 == static_.rn_2808) {
			rn_2793.rn_2787 = rn_2792;
			rn_2793.rn_2772 = -2.5F;
			rn_2793.rn_2773 = 0.05F;
		}
		rn_2793.rn_2767 = rn_2791;
		rn_2793.rn_2769 = rn_2792;
		return rn_2793;
	}

	public final void rn_2794(float rn_2795, float rn_2796) {
		rn_2767 = rn_2767 + rn_2795;
		rn_2769 = rn_2769 + rn_2796;
		rn_2774.rn_3666 = rn_2774.rn_3666 - rn_2795;
		rn_2774.rn_3667 = rn_2774.rn_3667 - rn_2796;
	}

	public final void rn_2797(int rn_2798) {
		rn_2774.rn_3666 = -1 * rn_2798;
		rn_2774.rn_3667 = -1 * rn_2798;
		rn_2774.rn_3668 = rn_2798 * 2;
		rn_2774.rn_3669 = rn_2798 * 2;
	}

	public final float rn_2799() {
		return rn_2767 + rn_2768;
	}

	public final float rn_2800() {
		return rn_2769 + rn_2770;
	}

	public final boolean rn_2801() {
		rn_2767 = rn_2767 + rn_2771;
		rn_2769 = rn_2769 + rn_2772;
		rn_2772 = rn_2772 + rn_2773;
		rn_2781 = rn_2781 + rn_2782;
		if (rn_2781 < 0) {
			rn_2781 = rn_2781 + 360.0F;
		} else if (rn_2781 > 360.0F) {
			rn_2781 = rn_2781 - 360.0F;
		}
		if (rn_2780 < rn_2769 && rn_2780 != -1713.0F) {
			rn_2769 = rn_2780;
			rn_2771 = 0.0F;
		}
		if (rn_2767 < rn_2778 && rn_2778 != -1713.0F) {
			rn_2767 = rn_2778;
		}
		if (rn_2779 < rn_2767 && rn_2779 != -1713.0F) {
			rn_2767 = rn_2779;
		}
		if (rn_2776 == static_.rn_2805) {
			if ((rn_2774.rn_3671 || rn_2774.rn_3672) && rn_2784 == 0) {
				rn_2775.rn_509 = rn_2775.rn_509 + 25;
				rn_2775.rn_1134(Coin.this);
				rn_2784 = 1;
			} else if (rn_2784 == 1) {
				rn_2783 = rn_2783 + 1;
				if (rn_2783 > 100) {
					return true;
				}
				rn_2768 = (-rn_2775.rn_459 - rn_2767 + 50) * rn_2783 / 100;
				rn_2770 = (-rn_2775.rn_460 - rn_2769 + 50) * rn_2783 / 100;
				if (rn_2783 > 80) {
					rn_2777.rn_3521("", new float[]{1.0F, 1.0F, 1.0F, (100 - rn_2783) / 20.0F});
				}
			}
		} else if (rn_2776 == static_.rn_2808) {
			if (rn_2769 > rn_2787) {
				rn_2769 = rn_2787;
				rn_2772 = 0;
				rn_2773 = 0;
			}
			if ((rn_2774.rn_3671 || rn_2774.rn_3672) && rn_2784 == 0) {
				rn_2775.rn_1152(Coin.this);
				rn_2784 = 1;
			} else if (rn_2784 == 1) {
				rn_2783 = rn_2783 + 1;
				if (rn_2783 > 500) {
					return true;
				}
			}
		}
		return false;
	}
}