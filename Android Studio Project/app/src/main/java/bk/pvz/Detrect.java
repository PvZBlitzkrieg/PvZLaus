package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.Point;
import bk.pvz.ope;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Pointed;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_10083;
import rn_6840.rn_6841.rn_6842.rn_6935;
import rn_6840.rn_6841.rn_6842.rn_6941;
import rn_4581.rn_4582.rn_4583.rn_7317;

public class Detrect {
	public java.util.ArrayList<Point> rn_4182 = new java.util.ArrayList<Point>();
	public String rn_4183 = "";
	public long rn_4184 = 0;
	public Point rn_4185 = new Point();

	public static final Detrect rn_4186(float rn_4187, float rn_4188, float rn_4189, float rn_4190, float rn_4191, float rn_4192, float rn_4193, float rn_4194) {
		Point rn_4195 = Point.rn_4178(rn_4187, rn_4188);
		Point rn_4196 = Point.rn_4178(rn_4189, rn_4190);
		Point rn_4197 = Point.rn_4178(rn_4191, rn_4192);
		Point rn_4198 = Point.rn_4178(rn_4193, rn_4194);
		return Detrect.rn_4199(new Point[]{rn_4195, rn_4196, rn_4197, rn_4198});
	}

	public static final Detrect rn_4199(Point[] rn_4200) {
		Detrect rn_4201 = new Detrect();
		rn_4201.rn_4182 = Pointed.rn_4215(rn_4200);
		return rn_4201;
	}

	public final boolean rn_4202(Point rn_4203) {
		long rn_4204 = rn_10083.rn_10089() - rn_4184;
		if (rn_4204 < 200) {
			double rn_4205 = rn_7317.rn_7338(rn_4185.rn_4176 - rn_4203.rn_4176);
			double rn_4206 = rn_7317.rn_7338(rn_4185.rn_4177 - rn_4203.rn_4177);
			if (rn_4205 < 10 && rn_4206 < 10) {
				return true;
			}
		}
		return false;
	}

	public final boolean rn_4207(Point rn_4208) {
		Point[] rn_4209 = Pointed.rn_4244(rn_4182);
		Point[] quad=rn_4209;
		Point touch=rn_4208;
        if (quad.length != 4) {
            throw new IllegalArgumentException("四边形必须有四个顶点");
        }

        // 计算四边形的面积（分成两个三角形）
        double area1 = ope.rn_1857(quad[0], quad[1], quad[2]);
        double area2 = ope.rn_1857(quad[0], quad[2], quad[3]);
        double area_quad = area1 + area2;

        // 计算触摸点与四边形构成的四个三角形的面积
        double area_sum = 0;
        for (int i = 0; i < 4; i++) {
            Point p1 = quad[i];
            Point p2 = quad[(i + 1) % 4];
            area_sum += ope.rn_1857(touch, p1, p2);
        }

        // 允许一定的浮点误差
        return Math.abs(area_sum - area_quad) < 1;
	}

	public interface rn_4210_r {
		void dispatch(Point rn_4211, String rn_4212);
	}
	private rn_4210_r rn_4210_v;
	public final void rn_4210_s(rn_4210_r receiver) {
		this.rn_4210_v = receiver;
	}
	public final void rn_4210(Point rn_4211, String rn_4212) {
		if (this.rn_4210_v != null) {
			this.rn_4210_v.dispatch(rn_4211, rn_4212);
		}
	}

	public interface rn_4213_r {
		void dispatch(Point rn_4214);
	}
	private rn_4213_r rn_4213_v;
	public final void rn_4213_s(rn_4213_r receiver) {
		this.rn_4213_v = receiver;
	}
	public final void rn_4213(Point rn_4214) {
		if (this.rn_4213_v != null) {
			this.rn_4213_v.dispatch(rn_4214);
		}
	}
}