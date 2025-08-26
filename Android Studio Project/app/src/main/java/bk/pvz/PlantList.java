package bk.pvz;
import bk.pvz.Plant;
import rn_6840.rn_6841.rn_6842.rn_6928;

public class PlantList {
	public static Plant rn_2398(java.util.ArrayList<Plant> r_obj, int rn_2399) {
		return PlantList.rn_2414(r_obj, rn_2399);
	}

	public static void rn_2406(java.util.ArrayList<Plant> r_obj, Plant rn_2407) {
		r_obj.add(rn_2407);
	}

	public static Plant rn_2414(java.util.ArrayList<Plant> r_obj, int rn_2415) {
		return r_obj.get(rn_2415);
	}

	public static void rn_2421(java.util.ArrayList<Plant> r_obj, int rn_2422) {
		r_obj.remove(rn_2422);
	}

	public static int rn_1225(java.util.ArrayList<Plant> r_obj) {
		return r_obj.size();
	}
}