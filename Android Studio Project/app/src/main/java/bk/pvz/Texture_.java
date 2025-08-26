package bk.pvz;
import com.badlogic.gdx.graphics.Texture;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Pixmap_;
import bk.pvz.FileHandle_;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Texture_ {
	public static com.badlogic.gdx.graphics.Texture rn_4059(com.badlogic.gdx.graphics.Pixmap rn_4060) {
		Texture texture = new Texture(rn_4060,true);
texture.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);

		 return texture;
	}

	public static com.badlogic.gdx.graphics.Texture rn_4061(com.badlogic.gdx.files.FileHandle rn_4062) {
		return new Texture(rn_4062);
	}

	public static int rn_4065(com.badlogic.gdx.graphics.Texture r_obj) {
		return r_obj.getWidth();
	}

	public static int rn_4066(com.badlogic.gdx.graphics.Texture r_obj) {
		return r_obj.getHeight();
	}
}