package bk.pvz;
import com.badlogic.gdx.graphics.Pixmap;
import android.view.WindowManager;
import android.graphics.*;
import rn_4413.rn_4414.rn_4415.rn_9553;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_4413.rn_4414.rn_4415.rn_5240;
import rn_4413.rn_4414.rn_4415.rn_5373;
import rn_6672.rn_6673.rn_6674.rn_6767;
import bk.pvz.MIP;
import rn_4413.rn_4414.rn_4415.rn_8652;
import bk.pvz.CrashWindow;
import bk.pvz.TextureRegion_;
import rn_4413.rn_4414.rn_4415.rn_8937;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_6672.rn_6673.rn_6674.rn_6817;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import bk.pvz.Point;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_9755;
import rn_4413.rn_4414.rn_4415.rn_7149;
import rn_6672.rn_6673.rn_6674.rn_6793;
import bk.pvz.Array_;
import rn_4413.rn_4414.rn_4415.rn_6943;
import bk.pvz.Pixmap_;
import rn_6672.rn_6673.rn_6674.rn_6773;
import rn_4126.rn_4127.rn_4128.rn_4132;
import bk.pvz.Matrix_;

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

	public static final String rn_1683 = "/storage/emulated/0/.pvz/pvz/properties/log.cat";

	public static final float rn_1684(float rn_1685, float rn_1686) {
		return op.rn_1038(rn_7149.rn_7163(rn_1685, rn_1686 - 1.0F));
	}

	public static final float rn_1687(float rn_1688, float rn_1689, float rn_1690, int rn_1691) {
		float rn_1692 = rn_1689 - rn_1688;
		float rn_1693 = rn_1690 / 2;
		float rn_1694 = rn_1692 / (rn_1693 * (rn_1693 + 1));
		if (rn_1691 < 0) {
			return 0;
		} else if (rn_1691 < rn_1690 / 2) {
			return (rn_1691 + 1) * rn_1694;
		} else if (rn_1691 < rn_1690) {
			return (rn_1690 - rn_1691) * rn_1694;
		} else {
			return 0;
		}
	}

	public static final org.json.JSONObject rn_1698(java.util.ArrayList<Object> rn_1699) {
		org.json.JSONObject rn_1700 = new org.json.JSONObject();
		for (int rn_10378 = 0;rn_10378 < rn_4132.rn_1021(rn_1699);rn_10378 += 1) {
			String rn_1701 = rn_4133.rn_6675(rn_4132.rn_4136(rn_1699, rn_10378));
			if (rn_3081.rn_6693(rn_1701, "{", 0)) {
				org.json.JSONObject rn_1702 = rn_4577.rn_4578(rn_1701);
				rn_4577.rn_4607(rn_1700, "i" + rn_6760.rn_6765(rn_10378), rn_1702);
			} else {
				rn_4577.rn_4607(rn_1700, "i" + rn_6760.rn_6765(rn_10378), rn_4132.rn_4136(rn_1699, rn_10378));
			}
		}
		return rn_1700;
	}

	public static final void alienatedGas(android.app.Activity rn_1708) {
		try {;
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread thread, Throwable ex) {
				//handleMainThread(ex);
				//Thread.sleep(5000);
		rn_5373.rn_5375(rn_1708, "error", false);
		String rn_1709 = "";
		rn_1709=ex.getLocalizedMessage();
		Throwable rn_1710 = null;
		rn_1710=ex;
		String rn_1711 = "";
		int rn_1712 = 0;
		String rn_1713 = "";
		String rn_1714 = "";
		rn_1714 = rn_1714 + (rn_6817.rn_6818(rn_1710) + "\n" + rn_6817.rn_6819(rn_1710) + "\n" + rn_1709);
		android.content.Intent rn_1715 = new android.content.Intent();
		StackTraceElement[] ste=thread.currentThread().getStackTrace();
				for (int i=0;i<ste.length;i++) {
					rn_1711=ste[i].getClassName();
					rn_1712=i;
					rn_1713=android.util.Log.getStackTraceString(ex);
		rn_1714 = rn_1714 + (rn_6760.rn_6765(rn_1712) + " " + rn_1711 + "\n");
		}
		rn_1714 = (rn_1713);
		rn_1715.putExtra("error", rn_1714);;
		rn_1715.putExtra("a", rn_4133.rn_6676(rn_1708));;
		if (rn_1715 == null) {
			rn_9553.newActivity(rn_1708, CrashWindow.class);
		} else {
			rn_9553.newActivity2(rn_1708, CrashWindow.class, rn_1715);
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
		rn_9755.rn_9798("/sdcard/bk/logcat.4", "异常:" + rn_6817.rn_6818(e));
		};
	}

	public static final byte[] rn_1718(int[] rn_1719) {
		byte[] rn_1720 = (byte[]) (new byte[rn_1719.length * 4]);
		byte[] rn_1721 = null;
		for (int rn_10380 = 0;rn_10380 < rn_1719.length;rn_10380 += 1) {
			rn_1721 = op.rn_1147(rn_1719 [rn_10380]);
			rn_1720 [rn_10380 * 4 + 0] = rn_1721 [1];
			rn_1720 [rn_10380 * 4 + 1] = rn_1721 [2];
			rn_1720 [rn_10380 * 4 + 2] = rn_1721 [3];
			rn_1720 [rn_10380 * 4 + 3] = rn_1721 [0];
		}
		return rn_1720;
	}

	public static final float rn_1726(float rn_1727) {
		if (rn_1727 < 0) {
			return -1 * rn_1727;
		} else {
			return rn_1727;
		}
	}

	public static final float rn_1728(float rn_1729) {
		if (rn_1729 < 0) {
			return -1 * rn_1729;
		} else {
			return rn_1729;
		}
	}

	public static final double rn_1730(Point rn_1731, Point rn_1732, Point rn_1733) {
		return rn_7149.rn_7170((rn_1731.rn_4008 * (rn_1732.rn_4009 - rn_1733.rn_4009) + rn_1732.rn_4008 * (rn_1733.rn_4009 - rn_1731.rn_4009) + rn_1733.rn_4008 * (rn_1731.rn_4009 - rn_1732.rn_4009)) / 2.0);
	}

	public static final boolean rn_1734(int rn_1735) {
		if (rn_1735 > 0) {
			return true;
		}
		return false;
	}

	public static final int[] rn_1736(int rn_1737) {
		int[] colors={android.graphics.Color.alpha(rn_1737),android.graphics.Color.red(rn_1737),android.graphics.Color.green(rn_1737),android.graphics.Color.blue(rn_1737)};
		return colors;
	}

	public static final int rn_1738(int[] rn_1739) {
		return android.graphics.Color.argb(rn_1739[0],rn_1739[1],rn_1739[2],rn_1739[3]);
	}

	public static final int rn_1740(int[] rn_1741, int rn_1742) {
		return android.graphics.Color.argb(rn_1742,rn_1741[0],rn_1741[1],rn_1741[2]);
	}

	public static final void rn_1743(android.graphics.Bitmap rn_1744, int[] rn_1745, int rn_1746, int rn_1747, int rn_1748, int rn_1749, int rn_1750, int rn_1751) {
		rn_1744.getPixels(rn_1745,rn_1746,rn_1747,rn_1748,rn_1749,rn_1750,rn_1751);
	}

	public static final android.graphics.Bitmap rn_1752(android.graphics.Bitmap rn_1753, int rn_1754, int rn_1755, int rn_1756, int rn_1757) {
		return android.graphics.Bitmap.createBitmap(rn_1753, rn_1754, rn_1755, rn_1756, rn_1757, null, false);
	}

	public static final com.badlogic.gdx.graphics.Pixmap rn_1758(com.badlogic.gdx.graphics.Pixmap rn_1759, int rn_1760, int rn_1761, int rn_1762, int rn_1763) {
		Pixmap originalPixmap = rn_1759;
int cropX = rn_1760, cropY = rn_1761, cropWidth = rn_1762, cropHeight = rn_1763;

Pixmap croppedPixmap = new Pixmap(cropWidth, cropHeight, originalPixmap.getFormat());
croppedPixmap.drawPixmap(originalPixmap, 0, 0, cropX, cropY, cropWidth, cropHeight);



//originalPixmap.dispose(); // 记得释放资源
return croppedPixmap;
	}

	public static final com.badlogic.gdx.graphics.Pixmap rn_1764(com.badlogic.gdx.graphics.Pixmap rn_1765, int rn_1766, int rn_1767, int rn_1768, int rn_1769) {
		return ope.rn_1758(rn_1765, rn_1766, rn_1767, rn_1768 - rn_1766, rn_1769 - rn_1767);
	}

	public static final float[] rn_1776(float[] rn_1777) {
		float[] rn_1778 = (float[]) (new float[rn_1777.length]);
		rn_1778 [0] = rn_1777 [0];
		rn_1778 [1] = rn_1777 [3];
		rn_1778 [2] = rn_1777 [6];
		rn_1778 [3] = rn_1777 [1];
		rn_1778 [4] = rn_1777 [4];
		rn_1778 [5] = rn_1777 [7];
		rn_1778 [6] = rn_1777 [2];
		rn_1778 [7] = rn_1777 [5];
		rn_1778 [8] = rn_1777 [8];
		return rn_1778;
	}

	public static final android.graphics.Matrix rn_1782(android.graphics.Matrix rn_1783, int rn_1784, int rn_1785) {
		Matrix_.rn_3447(rn_1783, 0, rn_1785);
		Matrix_.rn_3436(rn_1783, 1, -1);
		Matrix_.rn_3411(rn_1783, 1, -1);
		Matrix_.rn_3422(rn_1783, 0, rn_1784);
		return rn_1783;
	}

	public static final float rn_1786(float rn_1787, float rn_1788, float rn_1789) {
		return rn_1788 - rn_1787 - rn_1789;
	}

	public static final com.badlogic.gdx.utils.Array rn_1790(com.badlogic.gdx.graphics.g2d.TextureRegion[] rn_1791) {
		com.badlogic.gdx.utils.Array<com.badlogic.gdx.graphics.g2d.TextureRegion> arr=new com.badlogic.gdx.utils.Array(rn_1791);
		return arr;
	}

	public static final int rn_1792(int rn_1793) {
		int[] rn_1794 = ope.rn_1736(rn_1793);
		int[] rn_1795 = (int[]) (new int[4]);
		rn_1795 [0] = rn_1794 [1];
		rn_1795 [1] = rn_1794 [2];
		rn_1795 [2] = rn_1794 [3];
		rn_1795 [3] = rn_1794 [0];
		return ope.rn_1738(rn_1795);
	}

	public static final void rn_1796(Object rn_1797) {
		rn_1797 = null;
		rn_6943.rn_7015();
	}

	public static final void rn_1798(String rn_1799) {
		rn_9755.rn_9778(rn_1683, rn_1799 + "\n");
	}

	public static final int[] rn_1818(float[] rn_1819) {
		float rn_1820 = rn_1819 [0];
		float rn_1821 = rn_1819 [1];
		float rn_1822 = rn_1819 [2];
		return hsvToRgb(rn_1820,rn_1821,rn_1822);
	}

	public static final void rn_1827(android.app.Activity rn_1828) {
		rn_1828.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		rn_1828.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
// 全屏展示

        rn_1828.getWindow().getDecorView().setSystemUiVisibility(
                android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
                        | android.view.View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
	}

	public static final int rn_1859(int rn_1860, int rn_1861) {
		int rn_1862 = op.rn_1026(rn_1860, -16777216);
		rn_1862 = 16777215 - rn_1862;
		rn_1861=rn_1861<<24;
		return -16777216 + rn_1862;
	}

	public static final android.view.MotionEvent rn_1875(long rn_1876, int rn_1877, float rn_1878, float rn_1879) {
		return android.view.MotionEvent.obtain(rn_1876,rn_1876+100,rn_1877,rn_1878,rn_1879,0);
	}
}