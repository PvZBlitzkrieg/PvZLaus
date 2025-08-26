package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Coin;

public class CoinList {
	public static Coin rn_2460(java.util.ArrayList<Coin> r_obj, int rn_2461) {
		return CoinList.rn_2476(r_obj, rn_2461);
	}

	public static void rn_2468(java.util.ArrayList<Coin> r_obj, Coin rn_2469) {
		r_obj.add(rn_2469);
	}

	public static Coin rn_2476(java.util.ArrayList<Coin> r_obj, int rn_2477) {
		return r_obj.get(rn_2477);
	}

	public static void rn_2483(java.util.ArrayList<Coin> r_obj, int rn_2484) {
		r_obj.remove(rn_2484);
	}

	public static int rn_1225(java.util.ArrayList<Coin> r_obj) {
		return r_obj.size();
	}
}