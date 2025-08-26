package bk.pvz;
import bk.pvz.POSLIST;
import bk.pvz.POS;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Anim;
import bk.pvz.Tracle;
import rn_4581.rn_4582.rn_4583.rn_7317;
import bk.pvz.STSL;
import bk.pvz.Reanimed;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.ParticleList;
import bk.pvz.static_;
import bk.pvz.TracleList;
import bk.pvz.op;
import bk.pvz.Renderinfo;
import bk.pvz.Quad;
import rn_6840.rn_6841.rn_6842.rn_6845;
import bk.pvz.ZombieList;
import bk.pvz.ope;
import rn_6840.rn_6841.rn_6842.rn_6945;
import bk.pvz.RenderinfoList;
import rn_6840.rn_6841.rn_6842.rn_6925;
import bk.pvz.Plant;
import bk.pvz.Particle;
import bk.pvz.Matrix_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Rectx;
import bk.pvz.Nirvana;
import bk.pvz.PlantList;
import bk.pvz.Const;

public class Zombie {
	public int rn_2166 = 0;
	public int rn_2167 = 0;
	public int rn_2168 = 0;
	public Anim rn_2169 = new Anim();
	public float rn_2170 = 0.0F;
	public float rn_2171 = 0.0F;
	public float rn_2172 = 0.0F;
	public int rn_2174 = -1;
	public boolean rn_2175 = false;
	public int rn_2176 = 0;
	public int rn_2177 = 0;
	public String rn_2178 = "";
	public boolean rn_2179 = false;
	public int rn_2180 = 0;
	public int rn_2181 = 0;
	public String rn_2182 = "";
	public boolean rn_2184 = false;
	public boolean rn_2185 = false;
	public boolean rn_2186 = false;
	public boolean rn_2187 = false;
	public boolean rn_2188 = false;
	public boolean rn_2189 = false;
	public float rn_2190 = 0.0F;
	public int rn_2192 = 0;
	public int rn_2193 = 0;
	public String rn_2194 = "none";
	public boolean rn_2196 = false;
	public boolean rn_2197 = false;
	public boolean rn_2198 = false;
	public int rn_2199 = 0;
	public boolean rn_2200 = false;
	public Quad rn_2201 = new Quad();
	public boolean rn_2202 = true;
	public float rn_2203 = 0F;
	public boolean rn_2204 = false;
	public float rn_2205 = 0F;
	public static String[] rn_2206 = {"anim_innerarm1", "anim_innerarm2", "anim_innerarm3"};
	public static String[] rn_2207 = {"Zombie_outerarm_upper", "Zombie_outerarm_lower", "Zombie_outerarm_hand"};
	public static String[] rn_2208 = {"Zombie_outerarm_screendoor", "Zombie_innerarm_screendoor", "Zombie_innerarm_screendoor_hand"};
	public static String[] rn_2209 = {"anim_screendoor"};
	public static String[] rn_2210 = {"anim_cone"};
	public static String[] rn_2211 = {"anim_bucket"};
	public static String[] rn_2212 = {"Zombie_flaghand", "Zombie_innerarm_screendoor"};
	public static String[] rn_2213 = {"Zombie_duckytube"};
	public static String[] rn_2214 = {"Zombie_mustache"};
	public static String[] rn_2215 = {"anim_tongue"};
	public static String[] rn_2216 = {"Zombie_mustache", "anim_tongue", "anim_head1", "anim_head2", "anim_hair"};
	public Nirvana rn_2217 = new Nirvana();
	public String rn_2218 = "uninit";
	public Rectx rn_2219 = new Rectx();
	public float rn_2220 = 0.0F;
	public String rn_2221 = "";
	public String rn_2222 = "";
	public float rn_2223 = 0.0F;
	public boolean rn_2224 = false;
	public android.graphics.Matrix rn_2226 = Matrix_.rn_3576();
	public boolean rn_2227 = false;
	public float rn_2228 = 0.0F;
	public Zombie[] rn_2229 = new Zombie[0];
	public boolean rn_2230 = false;

	public final void rn_2231(int rn_2232) {
		rn_2192 = rn_2232;
		rn_2198 = true;
		rn_2169.rn_3521("", new float[]{0.6F, 0.6F, 1.8F, 1.0F});
	}

	public final void rn_2233(boolean rn_2234) {
		if (rn_2234) {
			rn_2205 = rn_2329();
			rn_2220 = 0;
		} else if (rn_2204 == true) {
			rn_2170 = rn_2170 - rn_2220;
			rn_2220 = 0;
		}
		rn_2204 = rn_2234;
	}

	public final Zombie rn_2239(int rn_2240) {
		rn_2167 = rn_2240;
		rn_2166 = rn_2167;
		return Zombie.this;
	}

	public final Zombie rn_2241(int rn_2242) {
		rn_2181 = rn_2242;
		rn_2180 = rn_2181;
		return Zombie.this;
	}

	public final Zombie rn_2243(int rn_2244) {
		rn_2177 = rn_2244;
		rn_2176 = rn_2177;
		return Zombie.this;
	}

	public static final Zombie 万恶之源(Nirvana rn_2245, int rn_2246, int rn_2247) {
		Zombie rn_2248 = new Zombie();
		rn_2248.rn_2217 = rn_2245;
		rn_2248.rn_2170 = rn_7317.rn_7328(950, 1050);
		rn_2248.rn_2174 = rn_2247;
		rn_2248.rn_2218 = "walk";
		rn_2248.rn_2168 = rn_2246;
		rn_2248.rn_2260();
		rn_2248.rn_2228 = rn_2248.rn_2170;
		if (rn_2246 == 0) {
			rn_2248.rn_2258(0.2F);
		} else if (rn_2246 == 1) {
			rn_2248.rn_2258(0.4F);
			rn_2248.rn_2239(500);
			rn_2248.rn_2169.rn_3556(Zombie.rn_2279(new String[][]{rn_2212}), 0, false);
			rn_2248.rn_2169.rn_3556(Zombie.rn_2279(new String[][]{rn_2206}), -1, false);
			POS rn_2249 = new POS();
			rn_2249.rn_3283(-1719.0F);
			rn_2249.rn_3275 = 20;
			rn_2249.rn_3276 = 20;
			rn_2249.rn_3271 = 10;
			rn_2249.rn_3272 = -40;
			rn_2249.rn_3280 = 0;
			rn_2249.rn_3281 = 70;
			rn_2248.rn_2169.rn_3524("Zombie_flaghand", Anim.rn_3508("Zombie_FlagPole", rn_2245), rn_2249, true);
		} else if (rn_2246 == 2) {
			rn_2248.rn_2258(0.2F).rn_2266("anim_cone", 370);
		} else if (rn_2246 == 3) {
			rn_2248.rn_2251("run");
			rn_2248.rn_2239(500);
			rn_2248.rn_2175 = true;
			rn_2248.rn_2171 = Zombie.rn_2277(rn_2247) - 10;
			rn_2248.rn_2169 = Anim.rn_3508("Zombie_polevaulter", rn_2245);
			rn_2248.rn_2253("anim_run");
			rn_2248.rn_2223 = Zombie.rn_2255() * 0.8F;
			rn_2248.rn_2169.rn_3487 = rn_2248.rn_2223 * 2.0F;
			rn_2248.rn_2172 = rn_2248.rn_2223;
			rn_2248.rn_2169.rn_3556(Zombie.rn_2279(new String[][]{rn_2208, rn_2212, rn_2213, rn_2209, rn_2211, rn_2214}), -1, true);
			if (rn_7317.rn_7328(0, 100) < 50) {
				rn_2248.rn_2169.rn_3556(rn_2215, -1, false);
			}
		} else if (rn_2246 == 4) {
			rn_2248.rn_2258(0.4F).rn_2266("anim_bucket", 1100);
		} else if (rn_2246 == 5) {
			rn_2248.rn_2251("walk");
			rn_2248.rn_2241(150);
			rn_2248.rn_2239(270);
			rn_2248.rn_2171 = 50 + 100 * rn_2247;
			rn_2248.rn_2169 = Anim.rn_3508("Zombie_paper", rn_2245);
			rn_2248.rn_2182 = "Zombie_paper_paper";
			rn_2248.rn_2253("anim_walk");
			rn_2248.rn_2223 = Zombie.rn_2255() * 0.4F;
			rn_2248.rn_2169.rn_3487 = rn_2248.rn_2223 * 2.0F;
			rn_2248.rn_2172 = rn_2248.rn_2223;
			rn_2248.rn_2272("Zombie_paper_paper", 150);
		} else if (rn_2246 == 6) {
			rn_2248.rn_2258(0.4F).rn_2269("anim_screendoor", 1100);
		} else if (rn_2246 == 7) {
			rn_2248.rn_2218 = "walk";
			rn_2248.rn_2239(270);
			rn_2248.rn_2169 = Anim.rn_3508("Zombie_football", rn_2245);
			rn_2248.rn_2171 = rn_2248.rn_2291();
			rn_2248.rn_2253("anim_walk");
			rn_2248.rn_2223 = Zombie.rn_2255() * 1.5F;
			rn_2248.rn_2169.rn_3487 = rn_2248.rn_2223 * 2.0F;
			rn_2248.rn_2172 = rn_2248.rn_2223;
			rn_2248.rn_2266("zombie_football_helmet", 1400);
		} else if (rn_2246 == 8) {
			rn_2248.rn_2239(500);
			rn_2248.rn_2169 = Anim.rn_3508("Zombie_Jackson", rn_2245);
			rn_2248.rn_2171 = rn_2248.rn_2291();
			rn_2248.rn_2253("anim_moonwalk");
			rn_2248.rn_2223 = Zombie.rn_2255() * 0.5F;
			rn_2248.rn_2169.rn_3487 = rn_2248.rn_2223 * 2.0F;
			rn_2248.rn_2172 = rn_2248.rn_2223;
			rn_2248.rn_2227 = true;
			Matrix_.rn_3603(Matrix_.rn_3592(rn_2248.rn_2226, -1, 1), 100, 0);
			rn_2248.rn_2251("moonwalk");
			rn_2248.rn_2229 = (Zombie[]) (new Zombie[4]);
		} else if (rn_2246 == 9) {
			rn_2248.rn_2239(500);
			rn_2248.rn_2169 = Anim.rn_3508("Zombie_dancer", rn_2245);
			rn_2248.rn_2171 = rn_2248.rn_2291();
			rn_2248.rn_2253("anim_armraise");
			rn_2248.rn_2251("dance");
			rn_2248.rn_2223 = Zombie.rn_2255() * 0.5F;
			rn_2248.rn_2169.rn_3487 = rn_2248.rn_2223 * 2.0F;
			rn_2248.rn_2172 = rn_2248.rn_2223;
			Matrix_.rn_3603(Matrix_.rn_3592(rn_2248.rn_2226, -1, 1), 100, 0);
			rn_2248.rn_2256(rn_2248.rn_2169.rn_3487 / 2);
		}
		rn_2248.rn_2172 = 1.0F;
		return rn_2248;
	}

	public final void rn_2251(String rn_2252) {
		rn_2218 = rn_2252;
		rn_2222 = rn_2252;
	}

	public final void rn_2253(String rn_2254) {
		rn_2221 = rn_2254;
		rn_2169.rn_3562(rn_2254, false);
	}

	public static final float rn_2255() {
		return rn_7317.rn_7328(850, 1150) / 1000.0F;
	}

	public final Zombie rn_2256(float rn_2257) {
		rn_2223 = rn_2257 * 0.5F;
		rn_2169.rn_3487 = rn_2257;
		return Zombie.this;
	}

	public final Zombie rn_2258(float rn_2259) {
		rn_2251("walk");
		rn_2239(270);
		rn_2260();
		rn_2169 = Anim.rn_3508("Zombie", rn_2217);
		rn_2171 = rn_2291();
		if (rn_7317.rn_7328(0, 100) < 50) {
			rn_2253("anim_walk");
		} else {
			rn_2253("anim_walk2");
		}
		rn_2223 = rn_7317.rn_7328(700, 1300) / 1000.0F * rn_2259;
		rn_2169.rn_3487 = rn_2223 * 2.0F;
		rn_2172 = rn_2223;
		rn_2169.rn_3556(Zombie.rn_2279(new String[][]{rn_2208, rn_2212, rn_2213, rn_2209, rn_2210, rn_2211, rn_2214}), -1, true);
		rn_2275();
		return Zombie.this;
	}

	public final void rn_2260() {
		rn_2219.rn_3666 = 40;
		rn_2219.rn_3667 = 40;
		rn_2219.rn_3668 = 40;
		rn_2219.rn_3669 = 80;
	}

	public final Zombie rn_2266(String rn_2267, int rn_2268) {
		rn_2169.rn_3556(new String[]{rn_2267}, 0, false);
		rn_2178 = rn_2267;
		rn_2243(rn_2268);
		rn_2175 = true;
		return Zombie.this;
	}

	public final Zombie rn_2269(String rn_2270, int rn_2271) {
		rn_2169.rn_3556(Zombie.rn_2279(new String[][]{new String[]{rn_2270}, rn_2208}), 0, false);
		rn_2169.rn_3556(Zombie.rn_2279(new String[][]{rn_2206, rn_2207}), -1, false);
		rn_2182 = rn_2270;
		rn_2241(rn_2271);
		rn_2179 = true;
		return Zombie.this;
	}

	public final Zombie rn_2272(String rn_2273, int rn_2274) {
		rn_2182 = rn_2273;
		rn_2241(rn_2274);
		rn_2179 = true;
		return Zombie.this;
	}

	public final Zombie rn_2275() {
		if (rn_7317.rn_7328(0, 100) < 50) {
			rn_2169.rn_3556(rn_2215, -1, false);
		}
		return Zombie.this;
	}

	public final void rn_2276() {
		rn_2230 = true;
	}

	public static final int rn_2277(int rn_2278) {
		return 50 + 100 * rn_2278;
	}

	public static final String[] rn_2279(String[][] rn_2280) {
		int rn_2281 = 0;
		for (int rn_10546 = 0;rn_10546 < rn_2280.length;rn_10546 += 1) {
			rn_2281 = rn_2281 + rn_2280 [rn_10546].length;
		}
		int rn_2282 = 0;
		int rn_2283 = 0;
		String[] rn_2284 = (String[]) (new String[rn_2281]);
		for (int rn_10547 = 0;rn_10547 < rn_2281;rn_10547 += 1) {
			if (rn_2283 >= rn_2280 [rn_2282].length) {
				rn_2283 = 0;
				rn_2282 = rn_2282 + 1;
			}
			rn_2284 [rn_10547] = rn_2280 [rn_2282] [rn_2283];
			rn_2283 = rn_2283 + 1;
		}
		return rn_2284;
	}

	public final float rn_2291() {
		float rn_2292 = rn_2217.rn_1143(rn_2174, rn_2329() + 50) - 5;
		int rn_2293 = -130;
		if (rn_3289.rn_6850(rn_2169.rn_3482, "Zombie")) {
			rn_2293 = -130;
		} else if (rn_3289.rn_6850(rn_2169.rn_3482, "Zombie_polevaulter") || rn_3289.rn_6850(rn_2169.rn_3482, "Zombie_football")) {
			rn_2293 = -140;
		}
		return rn_2292 + rn_2293;
	}

	public final boolean rn_2294() {
		if (rn_2196) {
			return true;
		}
		if (rn_2230) {
			Tracle rn_2295 = Tracle.rn_2832(rn_2217, static_.rn_2809, rn_2329(), rn_2171);
			rn_2169.rn_3498 = true;
			POS rn_2296 = new POS();
			rn_2296.rn_3283(-1719.0F);
			Anim rn_2297 = Anim.rn_3508("LawnMoweredZombie", rn_2217).rn_3524("locator", rn_2169, rn_2296, true);
			rn_2297.rn_3499 = true;
			rn_2295.rn_2827 = rn_2297;
			TracleList.rn_2499(rn_2217.rn_480, rn_2295);
			return true;
		}
		if (rn_3289.rn_6850(rn_2169.rn_3495, "anim_idle")) {
		} else {
			float rn_2298 = rn_2291();
			float rn_2299 = rn_2171 - rn_2298;
			if (rn_2299 >= 1.0F) {
				rn_2171 = rn_2171 - 1.0F;
			} else if (rn_2299 <= -1.0F) {
				rn_2171 = rn_2171 + 1.0F;
			} else {
				rn_2171 = rn_2298;
			}
		}
		if (rn_2197) {
			rn_2197 = false;
		} else {
			rn_2197 = true;
		}
		if (rn_2192 == 0 && rn_2193 == 0) {
			rn_2169.rn_3502 = 1.0F;
		}
		if (rn_3289.rn_6850(rn_2218, "charry")) {
			Tracle rn_2300 = Tracle.rn_2832(rn_2217, static_.rn_2810, rn_2329(), rn_2171);
			TracleList.rn_2499(rn_2217.rn_480, rn_2300);
			return true;
		}
		if (rn_2170 < 0) {
			return true;
		}
		if (rn_2189 && (rn_2169.rn_3485 >= rn_2169.rn_3486 - 1.0F - rn_2169.rn_3487 || rn_2169.rn_3493)) {
			return true;
		}
		if (rn_2189 == false) {
			if (rn_2166 <= 0) {
				rn_2189 = true;
				rn_2184 = true;
				rn_2185 = true;
				rn_2186 = true;
				String[] rn_2301 = {"anim_death"};
				if (rn_3289.rn_6850(rn_2169.rn_3482, "Zombie")) {
					rn_2301 = new String[]{"anim_superlongdeath", "anim_death", "anim_death2"};
				}
				rn_2326();
				rn_2169.rn_3562(rn_2301 [rn_7317.rn_7328(0, rn_2301.length - 1)], false);
				rn_2169.rn_3556(new String[]{"Zombie_whitewater", "Zombie_whitewater2"}, -1, false);
				rn_2169.rn_3493 = false;
				return false;
			}
			rn_2329();
		}
		if (rn_2188 && rn_2197) {
			rn_2166 = rn_2166 - 1;
		}
		if (rn_3289.rn_6852(rn_2218, "eat")) {
			java.util.ArrayList<POS> rn_2302 = rn_2169.rn_3574("_ground").rn_3126;
			float rn_2303 = rn_2169.rn_3485;
			float rn_2304 = rn_2303 % 1;
			int rn_2305 = (int) (rn_2303 - rn_2304);
			if (rn_2169.rn_3489 == -1) {
				if (rn_2305 >= rn_2169.rn_3486) {
					rn_2305 = rn_2169.rn_3484;
					rn_2169.rn_3485 = rn_2169.rn_3484;
					rn_2326();
				}
			}
			float rn_2306 = POSLIST.rn_3129(rn_2302, rn_2169.rn_3484).rn_3271;
			float rn_2307 = POSLIST.rn_3129(rn_2302, rn_2305).rn_3271;
			int rn_2308 = rn_2305 + 1;
			if (rn_2308 >= rn_2169.rn_3486) {
				rn_2308 = rn_2169.rn_3484;
				rn_2326();
			} else {
				float rn_2309 = POSLIST.rn_3129(rn_2302, rn_2308).rn_3271;
				if (rn_2169.rn_3493) {
					rn_2326();
				} else if (rn_2169.rn_3489 == -1) {
					rn_2220 = -1 * ((rn_2309 - rn_2307) * rn_2304 * rn_2172 + (rn_2307 - rn_2306) * rn_2172);
					if (rn_2227) {
						float[] rn_2310 = Matrix_.rn_3579(rn_2226);
						rn_2220 = rn_2220 * rn_2310 [0];
					}
				}
			}
		}
		if (rn_2188 == false) {
			if (rn_2185 == false) {
				boolean rn_2311 = false;
				for (int rn_10550 = 0;rn_10550 < PlantList.rn_1225(rn_2217.rn_478);rn_10550 += 1) {
					Plant rn_2312 = PlantList.rn_2398((rn_2217.rn_478), rn_10550);
					if (rn_2312.rn_2622 == rn_2174 && rn_2312.rn_2633 == false) {
						int rn_2313 = (int) ((int) (rn_2329()));
						int rn_2314 = (int) ((int) (rn_2312.rn_2619));
						if (rn_2219.rn_3686(rn_2312.rn_2627, rn_2313, rn_2314)) {
							if (rn_2168 == 3 && rn_3289.rn_6850(rn_2218, "run")) {
								rn_2326();
								rn_2169.rn_3562("anim_jump", false);
								rn_2169.rn_3494 = "anim_walk";
								rn_2218 = "waitwalk";
								rn_2184 = true;
								rn_2185 = true;
							} else {
								if (rn_3289.rn_6850(rn_2218, "eat")) {
								} else {
									rn_2326();
									rn_2356(false);
									if (rn_2179) {
										rn_2352(false);
									}
									int rn_2315 = (int) ((int) (rn_2169.rn_3485));
									rn_2169.rn_3498 = false;
									rn_2169.rn_3499 = false;
									if (rn_3289.rn_6850(rn_2194, "gasp")) {
										rn_2169.rn_3562("anim_eat_nopaper", false);
									} else {
										rn_2169.rn_3562("anim_eat", false);
									}
									rn_2169.rn_3550(rn_2315, 4);
									rn_2327("eat");
								}
								if (rn_2312.rn_2617 == 4 && rn_3289.rn_6850(rn_2312.rn_2634, "idle")) {
									rn_2312.rn_2634 = "boom";
								}
								if (rn_2312.rn_2632 == false && rn_2197) {
									PlantList.rn_2398((rn_2217.rn_478), rn_10550).rn_2615 = PlantList.rn_2398((rn_2217.rn_478), rn_10550).rn_2615 - 1;
								}
								rn_2311 = true;
							}
							break;
						}
					}
				}
				if (rn_2311 == false && rn_3289.rn_6850(rn_2218, "eat")) {
					if (rn_2179) {
						rn_2352(true);
					}
					rn_2356(true);
					int rn_2316 = (int) ((int) (rn_2169.rn_3485));
					rn_2169.rn_3562(rn_2221, false);
					if (rn_2316 != rn_2169.rn_3484) {
						rn_2169.rn_3550(rn_2316, 4);
					}
					rn_2327(rn_2222);
				}
			}
		}
		if (rn_2189 == false) {
			if (rn_2168 == 8 || (rn_2168 == 9 && rn_3289.rn_6852(rn_2218, "pre"))) {
				if (rn_3289.rn_6850(rn_2218, "moonwalk")) {
					rn_2227 = Const.rn_1779;
					if (rn_2228 - rn_2329() >= 3 * rn_2217.rn_1025()) {
						rn_2326();
						rn_2227 = false;
						rn_2218 = "point";
						rn_2169.rn_3562("anim_point", false);
						rn_2169.rn_3499 = true;
					}
				} else if (rn_3289.rn_6850(rn_2218, "point")) {
					if (rn_2199 == 50) {
						for (int rn_10551 = 0;rn_10551 < 4;rn_10551 += 1) {
							if ((rn_2229 [rn_10551] == null || rn_2229 [rn_10551].rn_2202 == false) && ((rn_2174 == 0 && rn_10551 == 0) == false) && ((rn_2174 == rn_2217.rn_1148() - 1 && rn_10551 == 2) == false)) {
								int rn_2317 = rn_2174;
								Zombie rn_2318 = Zombie.万恶之源(rn_2217, 9, rn_2317);
								rn_2318.rn_2218 = "pre";
								rn_2318.rn_2169.rn_3498 = Const.rn_1779;
								if (rn_10551 == 0) {
									rn_2318.rn_2174 = rn_2174 - 1;
									rn_2318.rn_2170 = rn_2170;
									rn_2318.rn_2171 = rn_2171 - rn_2217.rn_1149();
								} else if (rn_10551 == 1) {
									rn_2318.rn_2170 = rn_2170 - rn_2217.rn_1150();
									rn_2318.rn_2171 = rn_2171;
								} else if (rn_10551 == 2) {
									rn_2318.rn_2174 = rn_2174 + 1;
									rn_2318.rn_2170 = rn_2170;
									rn_2318.rn_2171 = rn_2171 + rn_2217.rn_1149();
								} else if (rn_10551 == 3) {
									rn_2318.rn_2170 = rn_2170 + rn_2217.rn_1150();
									rn_2318.rn_2171 = rn_2171;
								}
								rn_2318.rn_2171 = rn_2318.rn_2171 + 100;
								rn_2318.rn_2185 = true;
								rn_2318.rn_2201 = Quad.rn_4286(-200, rn_2318.rn_2171 - 120, 400, 145, 1, 0);
								rn_2318.rn_2200 = Const.rn_1779;
								ZombieList.rn_2374(rn_2217.rn_477, rn_2318);
								Particle rn_2319 = Particle.rn_2852("DancerRise", rn_2318.rn_2329() + 10, rn_2318.rn_2171 - 15, rn_2174, rn_2217);
								ParticleList.rn_2530(rn_2217.rn_481, rn_2319);
								rn_2229 [rn_10551] = rn_2318;
							}
						}
					}
					if (rn_2199 >= 200) {
						rn_2256(rn_2169.rn_3487 / 2);
						rn_2199 = 0;
						rn_2169.rn_3562("anim_armraise", false);
						rn_2169.rn_3493 = false;
						rn_2251("dance");
						rn_2227 = true;
					} else {
						rn_2199 = rn_2199 + 1;
					}
				} else if (rn_3289.rn_6850(rn_2218, "dance")) {
					int rn_2320 = 67;
					if (rn_2168 == 9) {
						rn_2320 = 21;
					}
					int rn_2321 = 46;
					if (rn_2168 == 9) {
						rn_2321 = 0;
					}
					if (rn_3289.rn_6852(rn_2218, "pre") && rn_3289.rn_6852(rn_2218, "moonwalk") && rn_3289.rn_6852(rn_2218, "point") && rn_3289.rn_6852(rn_2218, "eat")) {
						rn_2169.rn_3498 = true;
						if (rn_2203 < 40) {
							rn_2169.rn_3484 = rn_2320;
							rn_2169.rn_3486 = rn_2320 + 12;
							if (rn_2169.rn_3485 > rn_2320 + rn_2203 % 10) {
								rn_2326();
							}
							rn_2169.rn_3485 = rn_2320 + rn_2203 % 10;
							rn_2227 = ope.rn_1861((((int) rn_2203 - (int) rn_2203 % 10) / 10 + 1) % 2);
						} else if (rn_2203 < 80) {
							rn_2169.rn_3484 = rn_2321;
							rn_2169.rn_3486 = rn_2321 + 22;
							if (rn_2169.rn_3485 > rn_2321 + (rn_2203 - 40) % 20) {
								rn_2326();
							}
							rn_2169.rn_3485 = rn_2321 + (rn_2203 - 40) % 20;
							rn_2227 = false;
						} else {
							rn_2203 = 0;
							if (rn_2325()) {
								rn_2218 = "point";
								rn_2169.rn_3562("anim_point", false);
								rn_2199 = 0;
								rn_2169.rn_3498 = false;
								rn_2169.rn_3499 = Const.rn_1779;
								rn_2169.rn_3487 = 1.0F;
							}
						}
						if (rn_2168 == 8) {
							boolean rn_2322 = false;
							for (int rn_10552 = 0;rn_10552 < rn_2229.length;rn_10552 += 1) {
								if (rn_2229 [rn_10552] != null && (rn_3289.rn_6850(rn_2229 [rn_10552].rn_2218, "eat") && rn_2229 [rn_10552].rn_2202 == Const.rn_1779)) {
									rn_2229 [rn_10552].rn_2227 = false;
									rn_2322 = true;
									break;
								}
							}
							rn_2233(rn_2322);
							for (int rn_10553 = 0;rn_10553 < rn_2229.length;rn_10553 += 1) {
								if (rn_2229 [rn_10553] != null) {
									rn_2229 [rn_10553].rn_2233(rn_2322);
								}
							}
						}
					}
					float rn_2323 = rn_2203;
					rn_2203 = rn_2203 + 0.2F;
					if (rn_2203 >= 60.0F && rn_2323 < 60.0F) {
						rn_2326();
					}
					for (int rn_10554 = 0;rn_10554 < rn_2229.length;rn_10554 += 1) {
						if (rn_2229 [rn_10554] != null) {
							rn_2229 [rn_10554].rn_2203 = rn_2203;
						}
					}
				} else if (rn_2168 == 8 && rn_3289.rn_6850(rn_2218, "eat")) {
					rn_2227 = false;
					for (int rn_10555 = 0;rn_10555 < rn_2229.length;rn_10555 += 1) {
						if (rn_2229 [rn_10555] != null) {
							rn_2229 [rn_10555].rn_2233(true);
						}
					}
				}
			} else if (rn_2168 == 9) {
				if (rn_3289.rn_6850(rn_2218, "pre")) {
					rn_2199 = rn_2199 + 1;
					if (rn_2199 == 100) {
						rn_2200 = false;
						rn_2169.rn_3498 = true;
						rn_2251("dance");
						rn_2199 = 0;
						rn_2185 = false;
						rn_2227 = true;
						rn_2169.rn_3498 = false;
						rn_2169.rn_3499 = Const.rn_1779;
					}
				}
			}
		}
		rn_2169.rn_3493 = false;
		rn_2324();
		return false;
	}

	public final void rn_2324() {
		if (rn_3289.rn_6864(rn_2169.rn_3495, "nopaper") && rn_3289.rn_6850(rn_2194, "doubt")) {
			rn_2169.rn_3487 = rn_2169.rn_3487 * 4;
			rn_2223 = rn_2223 * 4;
			rn_2194 = "gasp";
		}
		if (rn_3289.rn_6850(rn_2218, "waitwalk") && rn_2169.rn_3496) {
			rn_2251("walk");
			rn_2221 = "anim_walk";
			rn_2169.rn_3496 = false;
			rn_2169.rn_3487 = rn_2223 * 2.0F;
			rn_2170 = rn_2170 - 147;
			rn_2184 = false;
			rn_2185 = false;
			rn_2169.rn_3556(new String[]{"Zombie_polevaulter_pole", "Zombie_polevaulter_pole2"}, -1, false);
		}
		if (rn_2198 && rn_2192 <= 0) {
			rn_2169.rn_3521("", new float[]{1.0F, 1.0F, 1.0F, 1.0F});
		}
	}

	public final boolean rn_2325() {
		if (rn_2168 == 8) {
			for (int rn_10556 = 0;rn_10556 < 4;rn_10556 += 1) {
				if ((rn_2229 [rn_10556] == null && (rn_2174 == 0 && rn_10556 == 0) == false && (rn_2174 == rn_2217.rn_1148() - 1 && rn_10556 == 2) == false) || (rn_2229 [rn_10556] != null && rn_2229 [rn_10556].rn_2202 == false)) {
					return true;
				}
			}
		}
		return false;
	}

	public final void rn_2326() {
		if (rn_2204 == false) {
			rn_2170 = rn_2170 + rn_2220;
			rn_2220 = 0;
		}
	}

	public final void rn_2327(String rn_2328) {
		if (rn_3289.rn_6850(rn_2218, "walk")) {
			rn_2326();
		}
		if (rn_3289.rn_6850(rn_2328, "eat")) {
			rn_2169.rn_3487 = 1.0F;
		} else {
			rn_2169.rn_3487 = rn_2223 * 2.0F;
		}
		rn_2218 = rn_2328;
	}

	public final float rn_2329() {
		if (rn_2204) {
			return rn_2205;
		} else {
			return rn_2170 + rn_2220;
		}
	}

	public final void rn_2330(int rn_2331, int rn_2332) {
		if (rn_2332 == 2) {
			if ((rn_2179 || rn_2168 == 12) == false) {
				rn_2231(1000);
			}
		}
		if (rn_2179) {
			if (rn_2180 < rn_2331) {
				rn_2331 = rn_2331 - rn_2180;
				rn_2180 = 0;
				rn_2351();
			} else {
				rn_2180 = rn_2180 - rn_2331;
				rn_2345(rn_2182, 1.5F, 10);
				try {;
				if (rn_2180 < rn_2181 * 1.0F / 3.0F) {
					String rn_2333 = POSLIST.rn_3129((rn_2169.rn_3574(rn_2182).rn_3126), 0).rn_3279;
					rn_2169.rn_3529(rn_2182, rn_3289.rn_6887(rn_2333, 0, rn_6845.rn_1225(rn_2333) - 2) + "3");
				} else if (rn_2180 < rn_2181 * 2.0F / 3.0F) {
					String rn_2334 = POSLIST.rn_3129((rn_2169.rn_3574(rn_2182).rn_3126), 0).rn_3279;
					rn_2169.rn_3529(rn_2182, rn_3289.rn_6887(rn_2334, 0, rn_6845.rn_1225(rn_2334) - 2) + "2");
				}
				} catch (Exception e) {;
				ope.rn_1925(rn_2182);
				};
				return ;
			}
		}
		if (rn_2175) {
			if (rn_2176 < rn_2331) {
				rn_2331 = rn_2331 - rn_2176;
				rn_2176 = 0;
				rn_2350();
			} else {
				rn_2176 = rn_2176 - rn_2331;
				rn_2345(rn_2178, 1.5F, 10);
				if (rn_2176 < rn_2177 * 1.0F / 3.0F) {
					String rn_2335 = POSLIST.rn_3129((rn_2169.rn_3574(rn_2178).rn_3126), 0).rn_3279;
					int rn_2336 = 1;
					if (rn_3289.rn_6864(rn_2335, "1")) {
						rn_2336 = 2;
					}
					rn_2169.rn_3529(rn_2178, rn_3289.rn_6887(rn_2335, 0, rn_6845.rn_1225(rn_2335) - rn_2336) + "3");
				} else if (rn_2176 < rn_2177 * 2.0F / 3.0F) {
					String rn_2337 = POSLIST.rn_3129((rn_2169.rn_3574(rn_2178).rn_3126), 0).rn_3279;
					int rn_2338 = 1;
					if (rn_3289.rn_6864(rn_2337, "1")) {
						rn_2338 = 2;
					}
					rn_2169.rn_3529(rn_2178, rn_3289.rn_6887(rn_2337, 0, rn_6845.rn_1225(rn_2337) - rn_2338) + "2");
				}
				return ;
			}
		}
		if (rn_2166 < rn_2331) {
			rn_2166 = 0;
			if (rn_2332 == 1) {
				rn_2218 = "charry";
			}
		} else {
			rn_2166 = rn_2166 - rn_2331;
		}
		rn_2345("", 1.5F, 10);
		if (rn_2187 == false && rn_2166 < rn_2167 * 2.0F / 3.0F) {
			rn_2187 = true;
			int[] rn_2339 = {0, 1, 2, 4, 5, 6, 7, 8, 9, 10};
			if (op.rn_1409(rn_2339, rn_2168)) {
				rn_2340(new String[]{"Zombie_outerarm_lower", "Zombie_outerarm_hand"}, 50);
				rn_2169.rn_3529("Zombie_outerarm_upper", "IMAGE_REANIM_" + rn_3289.rn_6879("Zombie_outerarm_upper2"));
			} else if (rn_2168 == 3) {
				rn_2340(new String[]{"Zombie_polevaulter_outerarm_lower", "Zombie_outerarm_hand"}, 50);
				rn_2169.rn_3529("Zombie_polevaulter_outerarm_upper", "IMAGE_REANIM_" + rn_3289.rn_6879("Zombie_polevaulter_outerarm_upper2"));
			}
		}
		if (rn_2188 == false && rn_2166 < rn_2167 * 1.0F / 3.0F) {
			rn_2202 = false;
			rn_2188 = true;
			rn_2169.rn_3503 = 1.0F / rn_2169.rn_3487;
			rn_2340(rn_2216, 100);
		}
		return ;
	}

	public final void rn_2340(String[] rn_2341, int rn_2342) {
		String[] rn_2343 = rn_2169.rn_3553(rn_2341);
		rn_2169.rn_3556(rn_2341, -1, false);
		Tracle rn_2344 = Tracle.rn_2832(rn_2217, -1, rn_2329(), rn_2171);
		rn_2344.rn_2827 = rn_2169.rn_3506().rn_3556(rn_2343, 0, true);
		rn_2344.rn_2821 = ope.rn_1821(0.1F, 0.7F);
		rn_2344.rn_2816 = rn_2344.rn_2821;
		rn_2344.rn_2817 = 1.8F;
		rn_2344.rn_2824 = rn_2171 + rn_2342;
		rn_2344.rn_2839(30 + (int) (rn_2342 / rn_2344.rn_2817));
		TracleList.rn_2499(rn_2217.rn_480, rn_2344);
	}

	public final void rn_2345(String rn_2346, float rn_2347, float rn_2348) {
		float[] rn_2349 = {rn_2347, rn_2347, rn_2347, 1.0F};
		if (rn_3289.rn_6850(rn_2346, "")) {
			for (int rn_10557 = 0;rn_10557 < Reanimed.rn_1225(rn_2169.rn_3483);rn_10557 += 1) {
				RenderinfoList.rn_3453((rn_2169.rn_3497), rn_10557).rn_3435(rn_2349, rn_2348);
			}
		} else {
			rn_2169.rn_3517(rn_2346, rn_2349, rn_2348);
		}
	}

	public final void rn_2350() {
		rn_2175 = false;
		rn_2340(new String[]{rn_2178}, 100);
	}

	public final void rn_2351() {
		rn_2179 = false;
		rn_2340(new String[]{rn_2182}, 10);
		rn_2352(false);
		if (rn_2168 == 5) {
			rn_2326();
			if (rn_3289.rn_6850(rn_2169.rn_3495, "anim_eat")) {
				rn_2169.rn_3562("anim_gasp", false);
				rn_2169.rn_3494 = "anim_eat_nopaper";
			} else {
				rn_2169.rn_3562("anim_gasp", false);
				rn_2169.rn_3494 = "anim_walk_nopaper";
			}
			rn_2194 = "doubt";
		}
	}

	public final void rn_2352(boolean rn_2353) {
		int rn_2354 = -1;
		int rn_2355 = 0;
		if (rn_2353) {
			rn_2354 = 0;
			rn_2355 = -1;
		}
		rn_2169.rn_3556(rn_2208, rn_2354, false);
		rn_2169.rn_3556(Zombie.rn_2279(new String[][]{rn_2207, rn_2206}), rn_2355, false);
	}

	public final void rn_2356(boolean rn_2357) {
		int rn_2358 = -1;
		int rn_2359 = 0;
		if (rn_2357) {
			rn_2358 = 0;
			rn_2359 = -1;
		}
	}

	public final STSL rn_2360() {
		STSL rn_2361 = new STSL();
		rn_2361.rn_3661("BHP", rn_6928.rn_6933(rn_2166) + "/" + rn_6928.rn_6933(rn_2167));
		String rn_2362 = "0";
		if (rn_2175) {
			rn_2362 = rn_2176 + "/" + rn_2177 + "<" + rn_2178 + ">";
		}
		rn_2361.rn_3661("HHP", rn_2362);
		String rn_2363 = "0";
		if (rn_2179) {
			rn_2363 = rn_2180 + "/" + rn_2181 + "<" + rn_2182 + ">";
		}
		rn_2361.rn_3661("SHP", rn_2363);
		rn_2361.rn_3661("type", rn_6928.rn_6933(rn_2168));
		rn_2361.rn_3661("state", rn_4301.rn_6843(rn_2218));
		rn_2361.rn_3661("dtime", rn_6928.rn_6933(rn_2199));
		rn_2361.rn_3661("prex", rn_6945.rn_6947(rn_2220));
		rn_2361.rn_3661("ddt", rn_6945.rn_6947(rn_2203));
		rn_2361.rn_3661("anim.name", rn_2169.rn_3482 + "<" + rn_2169.rn_3495 + ">");
		rn_2361.rn_3661("anim.frame", rn_6945.rn_6947(rn_2169.rn_3485));
		rn_2361.rn_3661("anim.startframe", rn_6928.rn_6933(rn_2169.rn_3484));
		rn_2361.rn_3661("anim.maxframe", rn_6928.rn_6933(rn_2169.rn_3486));
		rn_2361.rn_3661("anim.speed", rn_6945.rn_6947(rn_2169.rn_3487));
		rn_2361.rn_3661("anim.mustframe", rn_6928.rn_6933(rn_2169.rn_3489));
		rn_2361.rn_3661("anim.musttime", rn_6945.rn_6947(rn_2169.rn_3490));
		rn_2361.rn_3661("anim.mustprocess", rn_6945.rn_6947(rn_2169.rn_3491));
		rn_2361.rn_3661("anim.return", rn_2169.rn_3494);
		rn_2361.rn_3661("anim.stop", rn_6925.rn_6926(rn_2169.rn_3498));
		rn_2361.rn_3661("anim.update", rn_6925.rn_6926(rn_2169.rn_3493));
		rn_2361.rn_3661("x", rn_6945.rn_6947(rn_2329()));
		rn_2361.rn_3661("y", rn_6945.rn_6947(rn_2171));
		rn_2361.rn_3661("xv", rn_6945.rn_6947(rn_2172));
		rn_2361.rn_3661("row", rn_6928.rn_6933(rn_2174));
		rn_2361.rn_3661("isInvincible", rn_6925.rn_6926(rn_2184));
		rn_2361.rn_3661("isUndetectable", rn_6925.rn_6926(rn_2185));
		rn_2361.rn_3661("isIntangible", rn_6925.rn_6926(rn_2186));
		rn_2361.rn_3661("cold", rn_6928.rn_6933(rn_2192));
		rn_2361.rn_3661("freeze", rn_6928.rn_6933(rn_2193));
		rn_2361.rn_3661("enableMatrix", rn_6925.rn_6926(rn_2227));
		return rn_2361;
	}
}