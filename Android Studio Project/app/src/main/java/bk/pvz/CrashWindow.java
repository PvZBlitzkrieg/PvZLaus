package bk.pvz;
import rn_4413.rn_4414.rn_4415.rn_9553;
import rn_6672.rn_6673.rn_6674.rn_6817;
import rn_4413.rn_4414.rn_4415.rn_9645;
import bk.pvz.Editor;
import bk.pvz.tempE;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_4413.rn_4414.rn_4415.rn_5240;
import rn_4413.rn_4414.rn_4415.rn_8498;
import rn_4413.rn_4414.rn_4415.rn_5373;

public class CrashWindow extends rn_9645 {
	public void onInit() {
		this.rn_1679 = new rn_8498(this);
		setLayout(rn_1679);
		this.rn_1680 = new tempE(this);
		this.rn_1679.rn_5474(-1);
		this.rn_1679.rn_5478(-1);
		rn_1679.addComponent(rn_1680);
		this.rn_1679.rn_8505(rn_1680, -9.0E-4);
		this.rn_1679.rn_8508(rn_1680, -5.0E-4);
		this.rn_1680.rn_5474(-1);
		this.rn_1680.rn_5478(-1);
	}

	public rn_8498 rn_1679;
	public tempE rn_1680;

	@Override
	public void rn_9647() {
		;
		try {;
		android.content.Intent rn_1682 = rn_9553.rn_9612(CrashWindow.this);
		rn_1680.rn_4(rn_4133.rn_6675(rn_5240.rn_5265(rn_1682, "error")));
		} catch (Exception e) {;
		rn_5373.rn_5375(CrashWindow.this, rn_6817.rn_6818(e), false);
		};
	}
}