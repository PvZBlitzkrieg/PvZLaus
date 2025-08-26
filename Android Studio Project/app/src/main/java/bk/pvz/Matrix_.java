package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_6840.rn_6841.rn_6842.rn_4301;

public class Matrix_ {
	public static android.graphics.Matrix rn_3576() {
		return new android.graphics.Matrix();
	}

	public static android.graphics.Matrix rn_3577(android.graphics.Matrix rn_3578) {
		return new android.graphics.Matrix(rn_3578);
	}

	public static float[] rn_3579(android.graphics.Matrix r_obj) {
		float[] rn_3580 = (float[]) (new float[9]);
		r_obj.getValues(rn_3580);
		return rn_3580;
	}

	public static android.graphics.Matrix rn_3581(android.graphics.Matrix r_obj, float rn_3582, float rn_3583, float rn_3584) {
		r_obj.postRotate(rn_3582,rn_3583,rn_3584);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3587(android.graphics.Matrix r_obj, float rn_3588, float rn_3589, float rn_3590, float rn_3591) {
		r_obj.postScale( rn_3588,  rn_3589,  rn_3590,  rn_3591);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3592(android.graphics.Matrix r_obj, float rn_3593, float rn_3594) {
		r_obj.postScale( rn_3593,  rn_3594);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3595(android.graphics.Matrix r_obj, float rn_3596, float rn_3597, float rn_3598, float rn_3599) {
		r_obj.postSkew( rn_3596,  rn_3597,rn_3598,rn_3599);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3603(android.graphics.Matrix r_obj, float rn_3604, float rn_3605) {
		r_obj.postTranslate(rn_3604, rn_3605);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3612(android.graphics.Matrix r_obj, float rn_3613, float rn_3614, float rn_3615, float rn_3616) {
		r_obj.preScale( rn_3613,  rn_3614,  rn_3615,  rn_3616);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3617(android.graphics.Matrix r_obj, float rn_3618, float rn_3619) {
		r_obj.preScale( rn_3618,  rn_3619);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3628(android.graphics.Matrix r_obj, float rn_3629, float rn_3630) {
		r_obj.preTranslate(rn_3629, rn_3630);
		return r_obj;
	}
}