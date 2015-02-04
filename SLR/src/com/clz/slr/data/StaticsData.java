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

		// EF-S 17-85mm f/4-5.6 IS USM
		Lens len17_85 = new Lens();
		len17_85.name = "EF-S 17-85mm f/4-5.6 IS USM";
		len17_85.iconid = R.drawable.icon_len_17_85;
		len17_85.description = "覆盖从广角到中远摄的宽广焦段、专为APS-C画幅EOS数码单反相机设计的标准变焦镜头。作为标准变焦镜头，拥有约5倍的高变焦比，适于风光、人像摄影以及抓拍等多种领域。";
		len17_85.htmlPath = "file:///android_asset/details/html/17-85/detail.html";
		
		// EF-S 18-55mm f/3.5-5.6 IS STM
		Lens len18_55 = new Lens();
		len18_55.name = "EF-S 18-55mm f/3.5-5.6 IS STM";
		len18_55.iconid = R.drawable.icon_len_18_55;
		len18_55.description = "一款APS-C画幅专用的小型标准变焦镜头，以35mm规格换算，可覆盖相当于约29mm的广角端至约88mm的中远摄端的广阔焦段。";
		len18_55.htmlPath = "file:///android_asset/details/html/18-55/detail.html";
		
		// EF-S 18-55mm f/3.5-5.6 IS II
		Lens len18_55II = new Lens();
		len18_55II.name = "EF-S 18-55mm f/3.5-5.6 IS II";
		len18_55II.iconid = R.drawable.icon_len_18_55ii;
		len18_55II.description = "这是一款小巧轻便的标准变焦镜头，换算成35mm规格能够覆盖相当于约29-88mm的视角。通过优化配置高精度PMo（树脂成型）非球面镜片，可以对球面像差等多种像差进行有效补偿，实现了全焦段的高画质。";
		len18_55II.htmlPath = "file:///android_asset/details/html/18-55II/detail.html";
		
		// EF-S 18-135mm f/3.5-5.6 IS STM
		Lens len18_135STM = new Lens();
		len18_135STM.name = "EF-S 18-135mm f/3.5-5.6 IS STM";
		len18_135STM.iconid = R.drawable.icon_len_18_135_stm;
		len18_135STM.description = "EF-S 18-135mm f/3.5-5.6 IS STM是一款高倍率变焦镜头，安装在APS-C画幅EOS数码相机上时以35mm规格换算可获得相当于约29-216mm的视角。";
		len18_135STM.htmlPath = "file:///android_asset/details/html/18-135STM/detail.html";
		
		// EF-S 18-135mm f/3.5-5.6 IS
		Lens len18_135 = new Lens();
		len18_135.name = "EF-S 18-135mm f/3.5-5.6 IS";
		len18_135.iconid = R.drawable.icon_lens_16_35f4;
		len18_135.description = "具有高达约7.5倍变焦比的高倍率标准变焦镜头，其焦距换算为35mm规格后能够覆盖约29-216mm的视角。搭载的IS影像稳定器能够在广角端到远摄端的全焦段都得到最大相当于约4级快门速度的手抖动补偿效果，并可自动识别普通拍摄与追随拍摄，选择合适的IS模式。";
		len18_135.htmlPath = "file:///android_asset/details/html/18-135/detail.html";
		
		// EF 24-70mm f/2.8L II USM
		Lens len24_70II = new Lens();
		len24_70II.name = "EF 24-70mm f/2.8L II USM";
		len24_70II.iconid = R.drawable.icon_lens_16_35f4;
		len24_70II.description = "覆盖24mm广角到70mm中远摄焦段的L级标准变焦镜头。F2.8的最大光圈在整个变焦范围内保持明亮，可应对风光、人像摄影等广泛领域。";
		len24_70II.htmlPath = "file:///android_asset/details/html/24-70II/detail.html";
		
		// EF 24-70mm f/4L IS USM
		Lens len24_70IS = new Lens();
		len24_70IS.name = "EF 24-70mm f/4L IS USM";
		len24_70IS.iconid = R.drawable.icon_lens_16_35f4;
		len24_70IS.description = "EF 24-70mm f/4L IS USM是覆盖从24mm广角到70mm中远摄焦段的L级标准变焦镜头。广泛适用于风光、抓拍和人像等多种拍摄场景，通过操作变焦环还可以切换到微距模式※1，进行最大放大倍率约0.7倍的微距拍摄。";
		len24_70IS.htmlPath = "file:///android_asset/details/html/24-70IS/detail.html";
		
		// EF 24−105mm f/3.5-5.6 IS STM
		Lens len24_105STM = new Lens();
		len24_105STM.name = "EF 24−105mm f/3.5-5.6 IS STM";
		len24_105STM.iconid = R.drawable.icon_lens_16_35f4;
		len24_105STM.description = "这是一款性价比很高的标准变焦镜头，焦距覆盖广角到中远摄，可以应对风景以及人像等多种场景的拍摄。在实现了接近L镜头的高画质的同时，还保持了轻量化设计，机身仅约525克。";
		len24_105STM.htmlPath = "file:///android_asset/details/html/24-105STM/detail.html";
		
		// EF 24-105mm f/4L IS USM
		Lens len24_105USM = new Lens();
		len24_105USM.name = "EF 24-105mm f/4L IS USM";
		len24_105USM.iconid = R.drawable.icon_lens_16_35f4;
		len24_105USM.description = "覆盖从24mm广角到105mm中远摄焦段的L级标准变焦镜头。采用了恒定F4的最大光圈设计，使镜头口径得以缩小，同时较好地抑制了球面像差等的发生。不但覆盖了变焦比约4.4倍的宽广焦段，还实现了镜身整体的小型化。";
		len24_105USM.htmlPath = "file:///android_asset/details/html/24-105USM/detail.html";
		
		// EF 28-135mm f/3.5-5.6 IS USM
		Lens len28_135 = new Lens();
		len28_135.name = "EF 28-135mm f/3.5-5.6 IS USM";
		len28_135.iconid = R.drawable.icon_lens_16_35f4;
		len28_135.description = "变焦比约为5倍、覆盖28mm广角端且具有宽广焦段的标准变焦镜头。搭载有可在整个变焦范围内发挥较高补偿效果的手抖动补偿机构IS影像稳定器，使手持拍摄领域得到进一步扩展。镜头驱动方面采用了环形USM超声波马达，对焦时几乎没有动作音。";
		len28_135.htmlPath = "file:///android_asset/details/html/28-135/detail.html";
		
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
