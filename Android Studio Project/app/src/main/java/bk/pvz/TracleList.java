package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Tracle;

public class TracleList {
	public static Tracle rn_2491(java.util.ArrayList<Tracle> r_obj, int rn_2492) {
		return TracleList.rn_2507(r_obj, rn_2492);
	}

	public static void rn_2499(java.util.ArrayList<Tracle> r_obj, Tracle rn_2500) {
		r_obj.add(rn_2500);
	}

	public static Tracle rn_2507(java.util.ArrayList<Tracle> r_obj, int rn_2508) {
		return r_obj.get(rn_2508);
	}

	public static void rn_2514(java.util.ArrayList<Tracle> r_obj, int rn_2515) {
		r_obj.remove(rn_2515);
	}

	public static int rn_1225(java.util.ArrayList<Tracle> r_obj) {
		return r_obj.size();
	}
}