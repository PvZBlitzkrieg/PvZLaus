package bk.pvz;
import android.content.Intent;
import android.os.*;
import rn_4413.rn_4414.rn_4415.rn_9553;
import bk.pvz.Setup;
import bk.pvz.Editor;
import bk.pvz.v;
import rn_6672.rn_6673.rn_6674.rn_4133;
import rn_4413.rn_4414.rn_4415.rn_5373;
import rn_6672.rn_6673.rn_6674.rn_6767;
import bk.pvz.AA;
import rn_4413.rn_4414.rn_4415.rn_9353;
import bk.pvz.BitmapFontData_;
import bk.pvz.MIP;
import rn_4413.rn_4414.rn_4415.rn_8652;
import bk.pvz.tempE;
import bk.pvz.TextureRegion_;
import bk.pvz.BitmapFont_;
import rn_4413.rn_4414.rn_4415.rn_9915;
import bk.pvz.ope;
import rn_6672.rn_6673.rn_6674.rn_6757;
import bk.pvz.Nirvana;
import rn_6672.rn_6673.rn_6674.rn_6817;
import bk.pvz.Stringk;
import bk.pvz.AAC;
import bk.pvz.op;
import rn_4413.rn_4414.rn_4415.rn_9355;
import rn_6672.rn_6673.rn_6674.rn_6760;
import rn_6672.rn_6673.rn_6674.rn_3081;
import rn_4413.rn_4414.rn_4415.rn_9755;
import rn_4413.rn_4414.rn_4415.rn_7149;
import bk.pvz.XMLR;
import bk.pvz.Color_;
import rn_4413.rn_4414.rn_4415.rn_6943;
import rn_4126.rn_4127.rn_4128.rn_7529;
import bk.pvz.ShaderProgram_;
import bk.pvz.SpriteBatch;
import bk.pvz.FrameBuffer_;

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
	public void rn_3699() {
		this.rn_360 = new tempE(m.this);
		this.rn_361 = null;
		this.rn_362 = 0;
		this.rn_363 = 0;
		this.rn_364 = 1000 / 60;
		this.rn_367 = new Nirvana();
		this.rn_368 = false;
		this.rn_370 = op.rn_1258(100);
		this.rn_371 = 0;
		this.rn_372 = 1;
		this.rn_375 = "/storage/emulated/0/.pvz/log.";
		this.rn_376 = rn_364;
		this.rn_377 = 0;
		this.rn_378 = false;
		this.rn_379 = false;
		this.rn_380 = "0.45.831.1 alpha dev(vb45.250831.544201)";
		this.rn_381 = 0L;
		this.rn_382 = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
		this.rn_383 = new AA();
		this.rn_384 = false;
		this.rn_385 = 0L;
		this.rgb_vert = "attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\n\nuniform mat4 u_projTrans;\n\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main() {\n    v_color = a_color;\n    v_texCoords = a_texCoord0;\n    gl_Position = u_projTrans * a_position;\n}";
		this.rgb_frag = "#ifdef GL_ES\n    precision mediump float;\n#endif\n\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nuniform vec3 u_rgbFactors; // x=red, y=green, z=blue\nuniform float u_opacity;\nuniform vec4 u_clipRegion;\n\nvoid main() {\nif (gl_FragCoord.x < u_clipRegion.x ||\n      gl_FragCoord.y < u_clipRegion.y ||\n      gl_FragCoord.x > (u_clipRegion.x + u_clipRegion.z) ||\n      gl_FragCoord.y > (u_clipRegion.y + u_clipRegion.w)) {\n    discard;\n  }\n    vec4 color = texture2D(u_texture, v_texCoords);\n    // 应用RGB通道分离/增强\n    color.r *= u_rgbFactors.x;\n    color.g *= u_rgbFactors.y;\n    color.b *= u_rgbFactors.z;\n	color.a *= u_opacity;\n    gl_FragColor = color * v_color;\n}";
		this.rn_442 = R.style.Blue;
		rn_360.rn_5556(true);
		rn_360.rn_5568_s(new rn_4413.rn_4414.rn_4415.rn_5469.rn_5568_r() {
			@Override
			public void dispatch() {
				rn_438();
			}
		});
		rn_383.rn_3730_s(new bk.pvz.AA.rn_3730_r() {
			@Override
			public void dispatch() {
				rn_443();
			}
		});
		ope.alienatedGas(m.this);
		rn_3726(rn_383, rn_382);
		rn_361 = v.rn_1660(m.this);
		rn_361.setLayerType(android.view.View.LAYER_TYPE_HARDWARE, null);
		rn_367.frametime = rn_364;
		rn_367.mainThread = m.this;
		rn_362 = rn_6943.rn_6944(m.this);
		rn_363 = rn_6943.rn_6946(m.this);
		if (rn_378 == false) {
			if (rn_377 >= 5) {
				rn_360.rn_4(rn_360.rn_4() + "强制重启，等待一秒......");
				rn_378 = true;
				rn_402(1000);
				return ;
			}
			rn_377 = rn_377 + 1;
			rn_9553.rn_9621(m.this, 1);
			try {;
			rn_9755.rn_9845("/sdcard/");
			rn_9755.rn_9798("/sdcard/test.pvz_laus", "test");
			} catch (Exception e) {;
			rn_5373.rn_5375(m.this, "error:权限测试失败", false);
			rn_368 = true;
			return ;
			};
			rn_368 = false;
			if (rn_3081.rn_6684(rn_9755.rn_9795(rn_375, "UTF-8"), "finish")) {
				rn_360.rn_4(rn_360.rn_4() + "游戏启动被阻止，请求重新解压资源：\n");
				rn_409();
				return ;
			}
			rn_384 = true;
			getWindow().setBackgroundDrawable(null); // 移除窗口默认背景
			MIP rn_387 = new MIP();
			rn_387.rn_3965_s(new bk.pvz.MIP.rn_3965_r() {
				@Override
				public void dispatch(android.view.MotionEvent rn_389) {
					rn_367.handleTouch(rn_389, false);
				}
			});
			com.badlogic.gdx.Gdx.input.setInputProcessor(rn_387);;
			ope.rn_1827(m.this);
			rn_9553.rn_9579(m.this, 0);
			rn_5373.rn_5375(m.this, "你好，结绳！", false);
			try {;
			if (rn_9755.rn_9791(ope.rn_1683)) {
				rn_9755.rn_9798(ope.rn_1683 + ".bak", rn_9755.rn_9795(ope.rn_1683, "UTF-8"));
			}
			} catch (Exception e) {;
			};
			rn_9755.rn_9798(ope.rn_1683, "");
			try {;
			rn_370 = (int[]) (new int[(op.rn_1035(rn_362, rn_363) - op.rn_1032(rn_362, rn_363) * 4 / 3) / 2]);
			} catch (Exception e) {;
			};
			Thread thread = new Thread(new Runnable() { public void run() {;
			rn_367.initi(rn_362, rn_363);
			}}); thread.start();
			rn_367.drawuprate = rn_364;
			rn_367.speed = 12.0F / (1000 / rn_364) * 2;
			rn_397();
			rn_360.rn_5556(true);
			rn_360.rn_5568_s(new rn_4413.rn_4414.rn_4415.rn_5469.rn_5568_r() {
				@Override
				public void dispatch() {
					rn_438();
				}
			});
			rn_383.rn_3730_s(new bk.pvz.AA.rn_3730_r() {
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
		try {;
		if (rn_384 && rn_367.inited) {
			long rn_390 = rn_9915.rn_9921();
			com.badlogic.gdx.graphics.g2d.TextureRegion rn_391 = null;
			com.badlogic.gdx.graphics.glutils.FrameBuffer rn_392 = null;
			com.badlogic.gdx.graphics.g2d.SpriteBatch rn_393 = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
			rn_392 = FrameBuffer_.rn_3927(com.badlogic.gdx.Gdx.graphics.getWidth(), com.badlogic.gdx.Gdx.graphics.getHeight());
			if (rn_367.fbo != null) {
				rn_367.fbo.dispose();
			}
			rn_367.screen = rn_393;
			rn_367.fbo = rn_392;
			if (rn_367.rgbShader == null) {
				ShaderProgram_.rn_3936(false);
				rn_367.rgbShader = ShaderProgram_.rn_3933(rgb_vert, rgb_frag);
			}
			rn_391 = rn_367.法外狂徒(rn_376, rn_364);
			int rn_394 = (int) ((rn_9915.rn_9921() - rn_390));
			rn_370 [rn_371] = (int) (rn_394);
			if (rn_370 [rn_371] > rn_372) {
				rn_372 = rn_370 [rn_371];
			}
			rn_371 = rn_371 + 1;
			if (rn_371 >= rn_370.length) {
				rn_371 = 0;
			}
			try {;
			String rn_395 = rn_6760.rn_6765(rn_394) + "ms " + rn_367.getLoadingProc() + "x1 " + rn_9915.rn_9921() + "\n" + rn_367.loadproc.rn_2860 + "\nTM:" + rn_407(rn_404()) + "/" + rn_407(rn_405()) + " " + rn_407(rn_406()) + " available\n" + "ANL:" + rn_367.loadinfo + "\n" + "Drawing Info:" + rn_367.frameinfo + "\n" + "x:" + rn_367.predx + "  y:" + rn_367.predy + "\n" + "colorMatrix rebuild time:" + rn_367.buildtime + "\n" + "ds q:" + rn_367.ultna + "   ds n:" + rn_367.ultnb + "\n" + "proc:" + rn_367.proc + "  dptime:" + rn_367.animproc + "\n" + "wave:" + rn_367.wave + "  wavemax:" + rn_367.wavemax + "\n" + "Manger state:" + rn_367.state + "  CTAS:" + rn_367.sunapp + "  CCTAS:" + rn_367.canshedsun + "\n" + "card_move:" + rn_367.cardev + "   CBY:" + rn_367.csint + "\n" + rn_367.uinfo + "\n" + "This version is produced by Xborks,\nTG channel:t.me/xborks,\nGithub:github.com/urepoch/PvZLaus\n" + rn_380 + "\n---------------";
			if (rn_379) {
			} else {
				com.badlogic.gdx.graphics.g2d.SpriteBatch rn_396 = new com.badlogic.gdx.graphics.g2d.SpriteBatch();
				SpriteBatch.rn_3832(rn_396);
				SpriteBatch.rn_3833(rn_396, rn_391, (rn_362 - rn_363 * 4 / 3) / 2, 0);
				BitmapFontData_.rn_4006(BitmapFont_.rn_3989(rn_367.font1), 1);
				BitmapFont_.rn_3990(rn_367.font1, Color_.rn_3900(ope.rn_1792(ope.rn_1740(ope.rn_1818(new float[]{rn_367.gcv, 1.0F, 1.0F}), 255))));
				BitmapFont_.rn_3999(rn_367.font1, rn_396, rn_395, 0, rn_363);
				SpriteBatch.rn_3888(rn_396);
				rn_396.dispose();
				if (rn_367.screen != null) {
					rn_367.screen.dispose();
				}
			}
			rn_395 = null;
			rn_6943.rn_7015();
			if (rn_381 == 0L) {
				rn_381 = rn_9915.rn_9921();
			} else {
				rn_376 = (int) ((int) ((rn_9915.rn_9921() - rn_381)));
				rn_367.drawtime = rn_376;
				rn_381 = rn_9915.rn_9921();
			}
			} catch (Exception e) {;
			rn_5373.rn_5375(m.this, rn_6817.rn_6818(e), false);
			return ;
			};
		}
		rn_385 = rn_9915.rn_9921();
		} catch (Exception e) {;
		};
	}

	public final void rn_397() {
		if (true) {
			Thread thread = new Thread(new Runnable() { public void run() {;
			for (int rn_10240 = 0;rn_10240 < 10;rn_10240 += 1) {
				rn_10240 = 0;
				long rn_398 = rn_9915.rn_9921();
				if (rn_367.inited) {
					rn_367.Update();
				}
				rn_398 = rn_9915.rn_9921() - rn_398;
				if (rn_398 < 10) {
					try { Thread.sleep(10 - rn_398); } catch (Exception e) { e.printStackTrace(); };
				}
			}
			}}); thread.start();
		}
		Thread thread = new Thread(new Runnable() { public void run() {;
		for (int rn_10241 = 0;rn_10241 < 10;rn_10241 += 1) {
			rn_10241 = 0;
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
			ope.rn_1798("绘制异常:" + rn_6817.rn_6818(e));
			rn_5373.rn_5375(m.this, "绘制异常:" + rn_6817.rn_6818(e), false);
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
			return rn_7149.rn_7192(rn_408 / 1024.0F, 3) + " KiB";
		} else if (rn_408 <= 1024 * 1024 * 1024) {
			return rn_7149.rn_7192(rn_408 / 1024.0F / 1024.0F, 3) + " MiB";
		} else if (rn_408 <= 1024L * 1024L * 1024L * 1024L) {
			return rn_7149.rn_7192(rn_408 / 1024.0F / 1024.0F / 1024.0F, 3) + " GiB";
		} else if (rn_408 <= 1024L * 1024L * 1024L * 1024L * 1024L) {
			return rn_7149.rn_7192(rn_408 / 1024.0F / 1024.0F / 1024.0F / 1024.0F, 3) + " TiB";
		} else if (rn_408 >= 1024 * 1024 * 1024 * 1024 * 1024 && rn_408 <= 1024 * 1024 * 1024 * 1024 * 1024 * 1024) {
			return rn_7149.rn_7192(rn_408 / 1024.0F / 1024.0F / 1024.0F / 1024.0F / 1024.0F, 3) + " PiB";
		} else if (rn_408 >= 1024 * 1024 * 1024 * 1024 * 1024 * 1024 && rn_408 <= 1024 * 1024 * 1024 * 1024 * 1024 * 1024 * 1024) {
			return rn_7149.rn_7192(rn_408 / 1024.0F / 1024.0F / 1024.0F / 1024.0F / 1024.0F / 1024.0F, 3) + " EiB";
		}
		return rn_6767.rn_6771(rn_408);
	}

	public final void rn_409() {
		Thread thread = new Thread(new Runnable() { public void run() {;
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_360.rn_4(rn_360.rn_4() + "正在提取压缩文件：\n");
		}});
		rn_9755.rn_9818(m.this, "pvz", "/storage/emulated/0/.pvz/res.23");
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_360.rn_4(rn_360.rn_4() + "解压资源：\n");
		}});
		rn_7529.rn_7550("/storage/emulated/0/.pvz/res.23", "/storage/emulated/0/");
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_360.rn_4(rn_360.rn_4() + "解压完成，重新尝试启动......\n");
		}});
		String rn_410 = rn_9755.rn_9795(rn_375, "UTF-8");
		if (rn_3081.rn_6684(rn_410, "keep")) {
			rn_9755.rn_9798(rn_375, "finish");
		}
		m.this.runOnUiThread(new Runnable() { public void run() {;
		rn_3699();
		}});
		}}); thread.start();
	}

	private void rn_438() {
		XMLR rn_439 = new XMLR();
		XMLR.rn_2835(rn_439, Stringk.rn_2864(rn_9755.rn_9795("/storage/emulated/0/.pvz/pvz/properties/levels.xml", "UTF-8")), 0);
	}
	public int rn_442;

	private void rn_443() {
		霜雪千年();
	}
}