package com.clz.slr.data;

import java.util.ArrayList;
import java.util.List;

import com.clz.cannon.lens.R;

/**
 * 一些静态数据
 * @author stevcao
 *
 */
public class StaticsData {
	public static List<LensGroup> lensGroupList = new ArrayList<LensGroup>();
	
	
	private static void initLensList() {
		Lens len = new Lens();
		len.name = "佳能EF 17-40mm f/4L USM";
		len.iconid = R.drawable.icon_len_17_40f4;
		len.description = "佳能 EF 17-40mm f/4L USM镜头的最近对焦距离为28cm，对角线视角为104度，它能赋予旷野中小动物以生气，"
				+ "并能够得到锐利的图像，是专业摄影师经常使用的一支镜头。";
		len.pics = new int[] {R.drawable.len_17_40f4_show_1, R.drawable.len_17_40f4_show_2};
		len.detail = "为适应数码单反相机而设计制造，同样适用于传统相机。镜头采用1片玻璃铸模非球面镜片(口径55mm)和2片普通非球面镜片，"
				+ "以及超级超低色散(超级UD)镜片和优化的镜头镀膜，成像素质十分出色，具有优异的防尘、防潮性能。"
				+"请注意：本产品虽然具有一定的防水滴性能，但是如果在雨天拍摄时，请尽量不要将本产品淋湿。";
		for (int i = 0 ; i < 3; i ++) {
			LensGroup group = new LensGroup();
			group.name = "广角";
			for (int j = 0 ; j < 5; j ++) {
				group.lensList.add(len);
			}
			lensGroupList.add(group);
		}
	}
	
	static {
		initLensList();
	}
}
