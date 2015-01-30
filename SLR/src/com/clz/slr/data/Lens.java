package com.clz.slr.data;

import java.io.Serializable;

import android.os.Parcelable;

/**
 * 镜头数据
 * @author stevcao
 *
 */
public class Lens implements Serializable{
	public int iconid;//icon path
	public String iconPath;
	public String name;
	public String description;
	public String detail;
	public String focus;//焦距
	public String aperture;//光圈
	public int[] pics;
}
