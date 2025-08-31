package bk.pvz;
import bk.pvz.ApplicationAdapter_;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class AA extends com.badlogic.gdx.ApplicationAdapter {
	@Override
	public void create () {
	    rn_3729();
	}
	
    @Override
	public void render () {
	    rn_3730();
	}
	
	@Override
	public void resize (int width, int height) {
	    rn_3731(width,height);
	}

	@Override
	public void pause () {
	    rn_3734();
	}

	@Override
	public void resume () {
	     rn_3735();
	}

	@Override
	public void dispose () {
	      rn_3736();
	}

	public void rn_3729() {
	}

	public interface rn_3730_r {
		void dispatch();
	}
	private rn_3730_r rn_3730_v;
	public final void rn_3730_s(rn_3730_r receiver) {
		this.rn_3730_v = receiver;
	}
	public final void rn_3730() {
		if (this.rn_3730_v != null) {
			this.rn_3730_v.dispatch();
		}
	}

	public void rn_3731(int rn_3732, int rn_3733) {
	}

	public void rn_3734() {
	}

	public void rn_3735() {
	}

	public void rn_3736() {
	}
}