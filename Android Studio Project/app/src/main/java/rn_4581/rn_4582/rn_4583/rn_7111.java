package rn_4581.rn_4582.rn_4583;
import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import android.view.*;
import android.util.*;
import android.net.*;
import android.database.*;
import android.provider.*;
import android.content.*;
import android.content.res.*;
import android.os.*;
import android.system.*;
import android.graphics.*;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_6301;

public class rn_7111 {
	public static final int rn_7112(android.content.Context rn_7113) {
		WindowManager wm = (WindowManager) rn_7113.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics outMetrics = new DisplayMetrics();
		wm.getDefaultDisplay().getRealMetrics(outMetrics);
		return outMetrics.widthPixels;
	}

	public static final int rn_7114(android.content.Context rn_7115) {
		WindowManager wm = (WindowManager) rn_7115.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics outMetrics = new DisplayMetrics();
		wm.getDefaultDisplay().getRealMetrics(outMetrics);
		return outMetrics.heightPixels;
	}

	public static final int rn_7118(android.content.Context rn_7119) {
		if (!rn_7126(rn_7119)) {
				return rn_7114(rn_7119) - rn_7122(rn_7119);
		  }
		  DisplayMetrics outMetrics = new DisplayMetrics();
		  WindowManager wm = (WindowManager) rn_7119.getSystemService(Context.WINDOW_SERVICE);
		  wm.getDefaultDisplay().getMetrics(outMetrics);
		  int heightPixel = outMetrics.heightPixels;
		  int statusBarHeight = rn_7122(rn_7119);
		  if (Build.MANUFACTURER.equals("Xiaomi") && Settings.Global.getInt(rn_7119.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
				return heightPixel + rn_7124(rn_7119) - statusBarHeight;
		  }
		  if (rn_7124(rn_7119) + heightPixel < rn_7114(rn_7119)) {
				heightPixel = heightPixel + statusBarHeight;
		  }
		  return heightPixel - statusBarHeight;
	}

	public static final int rn_7122(android.content.Context rn_7123) {
		if (Build.VERSION.SDK_INT < 29) {
				try {
					 Class<?> c = Class.forName("com.android.internal.R$dimen");
					 return rn_7123.getResources().getDimensionPixelSize(Integer.parseInt(c.getField("status_bar_height").get(c.newInstance()).toString()));
				} catch (Exception e) {
					 e.printStackTrace();
					 return 0;
				}
		  } else {
				Resources resources = rn_7123.getResources();
				return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
		  }
	}

	public static final int rn_7124(android.content.Context rn_7125) {
		if (Build.VERSION.SDK_INT < 17) {
				return 0;
		  }
		  Resources resources = rn_7125.getResources();
		  return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
	}

	public static final boolean rn_7126(android.content.Context rn_7127) {
		if (Build.VERSION.SDK_INT < 17) {
				return false;
		  }
		  if (Build.MANUFACTURER.equals("Xiaomi") && Settings.Global.getInt(rn_7127.getContentResolver(), "force_fsg_nav_bar", 0) != 0) {
				return false;
		  }
		  DisplayMetrics outMetrics = new DisplayMetrics();
		  WindowManager wm = (WindowManager) rn_7127.getSystemService(Context.WINDOW_SERVICE);
		  wm.getDefaultDisplay().getRealMetrics(outMetrics);
		  int height1 = outMetrics.heightPixels;
		  wm.getDefaultDisplay().getMetrics(outMetrics);
		  if ((height1 - outMetrics.heightPixels) - rn_7122(rn_7127) > 0) {
				return true;
		  }
		  return false;
	}

	public static final void rn_7183() {
		System.gc();
	}
}