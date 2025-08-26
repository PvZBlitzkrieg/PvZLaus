package bk.pvz;
import android.content.Intent;
import android.net.Uri;
import android.os.*;
import android.provider.Settings;

import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_4581.rn_4582.rn_4583.rn_5814;
import rn_4581.rn_4582.rn_4583.rn_9813;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_4294.rn_4295.rn_4296.rn_7697;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_9923;
import rn_4581.rn_4582.rn_4583.rn_8679;
import rn_4581.rn_4582.rn_4583.rn_5408;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.m;
import rn_4581.rn_4582.rn_4583.rn_5752;

public class L extends rn_9813 {
	public void onInit() {
		this.rn_331 = new rn_8679(this);
		setLayout(rn_331);
		this.rn_332 = new rn_5814(this);
		this.rn_331.rn_5642(-1);
		this.rn_331.rn_5646(-1);
		rn_331.addComponent(rn_332);
		this.rn_332.rn_5642(-1);
		this.rn_332.rn_5646(-1);
	}

	public rn_8679 rn_331;
	public rn_5814 rn_332;
	public boolean rn_340;
	public String rn_347;
	public int rn_348;
	public boolean rn_349;

	@Override
	public void rn_9814() {
	}

	@Override
	public void rn_9815() {
		this.rn_340 = false;
		this.rn_347 = "/storage/emulated/0/.pvz/log.";
		this.rn_348 = 0;
		this.rn_349 = false;
		;
		if (rn_349 == false) {
			if (rn_348 >= 5) {
				rn_332.rn_4(rn_332.rn_4() + "强制重启，等待一秒......");
				rn_349 = true;
				rn_358(1000);
				return ;
			}
			rn_348 = rn_348 + 1;
			rn_9721.rn_9789(L.this, 1);

			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {// android 11  且 不是已经被拒绝
				// 先判断有没有权限
				if (!Environment.isExternalStorageManager()) {
					Intent intent = new Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
					intent.setData(Uri.parse("package:" + getPackageName()));
					startActivityForResult(intent, 1024);

				}
			}

			try {;
				rn_9923.rn_10013("/sdcard/");
				rn_9923.rn_9966("/sdcard/test.pvz_laus", "test");
			} catch (Exception e) {;
				rn_5541.rn_5543(L.this, "error:权限测试失败", false);
				rn_340 = true;
				return ;
			};
			rn_5541.rn_5543(L.this, "权限测试成功", false);
			rn_340 = false;
			if (rn_3289.rn_6852(rn_9923.rn_9963(rn_347, "UTF-8"), "finish")) {
				rn_332.rn_4(rn_332.rn_4() + "游戏启动被阻止，请求重新解压资源：\n");
				rn_356();
				return ;
			}
			rn_9721.newActivity(L.this, m.class);
		}
	}

	@Override
	public void rn_9831(int rn_353, String[] rn_354, int[] rn_355) {
		if (rn_340) {
			L.this.rn_9815();
		}
	}

	public final void rn_356() {
		Thread thread = new Thread(new Runnable() { public void run() {;
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_332.rn_4(rn_332.rn_4() + "正在提取压缩文件：\n");
		}});
		rn_9923.rn_9986(L.this, "pvz", "/storage/emulated/0/.pvz/res.23");
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_332.rn_4(rn_332.rn_4() + "解压资源：\n");
		}});
		rn_7697.rn_7718("/storage/emulated/0/.pvz/res.23", "/storage/emulated/0/");
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_332.rn_4(rn_332.rn_4() + "解压完成，重新尝试启动......\n");
		}});
		String rn_357 = rn_9923.rn_9963(rn_347, "UTF-8");
		if (rn_3289.rn_6852(rn_357, "keep")) {
			rn_9923.rn_9966(rn_347, "finish");
		}
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_9815();
		}});
		}}); thread.start();
	}

	public final void rn_358(int rn_359) {
		new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(getApplication().getPackageName());
                        LaunchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(LaunchIntent);
                    }
                }, rn_359);
	}
}