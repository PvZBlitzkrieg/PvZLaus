package bk.pvz;
import bk.pvz.ApplicationAdapter_;
import rn_6840.rn_6841.rn_6842.rn_6928;

public class AA extends com.badlogic.gdx.ApplicationAdapter {
	@Override
	public void create () {
	    rn_3897();
	}
	
    @Override
	public void render () {
	    rn_3898();
	}
	
	@Override
	public void resize (int width, int height) {
	    rn_3899(width,height);
	}

	@Override
	public void pause () {
	    rn_3902();
	}

	@Override
	public void resume () {
	     rn_3903();
	}

	@Override
	public void dispose () {
	      rn_3904();
	}

	public void rn_3897() {
	}

	public interface rn_3898_r {
		void dispatch();
	}
	private rn_3898_r rn_3898_v;
	public final void rn_3898_s(rn_3898_r receiver) {
		this.rn_3898_v = receiver;
	}
	public final void rn_3898() {
		if (this.rn_3898_v != null) {
			this.rn_3898_v.dispatch();
		}
	}

	public void rn_3899(int rn_3900, int rn_3901) {
	}

	public void rn_3902() {
	}

	public void rn_3903() {
	}

	public void rn_3904() {
	}
}
