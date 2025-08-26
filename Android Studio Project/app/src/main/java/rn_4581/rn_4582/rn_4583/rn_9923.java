package rn_4581.rn_4582.rn_4583;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.nio.channels.*;
import java.util.zip.CRC32;
import java.security.*;
import android.content.Intent;
import android.net.Uri;
import rn_6840.rn_6841.rn_6842.rn_6925;
import rn_4581.rn_4582.rn_4583.rn_5541;
import rn_4294.rn_4295.rn_4296.rn_6193;
import rn_6840.rn_6841.rn_6842.rn_6961;
import rn_6840.rn_6841.rn_6842.rn_4301;
import rn_6840.rn_6841.rn_6842.rn_3289;
import rn_4581.rn_4582.rn_4583.rn_6301;

public class rn_9923 {
	private static FileInputStream fin;
	private static InputStreamReader isr;
	private static BufferedReader br;
	private static String line;
	private static FileOutputStream fout;
	private static OutputStreamWriter osw;
	private static BufferedWriter bw;
   
    /**
     * Copy or move file/directory
     */

    public static void moveTo(File from, File to) throws IOException {
        if (from.isDirectory()) {
            moveDir(from, to);
        } else {
            moveFile(from, to);
        }
    }

    public static void copyTo(File from, File to) throws IOException {
        if (from.isDirectory()) {
            copyDir(from, to);
        } else {
            copyFile(from, to);
        }
    }

    private static void moveDir(File oldFile, File newFile) throws IOException {
        copyDir(oldFile, newFile);
        deleteFile(oldFile);
    }

    private static void moveFile(File oldFile, File newFile) throws IOException {
        copyFile(oldFile, newFile);
        deleteFile(oldFile);
    }

    private static void copyDir(File srcFile, File dstFile) throws IOException {
        if (!dstFile.exists())
            dstFile.mkdirs();
        for (File file : dstFile.listFiles()) {
            if (file.isDirectory()) {
                copyDir(file, new File(dstFile.getAbsolutePath() + File.separator + file.getName()));
            } else {
                copyFile(file, new File(dstFile.getAbsolutePath() + File.separator + file.getName()));
            }
        }
    }

    private static void copyFile(File srcFile, File dstFile) throws IOException {
        if (!srcFile.exists()) {
            return;
        }
        if (!dstFile.exists()) {
            dstFile.getParentFile().mkdirs();
            if (srcFile.isFile())
                dstFile.createNewFile();
        }
        FileInputStream fileIns = null;
        FileOutputStream fileOuts = null;
        FileChannel source = null;
        FileChannel destination = null;
        try {
            fileIns = new FileInputStream(srcFile);
            fileOuts = new FileOutputStream(dstFile);
            source = fileIns.getChannel();
            destination = fileOuts.getChannel();
            destination.transferFrom(source, 0, source.size());
        } catch (IOException e) {
            throw e;
        } finally {
            if (fileIns != null)
                fileIns.close();
            if (fileOuts != null)
                fileOuts.close();
            if (source != null)
                source.close();
            if (destination != null)
                destination.close();
        }
    }

    

    public static String getSHA1(File file) throws IOException {
        return getDigest(file, "SHA1");
    }

    public static String getMD5(File file) throws IOException {
        return getDigest(file, "MD5");
    }

    private static String getDigest(File file, String algo) throws IOException {
        try {
            MessageDigest md = MessageDigest.getInstance(algo);
            byte[] buffer = new byte[8192];
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                int r = fis.read(buffer);
                if (r == -1) {
                    break;
                }
                md.update(buffer, 0, r);
            }
            fis.close();
            return new java.math.BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {

        }
        return null;
    }

    /**
     * Write file...
     */

    public static void write(File file, String content) throws IOException {
        if (!file.exists()) {
            createFile(file);
        }
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        writer.write(content);
        writer.flush();
        writer.close();
    }

    public static void write(File file, byte[] bytes) throws IOException {
        write(file, bytes, 0, bytes.length);
    }

    public static void write(File file, byte[] bytes, int offset, int len) throws IOException {
        if (!file.exists()) {
            createFile(file);
        }
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytes, offset, len);
        fos.flush();
        fos.close();
    }

    /**
     * Append to the end of file
     */

    public static void append(File file, byte[] appendix) throws IOException {
        append(file, appendix, 0, appendix.length);
    }

    public static void append(File file, byte[] appendix, int off, int len) throws IOException {
        if (!file.exists()) {
            createFile(file);
        }
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.seek(raf.length());
        raf.write(appendix, off, len);
        raf.close();
    }

    public static void append(File file, String appendix) throws IOException {
        if (!file.exists()) {
            createFile(file);
        }
        FileWriter fw = new FileWriter(file, true);
        fw.write(appendix);
        fw.flush();
        fw.close();
    }

    /**
     * Search files by name
     * 
     * @param file The <strong>directory</strong> you want to search
     * @param match The name or regular expression.This is decided by useRegex
     * @param useRegex Whether the parameter 'match' is a regex
     * @param ignoreCase Whether we should ignore the case
     * @param searchSub Whether we should search sub directories
     * @return The unodered result of searching
     */
    public static List<File> searchByName(File file, String match, boolean useRegex, boolean ignoreCase,
            boolean searchSub) {
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("not a directory");
        }
        ArrayList<File> result = new ArrayList<>();
        Pattern pattern = null;
        if (useRegex) {
            if (ignoreCase) {
                pattern = Pattern.compile(match, Pattern.CASE_INSENSITIVE);
            } else {
                pattern = Pattern.compile(match);
            }
        } else {
            if (ignoreCase) {
                match = match.toLowerCase();
            }
        }
        for (File f : file.listFiles()) {
            searchByNameInternal(result, f, match, ignoreCase, useRegex, pattern, searchSub);
        }
        return result;
    }

    /**
     * Thia is a helper method of searchByName() to search fies actually
     */
    private static void searchByNameInternal(List<File> result, File file, String match, boolean ignoreCase,
            boolean useRegex, Pattern pattern, boolean searchSub) {
        if (useRegex) {
            Matcher m = pattern.matcher(file.getName());
            if (m.find()) {
                result.add(file);
            }
        } else {
            if (ignoreCase) {
                if (file.getName().toLowerCase().contains(match)) {
                    result.add(file);
                }
            } else {
                if (file.getName().contains(match)) {
                    result.add(file);
                }
            }
        }
        if (file.isDirectory() && searchSub) {
            for (File sub : file.listFiles()) {
                searchByNameInternal(result, sub, match, ignoreCase, useRegex, pattern, searchSub);
            }
        }
    }

    /**
     * Delete the given file
     * @param file The file to delete
     * @return Whether we succeeded
     */
    public static boolean deleteFile(File file) {
        boolean success = true;
        if (file.exists()) {
            if (file.isDirectory()) {
                for (File subFile : file.listFiles()) {
                    if (!success) {
                        return false;
                    }
                    success = success && deleteFile(subFile);
                }
            }
            if (success)
                success = success && file.delete();
        }
        return success;
    }
	
	public static boolean createFile(File file) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Create the given file as directory
     * @param file The file to create as a directory
     * @return Whether we succeeded
     */
    public static boolean createDirectory(File file) {
        return file.mkdirs();
    }

    /**
     * Get the name of file by string path
     * @param path Path of a file
     * @return file name
     */
    public static String getFileName(String path) {
        int pos = path.lastIndexOf(File.pathSeparator);
        if (pos == -1) {
            return path;
        } else {
            return path.substring(pos + 1, path.length());
        }
    }

    /**
     * Get the parent path of file by string path
     * @param path Path of a file parent
     * @return parent path
     */
    public static String getFilePath(String path) {
        int pos = path.lastIndexOf(File.pathSeparator);
        if (pos == -1) {
            return path;
        } else {
            return path.substring(0, pos + 1);
        }
    }
	
	private static long getFileSize(File file) throws Exception {
		return file.length();
	}

	private static long getFileSizes(File f) throws Exception {
		long size = 0;
		File[] flist = f.listFiles();
		for (int i = 0; i < flist.length; i++) {
			if (flist[i].isDirectory()) {
				size += getFileSizes(flist[i]);
			} else {
				size += getFileSize(flist[i]);
			}
		}
		return size;
	}
	
	private static boolean writeStreamToFile(InputStream stream, File file) throws FileNotFoundException, IOException {
		OutputStream output = new FileOutputStream(file);
		byte[] buffer = new byte[1024];
		while (true) {
			int read = stream.read(buffer);
			if (read != -1) {
				output.write(buffer, 0, read);
			} else {
				output.flush();
				output.close();
				stream.close();
				return true;
			}
		}
	}
	
   public static String convertFileSize(long size,int bits) {
	    String bit = "";
        for (int i = 0;i < bits;i++) {
            bit += "#";
        }
        if (size <= 0) {
            return "0 B";
        }
        final String[] units = new String[]{"B", "KB", "MB", "GB", "TB"};
        int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
		
        return new DecimalFormat("#,##0."+bit).format(size / Math.pow(1024, digitGroups)) + " " + units[digitGroups];
    }

	public static final String rn_9935(String rn_9936) {
		int lastIndex = rn_9936.lastIndexOf(".");
        if (lastIndex != -1) {
            return rn_9936.substring(0, lastIndex);
        } else {
            return rn_9936;
        }
	}

	public static final String rn_9937(String rn_9938) {
		java.io.File rn_9939 = new java.io.File(rn_9938);
		return (rn_6193.rn_6204(rn_9939));
	}

	public static final void rn_9946(String rn_9947, String rn_9948) {
		try {
			append(new File(rn_9947), rn_9948);
		} catch (IOException e) {
				e.printStackTrace();
		  }
	}

	public static final boolean rn_9953(String rn_9954) {
		return createFile(new File(rn_9954));
	}

	public static final boolean rn_9959(String rn_9960) {
		return new File(rn_9960).exists();
	}

	public static final String rn_9963(String rn_9964, String rn_9965) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(rn_9964), rn_9965));
        	boolean first = true;
        	StringBuilder content = new StringBuilder();
        	String line;
        	while ((line = br.readLine()) != null) {
            	if (first) {
                	first = false;
                	content.append(line);
            	} else {
                	content.append('\n').append(line);
            	}
        	}
        	br.close();
        	return content.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static final void rn_9966(String rn_9967, String rn_9968) {
		try {
			write(new File(rn_9967), rn_9968);
		  } catch (IOException e) {
				e.printStackTrace();
		  }
	}

	public static final byte[] rn_9969(String rn_9970) {
		byte[] buffer = null;
		if (!new File(rn_9970).exists()) {
			return null;
		}
		try {
			FileInputStream fin = new FileInputStream(rn_9970);
			buffer = new byte[fin.available()];
			fin.read(buffer);
			fin.close();
			return buffer;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("读入字节文件( 错误");
		}
	}

	public static final boolean rn_9971(String rn_9972, byte[] rn_9973) {
		try {
			FileOutputStream fout = new FileOutputStream(rn_9972);
			fout.write(rn_9973);
			fout.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("写出字节文件( 错误");
		}
	}

	public static final boolean rn_9986(android.content.Context rn_9987, String rn_9988, String rn_9989) {
		try {
			InputStream stream = rn_9987.getAssets().open(rn_9988);
			File file = new File(rn_9989);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}
			if (stream != null && writeStreamToFile(stream, file)) {
				return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("写出资源文件( "  + rn_9988 + "或" + rn_9989);
		}
	}

	public static final String[] rn_10013(String rn_10014) {
		List<String> list = new ArrayList<>();
		File[] ff = new File(rn_10014).listFiles();
		for (int i = 0; i < ff.length; i++) {
			list.add(ff[i].getAbsolutePath());
		}
		return list.toArray(new String[list.size()]);
	}
}