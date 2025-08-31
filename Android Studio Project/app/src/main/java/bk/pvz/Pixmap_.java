package bk.pvz;
import com.badlogic.gdx.graphics.Pixmap;
import java.nio.*;
import bk.pvz.ByteBuffer_;
import rn_6672.rn_6673.rn_6674.rn_6793;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.ope;
import rn_4413.rn_4414.rn_4415.rn_8937;
import bk.pvz.Colorset;

public class Pixmap_ {
	public static com.badlogic.gdx.graphics.Pixmap rn_3914(int rn_3915, int rn_3916) {
		return new Pixmap(rn_3915,rn_3916,Pixmap.Format.RGBA8888);
	}

	public static com.badlogic.gdx.graphics.Pixmap rn_3917(Colorset rn_3918) {
		int[] pixels=rn_3918.rn_1891;
		int width=rn_3918.rn_1892;
		int height=rn_3918.rn_1893;

    // 创建 Pixmap，格式必须选 RGBA8888（libGDX 内部是 RGBA 顺序）
    Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);

    // 获取底层 ByteBuffer（每个像素 4 字节，顺序为 RGBA）
    ByteBuffer buffer = pixmap.getPixels();
    buffer.clear();

    for (int pixel : pixels) {
        // pixel: 0xAARRGGBB
        int r = (pixel >> 16) & 0xff;
        int g = (pixel >>  8) & 0xff;
        int b = (pixel      ) & 0xff;
        int a = (pixel >> 24) & 0xff;

        // 按 RGBA 顺序写入
        buffer.put((byte) r);
        buffer.put((byte) g);
        buffer.put((byte) b);
        buffer.put((byte) a);
    }

    buffer.flip(); // 可选，确保指针回到开头
    return pixmap;
	}

	public static com.badlogic.gdx.graphics.Pixmap rn_3919(android.graphics.Bitmap rn_3920) {
		int[] rn_3921 = (int[]) (new int[rn_8937.rn_5474(rn_3920) * rn_8937.rn_5478(rn_3920)]);
		ope.rn_1743(rn_3920, rn_3921, 0, rn_8937.rn_5474(rn_3920), 0, 0, rn_8937.rn_5474(rn_3920), rn_8937.rn_5478(rn_3920));
		com.badlogic.gdx.graphics.Pixmap rn_3922 = Pixmap_.rn_3914(rn_8937.rn_5474(rn_3920), rn_8937.rn_5478(rn_3920));
		byte[] rn_3923 = ope.rn_1718(rn_3921);
		java.nio.ByteBuffer rn_3924 = null;
		rn_3924=rn_3922.getPixels();
		rn_3924.clear();
		rn_3924.put(rn_3923);
		rn_3924.flip();
		return rn_3922;
	}

	public static int rn_3925(com.badlogic.gdx.graphics.Pixmap r_obj) {
		return r_obj.getWidth();
	}

	public static int rn_3926(com.badlogic.gdx.graphics.Pixmap r_obj) {
		return r_obj.getHeight();
	}
}