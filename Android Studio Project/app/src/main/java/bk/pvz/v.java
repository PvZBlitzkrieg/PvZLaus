package bk.pvz;
import android.view.MotionEvent;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
import android.graphics.*;
import java.io.File;
import android.view.View;
import android.widget.LinearLayout;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Canvas_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_8619;
import rn_4581.rn_4582.rn_4583.rn_8820;

public class v  extends android.view.View implements View.OnClickListener {
	Context mContext = null;
	
    public v(Context context) {
        super(context);
        this.mContext = context;
		rn_1810();
    }
 
    public v(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		rn_1810();
    }
	
    @Override
    protected void onDraw(Canvas canvas) {
	    rn_1811(canvas);
	}
	
    @Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return rn_1814(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }

	public static final v rn_1797(android.content.Context rn_1798) {
		return new v(rn_1798);
	}

	public final void rn_1799() {
		invalidate();
	}

	public final int rn_1800() {
		return this.getWidth();
	}

	public final int rn_1801() {
		return this.getHeight();
	}

	public final void rn_1802(int rn_1803) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=rn_1803;
		this.setLayoutParams(params_1);
	}

	public final void rn_1804(int rn_1805) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=rn_1805;
		this.setLayoutParams(params_1);
	}

	public final void rn_1806(rn_8619 rn_1807) {
		rn_1807.getView().addView(this);
	}

	public final boolean rn_1808(android.view.MotionEvent rn_1809) {
		return dispatchTouchEvent(rn_1809);
	}

	public interface rn_1810_r {
		void dispatch();
	}
	private rn_1810_r rn_1810_v;
	public final void rn_1810_s(rn_1810_r receiver) {
		this.rn_1810_v = receiver;
	}
	public final void rn_1810() {
		if (this.rn_1810_v != null) {
			this.rn_1810_v.dispatch();
		}
	}

	public interface rn_1811_r {
		void dispatch(android.graphics.Canvas rn_1812);
	}
	private rn_1811_r rn_1811_v;
	public final void rn_1811_s(rn_1811_r receiver) {
		this.rn_1811_v = receiver;
	}
	public final void rn_1811(android.graphics.Canvas rn_1812) {
		if (this.rn_1811_v != null) {
			this.rn_1811_v.dispatch(rn_1812);
		}
	}

	public interface rn_1813_r {
		void dispatch();
	}
	private rn_1813_r rn_1813_v;
	public final void rn_1813_s(rn_1813_r receiver) {
		this.rn_1813_v = receiver;
	}
	public final void rn_1813() {
		if (this.rn_1813_v != null) {
			this.rn_1813_v.dispatch();
		}
	}

	public interface rn_1814_r {
		boolean dispatch(android.view.MotionEvent rn_1815);
	}
	private rn_1814_r rn_1814_v;
	public final void rn_1814_s(rn_1814_r receiver) {
		this.rn_1814_v = receiver;
	}
	public final boolean rn_1814(android.view.MotionEvent rn_1815) {
		if (this.rn_1814_v != null) {
			return this.rn_1814_v.dispatch(rn_1815);
		}
		return false;
	}
}