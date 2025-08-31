package bk.pvz;
import bk.pvz.Point;

public class Pointed {
	public static java.util.ArrayList<Point> rn_4047(Point[] rn_4048) {
		java.util.ArrayList<Point> list = new java.util.ArrayList<>(rn_4048.length);
		for(Point el : rn_4048) {
			list.add(el);
		}
		return list;
	}

	public static Point[] rn_4076(java.util.ArrayList<Point> r_obj) {
		return r_obj.toArray(new Point[0]);
	}
}