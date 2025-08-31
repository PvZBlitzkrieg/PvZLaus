package bk.pvz;
import com.badlogic.gdx.graphics.Texture;
import bk.pvz.FileHandle_;
import bk.pvz.Pixmap_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class Texture_ {
	public static com.badlogic.gdx.graphics.Texture rn_3891(com.badlogic.gdx.graphics.Pixmap rn_3892) {
		Texture texture = new Texture(rn_3892,true);
texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

		 return texture;
	}

	public static com.badlogic.gdx.graphics.Texture rn_3893(com.badlogic.gdx.files.FileHandle rn_3894) {
		return new Texture(rn_3894);
	}

	public static int rn_3897(com.badlogic.gdx.graphics.Texture r_obj) {
		return r_obj.getWidth();
	}

	public static int rn_3898(com.badlogic.gdx.graphics.Texture r_obj) {
		return r_obj.getHeight();
	}
}