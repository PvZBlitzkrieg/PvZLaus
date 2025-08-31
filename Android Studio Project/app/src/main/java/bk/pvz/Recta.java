package bk.pvz;
import bk.pvz.Detrect;
import bk.pvz.RectaList;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class Recta extends java.util.ArrayList<Detrect> {
	public String rn_4109 = "";

	public final Detrect rn_4110(String rn_4111) {
		for (int rn_10489 = 0;rn_10489 < RectaList.rn_1021(Recta.this);rn_10489 += 1) {
			if (rn_3081.rn_6682(rn_4111, RectaList.rn_4080(Recta.this, rn_10489).rn_4015)) {
				return RectaList.rn_4080(Recta.this, rn_10489);
			}
		}
		return null;
	}
}