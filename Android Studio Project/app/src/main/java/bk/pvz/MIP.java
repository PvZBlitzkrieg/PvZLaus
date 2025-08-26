package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ope;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_10083;
import rn_4581.rn_4582.rn_4583.rn_8820;

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
		rn_4124(screenX,screenY);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        //System.out.println("Touch up at: " + screenX + ", " + screenY);
		rn_4130(screenX,screenY);
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        //System.out.println("Touch dragged to: " + screenX + ", " + screenY);
		rn_4127(screenX,screenY);
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

	public final void rn_4124(int rn_4125, int rn_4126) {
		rn_4133(ope.rn_2002(rn_10083.rn_10089(), 0, rn_4125, rn_4126));
	}

	public final void rn_4127(int rn_4128, int rn_4129) {
		rn_4133(ope.rn_2002(rn_10083.rn_10089(), 2, rn_4128, rn_4129));
	}

	public final void rn_4130(int rn_4131, int rn_4132) {
		rn_4133(ope.rn_2002(rn_10083.rn_10089(), 1, rn_4131, rn_4132));
	}

	public interface rn_4133_r {
		void dispatch(android.view.MotionEvent rn_4134);
	}
	private rn_4133_r rn_4133_v;
	public final void rn_4133_s(rn_4133_r receiver) {
		this.rn_4133_v = receiver;
	}
	public final void rn_4133(android.view.MotionEvent rn_4134) {
		if (this.rn_4133_v != null) {
			this.rn_4133_v.dispatch(rn_4134);
		}
	}
}