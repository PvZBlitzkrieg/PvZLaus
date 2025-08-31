package bk.pvz;
import bk.pvz.Grain;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class GrainSet {
	public static Grain rn_2721(java.util.ArrayList<Grain> r_obj, int rn_2722) {
		return GrainSet.rn_2737(r_obj, rn_2722);
	}

	public static void rn_2729(java.util.ArrayList<Grain> r_obj, Grain rn_2730) {
		r_obj.add(rn_2730);
	}

	public static Grain rn_2737(java.util.ArrayList<Grain> r_obj, int rn_2738) {
		return r_obj.get(rn_2738);
	}

	public static void rn_2744(java.util.ArrayList<Grain> r_obj, int rn_2745) {
		r_obj.remove(rn_2745);
	}

	public static int rn_1021(java.util.ArrayList<Grain> r_obj) {
		return r_obj.size();
	}
}