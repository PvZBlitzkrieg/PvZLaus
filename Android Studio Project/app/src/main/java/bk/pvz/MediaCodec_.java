package bk.pvz;
import bk.pvz.Surface_;
import bk.pvz.MediaCrypto_;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.MediaFormat_;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_6840.rn_6841.rn_6842.rn_6935;
import bk.pvz.ByteBuffer_;
import bk.pvz.BufferInfo_;

public class MediaCodec_ {
	public static final int rn_1462 = 2;
	public static final int rn_1463 = 1;
	public static final int rn_1464 = 1;

	public static android.media.MediaCodec rn_1465(String rn_1466)  throws Exception {
		return android.media.MediaCodec.createEncoderByType(rn_1466);
	}

	public static void rn_1467(android.media.MediaCodec r_obj, android.media.MediaFormat rn_1468, android.view.Surface rn_1469, android.media.MediaCrypto rn_1470, int rn_1471) {
		r_obj.configure(rn_1468,rn_1469,rn_1470,rn_1471);
	}

	public static android.view.Surface rn_1472(android.media.MediaCodec r_obj) {
		return r_obj.createInputSurface();
	}

	public static int rn_1473(android.media.MediaCodec r_obj, android.media.MediaCodec.BufferInfo rn_1474, long rn_1475) {
		return r_obj.dequeueOutputBuffer(rn_1474,rn_1475);
	}

	public static int rn_1476(android.media.MediaCodec r_obj, long rn_1477) {
		return r_obj.dequeueInputBuffer(rn_1477);
	}

	public static java.nio.ByteBuffer rn_1478(android.media.MediaCodec r_obj, int rn_1479) {
		return r_obj.getOutputBuffer(rn_1479);
	}

	public static void rn_1480(android.media.MediaCodec r_obj, int rn_1481, int rn_1482, int rn_1483, long rn_1484, int rn_1485) {
		r_obj.queueInputBuffer(rn_1481,rn_1482,rn_1483,rn_1484,rn_1485);
	}

	public static void rn_1486(android.media.MediaCodec r_obj, int rn_1487, boolean rn_1488) {
		r_obj.releaseOutputBuffer(rn_1487,rn_1488);
	}

	public static void rn_1489(android.media.MediaCodec r_obj) {
		r_obj.start();
	}

	public static void rn_1490(android.media.MediaCodec r_obj) {
		r_obj.stop();
	}

	public static void rn_1491(android.media.MediaCodec r_obj) {
		r_obj.release();
	}
}