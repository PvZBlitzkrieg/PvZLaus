package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Boolset {
	public boolean[] rn_2147 = new boolean[0];
	public int rn_2148 = 0;
	public int rn_2149 = 0;

	public static final Boolset rn_2150(int rn_2151, int rn_2152) {
		Boolset rn_2153 = new Boolset();
		rn_2153.rn_2154(rn_2151, rn_2152);
		return rn_2153;
	}

	public final void rn_2154(int rn_2155, int rn_2156) {
		rn_2148 = rn_2155;
		rn_2149 = rn_2156;
		rn_2147 = (boolean[]) (new boolean[rn_2155 * rn_2156]);
	}

	public final boolean rn_2157(int rn_2158, int rn_2159) {
		return rn_2147 [rn_2159 * rn_2148 + rn_2158];
	}

	public final void rn_2160(int rn_2161, int rn_2162, boolean rn_2163) {
		rn_2147 [rn_2162 * rn_2148 + rn_2161] = rn_2163;
	}

	public final void rn_2164(boolean rn_2165) {
		for (int rn_10545 = 0;rn_10545 < rn_2147.length;rn_10545 += 1) {
			rn_2147 [rn_10545] = rn_2165;
		}
	}
}