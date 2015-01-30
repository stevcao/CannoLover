package com.clz.slr.uitls;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import android.util.Log;

public class FileUtils {
	
	public static String TAG = FileUtils.class.getName();
	
	// 移动某个指定的文件，但移动成功后不会覆盖已存在的目标文件
	public static boolean moveFile(String sourceFileName,
			String targetFileName) {
		return FileUtils.moveFile(sourceFileName, targetFileName, false);
	}
	// 移动某个指定的文件，但移动成功后可以根据isOverlay的值来决定是否覆盖已存在的目标文件
	public static boolean moveFile(String sourceFileName,
			String targetFileName, boolean isOverlay) {
		// 判断原文件是否存在
		File sourceFile = new File(sourceFileName);
		if (!sourceFile.exists()) {
			Log.d(TAG , "移动文件失败：原文件" + sourceFileName + "不存在！");
			return false;
		} else if (!sourceFile.isFile()) {
			Log.d(TAG,"移动文件失败：" + sourceFileName + "不是一个文件！");
			return false;
		}
		File targetFile = new File(targetFileName);
		if (targetFile.exists()) {// 判断目标文件是否存在
			if (isOverlay) {// 如果目标文件存在，是否允许覆盖目标文件
				// 删除已存在的目标文件，无论目标文件是目录还是单个文件
				Log.d(TAG,"该文件已存在，准备删除它！");
				if (!deleteDir(targetFileName)) {
					Log.d(TAG,"文件移动失败，删除文件" + targetFileName + "失败！");
					return false;
				}
			} else {
				Log.d(TAG,"文件移动失败，文件" + targetFileName + "已存在！");
				return false;
			}
		} else {
			if (!targetFile.getParentFile().exists()) {
				// 如果目标文件所在的目录不存在，则创建目录
				Log.d(TAG,"该文件所在目录不存在，正在创建！");
				if (!targetFile.getParentFile().mkdirs()) {
					Log.d(TAG,"移动文件失败，创建文件所在的目录失败！");
					return false;
				}
			}
		}
		// 移动原文件至目标文件
//		if (sourceFile.renameTo(targetFile)) {
//			Log.d(TAG,"移动文件" + sourceFileName + "到" + targetFileName
//					+ "成功！");
//			return true;
//		} else {
//			Log.d(TAG,"移动文件" + sourceFileName + "到" + targetFileName
//					+ "失败！");
//			return true;
//		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(sourceFile);
			fos = new FileOutputStream(targetFile);
			byte[] buffer = new byte[1024];
			while (fis.read(buffer) != -1) {
				fos.write(buffer);
			}
			Log.d(TAG,"file " + sourceFileName + " moved to " + targetFileName
					+ " success！");
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if (fos != null) {
				try {
					fos.flush();
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		Log.d(TAG,"move " + sourceFileName + " to " + targetFileName
		+ " failed！");
		return false;
	}
	
	/**
	 * 移动某个指定的目录
	 * 默认为不覆盖目标文件
	 * @param sourceDirName
	 * @param targetDirName
	 * @return
	 */
	public static boolean moveDir(String sourceDirName, String targetDirName) {
		return FileUtils.moveDir(sourceDirName, targetDirName, false);
	}
	
	/**
	 *  移动某个指定的目录，但移动成功后可以根据isOverlay的值来决定是否覆盖当前已存在的目标目录
	 * @param sourceDirName
	 * @param targetDirName
	 * @param isOverlay
	 * @return
	 */
	public static boolean moveDir(String sourceDirName, String targetDirName,
			boolean isOverlay) {
		// 判断原目录是否存在
		File sourceDir = new File(sourceDirName);
		if (!sourceDir.exists()) {
			Log.d(TAG,"sourceDir: " + sourceDirName + " does not exit！");
			return false;
		} else if (!sourceDir.isDirectory()) {
			Log.d(TAG,sourceDirName + " is not a directory！");
			return false;
		}
		// 如果目标文件夹名不以文件分隔符结尾，自动添加文件分隔符
		if (!targetDirName.endsWith(File.separator)) {
			targetDirName = targetDirName + File.separator;
		}
		File targetDir = new File(targetDirName);
		// 如果目标文件夹存在，
		if (!targetDir.exists()) {
			targetDir.mkdirs();
		}
		boolean flag = true;
		// 移动原目录下的文件和子目录到目标目录下
		File[] files = sourceDir.listFiles();
		for (int i = 0; i < files.length; i++) {
			// 移动子文件
			if (files[i].isFile()) {
				flag = FileUtils.moveFile(files[i].getAbsolutePath(),
						targetDirName + files[i].getName(), isOverlay);
				if (!flag) {
					break;
				}
			}
			// 移动子目录
			else if (files[i].isDirectory()) {
				flag = FileUtils.moveDir(files[i].getAbsolutePath(),
						targetDirName + files[i].getName(), isOverlay);
				if (!flag) {
					break;
				}
			}
		}
		if (!flag) {
			Log.d(TAG,"dir:" + sourceDirName + " moved to " + targetDirName
					+ " failed！");
			return false;
		}
		// 删除原目录
		if (deleteDir(sourceDirName)) {
			Log.d(TAG,"dir: " + sourceDirName + " moved to" + targetDirName
					+ " success！");
			return true;
		} else {
			Log.d(TAG,"dir: " + sourceDirName + " moved to " + targetDirName
					+ " failed！");
			return false;
		}
	}
	
	/**
	 * 删除目录
	 * @param path
	 * @return
	 */
	public static boolean deleteDir(String path) {
		if (!path.endsWith(File.separator)) {
			path = path + File.separator;
		}
		File file = new File (path);
		if (file.isFile()) {
			File deleteFile = new File(file.getAbsolutePath() + System.currentTimeMillis());
			file.renameTo(deleteFile);
			file.delete();
		} else {
			String[] fileList = file.list();
			for (String child : fileList) {
				deleteDir(path + child);
			}
			File deleteFile = new File(file.getAbsolutePath() + System.currentTimeMillis());
			file.renameTo(deleteFile);
			file.delete();
		}
		return true;
	}
	
	/**
	 * 压缩
	 * @param sourcePath
	 * @param zipPath
	 */
	public static void zip(String sourcePath, String zipPath){
		try {
			OutputStream  os = new FileOutputStream(zipPath);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			ZipOutputStream zos = new ZipOutputStream(bos);
			File file = new File(sourcePath);
			String basePath = null;
			if(file.isDirectory()){//要压缩的是文件夹
				basePath = file.getPath();
			}else{
				basePath = file.getParent();
			}
			zipFile(file, basePath, zos);
			zos.closeEntry();
			zos.close();
			bos.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void zipFile(File sourceFile, String basePath, ZipOutputStream zos) {
		File[] files = new File[0];
		if(sourceFile.isDirectory()){
			files = sourceFile.listFiles();
		}else{
			files = new File[1];
			files[0] = sourceFile;
		}
		byte[] buffer = new byte[1024];
		int length = 0;
		try {
			for(File file : files){
				if(file.isDirectory()){
					String pathName = file.getPath().substring(basePath.length() + 1) + "/";
					zos.putNextEntry(new ZipEntry(pathName));
					zipFile(file, basePath, zos);//迭代
				}else{
					String pathName = file.getPath().substring(basePath.length() + 1);
					zos.putNextEntry(new ZipEntry(pathName));
					InputStream is = new FileInputStream(file);
					BufferedInputStream bis = new BufferedInputStream(is);
					while((length = bis.read(buffer)) > 0){
						zos.write(buffer, 0, length);
					}
					is.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 	 * 解压 zip 文件
	 * PS:注意不能解压 rar 文件哦，只能解压 zip 文件 解压 rar 文件 会出现 java.io.IOException: Negative seek offset 异常 
	 * @param zipfile
	 * @param destDir
	 * @param prefix 需要解压的文件全路径的前缀
	 * @param suffix 需要解压的文件全路径的后缀
	 */
	@SuppressWarnings("unchecked")
	public static void unZip(String zipfile, String destDir, String prefix, String suffix) {
		destDir = destDir.endsWith("//") ? destDir : destDir + "//";
		byte b[] = new byte[1024];
		int length;
		ZipFile zipFile;
		try {
			zipFile = new ZipFile(new File(zipfile));
			Enumeration enumeration = zipFile.entries();
			ZipEntry zipEntry = null;
			while (enumeration.hasMoreElements()) {
				zipEntry = (ZipEntry) enumeration.nextElement();
				if (prefix != null && !zipEntry.getName().startsWith(prefix))continue;
				if (suffix != null && !zipEntry.getName().endsWith(suffix))continue;
				File loadFile = new File(destDir + zipEntry.getName());
				if (!loadFile.getParentFile().exists())
					loadFile.getParentFile().mkdirs();
				OutputStream outputStream = new FileOutputStream(loadFile);
				InputStream inputStream = zipFile.getInputStream(zipEntry);
				while ((length = inputStream.read(b)) > 0)
					outputStream.write(b, 0, length);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	/**
//	 * 打印指定目录下的所有文件和目录
//	 * @param path
//	 */
//	public static void printFiles(String path) {
//		File dir = new File(path);
//		if (dir.isDirectory()) {
//			Log.d(TAG, "dir: " + path);
//			String[] fileList = dir.list();
//			for (String child : fileList) {
//				printFiles(path + File.separator +child);
//			}
//		} else {
//			Log.d(TAG,"file: " + path);
//		}
//	}
	
}
