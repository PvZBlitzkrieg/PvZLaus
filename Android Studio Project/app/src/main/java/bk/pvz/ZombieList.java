package bk.pvz;
import bk.pvz.Zombie;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class ZombieList {
	public static Zombie rn_2149(java.util.ArrayList<Zombie> r_obj, int rn_2150) {
		return ZombieList.rn_2165(r_obj, rn_2150);
	}

	public static void rn_2157(java.util.ArrayList<Zombie> r_obj, Zombie rn_2158) {
		r_obj.add(rn_2158);
	}

	public static Zombie rn_2165(java.util.ArrayList<Zombie> r_obj, int rn_2166) {
		return r_obj.get(rn_2166);
	}

	public static void rn_2171(java.util.ArrayList<Zombie> r_obj) {
		r_obj.clear();
	}

	public static void rn_2172(java.util.ArrayList<Zombie> r_obj, int rn_2173) {
		r_obj.remove(rn_2173);
	}

	public static int rn_1021(java.util.ArrayList<Zombie> r_obj) {
		return r_obj.size();
	}
}