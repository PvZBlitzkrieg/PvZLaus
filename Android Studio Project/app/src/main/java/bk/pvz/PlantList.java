package bk.pvz;
import bk.pvz.Plant;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class PlantList {
	public static Plant rn_2181(java.util.ArrayList<Plant> r_obj, int rn_2182) {
		return PlantList.rn_2197(r_obj, rn_2182);
	}

	public static void rn_2189(java.util.ArrayList<Plant> r_obj, Plant rn_2190) {
		r_obj.add(rn_2190);
	}

	public static Plant rn_2197(java.util.ArrayList<Plant> r_obj, int rn_2198) {
		return r_obj.get(rn_2198);
	}

	public static void rn_2204(java.util.ArrayList<Plant> r_obj, int rn_2205) {
		r_obj.remove(rn_2205);
	}

	public static int rn_1021(java.util.ArrayList<Plant> r_obj) {
		return r_obj.size();
	}
}