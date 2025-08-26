package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Detrect;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.RectaList;

public class Recta extends java.util.ArrayList<Detrect> {
	public String rn_4277 = "";

	public final Detrect rn_4278(String rn_4279) {
		for (int rn_10618 = 0;rn_10618 < RectaList.rn_1225(Recta.this);rn_10618 += 1) {
			if (rn_3289.rn_6850(rn_4279, RectaList.rn_4248(Recta.this, rn_10618).rn_4183)) {
				return RectaList.rn_4248(Recta.this, rn_10618);
			}
		}
		return null;
	}
}