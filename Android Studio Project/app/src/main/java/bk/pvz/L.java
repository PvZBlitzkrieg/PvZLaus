package bk.pvz;
import android.content.Intent;
import android.os.*;
import rn_4413.rn_4414.rn_4415.rn_9553;
import rn_4413.rn_4414.rn_4415.rn_9645;
import bk.pvz.Editor;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_4413.rn_4414.rn_4415.rn_9755;
import rn_4413.rn_4414.rn_4415.rn_5240;
import rn_4413.rn_4414.rn_4415.rn_5373;
import rn_4413.rn_4414.rn_4415.rn_8511;
import rn_4126.rn_4127.rn_4128.rn_7529;
import bk.pvz.m;
import bk.pvz.tempE;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class L extends rn_9645 {
	public void onInit() {
		this.rn_331 = new rn_8511(this);
		setLayout(rn_331);
		this.rn_332 = new tempE(this);
		this.rn_331.rn_5474(-1);
		this.rn_331.rn_5478(-1);
		rn_331.addComponent(rn_332);
		this.rn_332.rn_5474(-1);
		this.rn_332.rn_5478(-1);
	}

	public rn_8511 rn_331;
	public tempE rn_332;
	public boolean rn_340;
	public String rn_347;
	public int rn_348;
	public boolean rn_349;

	@Override
	public void rn_9646() {
	}

	@Override
	public void rn_9647() {
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
			rn_9553.rn_9621(L.this, 1);
			try {;
			rn_9755.rn_9845("/sdcard/");
			rn_9755.rn_9798("/sdcard/test.pvz_laus", "test");
			} catch (Exception e) {;
			rn_5373.rn_5375(L.this, "error:权限测试失败", false);
			rn_340 = true;
			return ;
			};
			rn_340 = false;
			if (rn_3081.rn_6684(rn_9755.rn_9795(rn_347, "UTF-8"), "finish")) {
				rn_332.rn_4(rn_332.rn_4() + "游戏启动被阻止，请求重新解压资源：\n");
				rn_356();
				return ;
			}
			if (null == null) {
			rn_9553.newActivity(L.this, m.class);
		} else {
			rn_9553.newActivity2(L.this, m.class, null);
		};
			;
		}
	}

	@Override
	public void rn_9663(int rn_353, String[] rn_354, int[] rn_355) {
		if (rn_340) {
			L.this.rn_9647();
		}
	}

	public final void rn_356() {
		Thread thread = new Thread(new Runnable() { public void run() {;
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_332.rn_4(rn_332.rn_4() + "正在提取压缩文件：\n");
		}});
		rn_9755.rn_9818(L.this, "pvz", "/storage/emulated/0/.pvz/res.23");
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_332.rn_4(rn_332.rn_4() + "解压资源：\n");
		}});
		rn_7529.rn_7550("/storage/emulated/0/.pvz/res.23", "/storage/emulated/0/");
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_332.rn_4(rn_332.rn_4() + "解压完成，重新尝试启动......\n");
		}});
		String rn_357 = rn_9755.rn_9795(rn_347, "UTF-8");
		if (rn_3081.rn_6684(rn_357, "keep")) {
			rn_9755.rn_9798(rn_347, "finish");
		}
		L.this.runOnUiThread(new Runnable() { public void run() {;
		rn_9647();
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