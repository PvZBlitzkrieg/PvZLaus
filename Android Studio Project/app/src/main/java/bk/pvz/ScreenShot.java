package bk.pvz;
import android.graphics.*;
import android.graphics.drawable.*;
import android.content.*;
import android.provider.*;
import android.app.*;
import android.view.*;
import java.io.*;
import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_4294.rn_4295.rn_4296.rn_6193;
import rn_4581.rn_4582.rn_4583.rn_9923;
import rn_4581.rn_4582.rn_4583.rn_7502;
import rn_4581.rn_4582.rn_4583.rn_9189;
import rn_4581.rn_4582.rn_4583.rn_9105;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_5637;
import rn_4581.rn_4582.rn_4583.rn_6301;

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

	public static final void rn_1781(android.app.Activity rn_1782, String rn_1783) {
		java.io.File rn_1784 = new java.io.File(rn_1783);
		if (rn_7502.rn_7508(rn_6193.rn_6226(rn_1784))) {
			rn_6193.rn_6211(rn_1784);
		}
		savePic(takeScreenShot(rn_1782), rn_1783);
	}

	public static final void rn_1785(android.graphics.Bitmap rn_1786, String rn_1787) {
		savePic(rn_1786,rn_1787);
	}

	public static final void rn_1788(rn_5637 rn_1789, String rn_1790) {
		savePic(takeViewShot(rn_1789.getView()), rn_1790);
	}

	public static final android.graphics.Bitmap rn_1791(rn_5637 rn_1792) {
		android.graphics.Bitmap rn_1793 = null;
		try {;
		rn_1793=takeViewShot(rn_1792.getView());
		} catch (Exception e) {;
		rn_1793 = rn_9105.rn_9126(8, 64, rn_9189.rn_9193);
		};
		return rn_1793;
	}

	public static final void rn_1794(android.graphics.Bitmap rn_1795, String rn_1796) {
		rn_9923.rn_9953(rn_1796);
		savePic(rn_1795,rn_1796);
	}
}