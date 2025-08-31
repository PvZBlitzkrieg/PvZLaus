package bk.pvz;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import bk.pvz.BitmapFontData_;
import bk.pvz.FileHandle_;
import bk.pvz.Array_;
import bk.pvz.Color_;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.Batch_;

public class BitmapFont_ {
	public static com.badlogic.gdx.graphics.g2d.BitmapFont rn_3983(com.badlogic.gdx.files.FileHandle rn_3984, com.badlogic.gdx.files.FileHandle rn_3985) {
		return new BitmapFont(rn_3984,rn_3985,false);
	}

	public static com.badlogic.gdx.graphics.g2d.BitmapFont rn_3986(com.badlogic.gdx.files.FileHandle rn_3987, com.badlogic.gdx.utils.Array rn_3988) {
		return new BitmapFont(new BitmapFont.BitmapFontData(rn_3987,false),rn_3988,false);
	}

	public static com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData rn_3989(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj) {
		return r_obj.getData();
	}

	public static void rn_3990(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj, com.badlogic.gdx.graphics.Color rn_3991) {
		r_obj.setColor(rn_3991);
	}

	public static void rn_3992(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj, com.badlogic.gdx.graphics.g2d.Batch rn_3993, String rn_3994, float rn_3995, float rn_3996) {
		String[] rn_3997 = rn_3081.rn_6724(rn_3994, "\n");
		int rn_3998 = 0;
		for (int rn_10488 = 0;rn_10488 < rn_3997.length;rn_10488 += 1) {
			BitmapFont_.rn_3999(r_obj, rn_3993, rn_3997 [rn_10488], rn_3995, rn_3996 - rn_3998 * 100);
			rn_3998 = rn_3998 + 1;
		}
	}

	public static void rn_3999(com.badlogic.gdx.graphics.g2d.BitmapFont r_obj, com.badlogic.gdx.graphics.g2d.Batch rn_4000, String rn_4001, float rn_4002, float rn_4003) {
		r_obj.draw(rn_4000,rn_4001,rn_4002,rn_4003);
	}
}