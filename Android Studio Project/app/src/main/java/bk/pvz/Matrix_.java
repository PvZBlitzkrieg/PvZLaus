package bk.pvz;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;

public class Matrix_ {
	public static android.graphics.Matrix rn_3395() {
		return new android.graphics.Matrix();
	}

	public static android.graphics.Matrix rn_3396(android.graphics.Matrix rn_3397) {
		return new android.graphics.Matrix(rn_3397);
	}

	public static float[] rn_3398(android.graphics.Matrix r_obj) {
		float[] rn_3399 = (float[]) (new float[9]);
		r_obj.getValues(rn_3399);
		return rn_3399;
	}

	public static android.graphics.Matrix rn_3400(android.graphics.Matrix r_obj, float rn_3401, float rn_3402, float rn_3403) {
		r_obj.postRotate(rn_3401,rn_3402,rn_3403);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3406(android.graphics.Matrix r_obj, float rn_3407, float rn_3408, float rn_3409, float rn_3410) {
		r_obj.postScale( rn_3407,  rn_3408,  rn_3409,  rn_3410);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3411(android.graphics.Matrix r_obj, float rn_3412, float rn_3413) {
		r_obj.postScale( rn_3412,  rn_3413);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3414(android.graphics.Matrix r_obj, float rn_3415, float rn_3416, float rn_3417, float rn_3418) {
		r_obj.postSkew( rn_3415,  rn_3416,rn_3417,rn_3418);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3422(android.graphics.Matrix r_obj, float rn_3423, float rn_3424) {
		r_obj.postTranslate(rn_3423, rn_3424);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3431(android.graphics.Matrix r_obj, float rn_3432, float rn_3433, float rn_3434, float rn_3435) {
		r_obj.preScale( rn_3432,  rn_3433,  rn_3434,  rn_3435);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3436(android.graphics.Matrix r_obj, float rn_3437, float rn_3438) {
		r_obj.preScale( rn_3437,  rn_3438);
		return r_obj;
	}

	public static android.graphics.Matrix rn_3447(android.graphics.Matrix r_obj, float rn_3448, float rn_3449) {
		r_obj.preTranslate(rn_3448, rn_3449);
		return r_obj;
	}
}