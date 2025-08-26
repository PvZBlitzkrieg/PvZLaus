package bk.pvz;
import bk.pvz.Pixmap_;
import bk.pvz.ope;
import bk.pvz.Matrix3_;
import bk.pvz.Matrix4_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Batch_;
import bk.pvz.ShaderProgram_;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Affine2_;
import bk.pvz.Matrix_;
import bk.pvz.Texture_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_4581.rn_4582.rn_4583.rn_10083;
import rn_6840.rn_6841.rn_6842.rn_6935;
import bk.pvz.TextureRegion_;
import bk.pvz.Nirvana;
import bk.pvz.Sprite_;

public class SpriteBatch {
	public static void rn_4000(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj) {
		r_obj.begin();
	}

	public static com.badlogic.gdx.graphics.g2d.SpriteBatch rn_4001(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.g2d.TextureRegion rn_4002, float rn_4003, float rn_4004) {
		r_obj.draw(rn_4002,rn_4003,rn_4004,0,0,rn_4002.getRegionWidth(),rn_4002.getRegionHeight(),1.0f,1f,0f);
		return r_obj;
	}

	public static void rn_4005(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Pixmap rn_4006, android.graphics.Matrix rn_4007, float rn_4008, int rn_4009) {
		SpriteBatch.rn_4021(r_obj, Texture_.rn_4059(rn_4006), rn_4007, rn_4008, rn_4009, null);
	}

	public static void rn_4021(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Texture rn_4022, android.graphics.Matrix rn_4023, float rn_4024, int rn_4025, Nirvana rn_4026) {
		float[] rn_4027 = {1.0F, 1, 1, rn_4024};
		SpriteBatch.rn_4034(r_obj, rn_4022, rn_4023, rn_4027, rn_4025, rn_4026, false);
	}

	public static void rn_4028(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Texture rn_4029, float rn_4030, float rn_4031, float rn_4032, float rn_4033) {
		r_obj.draw(rn_4029,rn_4030,rn_4031,rn_4032,rn_4033);
	}

	public static void rn_4034(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.Texture rn_4035, android.graphics.Matrix rn_4036, float[] rn_4037, int rn_4038, Nirvana rn_4039, boolean rn_4040) {
		float[] rn_4041 = Matrix_.rn_3579(ope.rn_1909(rn_4036, rn_4038, Texture_.rn_4066(rn_4035)));
		rn_4041 = ope.rn_1903(rn_4041);
		com.badlogic.gdx.math.Affine2 rn_4042 = Affine2_.rn_4057(Matrix3_.rn_4120(rn_4041));
		com.badlogic.gdx.graphics.g2d.SpriteBatch rn_4043 = null;
		rn_4043=r_obj;
		com.badlogic.gdx.graphics.g2d.Sprite rn_4044 = Sprite_.rn_3986(rn_4035);
		com.badlogic.gdx.graphics.glutils.ShaderProgram rn_4045 = SpriteBatch.rn_4047(r_obj);
		SpriteBatch.rn_4048(rn_4043, rn_4044, Texture_.rn_4065(rn_4035), Texture_.rn_4066(rn_4035), rn_4042);
		ShaderProgram_.rn_4117(rn_4045, "u_opacity", rn_4037 [3]);
		ShaderProgram_.rn_4106(rn_4045, "u_rgbFactors", rn_4037 [0], rn_4037 [1], rn_4037 [2]);
		if (rn_4040) {
			ope.rn_1925("ˇ   " + rn_4037 [1]);
		}
		long rn_4046 = rn_10083.rn_10090();
		if (rn_4039 != null) {
			rn_4039.rn_996 = rn_4039.rn_996 + rn_10083.rn_10090() - rn_4046;
		}
	}

	public static com.badlogic.gdx.graphics.glutils.ShaderProgram rn_4047(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj) {
		return r_obj.getShader();
	}

	public static void rn_4048(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.graphics.g2d.TextureRegion rn_4049, int rn_4050, int rn_4051, com.badlogic.gdx.math.Affine2 rn_4052) {
		r_obj.draw(rn_4049,rn_4050,rn_4051,rn_4052);
	}

	public static void rn_4054(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj, com.badlogic.gdx.math.Matrix4 rn_4055) {
		r_obj.setTransformMatrix(rn_4055);
	}

	public static void rn_4056(com.badlogic.gdx.graphics.g2d.SpriteBatch r_obj) {
		r_obj.end();
	}
}