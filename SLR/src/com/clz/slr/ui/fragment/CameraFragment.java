package com.clz.slr.ui.fragment;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.clz.cannon.lens.R;
import com.clz.slr.common.Constants;
import com.clz.slr.data.Lens;
import com.clz.slr.data.LensGroup;
import com.clz.slr.data.StaticsData;
import com.clz.slr.ui.activity.CameraInfoActivity;


/**
 * 聊天Fragment的界面
 * 
 * http://blog.csdn.net/guolin_blog/article/details/26365683
 * 
 * @author guolin
 */
public class CameraFragment extends Fragment {
	
	private View mRootView = null;
	private ListView mCameraList = null;
	
	private LensAdapter mAdapter = null;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_camera_list, null);
		mRootView = view;
		initView();
		initData();
		return view;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onResume() {
		super.onResume();
	}
	
	private void initView() {
		mCameraList = (ListView) mRootView.findViewById(R.id.lens_list);
		mAdapter = new LensAdapter(StaticsData.lensGroupList);
		mCameraList.setAdapter(mAdapter);
	}
	
	private void initData() {
		
	}
	
	class LensAdapter extends BaseAdapter {

		private static final int DATA_TYPE_CATIGARY = 1;
		private static final int DATA_TYPE_LEN = 2;
		
		private List<Data> mDataList = new ArrayList<CameraFragment.LensAdapter.Data>();
		
		public LensAdapter(List<LensGroup> groupList) {
			updateData(groupList);
		}

		/**
		 * 更新数据
		 * @param groupList
		 */
		public void updateData(List<LensGroup> groupList) {
			mDataList.clear();
			for (LensGroup group : groupList) {
				Data catigary = new Data();
				catigary.type = DATA_TYPE_CATIGARY;
				catigary.data = group.name;
				mDataList.add(catigary);
				for (Lens len : group.lensList) {
					Data lenData = new Data();
					lenData.type = DATA_TYPE_LEN;
					lenData.data = len;
					mDataList.add(lenData);
				}
			}
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
			ViewHolder holder = null;;
			if (converView == null) {
				converView = LayoutInflater.from(getActivity()).inflate(R.layout.list_item_lens, null);
				holder = new ViewHolder();
				holder.catigaryLayout = converView.findViewById(R.id.catigary_layout);
				holder.catigaryName = (TextView) converView.findViewById(R.id.catigary_name);
				holder.description = (TextView) converView.findViewById(R.id.len_description);
				holder.icon = (ImageView) converView.findViewById(R.id.len_icon);
				holder.lensName = (TextView) converView.findViewById(R.id.len_name);
				holder.lensLayout = converView.findViewById(R.id.lens_layout);
				converView.setTag(holder);
				converView.setOnClickListener(mOncliClickListener);
			} else {
				holder = (ViewHolder) converView.getTag();
			}
			Data data = mDataList.get(position);
			holder.position = position;
			if (data.type == DATA_TYPE_CATIGARY) {
				holder.catigaryLayout.setVisibility(View.VISIBLE);
				holder.lensLayout.setVisibility(View.GONE);
				holder.catigaryName.setText((String)data.data);
			} else {
				holder.catigaryLayout.setVisibility(View.GONE);
				holder.lensLayout.setVisibility(View.VISIBLE);
				Lens len = (Lens) data.data;
				holder.lensName.setText(len.name);
				holder.icon.setImageResource(len.iconid);
				holder.description.setText(len.description);
			}
			return converView;
		}
		
		private OnClickListener mOncliClickListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ViewHolder holder = (ViewHolder) v.getTag();
				Data data = (Data) getItem(holder.position);
				if (data.type == DATA_TYPE_LEN) {
					Intent intent = new Intent();
					intent.setClass(getActivity(), CameraInfoActivity.class);
					intent.putExtra(Constants.INTENT_KEY_LENS_DATA, (Lens)data.data);
					startActivity(intent);
				}
			}
		};
		
		class Data {
			int type;
			Object data;
		}
		
		class ViewHolder {
			int position;
			ImageView icon;
			TextView lensName;
			TextView description;
			TextView catigaryName;
			
			View lensLayout;
			View catigaryLayout;
		}
	}
	
}
