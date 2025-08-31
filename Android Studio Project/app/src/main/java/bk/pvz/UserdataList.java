package bk.pvz;
import bk.pvz.Userdata;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class UserdataList {
	public static Userdata rn_2769(java.util.ArrayList<Userdata> r_obj, int rn_2770) {
		return UserdataList.rn_2785(r_obj, rn_2770);
	}

	public static void rn_2777(java.util.ArrayList<Userdata> r_obj, Userdata rn_2778) {
		r_obj.add(rn_2778);
	}

	public static Userdata rn_2785(java.util.ArrayList<Userdata> r_obj, int rn_2786) {
		return r_obj.get(rn_2786);
	}

	public static void rn_2791(java.util.ArrayList<Userdata> r_obj) {
		r_obj.clear();
	}

	public static int rn_1021(java.util.ArrayList<Userdata> r_obj) {
		return r_obj.size();
	}
}