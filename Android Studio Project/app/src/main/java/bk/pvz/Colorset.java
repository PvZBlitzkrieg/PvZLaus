package bk.pvz;
import rn_4413.rn_4414.rn_4415.rn_9021;
import bk.pvz.Canvas_;
import bk.pvz.Texture_;
import bk.pvz.Pixmap_;
import rn_6672.rn_6673.rn_6674.rn_6777;
import bk.pvz.Paint_;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_8937;
import bk.pvz.ope;

public class Colorset {
	public int[] rn_1891 = new int[0];
	public int rn_1892 = 0;
	public int rn_1893 = 0;
	public android.graphics.Bitmap rn_1894 = null;
	public com.badlogic.gdx.graphics.Pixmap rn_1895 = null;
	public com.badlogic.gdx.graphics.Texture rn_1896 = null;

	public static final Colorset rn_1897(int rn_1898, int rn_1899) {
		Colorset rn_1900 = new Colorset();
		rn_1900.rn_1906(rn_1898, rn_1899);
		return rn_1900;
	}

	public static final Colorset rn_1901(android.graphics.Bitmap rn_1902) {
		Colorset rn_1903 = new Colorset();
		rn_1903.rn_1906(rn_8937.rn_5474(rn_1902), rn_8937.rn_5478(rn_1902));
		ope.rn_1743(rn_1902, rn_1903.rn_1891, 0, rn_8937.rn_5474(rn_1902), 0, 0, rn_8937.rn_5474(rn_1902), rn_8937.rn_5478(rn_1902));
		return rn_1903;
	}

	public final Colorset rn_1904(android.graphics.Bitmap rn_1905) {
		rn_1906(rn_8937.rn_5474(rn_1905), rn_8937.rn_5478(rn_1905));
		ope.rn_1743(rn_1905, rn_1891, 0, rn_8937.rn_5474(rn_1905), 0, 0, rn_8937.rn_5474(rn_1905), rn_8937.rn_5478(rn_1905));
		return Colorset.this;
	}

	public final void rn_1906(int rn_1907, int rn_1908) {
		rn_1892 = rn_1907;
		rn_1893 = rn_1908;
		rn_1891 = (int[]) (new int[rn_1907 * rn_1908]);
	}

	public final int rn_1909(int rn_1910, int rn_1911) {
		return rn_1891 [rn_1911 * rn_1892 + rn_1910];
	}

	public final void rn_1912(int rn_1913, int rn_1914, int rn_1915) {
		rn_1891 [rn_1914 * rn_1892 + rn_1913] = rn_1915;
		rn_1894 = null;
	}

	public final int rn_1916(int rn_1917, int rn_1918) {
		if (0 <= rn_1917 && rn_1917 < rn_1892 && 0 <= rn_1918 && rn_1918 < rn_1893) {
			return rn_1891 [rn_1918 * rn_1892 + rn_1917];
		} else {
			return 0;
		}
	}

	public final void rn_1919(int rn_1920, int rn_1921, int rn_1922) {
		if (0 <= rn_1920 && rn_1920 < rn_1892 && 0 <= rn_1921 && rn_1921 < rn_1893) {
			rn_1891 [rn_1921 * rn_1892 + rn_1920] = rn_1922;
		}
	}

	public final android.graphics.Bitmap rn_1923() {
		if (rn_1894 != null) {
			return rn_1894;
		} else {
			android.graphics.Bitmap.Config rn_1924 = rn_9021.rn_9025;
			rn_1894=android.graphics.Bitmap.createBitmap(rn_1891,0,rn_1892,rn_1892,rn_1893,rn_1924);
			return rn_1894;
		}
	}
	public com.badlogic.gdx.graphics.Pixmap[] rn_1925 = new com.badlogic.gdx.graphics.Pixmap[0];
	public com.badlogic.gdx.graphics.Texture[] rn_1926 = new com.badlogic.gdx.graphics.Texture[0];

	public final com.badlogic.gdx.graphics.Pixmap rn_1927(int rn_1928, int rn_1929, int rn_1930) {
		if (rn_1928 == 1 && rn_1929 == 1 && rn_1930 == 0) {
			if (rn_1895 != null) {
				return rn_1895;
			} else {
				rn_1895 = Pixmap_.rn_3917(Colorset.this);
				return rn_1895;
			}
		} else {
			if (rn_1925.length > rn_1930) {
			} else {
				rn_1925 = (com.badlogic.gdx.graphics.Pixmap[]) (new com.badlogic.gdx.graphics.Pixmap[rn_1928 * rn_1929]);
			}
			if (rn_1925 [rn_1930] != null) {
				return rn_1925 [rn_1930];
			} else {
				com.badlogic.gdx.graphics.Pixmap rn_1931 = rn_1927(1, 1, 0);
				int rn_1932 = rn_1930;
				int rn_1933 = rn_1932 % rn_1928;
				int rn_1934 = (rn_1932 - (rn_1932 % rn_1928)) / rn_1929;
				if (rn_1928 != 1) {
					int rn_1935 = rn_1933 * Pixmap_.rn_3925(rn_1931) / rn_1928;
					int rn_1936 = Pixmap_.rn_3925(rn_1931) / rn_1928;
					int rn_1937 = Pixmap_.rn_3926(rn_1931);
					try {;
					rn_1931 = ope.rn_1758(rn_1931, rn_1935, 0, rn_1936, rn_1937);
					} catch (Exception e) {;
					};
				}
				if (rn_1929 != 1) {
					int rn_1938 = rn_1934 * Pixmap_.rn_3926(rn_1931) / rn_1929;
					int rn_1939 = Pixmap_.rn_3925(rn_1931);
					int rn_1940 = Pixmap_.rn_3926(rn_1931) / rn_1929;
					try {;
					rn_1931 = ope.rn_1758(rn_1931, 0, rn_1938, rn_1939, rn_1940);
					} catch (Exception e) {;
					};
				}
				rn_1925 [rn_1930] = rn_1931;
				return rn_1931;
			}
		}
	}

	public final com.badlogic.gdx.graphics.Texture rn_1941(int rn_1942, int rn_1943, int rn_1944) {
		if (rn_1942 == 1 && rn_1943 == 1 && rn_1944 == 0) {
			if (rn_1896 != null) {
				return rn_1896;
			} else {
				rn_1896 = Texture_.rn_3891(rn_1927(1, 1, 0));
				return rn_1896;
			}
		} else {
			if (rn_1926.length > rn_1944) {
			} else {
				rn_1926 = (com.badlogic.gdx.graphics.Texture[]) (new com.badlogic.gdx.graphics.Texture[rn_1942 * rn_1943]);
			}
			if (rn_1926 [rn_1944] != null) {
				return rn_1926 [rn_1944];
			} else {
				com.badlogic.gdx.graphics.Texture rn_1945 = Texture_.rn_3891(rn_1927(rn_1942, rn_1943, rn_1944));
				rn_1926 [rn_1944] = rn_1945;
				return rn_1945;
			}
		}
	}

	public final void rn_1946(Colorset rn_1947, int rn_1948, int rn_1949) {
		for (int rn_10384 = 0;rn_10384 < rn_1947.rn_1892;rn_10384 += 1) {
			for (int rn_10385 = 0;rn_10385 < rn_1947.rn_1893;rn_10385 += 1) {
				rn_1919(rn_1948 + rn_10384, rn_1949 + rn_10385, rn_1947.rn_1916(rn_10384, rn_10385));
			}
		}
	}

	public final Object rn_1950(Colorset rn_1951, float rn_1952, float rn_1953, float rn_1954, float rn_1955, float rn_1956, float rn_1957, int rn_1958) {
		rn_1957 = rn_1957;
		float rn_1959 = 360.0F - rn_1956;
		int rn_1960 = -1;
		if (rn_1959 < -360.0F) {
			rn_1959 = rn_1959 + 720.0F;
			rn_1960 = -16776961;
		}
		if (rn_1959 < 0.0F) {
			rn_1959 = rn_1959 + 360.0F;
			rn_1960 = -65536;
		}
		if (rn_1959 > 360.0F) {
			rn_1959 = rn_1959 - 360.0F;
			rn_1960 = -16711681;
		}
		int rn_1961 = (int) (rn_1951.rn_1892 * rn_1954);
		int rn_1962 = (int) (rn_1951.rn_1893 * rn_1955);
		for (int rn_10386 = 0;rn_10386 < rn_1961 * 2;rn_10386 += 1) {
			for (int rn_10387 = 0;rn_10387 < rn_1962 * 2;rn_10387 += 1) {
				float[] rn_1963 = new float[0];
				if (rn_1958 == -1) {
					return null;
				} else {
					rn_1963 = Colorset.rn_1972(rn_1952, rn_1953, rn_1952 + rn_10386 / 2.0F, rn_1953 + rn_10387 / 2.0F, rn_1959);
				}
				rn_1964((int) rn_1963 [0], (int) rn_1963 [1], rn_1951.rn_1916((int) (rn_10386 / 2.0F / rn_1954), (int) (rn_10387 / 2.0F / rn_1955)));
			}
		}
		return null;
	}

	public final void rn_1964(int rn_1965, int rn_1966, int rn_1967) {
		int[] rn_1968 = ope.rn_1736(rn_1967);
		if (rn_1968 [0] == 0) {
		} else if (rn_1968 [0] == 255) {
			rn_1919(rn_1965, rn_1966, rn_1967);
		} else {
			int[] rn_1969 = ope.rn_1736(rn_1916(rn_1965, rn_1966));
			float rn_1970 = rn_1968 [0] / 256.0F;
			int[] rn_1971 = (int[]) (new int[4]);
			rn_1971 [0] = 255;
			rn_1971 [1] = (int) ((1 - rn_1970) * rn_1969 [1] + rn_1970 * rn_1968 [1]);
			rn_1971 [2] = (int) ((1 - rn_1970) * rn_1969 [2] + rn_1970 * rn_1968 [2]);
			rn_1971 [3] = (int) ((1 - rn_1970) * rn_1969 [3] + rn_1970 * rn_1968 [3]);
			rn_1919(rn_1965, rn_1966, ope.rn_1738(rn_1971));
		}
	}

	public static final float[] rn_1972(float rn_1973, float rn_1974, float rn_1975, float rn_1976, float rn_1977) {
		rn_1977=new Float(Math.toRadians(rn_1977));
		float x2=new Float((rn_1975-rn_1973)*Math.cos(rn_1977) +(rn_1976-rn_1974)*Math.sin(rn_1977)+rn_1973);
		float y2=new Float(-(rn_1975-rn_1973)*Math.sin(rn_1977) + (rn_1976-rn_1974)*Math.cos(rn_1977)+rn_1974);
		float[] result={x2,y2};
		return result;
	}

	public final Colorset rn_1978(int rn_1979, int rn_1980, int rn_1981, int rn_1982) {
		Colorset rn_1983 = Colorset.rn_1897(rn_1981, rn_1982);
		for (int rn_10388 = 0;rn_10388 < rn_1981;rn_10388 += 1) {
			for (int rn_10389 = 0;rn_10389 < rn_1982;rn_10389 += 1) {
				rn_1983.rn_1919(rn_10388, rn_10389, rn_1916(rn_1979 + rn_10388, rn_1980 + rn_10389));
			}
		}
		return rn_1983;
	}

	public final android.graphics.Bitmap rn_1984(int rn_1985, int rn_1986, int rn_1987, int rn_1988) {
		Colorset rn_1989 = Colorset.rn_1897(rn_1987, rn_1988);
		for (int rn_10390 = 0;rn_10390 < rn_1987;rn_10390 += 1) {
			for (int rn_10391 = 0;rn_10391 < rn_1988;rn_10391 += 1) {
				rn_1989.rn_1919(rn_10390, rn_10391, rn_1916(rn_1985 + rn_10390, rn_1986 + rn_10391));
			}
		}
		return rn_1989.rn_1923();
	}

	public final void rn_1990(int rn_1991, int rn_1992, int rn_1993, int rn_1994, int rn_1995) {
		for (int rn_10392 = rn_1991;rn_10392 < rn_1991 + rn_1993;rn_10392 += 1) {
			for (int rn_10393 = rn_1992;rn_10393 < rn_1992 + rn_1994;rn_10393 += 1) {
				rn_1919(rn_10392, rn_10393, rn_1995);
			}
		}
	}

	public final void rn_1996(int rn_1997, int rn_1998, String rn_1999, android.graphics.Paint rn_2000) {
		int rn_2001 = (int) Paint_.rn_1536(rn_2000, rn_1999);
		int rn_2002 = (int) Paint_.rn_1532(rn_2000);
		android.graphics.Bitmap rn_2003 = rn_1984(rn_1997, rn_1998, rn_2001 * 2, rn_2002 + 20);
		android.graphics.Canvas rn_2004 = Canvas_.rn_1559(rn_2003);
		Canvas_.rn_1576(rn_2004, rn_1999, 0, rn_2002, rn_2000);
		rn_1946(Colorset.rn_1901(rn_2003), rn_1997, rn_1998);
	}

	public final void rn_2005(int rn_2006) {
		for (int rn_10394 = 0;rn_10394 < rn_1891.length;rn_10394 += 1) {
			rn_1891 [rn_10394] = rn_2006;
		}
	}
}