package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.MowerList;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Mower;
import bk.pvz.Nirvana;

public class CartSet {
	public java.util.ArrayList<Mower> rn_2551 = new java.util.ArrayList<Mower>();
	public Nirvana rn_2555 = null;

	public final void rn_2556(int rn_2557, int[] rn_2558, float rn_2559, Nirvana rn_2560) {
		MowerList.rn_2588(rn_2551);
		CartSet.this.rn_2555 = rn_2560;
		if (rn_2557 == 0) {
		} else {
			for (int rn_10558 = 0;rn_10558 < rn_2557;rn_10558 += 1) {
				if (rn_2558 [rn_10558] != -1) {
					Mower rn_2561 = Mower.rn_2605(rn_2558 [rn_10558], rn_10558, rn_2560);
					rn_2561.rn_2595 = rn_2559;
					MowerList.rn_2574(rn_2551, rn_2561);
				}
			}
		}
	}

	public final void rn_2562() {
		for (int rn_10559 = 0;rn_10559 < MowerList.rn_1225(rn_2551);rn_10559 += 1) {
			Mower rn_2563 = MowerList.rn_2566(rn_2551, MowerList.rn_1225(rn_2551) - rn_10559 - 1);
			if (rn_2563.rn_2596 == false) {
			}
			if (rn_2563.rn_2611()) {
				rn_2563.rn_2602 = true;
			}
		}
	}
}