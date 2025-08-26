package rn_4581.rn_4582.rn_4583;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class rn_7502 {
	public final static android.os.Handler mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());

	public static final boolean rn_7508(boolean rn_7509) {
		if (rn_7509 == true) {
			return (false);
		} else {
			return (true);
		}
	}

	public static final boolean rn_7530() {
		return Thread.currentThread() == android.os.Looper.getMainLooper().getThread();
	}
}