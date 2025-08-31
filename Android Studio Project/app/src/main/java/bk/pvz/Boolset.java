package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Boolset {
	public boolean[] rn_2020 = new boolean[0];
	public int rn_2021 = 0;
	public int rn_2022 = 0;

	public static final Boolset rn_2023(int rn_2024, int rn_2025) {
		Boolset rn_2026 = new Boolset();
		rn_2026.rn_2027(rn_2024, rn_2025);
		return rn_2026;
	}

	public final void rn_2027(int rn_2028, int rn_2029) {
		rn_2021 = rn_2028;
		rn_2022 = rn_2029;
		rn_2020 = (boolean[]) (new boolean[rn_2028 * rn_2029]);
	}

	public final boolean rn_2030(int rn_2031, int rn_2032) {
		return rn_2020 [rn_2032 * rn_2021 + rn_2031];
	}

	public final void rn_2033(int rn_2034, int rn_2035, boolean rn_2036) {
		rn_2020 [rn_2035 * rn_2021 + rn_2034] = rn_2036;
	}

	public final void rn_2037(boolean rn_2038) {
		for (int rn_10395 = 0;rn_10395 < rn_2020.length;rn_10395 += 1) {
			rn_2020 [rn_10395] = rn_2038;
		}
	}
}