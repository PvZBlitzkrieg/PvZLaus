package bk.pvz;
import bk.pvz.Pointed;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_6773;
import bk.pvz.Point;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_9915;
import bk.pvz.ope;
import rn_4413.rn_4414.rn_4415.rn_7149;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_6672.rn_6673.rn_6674.rn_6767;

public class Detrect {
	public java.util.ArrayList<Point> rn_4014 = new java.util.ArrayList<Point>();
	public String rn_4015 = "";
	public long rn_4016 = 0;
	public Point rn_4017 = new Point();

	public static final Detrect rn_4018(float rn_4019, float rn_4020, float rn_4021, float rn_4022, float rn_4023, float rn_4024, float rn_4025, float rn_4026) {
		Point rn_4027 = Point.rn_4010(rn_4019, rn_4020);
		Point rn_4028 = Point.rn_4010(rn_4021, rn_4022);
		Point rn_4029 = Point.rn_4010(rn_4023, rn_4024);
		Point rn_4030 = Point.rn_4010(rn_4025, rn_4026);
		return Detrect.rn_4031(new Point[]{rn_4027, rn_4028, rn_4029, rn_4030});
	}

	public static final Detrect rn_4031(Point[] rn_4032) {
		Detrect rn_4033 = new Detrect();
		rn_4033.rn_4014 = Pointed.rn_4047(rn_4032);
		return rn_4033;
	}

	public final boolean rn_4034(Point rn_4035) {
		long rn_4036 = rn_9915.rn_9921() - rn_4016;
		if (rn_4036 < 200) {
			double rn_4037 = rn_7149.rn_7170(rn_4017.rn_4008 - rn_4035.rn_4008);
			double rn_4038 = rn_7149.rn_7170(rn_4017.rn_4009 - rn_4035.rn_4009);
			if (rn_4037 < 10 && rn_4038 < 10) {
				return true;
			}
		}
		return false;
	}

	public final boolean rn_4039(Point rn_4040) {
		Point[] rn_4041 = Pointed.rn_4076(rn_4014);
		Point[] quad=rn_4041;
		Point touch=rn_4040;
        if (quad.length != 4) {
            throw new IllegalArgumentException("四边形必须有四个顶点");
        }

        // 计算四边形的面积（分成两个三角形）
        double area1 = ope.rn_1730(quad[0], quad[1], quad[2]);
        double area2 = ope.rn_1730(quad[0], quad[2], quad[3]);
        double area_quad = area1 + area2;

        // 计算触摸点与四边形构成的四个三角形的面积
        double area_sum = 0;
        for (int i = 0; i < 4; i++) {
            Point p1 = quad[i];
            Point p2 = quad[(i + 1) % 4];
            area_sum += ope.rn_1730(touch, p1, p2);
        }

        // 允许一定的浮点误差
        return Math.abs(area_sum - area_quad) < 1;
	}

	public interface rn_4042_r {
		void dispatch(Point rn_4043, String rn_4044);
	}
	private rn_4042_r rn_4042_v;
	public final void rn_4042_s(rn_4042_r receiver) {
		this.rn_4042_v = receiver;
	}
	public final void rn_4042(Point rn_4043, String rn_4044) {
		if (this.rn_4042_v != null) {
			this.rn_4042_v.dispatch(rn_4043, rn_4044);
		}
	}

	public interface rn_4045_r {
		void dispatch(Point rn_4046);
	}
	private rn_4045_r rn_4045_v;
	public final void rn_4045_s(rn_4045_r receiver) {
		this.rn_4045_v = receiver;
	}
	public final void rn_4045(Point rn_4046) {
		if (this.rn_4045_v != null) {
			this.rn_4045_v.dispatch(rn_4046);
		}
	}
}