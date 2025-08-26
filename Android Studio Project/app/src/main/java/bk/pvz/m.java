package bk.pvz;
import android.content.Intent;
import android.os.*;
import rn_4581.rn_4582.rn_4583.rn_9521;
import rn_6840.rn_6841.rn_6842.rn_3289;
import bk.pvz.Color_;
import rn_4581.rn_4582.rn_4583.rn_9523;
import rn_4581.rn_4582.rn_4583.rn_7317;
import bk.pvz.Setup;
import bk.pvz.v;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_6840.rn_6841.rn_6842.rn_6985;
import bk.pvz.XMLR;
import rn_4581.rn_4582.rn_4583.rn_10083;
import bk.pvz.TextureRegion_;
import bk.pvz.MIP;
import bk.pvz.tempE;
import bk.pvz.op;
import bk.pvz.AA;
import rn_4581.rn_4582.rn_4583.rn_9721;
import rn_4581.rn_4582.rn_4583.rn_7111;
import bk.pvz.ope;
import bk.pvz.SpriteBatch;
import bk.pvz.ShaderProgram_;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_4294.rn_4295.rn_4296.rn_7697;
import rn_4581.rn_4582.rn_4583.rn_9923;
import bk.pvz.Stringk;
import bk.pvz.AAC;
import bk.pvz.FrameBuffer_;
import bk.pvz.BitmapFont_;
import rn_6840.rn_6841.rn_6842.rn_4301;
import bk.pvz.BitmapFontData_;
import rn_6840.rn_6841.rn_6842.rn_6935;
import bk.pvz.Nirvana;
import rn_4581.rn_4582.rn_4583.rn_8820;
import rn_4581.rn_4582.rn_4583.rn_5752;

public class m extends Setup {
	public void onInit() {
	}

	public tempE rn_360;
	public v rn_361;
	public int rn_362;
	public int rn_363;
	public int rn_364;
	public Nirvana rn_367;
	public boolean rn_368;
	public int[] rn_370;
	public int rn_371;
	public int rn_372;
	public String rn_375;
	public int rn_376;
	public int rn_377;
	public boolean rn_378;
	public boolean rn_379;
	public String rn_380;
	public long rn_381;
	public com.badlogic.gdx.backends.android.AndroidApplicationConfiguration rn_382;
	public AA rn_383;
	public boolean rn_384;
	public long rn_385;

	@Override
	public void rn_3867() {
		this.rn_360 = new tempE(m.this);
		this.rn_361 = null;
		this.rn_362 = 0;
		this.rn_363 = 0;
		this.rn_364 = 1000 / 60;
		this.rn_367 = new Nirvana();
		this.rn_368 = false;
		this.rn_370 = op.rn_1396(100);
		this.rn_371 = 0;
		this.rn_372 = 1;
		this.rn_375 = "/storage/emulated/0/.pvz/log.";
		this.rn_376 = rn_364;
		this.rn_377 = 0;
		this.rn_378 = false;
		this.rn_379 = false;
		this.rn_380 = "0.43.810.1 alpha dev(vb43.250810.481322)";
		this.rn_381 = 0L;
		this.rn_382 = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
		this.rn_383 = new AA();
		this.rn_384 = false;
		this.rn_385 = 0L;
		this.rgb_vert = "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\n\nuniform mat4 u_projTrans;\n\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main() {\n    v_color = a_color;\n    v_texCoords = a_texCoord0;\n    gl_Position = u_projTrans * a_position;\n}";
		this.rgb_frag = "#ifdef GL_ES\n    precision mediump float;\n#endif\n\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nuniform vec3 u_rgbFactors; // x=red, y=green, z=blue\nuniform float u_opacity;\nuniform vec4 u_clipRegion;\n\nvoid main() {\nif (gl_FragCoord.x < u_clipRegion.x ||\n      gl_FragCoord.y < u_clipRegion.y ||\n      gl_FragCoord.x > (u_clipRegion.x + u_clipRegion.z) ||\n      gl_FragCoord.y > (u_clipRegion.y + u_clipRegion.w)) {\n    discard;\n  }\n    vec4 color = texture2D(u_texture, v_texCoords);\n    // 应用RGB通道分离/增强\n    color.r *= u_rgbFactors.x;\n    color.g *= u_rgbFactors.y;\n    color.b *= u_rgbFactors.z;\n	color.a *= u_opacity;\n    gl_FragColor = color * v_color;\n}";

		rn_360.rn_5724(true);
		rn_360.rn_5736_s(new rn_4581.rn_4582.rn_4583.rn_5637.rn_5736_r() {
			@Override
			public void dispatch() {
				rn_438();
			}
		});
		rn_383.rn_3898_s(new bk.pvz.AA.rn_3898_r() {
			@Override
			public void dispatch() {
				rn_443();
			}
		});
		ope.rn_1834(m.this);
		rn_3894(rn_383, rn_382);
		rn_361 = v.rn_1797(m.this);
		rn_361.setLayerType(android.view.View.LAYER_TYPE_HARDWARE, null);
		rn_367.rn_496 = rn_364;
		rn_367.rn_457 = m.this;
		rn_362 = rn_7111.rn_7112(m.this);
		rn_363 = rn_7111.rn_7114(m.this);
		if (rn_378 == false) {
			if (rn_377 >= 5) {
				rn_360.rn_4(rn_360.rn_4() + "强制重启，等待一秒......");
				rn_378 = true;
				rn_402(1000);
				return ;
			}
			rn_377 = rn_377 + 1;
			rn_9721.rn_9789(m.this, 1);
			try {;
			rn_9923.rn_10013("/sdcard/");
			rn_9923.rn_9966("/sdcard/test.pvz_laus", "test");
			} catch (Exception e) {;
			rn_5541.rn_5543(m.this, "error:权限测试失败", false);
			rn_368 = true;
			return ;
			};
			rn_368 = false;
			if (rn_3289.rn_6852(rn_9923.rn_9963(rn_375, "UTF-8"), "finish")) {
				rn_360.rn_4(rn_360.rn_4() + "游戏启动被阻止，请求重新解压资源：\n");
				rn_409();
				return ;
			}
			rn_384 = true;
			getWindow().setBackgroundDrawable(null); // 移除窗口默认背景
			MIP rn_387 = new MIP();
			rn_387.rn_4133_s(new bk.pvz.MIP.rn_4133_r() {
				@Override
				public void dispatch(android.view.MotionEvent rn_389) {
					rn_367.rn_928(rn_389, false);
				}
			});
			com.badlogic.gdx.Gdx.input.setInputProcessor(rn_387);;
			ope.rn_1954(m.this);
			rn_9721.rn_9747(m.this, 0);
			rn_5541.rn_5543(m.this, "你好，结绳！", false);
			try {;
			if (rn_9923.rn_9959(ope.rn_1820)) {
				rn_9923.rn_9966(ope.rn_1820 + ".bak", rn_9923.rn_9963(ope.rn_1820, "UTF-8"));
			}
			} catch (Exception e) {;
			};
			rn_9923.rn_9966(ope.rn_1820, "");
			try {;
			rn_370 = (int[]) (new int[(op.rn_1239(rn_362, rn_363) - op.rn_1236(rn_362, rn_363) * 4 / 3) / 2]);
			} catch (Exception e) {;
			};
			Thread thread = new Thread(new Runnable() { public void run() {;
			rn_367.rn_560(rn_362, rn_363);
			}}); thread.start();
			rn_367.rn_474 = rn_364;
			rn_367.rn_471 = 12.0F / (1000 / rn_364) * 2;
			rn_397();
			rn_360.rn_5724(true);
			rn_360.rn_5736_s(new rn_4581.rn_4582.rn_4583.rn_5637.rn_5736_r() {
				@Override
				public void dispatch() {
					rn_438();
				}
			});
			rn_383.rn_3898_s(new bk.pvz.AA.rn_3898_r() {
				@Override
				public void dispatch() {
					rn_443();
				}
			});
		}
	}
	public String rgb_vert;
	public String rgb_frag;

	public final void 霜雪千年() {
		if (rn_384 && rn_367.rn_533) {
			long rn_390 = rn_10083.rn_10089();
			com.badlogic.gdx.graphics.g2d.TextureRegion rn_391 = null;
			com.badlogic.gdx.graphics.glutils.FrameBuffer rn_392 = null;
			com.badlogic.gdx.graphics.g2d.SpriteBatch rn_393 = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
			rn_392 = FrameBuffer_.rn_4095(com.badlogic.gdx.Gdx.graphics.getWidth(), com.badlogic.gdx.Gdx.graphics.getHeight());
			if (rn_367.rn_454 != null) {
				rn_367.rn_454.dispose();
			}
			rn_367.rn_453 = rn_393;
			rn_367.rn_454 = rn_392;
			if (rn_367.rn_524 == null) {
				ShaderProgram_.rn_4104(false);
				rn_367.rn_524 = ShaderProgram_.rn_4101(rgb_vert, rgb_frag);
			}
			rn_391 = rn_367.法外狂徒(rn_376, rn_364);
			int rn_394 = (int) ((rn_10083.rn_10089() - rn_390));
			rn_370 [rn_371] = (int) (rn_394);
			if (rn_370 [rn_371] > rn_372) {
				rn_372 = rn_370 [rn_371];
			}
			rn_371 = rn_371 + 1;
			if (rn_371 >= rn_370.length) {
				rn_371 = 0;
			}
			try {;
			String rn_395 = rn_6928.rn_6933(rn_394) + "ms " + rn_367.rn_978() + "x1 " + rn_10083.rn_10089() + "\n" + rn_367.rn_447.rn_3081 + "\nTM:" + rn_407(rn_404()) + "/" + rn_407(rn_405()) + " " + rn_407(rn_406()) + " available\n" + "ANL:" + rn_367.rn_514 + "\n" + "Drawing Info:" + rn_367.rn_515 + "\n" + "x:" + rn_367.rn_502 + "  y:" + rn_367.rn_503 + "\n" + "colorMatrix rebuild time:" + rn_367.rn_995 + "\n" + "ds q:" + rn_367.rn_521 + "   ds n:" + rn_367.rn_522 + "\n" + "proc:" + rn_367.rn_510 + "  dptime:" + rn_367.rn_484 + "\n" + "wave:" + rn_367.rn_493 + "  wavemax:" + rn_367.rn_494 + "\n" + "Manger state:" + rn_367.rn_530 + "  CTAS:" + rn_367.rn_490 + "  CCTAS:" + rn_367.rn_547 + "\n" + "card_move:" + rn_367.rn_550 + "   CBY:" + rn_367.rn_541 + "\n" + rn_367.rn_555 + "\n" + "This version is produced by Xborks,\nTG channel:t.me/xborks,\nGithub:github.com/urepoch/PvZLaus\n" + rn_380 + "\n---------------";
			if (rn_379) {
			} else {
				com.badlogic.gdx.graphics.g2d.SpriteBatch rn_396 = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
				SpriteBatch.rn_4000(rn_396);
				SpriteBatch.rn_4001(rn_396, rn_391, (rn_362 - rn_363 * 4 / 3) / 2, 0);
				BitmapFontData_.rn_4174(BitmapFont_.rn_4157(rn_367.rn_525), 1);
				BitmapFont_.rn_4158(rn_367.rn_525, Color_.rn_4068(ope.rn_1919(ope.rn_1867(ope.rn_1945(new float[]{rn_367.rn_458, 1.0F, 1.0F}), 255))));
				BitmapFont_.rn_4167(rn_367.rn_525, rn_396, rn_395, 0, rn_363);
				SpriteBatch.rn_4056(rn_396);
				rn_396.dispose();
				if (rn_367.rn_453 != null) {
					rn_367.rn_453.dispose();
				}
			}
			rn_395 = null;
			rn_7111.rn_7183();
			if (rn_381 == 0L) {
				rn_381 = rn_10083.rn_10089();
			} else {
				rn_376 = (int) ((int) ((rn_10083.rn_10089() - rn_381)));
				rn_367.rn_495 = rn_376;
				rn_381 = rn_10083.rn_10089();
			}
			} catch (Exception e) {;
			rn_5541.rn_5543(m.this, rn_6985.rn_6986(e), false);
			return ;
			};
		}
		rn_385 = rn_10083.rn_10089();
	}

	public final void rn_397() {
		if (true) {
			Thread thread = new Thread(new Runnable() { public void run() {;
			for (int rn_10408 = 0;rn_10408 < 10;rn_10408 += 1) {
				rn_10408 = 0;
				long rn_398 = rn_10083.rn_10089();
				if (rn_367.rn_533) {
					rn_367.rn_1113();
				}
				rn_398 = rn_10083.rn_10089() - rn_398;
				if (rn_398 < 10) {
					try { Thread.sleep(10 - rn_398); } catch (Exception e) { e.printStackTrace(); };
				}
			}
			}}); thread.start();
		}
		Thread thread = new Thread(new Runnable() { public void run() {;
		for (int rn_10409 = 0;rn_10409 < 10;rn_10409 += 1) {
			rn_10409 = 0;
			try {;
			int rn_399 = rn_371 - 1;
			if (rn_399 == -1) {
				rn_399 = rn_370.length - 1;
			}
			int rn_400 = rn_399 - 1;
			if (rn_400 < 0) {
				rn_400 = rn_370.length - 1;
			}
			int rn_401 = rn_370 [rn_400];
			if (rn_401 < rn_364) {
				try { Thread.sleep(rn_364 - rn_401); } catch (Exception e) { e.printStackTrace(); };
				rn_401 = rn_364;
			}
			} catch (Exception e) {;
			m.this.runOnUiThread(new Runnable() { public void run() {;
			ope.rn_1925("绘制异常:" + rn_6985.rn_6986(e));
			rn_5541.rn_5543(m.this, "绘制异常:" + rn_6985.rn_6986(e), false);
			}});
			};
		}
		}}); thread.start();
	}

	public final void rn_402(int rn_403) {
		new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent LaunchIntent = getPackageManager().getLaunchIntentForPackage(getApplication().getPackageName());
                        LaunchIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(LaunchIntent);
                    }
                }, rn_403);
	}

	public final long rn_404() {
		return Runtime.getRuntime().totalMemory();
	}

	public final long rn_405() {
		return Runtime.getRuntime().maxMemory();
	}

	public final long rn_406() {
		return Runtime.getRuntime().freeMemory();
	}

	public final String rn_407(long rn_408) {
		if (rn_408 <= 1024) {
			return rn_408 + " B";
		} else if (rn_408 <= 1024 * 1024) {
			return rn_7317.rn_7360(rn_408 / 1024.0F, 3) + " KiB";
		} else if (rn_408 <= 1024 * 1024 * 1024) {
			return rn_7317.rn_7360(rn_408 / 1024.0F / 1024.0F, 3) + " MiB";
		} else if (rn_408 <= 1024L * 1024L * 1024L * 1024L) {
			return rn_7317.rn_7360(rn_408 / 1024.0F / 1024.0F / 1024.0F, 3) + " GiB";
		} else if (rn_408 <= 1024L * 1024L * 1024L * 1024L * 1024L) {
			return rn_7317.rn_7360(rn_408 / 1024.0F / 1024.0F / 1024.0F / 1024.0F, 3) + " TiB";
		} else if (rn_408 >= 1024 * 1024 * 1024 * 1024 * 1024 && rn_408 <= 1024 * 1024 * 1024 * 1024 * 1024 * 1024) {
			return rn_7317.rn_7360(rn_408 / 1024.0F / 1024.0F / 1024.0F / 1024.0F / 1024.0F, 3) + " PiB";
		} else if (rn_408 >= 1024 * 1024 * 1024 * 1024 * 1024 * 1024 && rn_408 <= 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024) {
			return rn_7317.rn_7360(rn_408 / 1024.0F / 1024.0F / 1024.0F / 1024.0F / 1024.0F / 1024.0F, 3) + " EiB";
		}
		return rn_6935.rn_6939(rn_408);
	}

	public final void rn_409() {
		Thread thread = new Thread(new Runnable() { public void run() {;
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_360.rn_4(rn_360.rn_4() + "正在提取压缩文件：\n");
		}});
		rn_9923.rn_9986(m.this, "pvz", "/storage/emulated/0/.pvz/res.23");
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_360.rn_4(rn_360.rn_4() + "解压资源：\n");
		}});
		rn_7697.rn_7718("/storage/emulated/0/.pvz/res.23", "/storage/emulated/0/");
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_360.rn_4(rn_360.rn_4() + "解压完成，重新尝试启动......\n");
		}});
		String rn_410 = rn_9923.rn_9963(rn_375, "UTF-8");
		if (rn_3289.rn_6852(rn_410, "keep")) {
			rn_9923.rn_9966(rn_375, "finish");
		}
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_3867();
		}});
		}}); thread.start();
	}

	private void rn_438() {
		XMLR rn_439 = new XMLR();
		XMLR.rn_3056(rn_439, Stringk.rn_3085(rn_9923.rn_9963("/storage/emulated/0/.pvz/pvz/properties/levels.xml", "UTF-8")), 0);
	}
	public int rn_442;

	private void rn_443() {
		霜雪千年();
	}
}