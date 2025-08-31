package bk.pvz;
import bk.pvz.Nirvana;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Affine2_;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_4133;
import bk.pvz.Sprite_;
import rn_6672.rn_6673.rn_6674.rn_6767;
import bk.pvz.Texture_;
import bk.pvz.Pixmap_;
import bk.pvz.ShaderProgram_;
import bk.pvz.TextureRegion_;
import bk.pvz.Batch_;
import rn_4413.rn_4414.rn_4415.rn_9915;
import bk.pvz.Matrix4_;
import bk.pvz.ope;
import bk.pvz.Matrix_;
import rn_6672.rn_6673.rn_6674.rn_6757;
import bk.pvz.Matrix3_;

public class SpriteBatch {
	public static void rn_3832(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj) {
		r_obj.begin();
	}

	public static com.badlogic.gdx.graphics.g2d.SpriteBatch rn_3833(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.g2d.TextureRegion rn_3834, float rn_3835, float rn_3836) {
		r_obj.draw(rn_3834,rn_3835,rn_3836,0,0,rn_3834.getRegionWidth(),rn_3834.getRegionHeight(),1.0f,1f,0f);
		return r_obj;
	}

	public static void rn_3837(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Pixmap rn_3838, android.graphics.Matrix rn_3839, float rn_3840, int rn_3841) {
		SpriteBatch.rn_3853(r_obj, Texture_.rn_3891(rn_3838), rn_3839, rn_3840, rn_3841, null);
	}

	public static void rn_3853(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Texture rn_3854, android.graphics.Matrix rn_3855, float rn_3856, int rn_3857, Nirvana rn_3858) {
		float[] rn_3859 = {1.0F, 1, 1, rn_3856};
		SpriteBatch.rn_3866(r_obj, rn_3854, rn_3855, rn_3859, rn_3857, rn_3858, false);
	}

	public static void rn_3860(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Texture rn_3861, float rn_3862, float rn_3863, float rn_3864, float rn_3865) {
		r_obj.draw(rn_3861,rn_3862,rn_3863,rn_3864,rn_3865);
	}

	public static void rn_3866(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Texture rn_3867, android.graphics.Matrix rn_3868, float[] rn_3869, int rn_3870, Nirvana rn_3871, boolean rn_3872) {
		float[] rn_3873 = Matrix_.rn_3398(ope.rn_1782(rn_3868, rn_3870, Texture_.rn_3898(rn_3867)));
		rn_3873 = ope.rn_1776(rn_3873);
		com.badlogic.gdx.math.Affine2 rn_3874 = Affine2_.rn_3889(Matrix3_.rn_3952(rn_3873));
		com.badlogic.gdx.graphics.g2d.SpriteBatch rn_3875 = null;
		rn_3875=r_obj;
		com.badlogic.gdx.graphics.g2d.Sprite rn_3876 = Sprite_.rn_3818(rn_3867);
		com.badlogic.gdx.graphics.glutils.ShaderProgram rn_3877 = SpriteBatch.rn_3879(r_obj);
		SpriteBatch.rn_3880(rn_3875, rn_3876, Texture_.rn_3897(rn_3867), Texture_.rn_3898(rn_3867), rn_3874);
		ShaderProgram_.rn_3949(rn_3877, "u_opacity", rn_3869 [3]);
		ShaderProgram_.rn_3938(rn_3877, "u_rgbFactors", rn_3869 [0], rn_3869 [1], rn_3869 [2]);
		if (rn_3872) {
			ope.rn_1798("ˇ   " + rn_3869 [1]);
		}
		long rn_3878 = rn_9915.rn_9922();
		if (rn_3871 != null) {
			rn_3871.nullait = rn_3871.nullait + rn_9915.rn_9922() - rn_3878;
		}
	}

	public static com.badlogic.gdx.graphics.glutils.ShaderProgram rn_3879(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj) {
		return r_obj.getShader();
	}

	public static void rn_3880(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.g2d.TextureRegion rn_3881, int rn_3882, int rn_3883, com.badlogic.gdx.math.Affine2 rn_3884) {
		r_obj.draw(rn_3881,rn_3882,rn_3883,rn_3884);
	}

	public static void rn_3886(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.math.Matrix4 rn_3887) {
		r_obj.setTransformMatrix(rn_3887);
	}

	public static void rn_3888(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj) {
		r_obj.end();
	}
}