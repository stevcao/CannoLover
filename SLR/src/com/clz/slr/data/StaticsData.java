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

		/**
		 * ################################广角变焦###############################
		 */
		
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
		len16_35f28.iconid = R.drawable.icon_lens_16_35f28;
		len16_35f28.description = "专为采用APS-C画幅图像感应器的EOS数码单反相机设计开发，并能够带来真正超广角拍摄乐趣的广角变焦镜头。换算成35mm规格，可覆盖相当于约16mm视角的超广角范围。";
		len16_35f28.htmlPath = "file:///android_asset/details/html/16-3528/detail.html";

		// EF 16-35mm f/4L IS USM
		Lens len16_35f40 = new Lens();
		len16_35f40.name = "EF 16-35mm f/4L IS USM";
		len16_35f40.iconid = R.drawable.icon_lens_16_35f4;
		len16_35f40.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len16_35f40.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";

		LensGroup groupWide = new LensGroup();
		groupWide.name = "广角变焦";

		groupWide.lensList.add(len8_15);
		groupWide.lensList.add(len10_18);
		groupWide.lensList.add(len10_22);
		groupWide.lensList.add(len16_35f28);
		groupWide.lensList.add(len16_35f40);
		groupWide.lensList.add(len17_40);
		lensGroupList.add(groupWide);

		
		/**
		 * ################################标准变焦###############################
		 */
		// EF-S 15-85mm f/3.5-5.6 IS USM
		Lens len15_85 = new Lens();
		len15_85.name = "EF-S 15-85mm f/3.5-5.6 IS USM";
		len15_85.iconid = R.drawable.icon_len_15_85;
		len15_85.description = "换算为35mm规格后能够覆盖约24-136mm视角的标准变焦镜头，具有约5.7倍的变焦比。此镜头的一大特征就是拥有EF-S标准变焦镜头中最短的15mm广角端。";
		len15_85.htmlPath = "file:///android_asset/details/html/15-85/detail.html";

		// EF-S 17-55mm f/2.8 IS USM
		Lens len17_55 = new Lens();
		len17_55.name = "EF-S 17-55mm f/2.8 IS USM";
		len17_55.iconid = R.drawable.icon_len_17_55;
		len17_55.description = "整个变焦区域内均为明亮F2.8恒定最大光圈的APS-C画幅EOS数码单反相机专用标准变焦镜头。搭载有手抖动补偿机构IS影像稳定器，效果最大相当于提高约3级快门速度。";
		len17_55.htmlPath = "file:///android_asset/details/html/17-55/detail.html";

		// EF 16-35mm f/4L IS USM
		Lens len17_85 = new Lens();
		len17_85.name = "EF 16-35mm f/4L IS USM";
		len17_85.iconid = R.drawable.icon_lens_16_35f4;
		len17_85.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len17_85.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len18_55 = new Lens();
		len18_55.name = "EF 16-35mm f/4L IS USM";
		len18_55.iconid = R.drawable.icon_lens_16_35f4;
		len18_55.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len18_55.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len18_55II = new Lens();
		len18_55II.name = "EF 16-35mm f/4L IS USM";
		len18_55II.iconid = R.drawable.icon_lens_16_35f4;
		len18_55II.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len18_55II.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len18_135STM = new Lens();
		len18_135STM.name = "EF 16-35mm f/4L IS USM";
		len18_135STM.iconid = R.drawable.icon_lens_16_35f4;
		len18_135STM.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len18_135STM.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len18_135 = new Lens();
		len18_135.name = "EF 16-35mm f/4L IS USM";
		len18_135.iconid = R.drawable.icon_lens_16_35f4;
		len18_135.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len18_135.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len24_70II = new Lens();
		len24_70II.name = "EF 16-35mm f/4L IS USM";
		len24_70II.iconid = R.drawable.icon_lens_16_35f4;
		len24_70II.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len24_70II.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len24_70IS = new Lens();
		len24_70IS.name = "EF 16-35mm f/4L IS USM";
		len24_70IS.iconid = R.drawable.icon_lens_16_35f4;
		len24_70IS.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len24_70IS.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len24_105STM = new Lens();
		len24_105STM.name = "EF 16-35mm f/4L IS USM";
		len24_105STM.iconid = R.drawable.icon_lens_16_35f4;
		len24_105STM.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len24_105STM.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len24_105USM = new Lens();
		len24_105USM.name = "EF 16-35mm f/4L IS USM";
		len24_105USM.iconid = R.drawable.icon_lens_16_35f4;
		len24_105USM.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len24_105USM.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		// EF 16-35mm f/4L IS USM
		Lens len28_135 = new Lens();
		len28_135.name = "EF 16-35mm f/4L IS USM";
		len28_135.iconid = R.drawable.icon_lens_16_35f4;
		len28_135.description = "覆盖支持风光摄影、抓拍等焦段的L级广角变焦镜头。光学系统搭载了IS影像稳定器，最大可获得相当于提高约4级快门速度※1的手抖动补偿效果。扩大了手持拍摄的领域。";
		len28_135.htmlPath = "file:///android_asset/details/html/16-3540/detail.html";
		
		LensGroup standardGroup = new LensGroup();
		standardGroup.name = "标准变焦";
		
		standardGroup.lensList.add(len15_85);
		standardGroup.lensList.add(len17_55);
		standardGroup.lensList.add(len17_85);
		standardGroup.lensList.add(len18_55);
		standardGroup.lensList.add(len18_55II);
		standardGroup.lensList.add(len18_135STM);
		standardGroup.lensList.add(len18_135);
		standardGroup.lensList.add(len24_70II);
		standardGroup.lensList.add(len24_70IS);
		standardGroup.lensList.add(len24_105STM);
		standardGroup.lensList.add(len24_105USM);
		standardGroup.lensList.add(len28_135);
		lensGroupList.add(standardGroup);
		
		
	}

	static {
		initLensList();
	}
}
