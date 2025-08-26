package bk.pvz;
import android.opengl.GLSurfaceView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.fuckrenderer;
import bk.pvz.Canvas_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_8619;
import rn_4581.rn_4582.rn_4583.rn_8820;

public class GLSurfaceView_  extends android.opengl.GLSurfaceView implements View.OnClickListener {
	Context mContext = null;
	
    public GLSurfaceView_(Context context) {
        super(context);
        this.mContext = context;
		init();
		rn_3844();
    }
 
    public GLSurfaceView_(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		init();
		rn_3844();
    }
	
	private void init(){
	    this.setEGLContextClientVersion(2); 
		this.setRenderer(new fuckrenderer());
        this.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
	}
	
		@Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return rn_3847(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }

	public static final GLSurfaceView_ rn_3831(android.content.Context rn_3832) {
		return new GLSurfaceView_(rn_3832);
	}

	public final int rn_3833() {
		return this.getWidth();
	}

	public final int rn_3834() {
		return this.getHeight();
	}

	public final void rn_3835(int rn_3836) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=rn_3836;
		this.setLayoutParams(params_1);
	}

	public final void rn_3837(int rn_3838) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=rn_3838;
		this.setLayoutParams(params_1);
	}

	public final void rn_3839() {
	}

	public final void rn_3840(rn_8619 rn_3841) {
		rn_3841.getView().addView(this);
	}

	public final boolean rn_3842(android.view.MotionEvent rn_3843) {
		return dispatchTouchEvent(rn_3843);
	}

	public interface rn_3844_r {
		void dispatch();
	}
	private rn_3844_r rn_3844_v;
	public final void rn_3844_s(rn_3844_r receiver) {
		this.rn_3844_v = receiver;
	}
	public final void rn_3844() {
		if (this.rn_3844_v != null) {
			this.rn_3844_v.dispatch();
		}
	}

	public interface rn_3845_r {
		void dispatch(android.graphics.Canvas rn_3846);
	}
	private rn_3845_r rn_3845_v;
	public final void rn_3845_s(rn_3845_r receiver) {
		this.rn_3845_v = receiver;
	}
	public final void rn_3845(android.graphics.Canvas rn_3846) {
		if (this.rn_3845_v != null) {
			this.rn_3845_v.dispatch(rn_3846);
		}
	}

	public interface rn_3847_r {
		boolean dispatch(android.view.MotionEvent rn_3848);
	}
	private rn_3847_r rn_3847_v;
	public final void rn_3847_s(rn_3847_r receiver) {
		this.rn_3847_v = receiver;
	}
	public final boolean rn_3847(android.view.MotionEvent rn_3848) {
		if (this.rn_3847_v != null) {
			return this.rn_3847_v.dispatch(rn_3848);
		}
		return false;
	}
}