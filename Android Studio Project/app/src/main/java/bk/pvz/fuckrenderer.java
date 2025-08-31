package bk.pvz;
import android.opengl.GLSurfaceView.Renderer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.egl.EGLConfig;
import android.opengl.*;
import rn_6672.rn_6673.rn_6674.rn_4133;

public class fuckrenderer  implements android.opengl.GLSurfaceView.Renderer {
	private final float[] vPMatrix= new float[16];
	    private final float[] projMatrix= new float[16];
	    private final float[] vMatrix= new float[16];
	    public fuckrenderer() {
		        super();
		}
	
		@Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config){
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f); // 黑色背景
        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {
            GLES20.glViewport(0, 0, width, height);
			float ratio = (float) width / height;
			        // create a projection matrix from device screen geometry
			        Matrix.frustumM(projMatrix, 0, -ratio, ratio, -1, 1, 3, 7);
					Matrix.setLookAtM(vMatrix, 0, 0, 0, -3, 0f, 0f, 0f, 0f, 1.0f, 0.0f);
					        // Combine the projection and camera view matrices
					        Matrix.multiplyMM(vPMatrix, 0, projMatrix, 0, vMatrix, 0);
        }

        @Override
        public void onDrawFrame(GL10 gl) {
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        }
}