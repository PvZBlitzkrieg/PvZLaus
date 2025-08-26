package rn_4581.rn_4582.rn_4583;
import android.content.Context;
import rn_4581.rn_4582.rn_4583.rn_5608;

public class rn_5612 extends rn_5608 {
	protected Context context;

    public rn_5612(Context context) {
        this(context, true);
    }
	
	public rn_5612(Context context, boolean dispatchEvent) {
        this.context = context;
		if (dispatchEvent) {
		    onInit();
		    rn_5613();
		}
    }
	
	protected void onInit() {
	}

	public void rn_5613() {
	}
}