package bk.pvz;
import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_4581.rn_4582.rn_4583.rn_8666;
import rn_6840.rn_6841.rn_6842.rn_6985;
import rn_4581.rn_4582.rn_4583.rn_5408;
import rn_4581.rn_4582.rn_4583.rn_9813;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.tempE;
import rn_4581.rn_4582.rn_4583.rn_5752;

public class CrashWindow extends rn_9813 {
	public void onInit() {
		this.rn_1816 = new rn_8666(this);
		setLayout(rn_1816);
		this.rn_1817 = new tempE(this);
		this.rn_1816.rn_5642(-1);
		this.rn_1816.rn_5646(-1);
		rn_1816.addComponent(rn_1817);
		this.rn_1816.rn_8673(rn_1817, -9.0E-4);
		this.rn_1816.rn_8676(rn_1817, -5.0E-4);
		this.rn_1817.rn_5642(-1);
		this.rn_1817.rn_5646(-1);
	}

	public rn_8666 rn_1816;
	public tempE rn_1817;

	@Override
	public void rn_9815() {
		;
		try {;
		android.content.Intent rn_1819 = rn_9721.rn_9780(CrashWindow.this);
		rn_1817.rn_4(rn_4301.rn_6843(rn_5408.rn_5433(rn_1819, "error")));
		} catch (Exception e) {;
		rn_5541.rn_5543(CrashWindow.this, rn_6985.rn_6986(e), false);
		};
	}
}