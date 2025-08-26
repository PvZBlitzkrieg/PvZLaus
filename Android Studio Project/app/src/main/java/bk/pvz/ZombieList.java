package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Zombie;

public class ZombieList {
	public static Zombie rn_2366(java.util.ArrayList<Zombie> r_obj, int rn_2367) {
		return ZombieList.rn_2382(r_obj, rn_2367);
	}

	public static void rn_2374(java.util.ArrayList<Zombie> r_obj, Zombie rn_2375) {
		r_obj.add(rn_2375);
	}

	public static Zombie rn_2382(java.util.ArrayList<Zombie> r_obj, int rn_2383) {
		return r_obj.get(rn_2383);
	}

	public static void rn_2388(java.util.ArrayList<Zombie> r_obj) {
		r_obj.clear();
	}

	public static void rn_2389(java.util.ArrayList<Zombie> r_obj, int rn_2390) {
		r_obj.remove(rn_2390);
	}

	public static int rn_1225(java.util.ArrayList<Zombie> r_obj) {
		return r_obj.size();
	}
}