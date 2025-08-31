package bk.pvz;
import bk.pvz.Rectx;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class RectList {
	public static Rectx rn_3545(java.util.ArrayList<Rectx> r_obj, int rn_3546) {
		return RectList.rn_3561(r_obj, rn_3546);
	}

	public static void rn_3553(java.util.ArrayList<Rectx> r_obj, Rectx rn_3554) {
		r_obj.add(rn_3554);
	}

	public static Rectx rn_3561(java.util.ArrayList<Rectx> r_obj, int rn_3562) {
		return r_obj.get(rn_3562);
	}

	public static int rn_1021(java.util.ArrayList<Rectx> r_obj) {
		return r_obj.size();
	}
}