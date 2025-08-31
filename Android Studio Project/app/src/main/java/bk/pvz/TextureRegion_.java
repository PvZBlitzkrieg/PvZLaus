package bk.pvz;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import bk.pvz.Texture_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class TextureRegion_ {
	public static com.badlogic.gdx.graphics.g2d.TextureRegion rn_3821(com.badlogic.gdx.graphics.Texture rn_3822) {
		return new TextureRegion(rn_3822);
	}

	public static com.badlogic.gdx.graphics.g2d.TextureRegion rn_3823(com.badlogic.gdx.graphics.Texture rn_3824, int rn_3825, int rn_3826) {
		return new TextureRegion(rn_3824,rn_3825,rn_3826);
	}

	public static com.badlogic.gdx.graphics.g2d.TextureRegion rn_3827(com.badlogic.gdx.graphics.g2d.TextureRegion r_obj, boolean rn_3828, boolean rn_3829) {
		r_obj.flip(rn_3828,rn_3829);
		return r_obj;
	}
}