package bk.pvz;
import android.view.MotionEvent;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Toast;
import android.graphics.*;
import java.io.File;
import android.view.View;
import android.widget.LinearLayout;
import bk.pvz.Canvas_;
import rn_4413.rn_4414.rn_4415.rn_8652;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4413.rn_4414.rn_4415.rn_5373;
import rn_4413.rn_4414.rn_4415.rn_8451;

public class v  extends android.view.View implements View.OnClickListener {
	Context mContext = null;
	
    public v(Context context) {
        super(context);
        this.mContext = context;
		rn_1673();
    }
 
    public v(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		rn_1673();
    }
	
    @Override
    protected void onDraw(Canvas canvas) {
	    rn_1674(canvas);
	}
	
    @Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return rn_1677(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }

	public static final v rn_1660(android.content.Context rn_1661) {
		return new v(rn_1661);
	}

	public final void rn_1662() {
		invalidate();
	}

	public final int rn_1663() {
		return this.getWidth();
	}

	public final int rn_1664() {
		return this.getHeight();
	}

	public final void rn_1665(int rn_1666) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=rn_1666;
		this.setLayoutParams(params_1);
	}

	public final void rn_1667(int rn_1668) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=rn_1668;
		this.setLayoutParams(params_1);
	}

	public final void rn_1669(rn_8451 rn_1670) {
		rn_1670.getView().addView(this);
	}

	public final boolean rn_1671(android.view.MotionEvent rn_1672) {
		return dispatchTouchEvent(rn_1672);
	}

	public interface rn_1673_r {
		void dispatch();
	}
	private rn_1673_r rn_1673_v;
	public final void rn_1673_s(rn_1673_r receiver) {
		this.rn_1673_v = receiver;
	}
	public final void rn_1673() {
		if (this.rn_1673_v != null) {
			this.rn_1673_v.dispatch();
		}
	}

	public interface rn_1674_r {
		void dispatch(android.graphics.Canvas rn_1675);
	}
	private rn_1674_r rn_1674_v;
	public final void rn_1674_s(rn_1674_r receiver) {
		this.rn_1674_v = receiver;
	}
	public final void rn_1674(android.graphics.Canvas rn_1675) {
		if (this.rn_1674_v != null) {
			this.rn_1674_v.dispatch(rn_1675);
		}
	}

	public interface rn_1676_r {
		void dispatch();
	}
	private rn_1676_r rn_1676_v;
	public final void rn_1676_s(rn_1676_r receiver) {
		this.rn_1676_v = receiver;
	}
	public final void rn_1676() {
		if (this.rn_1676_v != null) {
			this.rn_1676_v.dispatch();
		}
	}

	public interface rn_1677_r {
		boolean dispatch(android.view.MotionEvent rn_1678);
	}
	private rn_1677_r rn_1677_v;
	public final void rn_1677_s(rn_1677_r receiver) {
		this.rn_1677_v = receiver;
	}
	public final boolean rn_1677(android.view.MotionEvent rn_1678) {
		if (this.rn_1677_v != null) {
			return this.rn_1677_v.dispatch(rn_1678);
		}
		return false;
	}
}