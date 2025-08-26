package bk.pvz;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Array_;
import bk.pvz.FileHandle_;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.BitmapFontData_;
import bk.pvz.Batch_;
import bk.pvz.Color_;

public class BitmapFont_ {
	public static com.badlogic.gdx.graphics.g2d.BitmapFont rn_4151(com.badlogic.gdx.files.FileHandle rn_4152, com.badlogic.gdx.files.FileHandle rn_4153) {
		return new BitmapFont(rn_4152,rn_4153,false);
	}

	public static com.badlogic.gdx.graphics.g2d.BitmapFont rn_4154(com.badlogic.gdx.files.FileHandle rn_4155, com.badlogic.gdx.utils.Array rn_4156) {
		return new BitmapFont(new BitmapFont.BitmapFontData(rn_4155,false),rn_4156,false);
	}

	public static com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData rn_4157(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj) {
		return r_obj.getData();
	}

	public static void rn_4158(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj, com.badlogic.gdx.graphics.Color rn_4159) {
		r_obj.setColor(rn_4159);
	}

	public static void rn_4160(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj, com.badlogic.gdx.graphics.g2d.Batch rn_4161, String rn_4162, float rn_4163, float rn_4164) {
		String[] rn_4165 = rn_3289.rn_6892(rn_4162, "\n");
		int rn_4166 = 0;
		for (int rn_10617 = 0;rn_10617 < rn_4165.length;rn_10617 += 1) {
			BitmapFont_.rn_4167(r_obj, rn_4161, rn_4165 [rn_10617], rn_4163, rn_4164 - rn_4166 * 100);
			rn_4166 = rn_4166 + 1;
		}
	}

	public static void rn_4167(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj, com.badlogic.gdx.graphics.g2d.Batch rn_4168, String rn_4169, float rn_4170, float rn_4171) {
		r_obj.draw(rn_4168,rn_4169,rn_4170,rn_4171);
	}
}