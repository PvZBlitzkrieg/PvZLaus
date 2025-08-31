package bk.pvz;
import bk.pvz.Reanimed;
import bk.pvz.Nirvana;
import rn_4413.rn_4414.rn_4415.rn_4577;
import bk.pvz.POSLIST;
import bk.pvz.op;
import rn_6672.rn_6673.rn_6674.rn_6777;
import bk.pvz.Renderinfo;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.Animed;
import bk.pvz.reanims;
import bk.pvz.POS_int;
import bk.pvz.POS;
import bk.pvz.ints;
import bk.pvz.RenderinfoList;
import bk.pvz.XMLR;
import bk.pvz.ProxyAnim;
import bk.pvz.Reanim;
import rn_4126.rn_4127.rn_4128.rn_4198;
import rn_4126.rn_4127.rn_4128.rn_8150;
import rn_6672.rn_6673.rn_6674.rn_6757;
import rn_4126.rn_4127.rn_4128.rn_8084;

public class Anim {
	@Override
	public String toString(){
	    return ToJSON();
	}

	public String name = "";
	public java.util.ArrayList<Reanim> rean = new java.util.ArrayList<Reanim>();
	public int startframe = 0;
	public float frame = 0.0F;
	public int maxframe = 0;
	public float speed = 1.0F;
	public ints mandaf = new ints();
	public int ForcedEvolutionFrame = -1;
	public float ForcedEvolutionTime = -1.0F;
	public float ForcedEvolutionProc = 0;
	public ProxyAnim panims = new ProxyAnim();
	public boolean update = false;
	public String animReturn = "";
	public String animname = "";
	public boolean hasReplay = false;
	public java.util.ArrayList<Renderinfo> RenderValue = new java.util.ArrayList<Renderinfo>();
	public boolean pause = false;
	public boolean pauseAfterBroadcasting = false;
	public boolean prohibitEvolution = false;
	public boolean prohibitReturnedEvolution = false;
	public float speedslows = 1.0F;
	public float speedcat = 1.0F;
	public Nirvana gm = null;

	public final float rn_3307() {
		return speedslows * speedcat;
	}

	public final Anim rn_3308() {
		Anim rn_3309 = Anim.rn_3310(name, gm);
		rn_3309.rn_3366(animname, false);
		rn_3309.frame = frame;
		rn_3309.update = update;
		rn_3309.animReturn = animReturn;
		rn_3309.hasReplay = hasReplay;
		rn_3309.pause = true;
		rn_3309.prohibitEvolution = prohibitEvolution;
		rn_3309.prohibitReturnedEvolution = prohibitReturnedEvolution;
		for (int rn_10465 = 0;rn_10465 < RenderinfoList.rn_1021(RenderValue);rn_10465 += 1) {
			RenderinfoList.rn_3278((rn_3309.RenderValue), rn_10465).rn_3239 = RenderinfoList.rn_3278(RenderValue, rn_10465).rn_3239;
		}
		for (int rn_10466 = 0;rn_10466 < mandaf.rn_1021();rn_10466 += 1) {
			rn_3309.mandaf.rn_1286(mandaf.rn_1281(rn_10466));
		}
		return rn_3309;
	}

	public static final Anim rn_3310(String rn_3311, Nirvana rn_3312) {
		Anim rn_3313 = new Anim();
		rn_3313.name = rn_3311;
		rn_3313.gm = rn_3312;
		rn_3313.rean = rn_3312.REANIM.rn_2886(rn_3311);
		rn_3313.frame = 0;
		rn_3313.maxframe = Reanimed.rn_3138((rn_3313.rean), 0).rn_2904.rn_2834();
		for (int rn_10467 = 0;rn_10467 < Reanimed.rn_1021(rn_3313.rean);rn_10467 += 1) {
			rn_3313.mandaf.rn_1286(-2);
			RenderinfoList.rn_3286(rn_3313.RenderValue, new Renderinfo());
		}
		return rn_3313;
	}

	public final Anim rn_3317(boolean rn_3318) {
		prohibitReturnedEvolution = rn_3318;
		return Anim.this;
	}

	public final void rn_3319(String rn_3320, float[] rn_3321, float rn_3322) {
		for (int rn_10468 = 0;rn_10468 < Reanimed.rn_1021(rean);rn_10468 += 1) {
			if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10468).rn_2903, rn_3320)) {
				RenderinfoList.rn_3278(RenderValue, rn_10468).rn_3245(rn_3321, rn_3322);
			}
		}
	}

	public final void rn_3323(String rn_3324, float[] rn_3325) {
		for (int rn_10469 = 0;rn_10469 < Reanimed.rn_1021(rean);rn_10469 += 1) {
			if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10469).rn_2903, rn_3324) || rn_3081.rn_6682(rn_3324, "")) {
				RenderinfoList.rn_3278(RenderValue, rn_10469).rn_3251(rn_3325);
			}
		}
	}

	public final Anim rn_3326(String rn_3327, Anim rn_3328, POS rn_3329, boolean rn_3330) {
		for (int rn_10470 = 0;rn_10470 < Reanimed.rn_1021(rean);rn_10470 += 1) {
			if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10470).rn_2903, rn_3327)) {
				mandaf.rn_1283(rn_10470, 0);
				panims.rn_3198(rn_10470, rn_3327, rn_3328, rn_3329, rn_3330);
				break;
			}
		}
		return Anim.this;
	}

	public final void rn_3331(boolean rn_3332) {
		pause = rn_3332;
		for (int rn_10471 = 0;rn_10471 < Animed.rn_1021(panims.panim);rn_10471 += 1) {
			Animed.rn_3169((panims.panim), rn_10471).rn_3331(rn_3332);
		}
	}

	public final Anim rn_3333(String rn_3334, String rn_3335) {
		for (int rn_10472 = 0;rn_10472 < Reanimed.rn_1021(rean);rn_10472 += 1) {
			if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10472).rn_2903, rn_3334)) {
				RenderinfoList.rn_3278(RenderValue, rn_10472).rn_3239 = rn_3335;
				break;
			}
		}
		return Anim.this;
	}

	public final POS rn_3336(String rn_3337) {
		return rn_3340(frame, rn_3338(rn_3337)).rn_3620;
	}

	public final int rn_3338(String rn_3339) {
		for (int rn_10473 = 0;rn_10473 < Reanimed.rn_1021(rean);rn_10473 += 1) {
			if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10473).rn_2903, rn_3339)) {
				return rn_10473;
			}
		}
		return -1;
	}

	public final POS_int rn_3340(float rn_3341, int rn_3342) {
		float rn_3343 = rn_3341 % 1;
		int rn_3344 = (int) (rn_3341 - rn_3343);
		Reanim rn_3345 = Reanimed.rn_3138(rean, rn_3342);
		int rn_3346 = rn_3344 + 1;
		if (rn_3344 >= POSLIST.rn_1021(rn_3345.rn_2905)) {
			rn_3344 = POSLIST.rn_1021(rn_3345.rn_2905) - 1;
			rn_3346 = startframe;
		}
		POS rn_3347 = POSLIST.rn_2908((rn_3345.rn_2905), rn_3344);
		if (ForcedEvolutionFrame != -1) {
			rn_3346 = ForcedEvolutionFrame;
			rn_3343 = ForcedEvolutionProc / ForcedEvolutionTime;
		} else {
			if (rn_3346 >= maxframe) {
				rn_3346 = startframe;
				if (prohibitReturnedEvolution || prohibitEvolution) {
					rn_3343 = 0;
				}
			}
		}
		POS rn_3348 = new POS();
		if (rn_3346 >= POSLIST.rn_1021(rn_3345.rn_2905)) {
			if (startframe >= POSLIST.rn_1021(rn_3345.rn_2905)) {
				rn_3348 = POSLIST.rn_2908((rn_3345.rn_2905), rn_3344);
			}
		} else {
			rn_3348 = POSLIST.rn_2908((rn_3345.rn_2905), rn_3346);
		}
		POS rn_3349 = new POS();
		if (prohibitEvolution) {
			rn_3343 = 0;
		}
		rn_3349.rn_3050 = (rn_3348.rn_3050 - rn_3347.rn_3050) * rn_3343 + rn_3347.rn_3050;
		rn_3349.rn_3051 = (rn_3348.rn_3051 - rn_3347.rn_3051) * rn_3343 + rn_3347.rn_3051;
		rn_3349.rn_3052 = (rn_3348.rn_3052 - rn_3347.rn_3052) * rn_3343 + rn_3347.rn_3052;
		rn_3349.rn_3053 = (rn_3348.rn_3053 - rn_3347.rn_3053) * rn_3343 + rn_3347.rn_3053;
		rn_3349.rn_3054 = (rn_3348.rn_3054 - rn_3347.rn_3054) * rn_3343 + rn_3347.rn_3054;
		rn_3349.rn_3055 = (rn_3348.rn_3055 - rn_3347.rn_3055) * rn_3343 + rn_3347.rn_3055;
		rn_3349.rn_3056 = rn_3347.rn_3056;
		rn_3349.rn_3057 = rn_3347.rn_3057;
		rn_3349.rn_3058 = rn_3347.rn_3058;
		POS_int rn_3350 = new POS_int();
		rn_3350.rn_3618 = rn_3347;
		rn_3350.rn_3619 = rn_3348;
		rn_3350.rn_3620 = rn_3349;
		rn_3350.rn_3621 = rn_3344;
		return rn_3350;
	}

	public final int rn_3351(int rn_3352, int rn_3353) {
		if (mandaf.rn_1281(rn_3352) == -2) {
			return POSLIST.rn_2908((Reanimed.rn_3138(rean, rn_3352).rn_2905), rn_3353).rn_3056;
		} else {
			return mandaf.rn_1281(rn_3352);
		}
	}

	public final void rn_3354(int rn_3355, float rn_3356) {
		ForcedEvolutionFrame = (int) frame;
		frame = rn_3355;
		ForcedEvolutionTime = rn_3356;
		ForcedEvolutionProc = 0;
	}

	public final String[] rn_3357(String[] rn_3358) {
		java.util.ArrayList<String> rn_3359 = new java.util.ArrayList<String>();
		for (int rn_10474 = 0;rn_10474 < Reanimed.rn_1021(rean);rn_10474 += 1) {
			for (int rn_10475 = 0;rn_10475 < rn_3358.length;rn_10475 += 1) {
				if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10474).rn_2903, rn_3358 [rn_10475])) {
					if (mandaf.rn_1281(rn_10474) == 0 || mandaf.rn_1281(rn_10474) == -2) {
						rn_4198.rn_4209(rn_3359, rn_3358 [rn_10475]);
					}
					break;
				}
			}
		}
		return rn_4198.rn_4228(rn_3359);
	}

	public final Anim rn_3360(String[] rn_3361, int rn_3362, boolean rn_3363) {
		int rn_3364 = 0;
		if (rn_3362 == 0) {
			rn_3364 = -1;
		}
		for (int rn_10476 = 0;rn_10476 < Reanimed.rn_1021(rean);rn_10476 += 1) {
			boolean rn_3365 = false;
			for (int rn_10477 = 0;rn_10477 < rn_3361.length;rn_10477 += 1) {
				if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10476).rn_2903, rn_3361 [rn_10477])) {
					mandaf.rn_1283(rn_10476, rn_3362);
					rn_3365 = true;
					break;
				}
			}
			if (rn_3363 && rn_3365 == false) {
				mandaf.rn_1283(rn_10476, rn_3364);
			}
		}
		return Anim.this;
	}

	public final Anim rn_3366(String rn_3367, boolean rn_3368) {
		pause = false;
		if (rn_3368) {
			animReturn = animname;
		}
		animname = rn_3367;
		ForcedEvolutionFrame = -1;
		for (int rn_10478 = 0;rn_10478 < Reanimed.rn_1021(rean);rn_10478 += 1) {
			XMLR rn_3369 = (Reanimed.rn_3138(rean, rn_10478).rn_2904);
			if (rn_3081.rn_6682(rn_3369.rn_2813(0).rn_2808(), rn_3367)) {
				startframe = 0;
				maxframe = rn_3369.rn_2834();
				for (rn_10478 = 1;rn_10478 < rn_3369.rn_2826();rn_10478 += 1) {
					XMLR rn_3370 = (rn_3369.rn_2813(rn_10478)).rn_2811("f");
					if (rn_3370 != null) {
						if (rn_3081.rn_6682(rn_3370.rn_2808(), "0")) {
							startframe = rn_10478;
						} else if (rn_3081.rn_6682(rn_3370.rn_2808(), "-1")) {
							maxframe = rn_10478 - 1;
						}
					}
				}
				if (maxframe == 0) {
					maxframe = rn_3369.rn_2834();
				}
				break;
			}
		}
		frame = startframe;
		return Anim.this;
	}

	public final Reanim rn_3378(String rn_3379) {
		for (int rn_10479 = 0;rn_10479 < Reanimed.rn_1021(rean);rn_10479 += 1) {
			if (rn_3081.rn_6682(Reanimed.rn_3138(rean, rn_10479).rn_2903, rn_3379)) {
				return Reanimed.rn_3138(rean, rn_10479);
			}
		}
		return null;
	}

	public final String ToJSON() {
		org.json.JSONObject rn_3380 = new org.json.JSONObject();
		java.lang.reflect.Field[] rn_3381 = rn_8084.rn_8126(rn_4133.rn_6676(Anim.this));
		for (int rn_10480 = 0;rn_10480 < rn_3381.length;rn_10480 += 1) {
			java.lang.reflect.Field rn_3382 = rn_3381 [rn_10480];
			String rn_3383 = rn_8084.rn_8094(rn_8150.rn_8161(rn_3382));
			if (rn_3081.rn_6682(rn_3383, "bk.pvz.Reanim") || rn_3081.rn_6682(rn_3383, "bk.pvz.Nirvana") || rn_3081.rn_6682(rn_8150.rn_7729(rn_3382), "rean")) {
			} else {
				rn_3382.setAccessible(true);
				Object rn_3384 = rn_8150.rn_8165(rn_3382, Anim.this);
				if (rn_3081.rn_6693(rn_4133.rn_6675(rn_3384), "{", 0)) {
					org.json.JSONObject rn_3385 = rn_4577.rn_4578(rn_4133.rn_6675(rn_3384));
					rn_4577.rn_4607(rn_3380, rn_8150.rn_7729(rn_3382), rn_3385);
				} else if (rn_3081.rn_6682(rn_3383, "java.util.ArrayList")) {
				} else if (rn_3081.rn_6682(rn_3383, "[F")) {
					float[] rn_3386 = (float[]) ((float[]) (rn_3384));
					rn_4577.rn_4607(rn_3380, rn_8150.rn_7729(rn_3382), op.rn_1246(rn_3386));
				} else if (rn_3081.rn_6682(rn_3383, "bk.pvz.ints")) {
					ints rn_3387 = (ints) (rn_3384);
					org.json.JSONObject rn_3388 = op.rn_1191(rn_3387.rn_1305());
					rn_4577.rn_4607(rn_3380, rn_8150.rn_7729(rn_3382), rn_3388);
				} else {
					rn_4577.rn_4607(rn_3380, rn_8150.rn_7729(rn_3382), rn_4133.rn_6675(rn_3384));
				}
			}
		}
		return rn_4577.rn_4614(rn_3380, 0);
	}

	public static final Anim rn_3389(String rn_3390, Nirvana rn_3391) {
		org.json.JSONObject rn_3392 = rn_4577.rn_4578(rn_3390);
		Anim rn_3393 = new Anim();
		op.rn_1194(rn_3393, rn_3392, rn_3391);
		rn_3393.rean = rn_3391.REANIM.rn_2886(rn_3393.name);
		for (int rn_10481 = 0;rn_10481 < Reanimed.rn_1021(rn_3393.rean);rn_10481 += 1) {
			rn_3393.mandaf.rn_1286(-2);
			RenderinfoList.rn_3286(rn_3393.RenderValue, new Renderinfo());
		}
		rn_3393.gm = rn_3391;
		return rn_3393;
	}
}