package bk.pvz;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Texture_;

public class FrameBuffer_ {
	public static com.badlogic.gdx.graphics.glutils.FrameBuffer rn_4095(int rn_4096, int rn_4097) {
		return new FrameBuffer(Pixmap.Format.RGB888,rn_4096,rn_4097,true);
	}

	public static void rn_4098(com.badlogic.gdx.graphics.glutils.FrameBuffer r_obj) {
		r_obj.begin();
	}

	public static void rn_4099(com.badlogic.gdx.graphics.glutils.FrameBuffer r_obj) {
		r_obj.end();
	}

	public static com.badlogic.gdx.graphics.Texture rn_4100(com.badlogic.gdx.graphics.glutils.FrameBuffer r_obj) {
		return r_obj.getColorBufferTexture();
	}
}