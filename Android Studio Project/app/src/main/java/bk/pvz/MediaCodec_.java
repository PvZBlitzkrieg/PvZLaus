package bk.pvz;
import bk.pvz.ByteBuffer_;
import bk.pvz.Surface_;
import bk.pvz.MediaFormat_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import bk.pvz.MediaCrypto_;
import bk.pvz.BufferInfo_;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_6672.rn_6673.rn_6674.rn_6767;

public class MediaCodec_ {
	public static final int rn_1325 = 2;
	public static final int rn_1326 = 1;
	public static final int rn_1327 = 1;

	public static android.media.MediaCodec rn_1328(String rn_1329)  throws Exception {
		return android.media.MediaCodec.createEncoderByType(rn_1329);
	}

	public static void rn_1330(android.media.MediaCodec r_obj, android.media.MediaFormat rn_1331, android.view.Surface rn_1332, android.media.MediaCrypto rn_1333, int rn_1334) {
		r_obj.configure(rn_1331,rn_1332,rn_1333,rn_1334);
	}

	public static android.view.Surface rn_1335(android.media.MediaCodec r_obj) {
		return r_obj.createInputSurface();
	}

	public static int rn_1336(android.media.MediaCodec r_obj, android.media.MediaCodec.BufferInfo rn_1337, long rn_1338) {
		return r_obj.dequeueOutputBuffer(rn_1337,rn_1338);
	}

	public static int rn_1339(android.media.MediaCodec r_obj, long rn_1340) {
		return r_obj.dequeueInputBuffer(rn_1340);
	}

	public static java.nio.ByteBuffer rn_1341(android.media.MediaCodec r_obj, int rn_1342) {
		return r_obj.getOutputBuffer(rn_1342);
	}

	public static void rn_1343(android.media.MediaCodec r_obj, int rn_1344, int rn_1345, int rn_1346, long rn_1347, int rn_1348) {
		r_obj.queueInputBuffer(rn_1344,rn_1345,rn_1346,rn_1347,rn_1348);
	}

	public static void rn_1349(android.media.MediaCodec r_obj, int rn_1350, boolean rn_1351) {
		r_obj.releaseOutputBuffer(rn_1350,rn_1351);
	}

	public static void rn_1352(android.media.MediaCodec r_obj) {
		r_obj.start();
	}

	public static void rn_1353(android.media.MediaCodec r_obj) {
		r_obj.stop();
	}

	public static void rn_1354(android.media.MediaCodec r_obj) {
		r_obj.release();
	}
}