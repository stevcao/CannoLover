package com.clz.slr.data;

import java.util.ArrayList;
import java.util.List;

import com.clz.cannon.lens.R;

/**
 * 一些静态数据
 * 
 * @author stevcao
 * 
 */
public class StaticsData {
	public static List<LensGroup> lensGroupList = new ArrayList<LensGroup>();

	private static void initLensList() {

		// 佳能EF 17-40mm f/4L USM
		Lens len17_40 = new Lens();
		len17_40.name = "佳能EF 17-40mm f/4L USM";
		len17_40.iconid = R.drawable.icon_len_17_40f4;
		len17_40.description = "佳能 EF 17-40mm f/4L USM镜头的最近对焦距离为28cm，对角线视角为104度，它能赋予旷野中小动物以生气，"
				+ "并能够得到锐利的图像，是专业摄影师经常使用的一支镜头。";
		len17_40.aperture = "4.0";
		len17_40.focus = "17-44";
		len17_40.entry = "EF";
		len17_40.filters = 77f;
		len17_40.htmlPath = "file:///android_asset/details/html/17-44/detail.html";

		// EF 8-15mm f/4L USM 鱼眼
		Lens len8_15 = new Lens();
		len8_15.name = "EF 8-15mm f/4L USM 鱼眼";
		len8_15.iconid = R.drawable.icon_len_8_15f4;
		len8_15.description = "EF镜头首次推出面向专业摄影师和摄影发烧友的L级鱼眼变焦镜头。";
		len8_15.aperture = "4.0";
		len8_15.focus = "17-44";
		len8_15.entry = "EF";
		len8_15.filters = 78.5f;
		len8_15.htmlPath = "file:///android_asset/details/html/8-15/detail.html";
		
		// EF-S 10-18mm f/4.5-5.6 IS STM
		Lens len10_18 = new Lens();
		len10_18.name = "EF-S 10-18mm f/4.5-5.6 IS STM";
		len10_18.iconid = R.drawable.icon_len_10_18f4556;
		len10_18.description = "换算成35mm规格，相当于约16-29mm的视角，是具有高画质又便于携带的广角变焦镜头。高性价比，可轻松体验广角镜头的乐趣。";
		len10_18.aperture = "4.5-5.6";
		len10_18.focus = "10-18";
		len10_18.entry = "EF-S";
		len10_18.filters = 74.6f;
		len10_18.htmlPath = "file:///android_asset/details/html/10-18/detail.html";
		
		
		// EF-S 10-22mm f/3.5-4.5 USM
		Lens len10_22 = new Lens();
		len10_22.name = "EF-S 10-22mm f/3.5-4.5 USM";
		len10_22.iconid = R.drawable.icon_len_10_22f23545;
		len10_22.description = "专为采用APS-C画幅图像感应器的EOS数码单反相机设计开发，并能够带来真正超广角拍摄乐趣的广角变焦镜头。换算成35mm规格，可覆盖相当于约16mm视角的超广角范围。";
		len10_22.htmlPath = "file:///android_asset/details/html/10-22/detail.html";
		
		// EF 16-35mm f/2.8L II USM
		Lens len16_35f28 = new Lens();
		len16_35f28.name = "EF 16-35mm f/2.8L II USM";
		len16_35f28.iconid = R.drawable.icon_len_10_22f23545;
		len16_35f28.description = "专为采用APS-C画幅图像感应器的EOS数码单反相机设计开发，并能够带来真正超广角拍摄乐趣的广角变焦镜头。换算成35mm规格，可覆盖相当于约16mm视角的超广角范围。";
		len16_35f28.htmlPath = "file:///android_asset/details/html/16-3528/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len16_35f40 = new Lens();
		len16_35f40.name = "EF 16-35mm f/4L IS USM";
		len16_35f40.iconid = R.drawable.icon_len_10_22f23545;
		len16_35f40.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len16_35f40.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		

		LensGroup group = new LensGroup();
		group.name = "广角";
		
		group.lensList.add(len8_15);
		group.lensList.add(len10_18);
		group.lensList.add(len10_22);
		group.lensList.add(len16_35f28);
		group.lensList.add(len16_35f40);
		group.lensList.add(len17_40);
		lensGroupList.add(group);
	}

	static {
		initLensList();
	}
}
