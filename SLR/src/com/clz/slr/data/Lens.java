package com.clz.slr.data;

import java.io.Serializable;

import com.clz.db.Entity;

import android.os.Parcelable;

/**
 * 镜头数据
 * @author stevcao
 *
 */
public class Lens extends Entity implements Serializable{
	public int iconid;//icon path
	
	/**
	 * 图标路径
	 */
	public String iconPath;
	
	/**
	 * 镜头名称
	 */
	public String name;
	
	/**
	 * 镜头昵称
	 */
	public String nickName;
	
	/**
	 * 简介
	 */
	public String description;
	
	/**
	 * 详细描述
	 */
	public String detail;
	
	/**
	 * 照片
	 */
	public int[] photos;
	
	/**
	 * 图片
	 */
	public int[] pics;
	
	public String focus;//焦距
	/**
	 * 最大光圈
	 */
	public String aperture;//光圈
	
	/**
	 * 卡口
	 * EF、EF-S、EF-M
	 */
	public String entry;//卡口
	/**
	 * 镜头结构
	 */
	public String structure;//结构
	
	/**
	 * 滤镜尺寸
	 */
	public float filters ;//滤镜尺寸
	
	/**
	 * 对应IS参数
	 */
	public boolean imageStabilizer = false;
	
	/**
	 * 对应L参数
	 */
	public boolean luxury = false;
	
	/**
	 * 参考价格
	 */
	public int price;
	
	public String htmlPath;
}
