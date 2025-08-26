package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Renderinfo;

public class RenderinfoList {
	public static Renderinfo rn_3453(java.util.ArrayList<Renderinfo> r_obj, int rn_3454) {
		return RenderinfoList.rn_3469(r_obj, rn_3454);
	}

	public static void rn_3461(java.util.ArrayList<Renderinfo> r_obj, Renderinfo rn_3462) {
		r_obj.add(rn_3462);
	}

	public static Renderinfo rn_3469(java.util.ArrayList<Renderinfo> r_obj, int rn_3470) {
		return r_obj.get(rn_3470);
	}

	public static int rn_1225(java.util.ArrayList<Renderinfo> r_obj) {
		return r_obj.size();
	}
}