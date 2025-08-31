package bk.pvz;
import bk.pvz.Proj;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class ProjList {
	public static Proj rn_2212(java.util.ArrayList<Proj> r_obj, int rn_2213) {
		return ProjList.rn_2228(r_obj, rn_2213);
	}

	public static void rn_2220(java.util.ArrayList<Proj> r_obj, Proj rn_2221) {
		r_obj.add(rn_2221);
	}

	public static Proj rn_2228(java.util.ArrayList<Proj> r_obj, int rn_2229) {
		return r_obj.get(rn_2229);
	}

	public static void rn_2235(java.util.ArrayList<Proj> r_obj, int rn_2236) {
		r_obj.remove(rn_2236);
	}

	public static int rn_1021(java.util.ArrayList<Proj> r_obj) {
		return r_obj.size();
	}
}