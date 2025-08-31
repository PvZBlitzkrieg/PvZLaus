package bk.pvz;
import rn_4413.rn_4414.rn_4415.rn_8652;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_4413.rn_4414.rn_4415.rn_9915;
import bk.pvz.ope;

public class MIP implements com.badlogic.gdx.InputProcessor {
	@Override
    public boolean keyDown(int keycode) {
	/*
        if (keycode == Input.Keys.SPACE) {
            System.out.println("Space key pressed");
        }
		*/
        return true; // 返回 true 表示事件已处理
    }

    @Override
    public boolean keyUp(int keycode) {
	/*
        if (keycode == Input.Keys.SPACE) {
            System.out.println("Space key released");
        }*/
        return true;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.println("Key typed: " + character);
        return true;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        //System.out.println("Touch down at: " + screenX + ", " + screenY);
		rn_3956(screenX,screenY);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        //System.out.println("Touch up at: " + screenX + ", " + screenY);
		rn_3962(screenX,screenY);
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        //System.out.println("Touch dragged to: " + screenX + ", " + screenY);
		rn_3959(screenX,screenY);
        return true;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        System.out.println("Mouse moved to: " + screenX + ", " + screenY);
        return true;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        System.out.println("Scrolled: " + amountX + ", " + amountY);
        return true;
    }

	public final void rn_3956(int rn_3957, int rn_3958) {
		rn_3965(ope.rn_1875(rn_9915.rn_9921(), 0, rn_3957, rn_3958));
	}

	public final void rn_3959(int rn_3960, int rn_3961) {
		rn_3965(ope.rn_1875(rn_9915.rn_9921(), 2, rn_3960, rn_3961));
	}

	public final void rn_3962(int rn_3963, int rn_3964) {
		rn_3965(ope.rn_1875(rn_9915.rn_9921(), 1, rn_3963, rn_3964));
	}

	public interface rn_3965_r {
		void dispatch(android.view.MotionEvent rn_3966);
	}
	private rn_3965_r rn_3965_v;
	public final void rn_3965_s(rn_3965_r receiver) {
		this.rn_3965_v = receiver;
	}
	public final void rn_3965(android.view.MotionEvent rn_3966) {
		if (this.rn_3965_v != null) {
			this.rn_3965_v.dispatch(rn_3966);
		}
	}
}