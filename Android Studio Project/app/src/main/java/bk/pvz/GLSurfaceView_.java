package bk.pvz;
import android.opengl.GLSurfaceView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import bk.pvz.fuckrenderer;
import bk.pvz.Canvas_;
import rn_4413.rn_4414.rn_4415.rn_8652;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4413.rn_4414.rn_4415.rn_5373;
import rn_4413.rn_4414.rn_4415.rn_8451;

public class GLSurfaceView_  extends android.opengl.GLSurfaceView implements View.OnClickListener {
	Context mContext = null;
	
    public GLSurfaceView_(Context context) {
        super(context);
        this.mContext = context;
		init();
		rn_3676();
    }
 
    public GLSurfaceView_(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		init();
		rn_3676();
    }
	
	private void init(){
	    this.setEGLContextClientVersion(2); 
		this.setRenderer(new fuckrenderer());
        this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
	}
	
		@Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return rn_3679(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }

	public static final GLSurfaceView_ rn_3663(android.content.Context rn_3664) {
		return new GLSurfaceView_(rn_3664);
	}

	public final int rn_3665() {
		return this.getWidth();
	}

	public final int rn_3666() {
		return this.getHeight();
	}

	public final void rn_3667(int rn_3668) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=rn_3668;
		this.setLayoutParams(params_1);
	}

	public final void rn_3669(int rn_3670) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=rn_3670;
		this.setLayoutParams(params_1);
	}

	public final void rn_3671() {
	}

	public final void rn_3672(rn_8451 rn_3673) {
		rn_3673.getView().addView(this);
	}

	public final boolean rn_3674(android.view.MotionEvent rn_3675) {
		return dispatchTouchEvent(rn_3675);
	}

	public interface rn_3676_r {
		void dispatch();
	}
	private rn_3676_r rn_3676_v;
	public final void rn_3676_s(rn_3676_r receiver) {
		this.rn_3676_v = receiver;
	}
	public final void rn_3676() {
		if (this.rn_3676_v != null) {
			this.rn_3676_v.dispatch();
		}
	}

	public interface rn_3677_r {
		void dispatch(android.graphics.Canvas rn_3678);
	}
	private rn_3677_r rn_3677_v;
	public final void rn_3677_s(rn_3677_r receiver) {
		this.rn_3677_v = receiver;
	}
	public final void rn_3677(android.graphics.Canvas rn_3678) {
		if (this.rn_3677_v != null) {
			this.rn_3677_v.dispatch(rn_3678);
		}
	}

	public interface rn_3679_r {
		boolean dispatch(android.view.MotionEvent rn_3680);
	}
	private rn_3679_r rn_3679_v;
	public final void rn_3679_s(rn_3679_r receiver) {
		this.rn_3679_v = receiver;
	}
	public final boolean rn_3679(android.view.MotionEvent rn_3680) {
		if (this.rn_3679_v != null) {
			return this.rn_3679_v.dispatch(rn_3680);
		}
		return false;
	}
}