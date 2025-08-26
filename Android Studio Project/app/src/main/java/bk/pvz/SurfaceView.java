package bk.pvz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Canvas_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_8619;
import rn_4581.rn_4582.rn_4583.rn_8820;

public class SurfaceView  extends android.view.SurfaceView implements SurfaceHolder.Callback, View.OnClickListener {
	Context mContext = null;
	private Thread drawingThread;
    private boolean isRunning;
    private int positionX = 0;
    private final int speedX = 5;
	
    public SurfaceView(Context context) {
        super(context);
        this.mContext = context;
		getHolder().addCallback(this);
		rn_3861();
    }
 
    public SurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		getHolder().addCallback(this);
		rn_3861();
    }
	
	@Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        drawingThread = new Thread(() -> {
            while (isRunning) {
                Canvas canvas = holder.lockHardwareCanvas();
                if (canvas != null) {
                    synchronized (holder) {
                        rn_3862(canvas);
                    }
                    holder.unlockCanvasAndPost(canvas);
                }
            }
        });
        drawingThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        // Handle surface changes if needed
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        isRunning = false;
        try {
            drawingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
    @Override  
    public boolean onTouchEvent(MotionEvent event) {  
		return rn_3864(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }

	public static final SurfaceView rn_3849(android.content.Context rn_3850) {
		return new SurfaceView(rn_3850);
	}

	public final int rn_3851() {
		return this.getWidth();
	}

	public final int rn_3852() {
		return this.getHeight();
	}

	public final void rn_3853(int rn_3854) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=rn_3854;
		this.setLayoutParams(params_1);
	}

	public final void rn_3855(int rn_3856) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=rn_3856;
		this.setLayoutParams(params_1);
	}

	public final void rn_3857(rn_8619 rn_3858) {
		rn_3858.getView().addView(this);
	}

	public final boolean rn_3859(android.view.MotionEvent rn_3860) {
		return dispatchTouchEvent(rn_3860);
	}

	public interface rn_3861_r {
		void dispatch();
	}
	private rn_3861_r rn_3861_v;
	public final void rn_3861_s(rn_3861_r receiver) {
		this.rn_3861_v = receiver;
	}
	public final void rn_3861() {
		if (this.rn_3861_v != null) {
			this.rn_3861_v.dispatch();
		}
	}

	public interface rn_3862_r {
		void dispatch(android.graphics.Canvas rn_3863);
	}
	private rn_3862_r rn_3862_v;
	public final void rn_3862_s(rn_3862_r receiver) {
		this.rn_3862_v = receiver;
	}
	public final void rn_3862(android.graphics.Canvas rn_3863) {
		if (this.rn_3862_v != null) {
			this.rn_3862_v.dispatch(rn_3863);
		}
	}

	public interface rn_3864_r {
		boolean dispatch(android.view.MotionEvent rn_3865);
	}
	private rn_3864_r rn_3864_v;
	public final void rn_3864_s(rn_3864_r receiver) {
		this.rn_3864_v = receiver;
	}
	public final boolean rn_3864(android.view.MotionEvent rn_3865) {
		if (this.rn_3864_v != null) {
			return this.rn_3864_v.dispatch(rn_3865);
		}
		return false;
	}
}