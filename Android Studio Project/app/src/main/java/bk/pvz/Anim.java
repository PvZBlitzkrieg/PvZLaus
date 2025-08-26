package bk.pvz;
import bk.pvz.POS_int;
import bk.pvz.POSLIST;
import rn_6840.rn_6841.rn_6842.rn_6945;
import bk.pvz.POS;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4294.rn_4295.rn_4296.rn_4366;
import bk.pvz.RenderinfoList;
import bk.pvz.ints;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.Reanimed;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Reanim;
import bk.pvz.XMLR;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.reanims;
import bk.pvz.Nirvana;
import bk.pvz.Renderinfo;
import bk.pvz.ProxyAnim;

public class Anim {
	public String rn_3482 = "";
	public java.util.ArrayList<Reanim> rn_3483 = new java.util.ArrayList<Reanim>();
	public int rn_3484 = 0;
	public float rn_3485 = 0.0F;
	public int rn_3486 = 0;
	public float rn_3487 = 1.0F;
	public ints rn_3488 = new ints();
	public int rn_3489 = -1;
	public float rn_3490 = -1.0F;
	public float rn_3491 = 0;
	public ProxyAnim rn_3492 = new ProxyAnim();
	public boolean rn_3493 = false;
	public String rn_3494 = "";
	public String rn_3495 = "";
	public boolean rn_3496 = false;
	public java.util.ArrayList<Renderinfo> rn_3497 = new java.util.ArrayList<Renderinfo>();
	public boolean rn_3498 = false;
	public boolean rn_3499 = false;
	public boolean rn_3500 = false;
	public boolean rn_3501 = false;
	public float rn_3502 = 1.0F;
	public float rn_3503 = 1.0F;
	public Nirvana rn_3504 = null;

	public final float rn_3505() {
		return rn_3502 * rn_3503;
	}

	public final Anim rn_3506() {
		Anim rn_3507 = Anim.rn_3508(rn_3482, rn_3504);
		rn_3507.rn_3562(rn_3495, false);
		rn_3507.rn_3485 = rn_3485;
		rn_3507.rn_3493 = rn_3493;
		rn_3507.rn_3494 = rn_3494;
		rn_3507.rn_3496 = rn_3496;
		rn_3507.rn_3498 = true;
		rn_3507.rn_3500 = rn_3500;
		rn_3507.rn_3501 = rn_3501;
		for (int rn_10599 = 0;rn_10599 < RenderinfoList.rn_1225(rn_3497);rn_10599 += 1) {
			RenderinfoList.rn_3453((rn_3507.rn_3497), rn_10599).rn_3429 = RenderinfoList.rn_3453(rn_3497, rn_10599).rn_3429;
		}
		for (int rn_10600 = 0;rn_10600 < rn_3488.rn_1225();rn_10600 += 1) {
			rn_3507.rn_3488.rn_1423(rn_3488.rn_1418(rn_10600));
		}
		return rn_3507;
	}

	public static final Anim rn_3508(String rn_3509, Nirvana rn_3510) {
		Anim rn_3511 = new Anim();
		rn_3511.rn_3482 = rn_3509;
		rn_3511.rn_3504 = rn_3510;
		rn_3511.rn_3483 = rn_3510.rn_448.rn_3107(rn_3509);
		rn_3511.rn_3485 = 0;
		rn_3511.rn_3486 = Reanimed.rn_3343((rn_3511.rn_3483), 0).rn_3125.rn_3055();
		for (int rn_10601 = 0;rn_10601 < Reanimed.rn_1225(rn_3511.rn_3483);rn_10601 += 1) {
			rn_3511.rn_3488.rn_1423(-2);
			RenderinfoList.rn_3461(rn_3511.rn_3497, new Renderinfo());
		}
		return rn_3511;
	}

	public final Anim rn_3515(boolean rn_3516) {
		rn_3501 = rn_3516;
		return Anim.this;
	}

	public final void rn_3517(String rn_3518, float[] rn_3519, float rn_3520) {
		for (int rn_10602 = 0;rn_10602 < Reanimed.rn_1225(rn_3483);rn_10602 += 1) {
			if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10602).rn_3124, rn_3518)) {
				RenderinfoList.rn_3453(rn_3497, rn_10602).rn_3435(rn_3519, rn_3520);
			}
		}
	}

	public final void rn_3521(String rn_3522, float[] rn_3523) {
		for (int rn_10603 = 0;rn_10603 < Reanimed.rn_1225(rn_3483);rn_10603 += 1) {
			if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10603).rn_3124, rn_3522) || rn_3289.rn_6850(rn_3522, "")) {
				RenderinfoList.rn_3453(rn_3497, rn_10603).rn_3441(rn_3523);
			}
		}
	}

	public final Anim rn_3524(String rn_3525, Anim rn_3526, POS rn_3527, boolean rn_3528) {
		for (int rn_10604 = 0;rn_10604 < Reanimed.rn_1225(rn_3483);rn_10604 += 1) {
			if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10604).rn_3124, rn_3525)) {
				rn_3488.rn_1420(rn_10604, 0);
				rn_3492.rn_3408(rn_10604, rn_3525, rn_3526, rn_3527, rn_3528);
				break;
			}
		}
		return Anim.this;
	}

	public final Anim rn_3529(String rn_3530, String rn_3531) {
		for (int rn_10605 = 0;rn_10605 < Reanimed.rn_1225(rn_3483);rn_10605 += 1) {
			if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10605).rn_3124, rn_3530)) {
				RenderinfoList.rn_3453(rn_3497, rn_10605).rn_3429 = rn_3531;
				break;
			}
		}
		return Anim.this;
	}

	public final POS rn_3532(String rn_3533) {
		return rn_3536(rn_3485, rn_3534(rn_3533)).rn_3788;
	}

	public final int rn_3534(String rn_3535) {
		for (int rn_10606 = 0;rn_10606 < Reanimed.rn_1225(rn_3483);rn_10606 += 1) {
			if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10606).rn_3124, rn_3535)) {
				return rn_10606;
			}
		}
		return -1;
	}

	public final POS_int rn_3536(float rn_3537, int rn_3538) {
		float rn_3539 = rn_3537 % 1;
		int rn_3540 = (int) (rn_3537 - rn_3539);
		Reanim rn_3541 = Reanimed.rn_3343(rn_3483, rn_3538);
		int rn_3542 = rn_3540 + 1;
		if (rn_3540 >= POSLIST.rn_1225(rn_3541.rn_3126)) {
			rn_3540 = POSLIST.rn_1225(rn_3541.rn_3126) - 1;
			rn_3542 = rn_3484;
		}
		POS rn_3543 = POSLIST.rn_3129((rn_3541.rn_3126), rn_3540);
		if (rn_3489 != -1) {
			rn_3542 = rn_3489;
			rn_3539 = rn_3491 / rn_3490;
		} else {
			if (rn_3542 >= rn_3486) {
				rn_3542 = rn_3484;
				if (rn_3501 || rn_3500) {
					rn_3539 = 0;
				}
			}
		}
		POS rn_3544 = new POS();
		if (rn_3542 >= POSLIST.rn_1225(rn_3541.rn_3126)) {
			if (rn_3484 >= POSLIST.rn_1225(rn_3541.rn_3126)) {
				rn_3544 = POSLIST.rn_3129((rn_3541.rn_3126), rn_3540);
			}
		} else {
			rn_3544 = POSLIST.rn_3129((rn_3541.rn_3126), rn_3542);
		}
		POS rn_3545 = new POS();
		if (rn_3500) {
			rn_3539 = 0;
		}
		rn_3545.rn_3271 = (rn_3544.rn_3271 - rn_3543.rn_3271) * rn_3539 + rn_3543.rn_3271;
		rn_3545.rn_3272 = (rn_3544.rn_3272 - rn_3543.rn_3272) * rn_3539 + rn_3543.rn_3272;
		rn_3545.rn_3273 = (rn_3544.rn_3273 - rn_3543.rn_3273) * rn_3539 + rn_3543.rn_3273;
		rn_3545.rn_3274 = (rn_3544.rn_3274 - rn_3543.rn_3274) * rn_3539 + rn_3543.rn_3274;
		rn_3545.rn_3275 = (rn_3544.rn_3275 - rn_3543.rn_3275) * rn_3539 + rn_3543.rn_3275;
		rn_3545.rn_3276 = (rn_3544.rn_3276 - rn_3543.rn_3276) * rn_3539 + rn_3543.rn_3276;
		rn_3545.rn_3277 = rn_3543.rn_3277;
		rn_3545.rn_3278 = rn_3543.rn_3278;
		rn_3545.rn_3279 = rn_3543.rn_3279;
		POS_int rn_3546 = new POS_int();
		rn_3546.rn_3786 = rn_3543;
		rn_3546.rn_3787 = rn_3544;
		rn_3546.rn_3788 = rn_3545;
		rn_3546.rn_3789 = rn_3540;
		return rn_3546;
	}

	public final int rn_3547(int rn_3548, int rn_3549) {
		if (rn_3488.rn_1418(rn_3548) == -2) {
			return POSLIST.rn_3129((Reanimed.rn_3343(rn_3483, rn_3548).rn_3126), rn_3549).rn_3277;
		} else {
			return rn_3488.rn_1418(rn_3548);
		}
	}

	public final void rn_3550(int rn_3551, float rn_3552) {
		rn_3489 = (int) rn_3485;
		rn_3485 = rn_3551;
		rn_3490 = rn_3552;
		rn_3491 = 0;
	}

	public final String[] rn_3553(String[] rn_3554) {
		java.util.ArrayList<String> rn_3555 = new java.util.ArrayList<String>();
		for (int rn_10607 = 0;rn_10607 < Reanimed.rn_1225(rn_3483);rn_10607 += 1) {
			for (int rn_10608 = 0;rn_10608 < rn_3554.length;rn_10608 += 1) {
				if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10607).rn_3124, rn_3554 [rn_10608])) {
					if (rn_3488.rn_1418(rn_10607) == 0 || rn_3488.rn_1418(rn_10607) == -2) {
						rn_4366.rn_4377(rn_3555, rn_3554 [rn_10608]);
					}
					break;
				}
			}
		}
		return rn_4366.rn_4396(rn_3555);
	}

	public final Anim rn_3556(String[] rn_3557, int rn_3558, boolean rn_3559) {
		int rn_3560 = 0;
		if (rn_3558 == 0) {
			rn_3560 = -1;
		}
		for (int rn_10609 = 0;rn_10609 < Reanimed.rn_1225(rn_3483);rn_10609 += 1) {
			boolean rn_3561 = false;
			for (int rn_10610 = 0;rn_10610 < rn_3557.length;rn_10610 += 1) {
				if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10609).rn_3124, rn_3557 [rn_10610])) {
					rn_3488.rn_1420(rn_10609, rn_3558);
					rn_3561 = true;
					break;
				}
			}
			if (rn_3559 && rn_3561 == false) {
				rn_3488.rn_1420(rn_10609, rn_3560);
			}
		}
		return Anim.this;
	}

	public final Anim rn_3562(String rn_3563, boolean rn_3564) {
		rn_3498 = false;
		if (rn_3564) {
			rn_3494 = rn_3495;
		}
		rn_3495 = rn_3563;
		rn_3489 = -1;
		for (int rn_10611 = 0;rn_10611 < Reanimed.rn_1225(rn_3483);rn_10611 += 1) {
			XMLR rn_3565 = (Reanimed.rn_3343(rn_3483, rn_10611).rn_3125);
			if (rn_3289.rn_6850(rn_3565.rn_3034(0).rn_3029(), rn_3563)) {
				rn_3484 = 0;
				rn_3486 = rn_3565.rn_3055();
				for (rn_10611 = 1;rn_10611 < rn_3565.rn_3047();rn_10611 += 1) {
					XMLR rn_3566 = (rn_3565.rn_3034(rn_10611)).rn_3032("f");
					if (rn_3566 != null) {
						if (rn_3289.rn_6850(rn_3566.rn_3029(), "0")) {
							rn_3484 = rn_10611;
						} else if (rn_3289.rn_6850(rn_3566.rn_3029(), "-1")) {
							rn_3486 = rn_10611 - 1;
						}
					}
				}
				if (rn_3486 == 0) {
					rn_3486 = rn_3565.rn_3055();
				}
				break;
			}
		}
		rn_3485 = rn_3484;
		return Anim.this;
	}

	public final Reanim rn_3574(String rn_3575) {
		for (int rn_10612 = 0;rn_10612 < Reanimed.rn_1225(rn_3483);rn_10612 += 1) {
			if (rn_3289.rn_6850(Reanimed.rn_3343(rn_3483, rn_10612).rn_3124, rn_3575)) {
				return Reanimed.rn_3343(rn_3483, rn_10612);
			}
		}
		return null;
	}
}