package bk.pvz;
import bk.pvz.Proj;
import rn_6840.rn_6841.rn_6842.rn_6928;

public class ProjList {
	public static Proj rn_2429(java.util.ArrayList<Proj> r_obj, int rn_2430) {
		return ProjList.rn_2445(r_obj, rn_2430);
	}

	public static void rn_2437(java.util.ArrayList<Proj> r_obj, Proj rn_2438) {
		r_obj.add(rn_2438);
	}

	public static Proj rn_2445(java.util.ArrayList<Proj> r_obj, int rn_2446) {
		return r_obj.get(rn_2446);
	}

	public static void rn_2452(java.util.ArrayList<Proj> r_obj, int rn_2453) {
		r_obj.remove(rn_2453);
	}

	public static int rn_1225(java.util.ArrayList<Proj> r_obj) {
		return r_obj.size();
	}
}