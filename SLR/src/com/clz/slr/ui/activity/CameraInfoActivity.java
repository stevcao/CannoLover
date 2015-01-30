package com.clz.slr.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import com.clz.cannon.lens.R;
import com.clz.slr.common.Constants;
import com.clz.slr.data.Lens;
import com.clz.slr.uitls.DisplayUtils;

public class CameraInfoActivity extends Activity{

	LinearLayout mDetailLayout = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lens_info);
		initView();
		initData();
	}

	private void initView () {
		mDetailLayout = (LinearLayout) findViewById(R.id.detail_layout);
	}
	
	private void initData() {
		Intent intent = getIntent();
		Lens len = (Lens) intent.getSerializableExtra(Constants.INTENT_KEY_LENS_DATA);
		if (len != null) {
			setTitle(len.name);
			if (len.pics != null && len.pics.length > 0) {
				for (int drawableId : len.pics) {
					ImageView image = new ImageView(this);
					image.setImageResource(drawableId);
					LinearLayout.LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
					image.setPadding((int)DisplayUtils.convertDpToPixel(this, 15), 
							(int)DisplayUtils.convertDpToPixel(this, 15),(int)DisplayUtils.convertDpToPixel(this, 15), 
							(int)DisplayUtils.convertDpToPixel(this, 15));
					image.setLayoutParams(lp);
					mDetailLayout.addView(image);
				}
				TextView detail = new TextView(this);
				LinearLayout.LayoutParams textLp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
				detail.setLayoutParams(textLp);
				detail.setTextSize(16);
				detail.setPadding((int)DisplayUtils.convertDpToPixel(this, 15), 
						(int)DisplayUtils.convertDpToPixel(this, 15),(int)DisplayUtils.convertDpToPixel(this, 15), 
						(int)DisplayUtils.convertDpToPixel(this, 15));
				detail.setText(len.detail);
				mDetailLayout.addView(detail);
			}
		}
	}
}
