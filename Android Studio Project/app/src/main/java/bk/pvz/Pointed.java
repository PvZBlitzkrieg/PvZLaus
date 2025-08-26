package bk.pvz;
import bk.pvz.Point;

public class Pointed {
	public static java.util.ArrayList<Point> rn_4215(Point[] rn_4216) {
		java.util.ArrayList<Point> list = new java.util.ArrayList<>(rn_4216.length);
		for(Point el : rn_4216) {
			list.add(el);
		}
		return list;
	}

	public static Point[] rn_4244(java.util.ArrayList<Point> r_obj) {
		return r_obj.toArray(new Point[0]);
	}
}