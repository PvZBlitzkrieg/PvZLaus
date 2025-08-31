package bk.pvz;
import bk.pvz.ByteBuffer_;
import bk.pvz.MediaFormat_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.BufferInfo_;

public class MediaMuxer_ {
	public static android.media.MediaMuxer rn_1500(String rn_1501, int rn_1502)  throws Exception {
		return new android.media.MediaMuxer(rn_1501,rn_1502);
	}

	public static int rn_1503(android.media.MediaMuxer r_obj, android.media.MediaFormat rn_1504) {
		return r_obj.addTrack(rn_1504);
	}

	public static void rn_1505(android.media.MediaMuxer r_obj) {
		r_obj.release();
	}

	public static void rn_1506(android.media.MediaMuxer r_obj) {
		r_obj.start();
	}

	public static void rn_1507(android.media.MediaMuxer r_obj) {
		r_obj.stop();
	}

	public static void rn_1508(android.media.MediaMuxer r_obj, int rn_1509, java.nio.ByteBuffer rn_1510, android.media.MediaCodec.BufferInfo rn_1511) {
		r_obj.writeSampleData(rn_1509,rn_1510,rn_1511);
	}
}