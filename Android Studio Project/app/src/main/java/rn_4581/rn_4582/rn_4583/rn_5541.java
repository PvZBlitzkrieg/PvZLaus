package rn_4581.rn_4582.rn_4583;
import android.os.Environment;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_7502;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class rn_5541 {
	private static android.widget.Toast toast;
	private static int delayed;

	public static void rn_5543(android.content.Context r_obj, Object rn_5544, boolean rn_5545) {
		if (rn_7502.rn_7530()) {
			android.widget.Toast.makeText(r_obj, String.valueOf(rn_5544), rn_5545 ? 1 : 0).show();
		} else {
			rn_7502.mainHandler.post(new Runnable() { public void run() {;
			android.widget.Toast.makeText(r_obj, String.valueOf(rn_5544), rn_5545 ? 1 : 0).show();
			}});
		}
	}
}