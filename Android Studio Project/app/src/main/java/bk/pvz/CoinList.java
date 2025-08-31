package bk.pvz;
import bk.pvz.Coin;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class CoinList {
	public static Coin rn_2243(java.util.ArrayList<Coin> r_obj, int rn_2244) {
		return CoinList.rn_2259(r_obj, rn_2244);
	}

	public static void rn_2251(java.util.ArrayList<Coin> r_obj, Coin rn_2252) {
		r_obj.add(rn_2252);
	}

	public static Coin rn_2259(java.util.ArrayList<Coin> r_obj, int rn_2260) {
		return r_obj.get(rn_2260);
	}

	public static void rn_2266(java.util.ArrayList<Coin> r_obj, int rn_2267) {
		r_obj.remove(rn_2267);
	}

	public static int rn_1021(java.util.ArrayList<Coin> r_obj) {
		return r_obj.size();
	}
}