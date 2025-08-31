package bk.pvz;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import bk.pvz.Texture_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class FrameBuffer_ {
	public static com.badlogic.gdx.graphics.glutils.FrameBuffer rn_3927(int rn_3928, int rn_3929) {
		return new FrameBuffer(Pixmap.Format.RGB888,rn_3928,rn_3929,true);
	}

	public static void rn_3930(com.badlogic.gdx.graphics.glutils.FrameBuffer r_obj) {
		r_obj.begin();
	}

	public static void rn_3931(com.badlogic.gdx.graphics.glutils.FrameBuffer r_obj) {
		r_obj.end();
	}

	public static com.badlogic.gdx.graphics.Texture rn_3932(com.badlogic.gdx.graphics.glutils.FrameBuffer r_obj) {
		return r_obj.getColorBufferTexture();
	}
}