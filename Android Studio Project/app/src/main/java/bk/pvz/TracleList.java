package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Tracle;

public class TracleList {
	public static Tracle rn_2274(java.util.ArrayList<Tracle> r_obj, int rn_2275) {
		return TracleList.rn_2290(r_obj, rn_2275);
	}

	public static void rn_2282(java.util.ArrayList<Tracle> r_obj, Tracle rn_2283) {
		r_obj.add(rn_2283);
	}

	public static Tracle rn_2290(java.util.ArrayList<Tracle> r_obj, int rn_2291) {
		return r_obj.get(rn_2291);
	}

	public static void rn_2297(java.util.ArrayList<Tracle> r_obj, int rn_2298) {
		r_obj.remove(rn_2298);
	}

	public static int rn_1021(java.util.ArrayList<Tracle> r_obj) {
		return r_obj.size();
	}
}