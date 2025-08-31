package bk.pvz;
import bk.pvz.Nirvana;
import bk.pvz.Rectx;
import bk.pvz.Anim;
import rn_6672.rn_6673.rn_6674.rn_6777;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import bk.pvz.static_;
import rn_6672.rn_6673.rn_6674.rn_6757;

public class Coin {
	public float rn_2580 = 0.0F;
	public float rn_2581 = 0.0F;
	public float rn_2582 = 0.0F;
	public float rn_2583 = 0.0F;
	public float rn_2584 = 0.0F;
	public float rn_2585 = 0.0F;
	public float rn_2586 = 0.0F;
	public Rectx rn_2587 = new Rectx();
	public Nirvana rn_2588 = null;
	public int rn_2589 = 0;
	public Anim rn_2590 = new Anim();
	public float rn_2591 = -1713.0F;
	public float rn_2592 = -1713.0F;
	public float rn_2593 = -1713.0F;
	public float rn_2594 = 0.0F;
	public float rn_2595 = 0.0F;
	public int rn_2596 = 0;
	public int rn_2597 = 0;
	public float rn_2598 = 1.0F;
	public float rn_2599 = 1.0F;
	public float rn_2600 = 0.0F;

	public static final Coin rn_2601(Nirvana rn_2602, int rn_2603, float rn_2604, float rn_2605) {
		Coin rn_2606 = new Coin();
		rn_2606.rn_2588 = rn_2602;
		rn_2606.rn_2589 = rn_2603;
		rn_2606.rn_2610(25);
		if (rn_2603 == static_.rn_2618) {
			rn_2606.rn_2590 = Anim.rn_3310("Sun", rn_2602).rn_3366("Sun1", false).rn_3317(true);
			rn_2606.rn_2590.speed = 0.5F;
		} else if (rn_2603 == static_.rn_2615) {
			rn_2606.rn_2590 = Anim.rn_3310("Coin_silver", rn_2602);
		} else if (rn_2603 == static_.rn_2616) {
			rn_2606.rn_2590 = Anim.rn_3310("Coin_gold", rn_2602);
		} else if (rn_2603 == static_.rn_2619) {
			rn_2606.rn_2590 = Anim.rn_3310("LawnMower", rn_2602).rn_3366("anim_normal", false);
			rn_2606.rn_2598 = 0.75F;
			rn_2606.rn_2599 = rn_2606.rn_2598;
			rn_2606.rn_2607(-30, 0);
		} else if (rn_2603 == static_.rn_2621) {
			rn_2606.rn_2600 = rn_2605;
			rn_2606.rn_2585 = -2.5F;
			rn_2606.rn_2586 = 0.05F;
		}
		rn_2606.rn_2580 = rn_2604;
		rn_2606.rn_2582 = rn_2605;
		return rn_2606;
	}

	public final void rn_2607(float rn_2608, float rn_2609) {
		rn_2580 = rn_2580 + rn_2608;
		rn_2582 = rn_2582 + rn_2609;
		rn_2587.rn_3485 = rn_2587.rn_3485 - rn_2608;
		rn_2587.rn_3486 = rn_2587.rn_3486 - rn_2609;
	}

	public final void rn_2610(int rn_2611) {
		rn_2587.rn_3485 = -1 * rn_2611;
		rn_2587.rn_3486 = -1 * rn_2611;
		rn_2587.rn_3487 = rn_2611 * 2;
		rn_2587.rn_3488 = rn_2611 * 2;
	}

	public final float rn_2612() {
		return rn_2580 + rn_2581;
	}

	public final float rn_2613() {
		return rn_2582 + rn_2583;
	}

	public final boolean rn_2614() {
		rn_2580 = rn_2580 + rn_2584;
		rn_2582 = rn_2582 + rn_2585;
		rn_2585 = rn_2585 + rn_2586;
		rn_2594 = rn_2594 + rn_2595;
		if (rn_2594 < 0) {
			rn_2594 = rn_2594 + 360.0F;
		} else if (rn_2594 > 360.0F) {
			rn_2594 = rn_2594 - 360.0F;
		}
		if (rn_2593 < rn_2582 && rn_2593 != -1713.0F) {
			rn_2582 = rn_2593;
			rn_2584 = 0.0F;
		}
		if (rn_2580 < rn_2591 && rn_2591 != -1713.0F) {
			rn_2580 = rn_2591;
		}
		if (rn_2592 < rn_2580 && rn_2592 != -1713.0F) {
			rn_2580 = rn_2592;
		}
		if (rn_2589 == static_.rn_2618) {
			if ((rn_2587.rn_3490 || rn_2587.rn_3491) && rn_2597 == 0) {
				rn_2588.suncount = rn_2588.suncount + 25;
				rn_2588.collectSun(Coin.this);
				rn_2597 = 1;
			} else if (rn_2597 == 1) {
				rn_2596 = rn_2596 + 1;
				if (rn_2596 > 100) {
					return true;
				}
				rn_2581 = (-rn_2588.x - rn_2580 + 50) * rn_2596 / 100;
				rn_2583 = (-rn_2588.y - rn_2582 + 50) * rn_2596 / 100;
				if (rn_2596 > 80) {
					rn_2590.rn_3323("", new float[]{1.0F, 1.0F, 1.0F, (100 - rn_2596) / 20.0F});
				}
			}
		} else if (rn_2589 == static_.rn_2621) {
			if (rn_2582 > rn_2600) {
				rn_2582 = rn_2600;
				rn_2585 = 0;
				rn_2586 = 0;
			}
			if ((rn_2587.rn_3490 || rn_2587.rn_3491) && rn_2597 == 0) {
				rn_2588.clearance(Coin.this);
				rn_2597 = 1;
			} else if (rn_2597 == 1) {
				rn_2596 = rn_2596 + 1;
				if (rn_2596 > 500) {
					return true;
				}
			}
		}
		return false;
	}
}