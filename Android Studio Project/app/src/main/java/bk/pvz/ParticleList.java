package bk.pvz;
import bk.pvz.Particle;
import rn_6840.rn_6841.rn_6842.rn_6928;

public class ParticleList {
	public static Particle rn_2522(java.util.ArrayList<Particle> r_obj, int rn_2523) {
		return ParticleList.rn_2538(r_obj, rn_2523);
	}

	public static void rn_2530(java.util.ArrayList<Particle> r_obj, Particle rn_2531) {
		r_obj.add(rn_2531);
	}

	public static Particle rn_2538(java.util.ArrayList<Particle> r_obj, int rn_2539) {
		return r_obj.get(rn_2539);
	}

	public static void rn_2544(java.util.ArrayList<Particle> r_obj) {
		r_obj.clear();
	}

	public static void rn_2545(java.util.ArrayList<Particle> r_obj, int rn_2546) {
		r_obj.remove(rn_2546);
	}

	public static int rn_1225(java.util.ArrayList<Particle> r_obj) {
		return r_obj.size();
	}
}