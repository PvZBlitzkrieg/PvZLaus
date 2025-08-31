package bk.pvz;
import android.graphics.*;
import android.graphics.drawable.*;
import android.content.*;
import android.provider.*;
import android.app.*;
import android.view.*;
import java.io.*;
import rn_4413.rn_4414.rn_4415.rn_9553;
import rn_4413.rn_4414.rn_4415.rn_9021;
import rn_4126.rn_4127.rn_4128.rn_6025;
import rn_4413.rn_4414.rn_4415.rn_5469;
import rn_4413.rn_4414.rn_4415.rn_6133;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_9755;
import rn_4413.rn_4414.rn_4415.rn_8937;
import rn_4413.rn_4414.rn_4415.rn_7334;

public class ScreenShot {
	private static String clipText;
   private static Bitmap takeScreenShot(Activity activity) {
		View view = activity.getWindow().getDecorView();
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();

		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		int statusBarHeight = frame.top;

		int width = activity.getWindowManager().getDefaultDisplay().getWidth();
		int height = activity.getWindowManager().getDefaultDisplay().getHeight();

		Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight);
		view.destroyDrawingCache();
		return b;
	}
	
	private static Bitmap takeViewShot(View view) {
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();
		Rect frame = new Rect();
		int statusBarHeight = frame.top;

		int width = view.getWidth();
		int height = view.getHeight();

		Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight);
		view.destroyDrawingCache();
		return b;
	}

	private static Bitmap takeScreenShot2(Activity activity, int a, int c, int i, int d) {
		View view = activity.getWindow().getDecorView();
		view.setDrawingCacheEnabled(true);
		view.buildDrawingCache();
		Bitmap b1 = view.getDrawingCache();

		Rect frame = new Rect();
		activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
		Bitmap b = Bitmap.createBitmap(b1, a, c, i, d);
		view.destroyDrawingCache();
		return b;
	}

	private static void savePic(Bitmap b, String strFileName) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(strFileName);
			if (null != fos) {
				b.compress(Bitmap.CompressFormat.JPEG, 90, fos);
				fos.flush();
				fos.close();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("屏幕截图 未找到文件:" + strFileName);
		}
		catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("屏幕截图 没有存储权限");
		}
	}

	public static final void rn_1644(android.app.Activity rn_1645, String rn_1646) {
		java.io.File rn_1647 = new java.io.File(rn_1646);
		if (rn_7334.rn_7340(rn_6025.rn_6058(rn_1647))) {
			rn_6025.rn_6043(rn_1647);
		}
		savePic(takeScreenShot(rn_1645), rn_1646);
	}

	public static final void rn_1648(android.graphics.Bitmap rn_1649, String rn_1650) {
		savePic(rn_1649,rn_1650);
	}

	public static final void rn_1651(rn_5469 rn_1652, String rn_1653) {
		savePic(takeViewShot(rn_1652.getView()), rn_1653);
	}

	public static final android.graphics.Bitmap rn_1654(rn_5469 rn_1655) {
		android.graphics.Bitmap rn_1656 = null;
		try {;
		rn_1656=takeViewShot(rn_1655.getView());
		} catch (Exception e) {;
		rn_1656 = rn_8937.rn_8958(8, 64, rn_9021.rn_9025);
		};
		return rn_1656;
	}

	public static final void rn_1657(android.graphics.Bitmap rn_1658, String rn_1659) {
		rn_9755.rn_9785(rn_1659);
		savePic(rn_1658,rn_1659);
	}
}