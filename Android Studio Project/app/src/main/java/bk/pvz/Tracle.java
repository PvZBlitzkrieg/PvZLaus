package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.static_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Anim;
import bk.pvz.Nirvana;

public class Tracle {
	public float rn_2814 = 0.0F;
	public float rn_2815 = 0.0F;
	public float rn_2816 = 0.0F;
	public float rn_2817 = 0.0F;
	public float rn_2818 = 0.0F;
	public float rn_2819 = 0.0F;
	public float rn_2820 = 0.0F;
	public float rn_2821 = 0.0F;
	public float rn_2824 = -1713.0F;
	public Nirvana rn_2825 = null;
	public int rn_2826 = 0;
	public Anim rn_2827 = null;
	public int rn_2829 = 0;
	public int rn_2830 = 0;
	public String rn_2831 = "";

	public static final Tracle rn_2832(Nirvana rn_2833, int rn_2834, float rn_2835, float rn_2836) {
		Tracle rn_2837 = new Tracle();
		rn_2837.rn_2825 = rn_2833;
		rn_2837.rn_2826 = rn_2834;
		if (rn_2834 == static_.rn_2810) {
			rn_2837.rn_2827 = Anim.rn_3508("Zombie_charred", rn_2833);
			rn_2837.rn_2827.rn_3499 = true;
			rn_2837.rn_2827.rn_3501 = true;
			rn_2837.rn_2829 = 50;
		} else if (rn_2834 == static_.rn_2812) {
		} else if (rn_2834 == static_.rn_2811) {
		}
		rn_2837.rn_2814 = rn_2835;
		rn_2837.rn_2815 = rn_2836;
		rn_2837.rn_2830 = rn_2837.rn_2829;
		return rn_2837;
	}

	public final boolean rn_2838() {
		rn_2814 = rn_2814 + rn_2816;
		rn_2815 = rn_2815 + rn_2817;
		rn_2816 = rn_2816 + rn_2818;
		rn_2817 = rn_2817 + rn_2819;
		rn_2820 = rn_2820 + rn_2821;
		if (rn_2824 < rn_2815 && rn_2824 != static_.rn_2813) {
			rn_2815 = rn_2824;
			if (rn_2826 == -1) {
				rn_2817 = -0.5F;
				rn_2819 = 0.01F;
			}
		}
		if (rn_2826 == static_.rn_2810) {
			if (rn_2827.rn_3498) {
				return rn_2841();
			}
		} else if (rn_2826 == -1) {
			if (rn_3289.rn_6850(rn_2831, "dido")) {
				return rn_2841();
			} else {
				if (rn_2829 <= 0) {
					rn_2831 = "dido";
					rn_2839(20);
				} else {
					rn_2829 = rn_2829 - 1;
				}
			}
		} else if (rn_2826 == static_.rn_2809) {
			if (rn_2827.rn_3498 == true) {
				return true;
			}
		}
		return false;
	}

	public final Tracle rn_2839(int rn_2840) {
		rn_2829 = rn_2840;
		rn_2830 = rn_2840;
		return Tracle.this;
	}

	public final boolean rn_2841() {
		if (rn_2829 <= 0) {
			return true;
		} else {
			rn_2829 = rn_2829 - 1;
			rn_2827.rn_3521("", new float[]{1.0F, 1.0F, 1.0F, rn_2829 * 1.0F / rn_2830});
		}
		return false;
	}
}