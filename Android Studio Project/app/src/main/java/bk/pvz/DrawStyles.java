package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.DrawStyle;

public class DrawStyles {
	public static DrawStyle rn_3576(java.util.ArrayList<DrawStyle> r_obj, int rn_3577) {
		return DrawStyles.rn_3592(r_obj, rn_3577);
	}

	public static void rn_3584(java.util.ArrayList<DrawStyle> r_obj, DrawStyle rn_3585) {
		r_obj.add(rn_3585);
	}

	public static DrawStyle rn_3592(java.util.ArrayList<DrawStyle> r_obj, int rn_3593) {
		return r_obj.get(rn_3593);
	}

	public static void rn_3598(java.util.ArrayList<DrawStyle> r_obj) {
		r_obj.clear();
	}

	public static int rn_1021(java.util.ArrayList<DrawStyle> r_obj) {
		return r_obj.size();
	}
}