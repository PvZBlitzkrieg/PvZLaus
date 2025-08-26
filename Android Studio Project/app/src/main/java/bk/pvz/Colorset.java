package bk.pvz;
import rn_6840.rn_6841.rn_6842.rn_6928;
import bk.pvz.Pixmap_;
import bk.pvz.Canvas_;
import bk.pvz.ope;
import rn_4581.rn_4582.rn_4583.rn_9189;
import rn_6840.rn_6841.rn_6842.rn_6945;
import rn_4581.rn_4582.rn_4583.rn_9105;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.Texture_;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Paint_;

public class Colorset {
	public int[] rn_2018 = new int[0];
	public int rn_2019 = 0;
	public int rn_2020 = 0;
	public android.graphics.Bitmap rn_2021 = null;
	public com.badlogic.gdx.graphics.Pixmap rn_2022 = null;
	public com.badlogic.gdx.graphics.Texture rn_2023 = null;

	public static final Colorset rn_2024(int rn_2025, int rn_2026) {
		Colorset rn_2027 = new Colorset();
		rn_2027.rn_2033(rn_2025, rn_2026);
		return rn_2027;
	}

	public static final Colorset rn_2028(android.graphics.Bitmap rn_2029) {
		Colorset rn_2030 = new Colorset();
		rn_2030.rn_2033(rn_9105.rn_5642(rn_2029), rn_9105.rn_5646(rn_2029));
		ope.rn_1870(rn_2029, rn_2030.rn_2018, 0, rn_9105.rn_5642(rn_2029), 0, 0, rn_9105.rn_5642(rn_2029), rn_9105.rn_5646(rn_2029));
		return rn_2030;
	}

	public final Colorset rn_2031(android.graphics.Bitmap rn_2032) {
		rn_2033(rn_9105.rn_5642(rn_2032), rn_9105.rn_5646(rn_2032));
		ope.rn_1870(rn_2032, rn_2018, 0, rn_9105.rn_5642(rn_2032), 0, 0, rn_9105.rn_5642(rn_2032), rn_9105.rn_5646(rn_2032));
		return Colorset.this;
	}

	public final void rn_2033(int rn_2034, int rn_2035) {
		rn_2019 = rn_2034;
		rn_2020 = rn_2035;
		rn_2018 = (int[]) (new int[rn_2034 * rn_2035]);
	}

	public final int rn_2036(int rn_2037, int rn_2038) {
		return rn_2018 [rn_2038 * rn_2019 + rn_2037];
	}

	public final void rn_2039(int rn_2040, int rn_2041, int rn_2042) {
		rn_2018 [rn_2041 * rn_2019 + rn_2040] = rn_2042;
		rn_2021 = null;
	}

	public final int rn_2043(int rn_2044, int rn_2045) {
		if (0 <= rn_2044 && rn_2044 < rn_2019 && 0 <= rn_2045 && rn_2045 < rn_2020) {
			return rn_2018 [rn_2045 * rn_2019 + rn_2044];
		} else {
			return 0;
		}
	}

	public final void rn_2046(int rn_2047, int rn_2048, int rn_2049) {
		if (0 <= rn_2047 && rn_2047 < rn_2019 && 0 <= rn_2048 && rn_2048 < rn_2020) {
			rn_2018 [rn_2048 * rn_2019 + rn_2047] = rn_2049;
		}
	}

	public final android.graphics.Bitmap rn_2050() {
		if (rn_2021 != null) {
			return rn_2021;
		} else {
			android.graphics.Bitmap.Config rn_2051 = rn_9189.rn_9193;
			rn_2021=android.graphics.Bitmap.createBitmap(rn_2018,0,rn_2019,rn_2019,rn_2020,rn_2051);
			return rn_2021;
		}
	}
	public com.badlogic.gdx.graphics.Pixmap[] rn_2052 = new com.badlogic.gdx.graphics.Pixmap[0];
	public com.badlogic.gdx.graphics.Texture[] rn_2053 = new com.badlogic.gdx.graphics.Texture[0];

	public final com.badlogic.gdx.graphics.Pixmap rn_2054(int rn_2055, int rn_2056, int rn_2057) {
		if (rn_2055 == 1 && rn_2056 == 1 && rn_2057 == 0) {
			if (rn_2022 != null) {
				return rn_2022;
			} else {
				rn_2022 = Pixmap_.rn_4085(Colorset.this);
				return rn_2022;
			}
		} else {
			if (rn_2052.length > rn_2057) {
			} else {
				rn_2052 = (com.badlogic.gdx.graphics.Pixmap[]) (new com.badlogic.gdx.graphics.Pixmap[rn_2055 * rn_2056]);
			}
			if (rn_2052 [rn_2057] != null) {
				return rn_2052 [rn_2057];
			} else {
				com.badlogic.gdx.graphics.Pixmap rn_2058 = rn_2054(1, 1, 0);
				int rn_2059 = rn_2057;
				int rn_2060 = rn_2059 % rn_2055;
				int rn_2061 = (rn_2059 - (rn_2059 % rn_2055)) / rn_2056;
				if (rn_2055 != 1) {
					int rn_2062 = rn_2060 * Pixmap_.rn_4093(rn_2058) / rn_2055;
					int rn_2063 = Pixmap_.rn_4093(rn_2058) / rn_2055;
					int rn_2064 = Pixmap_.rn_4094(rn_2058);
					try {;
					rn_2058 = ope.rn_1885(rn_2058, rn_2062, 0, rn_2063, rn_2064);
					} catch (Exception e) {;
					};
				}
				if (rn_2056 != 1) {
					int rn_2065 = rn_2061 * Pixmap_.rn_4094(rn_2058) / rn_2056;
					int rn_2066 = Pixmap_.rn_4093(rn_2058);
					int rn_2067 = Pixmap_.rn_4094(rn_2058) / rn_2056;
					try {;
					rn_2058 = ope.rn_1885(rn_2058, 0, rn_2065, rn_2066, rn_2067);
					} catch (Exception e) {;
					};
				}
				rn_2052 [rn_2057] = rn_2058;
				return rn_2058;
			}
		}
	}

	public final com.badlogic.gdx.graphics.Texture rn_2068(int rn_2069, int rn_2070, int rn_2071) {
		if (rn_2069 == 1 && rn_2070 == 1 && rn_2071 == 0) {
			if (rn_2023 != null) {
				return rn_2023;
			} else {
				rn_2023 = Texture_.rn_4059(rn_2054(1, 1, 0));
				return rn_2023;
			}
		} else {
			if (rn_2053.length > rn_2071) {
			} else {
				rn_2053 = (com.badlogic.gdx.graphics.Texture[]) (new com.badlogic.gdx.graphics.Texture[rn_2069 * rn_2070]);
			}
			if (rn_2053 [rn_2071] != null) {
				return rn_2053 [rn_2071];
			} else {
				com.badlogic.gdx.graphics.Texture rn_2072 = Texture_.rn_4059(rn_2054(rn_2069, rn_2070, rn_2071));
				rn_2053 [rn_2071] = rn_2072;
				return rn_2072;
			}
		}
	}

	public final void rn_2073(Colorset rn_2074, int rn_2075, int rn_2076) {
		for (int rn_10534 = 0;rn_10534 < rn_2074.rn_2019;rn_10534 += 1) {
			for (int rn_10535 = 0;rn_10535 < rn_2074.rn_2020;rn_10535 += 1) {
				rn_2046(rn_2075 + rn_10534, rn_2076 + rn_10535, rn_2074.rn_2043(rn_10534, rn_10535));
			}
		}
	}

	public final Object rn_2077(Colorset rn_2078, float rn_2079, float rn_2080, float rn_2081, float rn_2082, float rn_2083, float rn_2084, int rn_2085) {
		rn_2084 = rn_2084;
		float rn_2086 = 360.0F - rn_2083;
		int rn_2087 = -1;
		if (rn_2086 < -360.0F) {
			rn_2086 = rn_2086 + 720.0F;
			rn_2087 = -16776961;
		}
		if (rn_2086 < 0.0F) {
			rn_2086 = rn_2086 + 360.0F;
			rn_2087 = -65536;
		}
		if (rn_2086 > 360.0F) {
			rn_2086 = rn_2086 - 360.0F;
			rn_2087 = -16711681;
		}
		int rn_2088 = (int) (rn_2078.rn_2019 * rn_2081);
		int rn_2089 = (int) (rn_2078.rn_2020 * rn_2082);
		for (int rn_10536 = 0;rn_10536 < rn_2088 * 2;rn_10536 += 1) {
			for (int rn_10537 = 0;rn_10537 < rn_2089 * 2;rn_10537 += 1) {
				float[] rn_2090 = new float[0];
				if (rn_2085 == -1) {
					return null;
				} else {
					rn_2090 = Colorset.rn_2099(rn_2079, rn_2080, rn_2079 + rn_10536 / 2.0F, rn_2080 + rn_10537 / 2.0F, rn_2086);
				}
				rn_2091((int) rn_2090 [0], (int) rn_2090 [1], rn_2078.rn_2043((int) (rn_10536 / 2.0F / rn_2081), (int) (rn_10537 / 2.0F / rn_2082)));
			}
		}
		return null;
	}

	public final void rn_2091(int rn_2092, int rn_2093, int rn_2094) {
		int[] rn_2095 = ope.rn_1863(rn_2094);
		if (rn_2095 [0] == 0) {
		} else if (rn_2095 [0] == 255) {
			rn_2046(rn_2092, rn_2093, rn_2094);
		} else {
			int[] rn_2096 = ope.rn_1863(rn_2043(rn_2092, rn_2093));
			float rn_2097 = rn_2095 [0] / 256.0F;
			int[] rn_2098 = (int[]) (new int[4]);
			rn_2098 [0] = 255;
			rn_2098 [1] = (int) ((1 - rn_2097) * rn_2096 [1] + rn_2097 * rn_2095 [1]);
			rn_2098 [2] = (int) ((1 - rn_2097) * rn_2096 [2] + rn_2097 * rn_2095 [2]);
			rn_2098 [3] = (int) ((1 - rn_2097) * rn_2096 [3] + rn_2097 * rn_2095 [3]);
			rn_2046(rn_2092, rn_2093, ope.rn_1865(rn_2098));
		}
	}

	public static final float[] rn_2099(float rn_2100, float rn_2101, float rn_2102, float rn_2103, float rn_2104) {
		rn_2104=new Float(Math.toRadians(rn_2104));
		float x2=new Float((rn_2102-rn_2100)*Math.cos(rn_2104) +(rn_2103-rn_2101)*Math.sin(rn_2104)+rn_2100);
		float y2=new Float(-(rn_2102-rn_2100)*Math.sin(rn_2104) + (rn_2103-rn_2101)*Math.cos(rn_2104)+rn_2101);
		float[] result={x2,y2};
		return result;
	}

	public final Colorset rn_2105(int rn_2106, int rn_2107, int rn_2108, int rn_2109) {
		Colorset rn_2110 = Colorset.rn_2024(rn_2108, rn_2109);
		for (int rn_10538 = 0;rn_10538 < rn_2108;rn_10538 += 1) {
			for (int rn_10539 = 0;rn_10539 < rn_2109;rn_10539 += 1) {
				rn_2110.rn_2046(rn_10538, rn_10539, rn_2043(rn_2106 + rn_10538, rn_2107 + rn_10539));
			}
		}
		return rn_2110;
	}

	public final android.graphics.Bitmap rn_2111(int rn_2112, int rn_2113, int rn_2114, int rn_2115) {
		Colorset rn_2116 = Colorset.rn_2024(rn_2114, rn_2115);
		for (int rn_10540 = 0;rn_10540 < rn_2114;rn_10540 += 1) {
			for (int rn_10541 = 0;rn_10541 < rn_2115;rn_10541 += 1) {
				rn_2116.rn_2046(rn_10540, rn_10541, rn_2043(rn_2112 + rn_10540, rn_2113 + rn_10541));
			}
		}
		return rn_2116.rn_2050();
	}

	public final void rn_2117(int rn_2118, int rn_2119, int rn_2120, int rn_2121, int rn_2122) {
		for (int rn_10542 = rn_2118;rn_10542 < rn_2118 + rn_2120;rn_10542 += 1) {
			for (int rn_10543 = rn_2119;rn_10543 < rn_2119 + rn_2121;rn_10543 += 1) {
				rn_2046(rn_10542, rn_10543, rn_2122);
			}
		}
	}

	public final void rn_2123(int rn_2124, int rn_2125, String rn_2126, android.graphics.Paint rn_2127) {
		int rn_2128 = (int) Paint_.rn_1673(rn_2127, rn_2126);
		int rn_2129 = (int) Paint_.rn_1669(rn_2127);
		android.graphics.Bitmap rn_2130 = rn_2111(rn_2124, rn_2125, rn_2128 * 2, rn_2129 + 20);
		android.graphics.Canvas rn_2131 = Canvas_.rn_1696(rn_2130);
		Canvas_.rn_1713(rn_2131, rn_2126, 0, rn_2129, rn_2127);
		rn_2073(Colorset.rn_2028(rn_2130), rn_2124, rn_2125);
	}

	public final void rn_2132(int rn_2133) {
		for (int rn_10544 = 0;rn_10544 < rn_2018.length;rn_10544 += 1) {
			rn_2018 [rn_10544] = rn_2133;
		}
	}
}