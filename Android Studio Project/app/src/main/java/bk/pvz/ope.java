package bk.pvz;
import com.badlogic.gdx.graphics.Pixmap;
import android.view.WindowManager;
import android.graphics.*;
import rn_6840.rn_6841.rn_6842.rn_6961;
import bk.pvz.Pixmap_;
import rn_4581.rn_4582.rn_4583.rn_9105;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_7317;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6985;
import bk.pvz.Point;
import rn_4581.rn_4582.rn_4583.rn_5408;
import rn_6840.rn_6841.rn_6842.rn_6941;
import bk.pvz.TextureRegion_;
import bk.pvz.MIP;
import bk.pvz.op;
import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_4581.rn_4582.rn_4583.rn_7111;
import bk.pvz.Array_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import bk.pvz.CrashWindow;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_4581.rn_4582.rn_4583.rn_9923;
import bk.pvz.Matrix_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_6935;
import rn_4581.rn_4582.rn_4583.rn_8820;

public class ope {
	// RGB to HSV  
    public static float[] rgbToHsv(int[] rgb) {  
        float[] hsv = new float[3];  
        float rNorm = rgb[0] / 255f;  
        float gNorm = rgb[1] / 255f;  
        float bNorm = rgb[2] / 255f;  
        float max = Math.max(rNorm, Math.max(gNorm, bNorm));  
        float min = Math.min(rNorm, Math.min(gNorm, bNorm));  
        float delta = max - min;  
  
        // Hue  
        if (delta == 0) {  
            hsv[0] = 0;  
        } else if (max == rNorm) {  
            hsv[0] = 60 * ((gNorm - bNorm) / delta % 6);  
        } else if (max == gNorm) {  
            hsv[0] = 60 * ((bNorm - rNorm) / delta + 2);  
        } else {  
            hsv[0] = 60 * ((rNorm - gNorm) / delta + 4);  
        }  
  
        // Saturation  
        hsv[1] = (max == 0) ? 0 : delta / max;  
  
        // Value  
        hsv[2] = max;  
  
        return hsv;  
    }  
  
    // HSV to RGB  
    public static int[] hsvToRgb(float h, float s, float v) {  
        int[] rgb = new int[3];  
		
		float hh = h / 60;
	int i = ((int) hh) % 6;

	float f = hh - i;
		
        float p = v * (1 - s);  
        float q = v * (1 - f * s);  
        float t = v * (1 - (1 - f) * s);  
  
        switch (i % 6) {  
            case 0:  
                rgb[0] = (int) (v * 255);  
                rgb[1] = (int) (t * 255);  
                rgb[2] = (int) (p * 255);  
                break;  
            case 1:  
                rgb[0] = (int) (q * 255);  
                rgb[1] = (int) (v * 255);  
                rgb[2] = (int) (p * 255);  
                break;  
            case 2:  
                rgb[0] = (int) (p * 255);  
                rgb[1] = (int) (v * 255);  
                rgb[2] = (int) (t * 255);  
                break;  
            case 3:  
                rgb[0] = (int) (p * 255);  
                rgb[1] = (int) (q * 255);  
                rgb[2] = (int) (v * 255);  
                break;  
            case 4:  
                rgb[0] = (int) (t * 255);  
                rgb[1] = (int) (p * 255);  
                rgb[2] = (int) (v * 255);  
                break;  
            case 5:  
                rgb[0] = (int) (v * 255);  
                rgb[1] = (int) (p * 255);  
                rgb[2] = (int) (q * 255);  
                break;  
        }  
  
        return rgb;  
    }

	public static final String rn_1820 = "/storage/emulated/0/.pvz/pvz/properties/log.cat";

	public static final float rn_1821(float rn_1822, float rn_1823) {
		return op.rn_1242(rn_7317.rn_7331(rn_1822, rn_1823 - 1.0F));
	}

	public static final float rn_1824(float rn_1825, float rn_1826, float rn_1827, int rn_1828) {
		float rn_1829 = rn_1826 - rn_1825;
		float rn_1830 = rn_1827 / 2;
		float rn_1831 = rn_1829 / (rn_1830 * (rn_1830 + 1));
		if (rn_1828 < 0) {
			return 0;
		} else if (rn_1828 < rn_1827 / 2) {
			return (rn_1828 + 1) * rn_1831;
		} else if (rn_1828 < rn_1827) {
			return (rn_1827 - rn_1828) * rn_1831;
		} else {
			return 0;
		}
	}

	public static final void rn_1834(android.app.Activity rn_1835) {
		try {;
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread thread, Throwable ex) {
				//handleMainThread(ex);
				//Thread.sleep(5000);
		rn_5541.rn_5543(rn_1835, "error", false);
		String rn_1836 = "";
		rn_1836=ex.getLocalizedMessage();
		Throwable rn_1837 = null;
		rn_1837=ex;
		String rn_1838 = "";
		int rn_1839 = 0;
		String rn_1840 = "";
		String rn_1841 = "";
		rn_1841 = rn_1841 + (rn_6985.rn_6986(rn_1837) + "\n" + rn_6985.rn_6987(rn_1837) + "\n" + rn_1836);
		android.content.Intent rn_1842 = new android.content.Intent();
		StackTraceElement[] ste=thread.currentThread().getStackTrace();
				for (int i=0;i<ste.length;i++) {
					rn_1838=ste[i].getClassName();
					rn_1839=i;
					rn_1840=android.util.Log.getStackTraceString(ex);
		rn_1841 = rn_1841 + (rn_6928.rn_6933(rn_1839) + " " + rn_1838 + "\n");
		}
		rn_1841 = (rn_1840);
		rn_1842.putExtra("error", rn_1841);;
		rn_1842.putExtra("a", rn_4301.rn_6844(rn_1835));;
		if (rn_1842 == null) {
			rn_9721.newActivity(rn_1835, CrashWindow.class);
		} else {
			rn_9721.newActivity2(rn_1835, CrashWindow.class, rn_1842);
		};
		//调试输出("abc")
				//ann.弹出提示("yyy")
				
				//ann.切换窗口(启动窗口)
				
			//TODO
				System.out.println(ex.getLocalizedMessage());
			    //#ann.finish();
				
			}
		});
		} catch (Exception e) {;
		rn_9923.rn_9966("/sdcard/bk/logcat.4", "异常:" + rn_6985.rn_6986(e));
		};
	}

	public static final byte[] rn_1845(int[] rn_1846) {
		byte[] rn_1847 = (byte[]) (new byte[rn_1846.length * 4]);
		byte[] rn_1848 = null;
		for (int rn_10530 = 0;rn_10530 < rn_1846.length;rn_10530 += 1) {
			rn_1848 = op.rn_1351(rn_1846 [rn_10530]);
			rn_1847 [rn_10530 * 4 + 0] = rn_1848 [1];
			rn_1847 [rn_10530 * 4 + 1] = rn_1848 [2];
			rn_1847 [rn_10530 * 4 + 2] = rn_1848 [3];
			rn_1847 [rn_10530 * 4 + 3] = rn_1848 [0];
		}
		return rn_1847;
	}

	public static final float rn_1853(float rn_1854) {
		if (rn_1854 < 0) {
			return -1 * rn_1854;
		} else {
			return rn_1854;
		}
	}

	public static final float rn_1855(float rn_1856) {
		if (rn_1856 < 0) {
			return -1 * rn_1856;
		} else {
			return rn_1856;
		}
	}

	public static final double rn_1857(Point rn_1858, Point rn_1859, Point rn_1860) {
		return rn_7317.rn_7338((rn_1858.rn_4176 * (rn_1859.rn_4177 - rn_1860.rn_4177) + rn_1859.rn_4176 * (rn_1860.rn_4177 - rn_1858.rn_4177) + rn_1860.rn_4176 * (rn_1858.rn_4177 - rn_1859.rn_4177)) / 2.0);
	}

	public static final boolean rn_1861(int rn_1862) {
		if (rn_1862 > 0) {
			return true;
		}
		return false;
	}

	public static final int[] rn_1863(int rn_1864) {
		int[] colors={android.graphics.Color.alpha(rn_1864),android.graphics.Color.red(rn_1864),android.graphics.Color.green(rn_1864),android.graphics.Color.blue(rn_1864)};
		return colors;
	}

	public static final int rn_1865(int[] rn_1866) {
		return android.graphics.Color.argb(rn_1866[0],rn_1866[1],rn_1866[2],rn_1866[3]);
	}

	public static final int rn_1867(int[] rn_1868, int rn_1869) {
		return android.graphics.Color.argb(rn_1869,rn_1868[0],rn_1868[1],rn_1868[2]);
	}

	public static final void rn_1870(android.graphics.Bitmap rn_1871, int[] rn_1872, int rn_1873, int rn_1874, int rn_1875, int rn_1876, int rn_1877, int rn_1878) {
		rn_1871.getPixels(rn_1872,rn_1873,rn_1874,rn_1875,rn_1876,rn_1877,rn_1878);
	}

	public static final android.graphics.Bitmap rn_1879(android.graphics.Bitmap rn_1880, int rn_1881, int rn_1882, int rn_1883, int rn_1884) {
		return android.graphics.Bitmap.createBitmap(rn_1880, rn_1881, rn_1882, rn_1883, rn_1884, null, false);
	}

	public static final com.badlogic.gdx.graphics.Pixmap rn_1885(com.badlogic.gdx.graphics.Pixmap rn_1886, int rn_1887, int rn_1888, int rn_1889, int rn_1890) {
		Pixmap originalPixmap = rn_1886;
int cropX = rn_1887, cropY = rn_1888, cropWidth = rn_1889, cropHeight = rn_1890;

Pixmap croppedPixmap = new Pixmap(cropWidth, cropHeight, originalPixmap.getFormat());
croppedPixmap.drawPixmap(originalPixmap, 0, 0, cropX, cropY, cropWidth, cropHeight);



//originalPixmap.dispose(); // 记得释放资源
return croppedPixmap;
	}

	public static final com.badlogic.gdx.graphics.Pixmap rn_1891(com.badlogic.gdx.graphics.Pixmap rn_1892, int rn_1893, int rn_1894, int rn_1895, int rn_1896) {
		return ope.rn_1885(rn_1892, rn_1893, rn_1894, rn_1895 - rn_1893, rn_1896 - rn_1894);
	}

	public static final float[] rn_1903(float[] rn_1904) {
		float[] rn_1905 = (float[]) (new float[rn_1904.length]);
		rn_1905 [0] = rn_1904 [0];
		rn_1905 [1] = rn_1904 [3];
		rn_1905 [2] = rn_1904 [6];
		rn_1905 [3] = rn_1904 [1];
		rn_1905 [4] = rn_1904 [4];
		rn_1905 [5] = rn_1904 [7];
		rn_1905 [6] = rn_1904 [2];
		rn_1905 [7] = rn_1904 [5];
		rn_1905 [8] = rn_1904 [8];
		return rn_1905;
	}

	public static final android.graphics.Matrix rn_1909(android.graphics.Matrix rn_1910, int rn_1911, int rn_1912) {
		Matrix_.rn_3628(rn_1910, 0, rn_1912);
		Matrix_.rn_3617(rn_1910, 1, -1);
		Matrix_.rn_3592(rn_1910, 1, -1);
		Matrix_.rn_3603(rn_1910, 0, rn_1911);
		return rn_1910;
	}

	public static final float rn_1913(float rn_1914, float rn_1915, float rn_1916) {
		return rn_1915 - rn_1914 - rn_1916;
	}

	public static final com.badlogic.gdx.utils.Array rn_1917(com.badlogic.gdx.graphics.g2d.TextureRegion[] rn_1918) {
		com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> arr=new com.badlogic.gdx.utils.Array(rn_1918);
		return arr;
	}

	public static final int rn_1919(int rn_1920) {
		int[] rn_1921 = ope.rn_1863(rn_1920);
		int[] rn_1922 = (int[]) (new int[4]);
		rn_1922 [0] = rn_1921 [1];
		rn_1922 [1] = rn_1921 [2];
		rn_1922 [2] = rn_1921 [3];
		rn_1922 [3] = rn_1921 [0];
		return ope.rn_1865(rn_1922);
	}

	public static final void rn_1923(Object rn_1924) {
		rn_1924 = null;
		rn_7111.rn_7183();
	}

	public static final void rn_1925(String rn_1926) {
		rn_9923.rn_9946(rn_1820, rn_1926 + "\n");
	}

	public static final int[] rn_1945(float[] rn_1946) {
		float rn_1947 = rn_1946 [0];
		float rn_1948 = rn_1946 [1];
		float rn_1949 = rn_1946 [2];
		return hsvToRgb(rn_1947,rn_1948,rn_1949);
	}

	public static final void rn_1954(android.app.Activity rn_1955) {
		rn_1955.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		rn_1955.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
// 全屏展示

        rn_1955.getWindow().getDecorView().setSystemUiVisibility(
                android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
                        | android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}

	public static final int rn_1986(int rn_1987, int rn_1988) {
		int rn_1989 = op.rn_1230(rn_1987, -16777216);
		rn_1989 = 16777215 - rn_1989;
		rn_1988=rn_1988<<24;
		return -16777216 + rn_1989;
	}

	public static final android.view.MotionEvent rn_2002(long rn_2003, int rn_2004, float rn_2005, float rn_2006) {
		return android.view.MotionEvent.obtain(rn_2003,rn_2003+100,rn_2004,rn_2005,rn_2006,0);
	}
}