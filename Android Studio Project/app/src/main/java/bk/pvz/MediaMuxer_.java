package bk.pvz;
import bk.pvz.MediaFormat_;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.ByteBuffer_;
import bk.pvz.BufferInfo_;

public class MediaMuxer_ {
	public static android.media.MediaMuxer rn_1637(String rn_1638, int rn_1639)  throws Exception {
		return new android.media.MediaMuxer(rn_1638,rn_1639);
	}

	public static int rn_1640(android.media.MediaMuxer r_obj, android.media.MediaFormat rn_1641) {
		return r_obj.addTrack(rn_1641);
	}

	public static void rn_1642(android.media.MediaMuxer r_obj) {
		r_obj.release();
	}

	public static void rn_1643(android.media.MediaMuxer r_obj) {
		r_obj.start();
	}

	public static void rn_1644(android.media.MediaMuxer r_obj) {
		r_obj.stop();
	}

	public static void rn_1645(android.media.MediaMuxer r_obj, int rn_1646, java.nio.ByteBuffer rn_1647, android.media.MediaCodec.BufferInfo rn_1648) {
		r_obj.writeSampleData(rn_1646,rn_1647,rn_1648);
	}
}