package bk.pvz;
import com.badlogic.gdx.graphics.Pixmap;
import java.nio.*;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6961;
import bk.pvz.ope;
import rn_4581.rn_4582.rn_4583.rn_9105;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Colorset;
import bk.pvz.ByteBuffer_;

public class Pixmap_ {
	public static com.badlogic.gdx.graphics.Pixmap rn_4082(int rn_4083, int rn_4084) {
		return new Pixmap(rn_4083,rn_4084,Pixmap.Format.RGBA8888);
	}

	public static com.badlogic.gdx.graphics.Pixmap rn_4085(Colorset rn_4086) {
		int[] pixels=rn_4086.rn_2018;
		int width=rn_4086.rn_2019;
		int height=rn_4086.rn_2020;

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

	public static com.badlogic.gdx.graphics.Pixmap rn_4087(android.graphics.Bitmap rn_4088) {
		int[] rn_4089 = (int[]) (new int[rn_9105.rn_5642(rn_4088) * rn_9105.rn_5646(rn_4088)]);
		ope.rn_1870(rn_4088, rn_4089, 0, rn_9105.rn_5642(rn_4088), 0, 0, rn_9105.rn_5642(rn_4088), rn_9105.rn_5646(rn_4088));
		com.badlogic.gdx.graphics.Pixmap rn_4090 = Pixmap_.rn_4082(rn_9105.rn_5642(rn_4088), rn_9105.rn_5646(rn_4088));
		byte[] rn_4091 = ope.rn_1845(rn_4089);
		java.nio.ByteBuffer rn_4092 = null;
		rn_4092=rn_4090.getPixels();
		rn_4092.clear();
		rn_4092.put(rn_4091);
		rn_4092.flip();
		return rn_4090;
	}

	public static int rn_4093(com.badlogic.gdx.graphics.Pixmap r_obj) {
		return r_obj.getWidth();
	}

	public static int rn_4094(com.badlogic.gdx.graphics.Pixmap r_obj) {
		return r_obj.getHeight();
	}
}