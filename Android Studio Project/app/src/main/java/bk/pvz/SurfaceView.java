package bk.pvz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.View;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import bk.pvz.Canvas_;
import rn_4413.rn_4414.rn_4415.rn_8652;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4413.rn_4414.rn_4415.rn_5373;
import rn_4413.rn_4414.rn_4415.rn_8451;

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
		rn_3693();
    }
 
    public SurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
		getHolder().addCallback(this);
		rn_3693();
    }
	
	@Override
    public void surfaceCreated(SurfaceHolder holder) {
        isRunning = true;
        drawingThread = new Thread(() -> {
            while (isRunning) {
                Canvas canvas = holder.lockHardwareCanvas();
                if (canvas != null) {
                    synchronized (holder) {
                        rn_3694(canvas);
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
		return rn_3696(event);
	}
	
	@Override
    public void onClick(View view) {
        //Toast.makeText(mContext, "\n5\n".split("\n")[], 0).show();
    }

	public static final SurfaceView rn_3681(android.content.Context rn_3682) {
		return new SurfaceView(rn_3682);
	}

	public final int rn_3683() {
		return this.getWidth();
	}

	public final int rn_3684() {
		return this.getHeight();
	}

	public final void rn_3685(int rn_3686) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.width=rn_3686;
		this.setLayoutParams(params_1);
	}

	public final void rn_3687(int rn_3688) {
		LinearLayout.LayoutParams params_1= (LinearLayout.LayoutParams) this.getLayoutParams();
		params_1.height=rn_3688;
		this.setLayoutParams(params_1);
	}

	public final void rn_3689(rn_8451 rn_3690) {
		rn_3690.getView().addView(this);
	}

	public final boolean rn_3691(android.view.MotionEvent rn_3692) {
		return dispatchTouchEvent(rn_3692);
	}

	public interface rn_3693_r {
		void dispatch();
	}
	private rn_3693_r rn_3693_v;
	public final void rn_3693_s(rn_3693_r receiver) {
		this.rn_3693_v = receiver;
	}
	public final void rn_3693() {
		if (this.rn_3693_v != null) {
			this.rn_3693_v.dispatch();
		}
	}

	public interface rn_3694_r {
		void dispatch(android.graphics.Canvas rn_3695);
	}
	private rn_3694_r rn_3694_v;
	public final void rn_3694_s(rn_3694_r receiver) {
		this.rn_3694_v = receiver;
	}
	public final void rn_3694(android.graphics.Canvas rn_3695) {
		if (this.rn_3694_v != null) {
			this.rn_3694_v.dispatch(rn_3695);
		}
	}

	public interface rn_3696_r {
		boolean dispatch(android.view.MotionEvent rn_3697);
	}
	private rn_3696_r rn_3696_v;
	public final void rn_3696_s(rn_3696_r receiver) {
		this.rn_3696_v = receiver;
	}
	public final boolean rn_3696(android.view.MotionEvent rn_3697) {
		if (this.rn_3696_v != null) {
			return this.rn_3696_v.dispatch(rn_3697);
		}
		return false;
	}
}