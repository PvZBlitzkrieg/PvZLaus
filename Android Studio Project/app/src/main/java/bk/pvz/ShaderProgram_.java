package bk.pvz;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;

public class ShaderProgram_ {
	public static com.badlogic.gdx.graphics.glutils.ShaderProgram rn_4101(String rn_4102, String rn_4103) {
		return new ShaderProgram(rn_4102,rn_4103);
	}

	public static void rn_4104(boolean rn_4105) {
		ShaderProgram.pedantic=rn_4105;
	}

	public static void rn_4106(com.badlogic.gdx.graphics.glutils.ShaderProgram r_obj, String rn_4107, float rn_4108, float rn_4109, float rn_4110) {
		r_obj.setUniformf(rn_4107,rn_4108,rn_4109,rn_4110);
	}

	public static void rn_4111(com.badlogic.gdx.graphics.glutils.ShaderProgram r_obj, String rn_4112, float rn_4113, float rn_4114, float rn_4115, float rn_4116) {
		r_obj.setUniformf(rn_4112,rn_4113,rn_4114,rn_4115,rn_4116);
	}

	public static void rn_4117(com.badlogic.gdx.graphics.glutils.ShaderProgram r_obj, String rn_4118, float rn_4119) {
		r_obj.setUniformf(rn_4118,rn_4119);
	}
}