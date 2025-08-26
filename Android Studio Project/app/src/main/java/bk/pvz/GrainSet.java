package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Grain;

public class GrainSet {
	public static Grain rn_2895(java.util.ArrayList<Grain> r_obj, int rn_2896) {
		return GrainSet.rn_2911(r_obj, rn_2896);
	}

	public static void rn_2903(java.util.ArrayList<Grain> r_obj, Grain rn_2904) {
		r_obj.add(rn_2904);
	}

	public static Grain rn_2911(java.util.ArrayList<Grain> r_obj, int rn_2912) {
		return r_obj.get(rn_2912);
	}

	public static void rn_2918(java.util.ArrayList<Grain> r_obj, int rn_2919) {
		r_obj.remove(rn_2919);
	}

	public static int rn_1225(java.util.ArrayList<Grain> r_obj) {
		return r_obj.size();
	}
}