package bk.pvz;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class ShaderProgram_ {
	public static com.badlogic.gdx.graphics.glutils.ShaderProgram rn_3933(String rn_3934, String rn_3935) {
		return new ShaderProgram(rn_3934,rn_3935);
	}

	public static void rn_3936(boolean rn_3937) {
		ShaderProgram.pedantic=rn_3937;
	}

	public static void rn_3938(com.badlogic.gdx.graphics.glutils.ShaderProgram r_obj, String rn_3939, float rn_3940, float rn_3941, float rn_3942) {
		r_obj.setUniformf(rn_3939,rn_3940,rn_3941,rn_3942);
	}

	public static void rn_3943(com.badlogic.gdx.graphics.glutils.ShaderProgram r_obj, String rn_3944, float rn_3945, float rn_3946, float rn_3947, float rn_3948) {
		r_obj.setUniformf(rn_3944,rn_3945,rn_3946,rn_3947,rn_3948);
	}

	public static void rn_3949(com.badlogic.gdx.graphics.glutils.ShaderProgram r_obj, String rn_3950, float rn_3951) {
		r_obj.setUniformf(rn_3950,rn_3951);
	}
}