package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Mower;

public class MowerList {
	public static Mower rn_2362(java.util.ArrayList<Mower> r_obj, int rn_2363) {
		return MowerList.rn_2378(r_obj, rn_2363);
	}

	public static void rn_2370(java.util.ArrayList<Mower> r_obj, Mower rn_2371) {
		r_obj.add(rn_2371);
	}

	public static Mower rn_2378(java.util.ArrayList<Mower> r_obj, int rn_2379) {
		return r_obj.get(rn_2379);
	}

	public static void rn_2384(java.util.ArrayList<Mower> r_obj) {
		r_obj.clear();
	}

	public static int rn_1021(java.util.ArrayList<Mower> r_obj) {
		return r_obj.size();
	}
}