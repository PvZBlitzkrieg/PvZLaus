package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Mower;

public class MowerList {
	public static Mower rn_2566(java.util.ArrayList<Mower> r_obj, int rn_2567) {
		return MowerList.rn_2582(r_obj, rn_2567);
	}

	public static void rn_2574(java.util.ArrayList<Mower> r_obj, Mower rn_2575) {
		r_obj.add(rn_2575);
	}

	public static Mower rn_2582(java.util.ArrayList<Mower> r_obj, int rn_2583) {
		return r_obj.get(rn_2583);
	}

	public static void rn_2588(java.util.ArrayList<Mower> r_obj) {
		r_obj.clear();
	}

	public static int rn_1225(java.util.ArrayList<Mower> r_obj) {
		return r_obj.size();
	}
}