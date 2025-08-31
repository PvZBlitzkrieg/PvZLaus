package bk.pvz;
import bk.pvz.Renderinfo;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class RenderinfoList {
	public static Renderinfo rn_3278(java.util.ArrayList<Renderinfo> r_obj, int rn_3279) {
		return RenderinfoList.rn_3294(r_obj, rn_3279);
	}

	public static void rn_3286(java.util.ArrayList<Renderinfo> r_obj, Renderinfo rn_3287) {
		r_obj.add(rn_3287);
	}

	public static Renderinfo rn_3294(java.util.ArrayList<Renderinfo> r_obj, int rn_3295) {
		return r_obj.get(rn_3295);
	}

	public static int rn_1021(java.util.ArrayList<Renderinfo> r_obj) {
		return r_obj.size();
	}
}