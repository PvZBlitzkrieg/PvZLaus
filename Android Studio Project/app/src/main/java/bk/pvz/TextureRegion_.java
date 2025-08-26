package bk.pvz;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Texture_;

public class TextureRegion_ {
	public static com.badlogic.gdx.graphics.g2d.TextureRegion rn_3989(com.badlogic.gdx.graphics.Texture rn_3990) {
		return new TextureRegion(rn_3990);
	}

	public static com.badlogic.gdx.graphics.g2d.TextureRegion rn_3991(com.badlogic.gdx.graphics.Texture rn_3992, int rn_3993, int rn_3994) {
		return new TextureRegion(rn_3992,rn_3993,rn_3994);
	}

	public static com.badlogic.gdx.graphics.g2d.TextureRegion rn_3995(com.badlogic.gdx.graphics.g2d.TextureRegion r_obj, boolean rn_3996, boolean rn_3997) {
		r_obj.flip(rn_3996,rn_3997);
		return r_obj;
	}
}