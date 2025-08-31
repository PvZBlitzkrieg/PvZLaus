package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Particle;

public class ParticleList {
	public static Particle rn_2305(java.util.ArrayList<Particle> r_obj, int rn_2306) {
		return ParticleList.rn_2321(r_obj, rn_2306);
	}

	public static void rn_2313(java.util.ArrayList<Particle> r_obj, Particle rn_2314) {
		r_obj.add(rn_2314);
	}

	public static Particle rn_2321(java.util.ArrayList<Particle> r_obj, int rn_2322) {
		return r_obj.get(rn_2322);
	}

	public static void rn_2327(java.util.ArrayList<Particle> r_obj) {
		r_obj.clear();
	}

	public static void rn_2328(java.util.ArrayList<Particle> r_obj, int rn_2329) {
		r_obj.remove(rn_2329);
	}

	public static int rn_1021(java.util.ArrayList<Particle> r_obj) {
		return r_obj.size();
	}
}