package com.clz.slr.ui.activity;

import java.util.ArrayList;
import java.util.List;

import com.clz.cannon.lens.R;
import com.clz.slr.common.Constants;
import com.clz.slr.data.Lens;
import com.clz.slr.data.StaticsData;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class LensListActivity extends Activity {

	public static final String KEY_CATIGORY_POSITION = "cat_position";
	public static final String KEY_TITLE = "title";
	
	private int mCatPosition;
	private LensAdapter mLensAdapter;
	private ListView mLenListView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lens_list);
		initView();
		initData();
	}

	private void initView() {
		mLenListView = (ListView) findViewById(R.id.lens_list);
	}
	
	private void initData() {
		mCatPosition = getIntent().getIntExtra(KEY_CATIGORY_POSITION, -1);
		String title = getIntent().getStringExtra(KEY_TITLE);
		setTitle(title);
		if (mCatPosition != -1) {
			List<Lens> list = StaticsData.lensGroupList.get(mCatPosition).lensList;
			mLensAdapter = new LensAdapter(list);
		}
		if (mLensAdapter != null) {
			mLenListView.setAdapter(mLensAdapter);
		}
	}
	
	class LensAdapter extends BaseAdapter {

		private List<Lens> mDataList = new ArrayList<Lens>();
		
		public LensAdapter(List<Lens> lensList) {
			updateData(lensList);
		}

		/**
		 * 更新数据
		 * 
		 * @param lensList
		 */
		public void updateData(List<Lens> lensList) {
			mDataList.clear();
			mDataList = lensList;
			notifyDataSetChanged();
		}

		@Override
		public int getCount() {
			return mDataList.size();
		}

		@Override
		public Object getItem(int arg0) {
			return mDataList.get(arg0);
		}

		@Override
		public long getItemId(int arg0) {
			return arg0;
		}

		@Override
		public View getView(int position, View converView, ViewGroup arg2) {
			ViewHolder holder = null;
			if (converView == null) {
				converView = LayoutInflater.from(getBaseContext()).inflate(
						R.layout.list_item_lens, null);
				holder = new ViewHolder();
				holder.description = (TextView) converView
						.findViewById(R.id.len_description);
				holder.icon = (ImageView) converView
						.findViewById(R.id.len_icon);
				holder.lensName = (TextView) converView
						.findViewById(R.id.len_name);
				converView.setTag(holder);
				converView.setOnClickListener(mOncliClickListener);
			} else {
				holder = (ViewHolder) converView.getTag();
			}
			Lens len = mDataList.get(position);
			holder.position = position;
				holder.lensName.setText(len.name);
				holder.icon.setImageResource(len.iconid);
				holder.description.setText(len.description);
			return converView;
		}

		private OnClickListener mOncliClickListener = new OnClickListener() {

			@Override
			public void onClick(View v) {
				ViewHolder holder = (ViewHolder) v.getTag();
				Lens data = (Lens) getItem(holder.position);
				Intent intent = new Intent();
				intent.setClass(LensListActivity.this, LensInfoActivity.class);
				intent.putExtra(Constants.INTENT_KEY_LENS_DATA, data);
				startActivity(intent);
			}
		};

		class ViewHolder {
			int position;
			ImageView icon;
			TextView lensName;
			TextView description;
			TextView catigaryName;
		}
	}
}
