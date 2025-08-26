package rn_4581.rn_4582.rn_4583;
import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import android.provider.MediaStore;
import android.database.Cursor;
import android.provider.DocumentsContract;
import android.os.Environment;
import android.content.ContentUris;
import android.view.*;
import android.app.*;
import android.content.Intent;
import android.os.Build;
import android.content.pm.*;
import android.content.pm.*;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_6840.rn_6841.rn_6842.rn_6928;
import rn_4581.rn_4582.rn_4583.rn_5408;
import rn_4581.rn_4582.rn_4583.rn_9458;

public class rn_9721 {
	public static void newActivity(android.app.Activity activity, Class<?> clazz) {
		android.content.Intent intent = new android.content.Intent(activity, clazz);
		activity.startActivity(intent);
	}
	
	public static void newActivity2(
			android.app.Activity activity, Class<?> clazz, android.content.Intent intent) {
		intent.setClass(activity, clazz);
		activity.startActivity(intent);
	}
	
	public static void newActivityForResult(android.app.Activity activity, Class<?> clazz, int requestCode) {
		android.content.Intent intent = new android.content.Intent(activity, clazz);
		activity.startActivityForResult(intent, requestCode);
	}
	
	public static void newActivityForResult2(
			android.app.Activity activity, Class<?> clazz, int requestCode, android.content.Intent intent) {
		intent.setClass(activity, clazz);
		activity.startActivityForResult(intent, requestCode);
	}
	static class FileChooseUtil {

		private Context context;
		private static FileChooseUtil util = null;

		private FileChooseUtil(Context context) {
			this.context = context;
		}

		public static FileChooseUtil getInstance(Context context) {
			if (util == null) {
				util = new FileChooseUtil(context);
			}
			return util;
		}

		/**
		 * 对外接口  获取uri对应的路径
		 *
		 * @param uri
		 * @return
		 */
		public String getChooseFileResultPath(Uri uri) {
			String chooseFilePath = null;
			if ("file".equalsIgnoreCase(uri.getScheme())) {//使用第三方应用打开
				chooseFilePath = uri.getPath();
				Toast.makeText(context, chooseFilePath, Toast.LENGTH_SHORT).show();
				return chooseFilePath;
			}
			if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT) {//4.4以后
				chooseFilePath = getPath(context, uri);
			}
			else {//4.4以下下系统调用方法
				chooseFilePath = getRealPathFromURI(uri);
			}
			return chooseFilePath;
		}

		private String getRealPathFromURI(Uri contentUri) {
			String res = null;
			String[] proj = {MediaStore.Images.Media.DATA};
			Cursor cursor = context.getContentResolver().query(contentUri, proj, null, null, null);
			if (null != cursor && cursor.moveToFirst()) {
				int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
				res = cursor.getString(column_index);
				cursor.close();
			}
			return res;
		}

		/**
		 * 专为Android4.4设计的从Uri获取文件绝对路径，以前的方法已不好使
		 */
		private String getPath(final Context context, final Uri uri) {

			final boolean isKitKat = Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;

			// DocumentProvider
			if (isKitKat && DocumentsContract.isDocumentUri(context, uri)) {
				// ExternalStorageProvider
				if (isExternalStorageDocument(uri)) {
					final String docId = DocumentsContract.getDocumentId(uri);
					final String[] split = docId.split(":");
					final String type = split[0];

					if ("primary".equalsIgnoreCase(type)) {
						return Environment.getExternalStorageDirectory() + "/" + split[1];

					}
				}
				else if (isDownloadsDocument(uri)) {
					final String id = DocumentsContract.getDocumentId(uri);
					final Uri contentUri = ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(id));
					return getDataColumn(context, contentUri, null, null);

				}
				else if (isMediaDocument(uri)) {
					final String docId = DocumentsContract.getDocumentId(uri);
					final String[] split = docId.split(":");
					final String type = split[0];

					Uri contentUri = null;
					if ("image".equals(type)) {
						contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

					}
					else if ("video".equals(type)) {
						contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

					}
					else if ("audio".equals(type)) {
						contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

					}

					final String selection = "_id=?";
					final String[] selectionArgs = new String[]{split[1]};

					return getDataColumn(context, contentUri, selection, selectionArgs);

				}

			}
			else if ("content".equalsIgnoreCase(uri.getScheme())) {
				return getDataColumn(context, uri, null, null);

			}
			else if ("file".equalsIgnoreCase(uri.getScheme())) {
				uri.getPath();

			}
			return null;
		}

		private String getDataColumn(Context context, Uri uri, String selection, String[] selectionArgs) {
			Cursor cursor = null;
			final String column = "_data";
			final String[] projection = {column};
			try {
				cursor = context.getContentResolver().query(uri, projection, selection, selectionArgs,
															null);
				if (cursor != null && cursor.moveToFirst()) {
					final int column_index = cursor.getColumnIndexOrThrow(column);
					return cursor.getString(column_index);
				}
			}
			finally {
				if (cursor != null)
					cursor.close();
			}
			return null;
		}

		/**
		 * @param uri The Uri to check.
		 * @return Whether the Uri authority is ExternalStorageProvider.
		 */
		private boolean isExternalStorageDocument(Uri uri) {
			return "com.android.externalstorage.documents".equals(uri.getAuthority());
		}

		/**
		 * @param uri The Uri to check.
		 * @return Whether the Uri authority is DownloadsProvider.
		 */
		private boolean isDownloadsDocument(Uri uri) {
			return "com.android.providers.downloads.documents".equals(uri.getAuthority());
		}

		/**
		 * @param uri The Uri to check.
		 * @return Whether the Uri authority is MediaProvider.
		 */
		private boolean isMediaDocument(Uri uri) {
			return "com.android.providers.media.documents".equals(uri.getAuthority());
		}
	}

	public static void rn_9747(android.app.Activity r_obj, int rn_9748) {
		r_obj.setRequestedOrientation(rn_9748);
	}

	public static android.content.Intent rn_9780(android.app.Activity r_obj) {
		return r_obj.getIntent();
	}

	public static void rn_9789(android.app.Activity r_obj, int rn_9790) {
		if (rn_9458.rn_9459 < 23) {
			return ;
		}
		try {
			PackageManager mPackageMgr = r_obj.getPackageManager();
			PackageInfo pack = mPackageMgr.getPackageInfo(r_obj.getPackageName(), PackageManager.GET_PERMISSIONS);
			String[] permissions = pack.requestedPermissions;
			r_obj.requestPermissions(permissions, rn_9790);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}