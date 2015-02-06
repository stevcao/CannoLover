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
import com.clz.slr.ui.activity.LensInfoActivity;
import com.clz.slr.ui.activity.LensListActivity;


/**
 * 聊天Fragment的界面
 * 
 * http://blog.csdn.net/guolin_blog/article/details/26365683
 * 
 * @author guolin
 */
public class LensCatigoryFragment extends Fragment {
	
	private View mRootView = null;
	private ListView mCatigoryList = null;
	
	private LensCatigoryAdapter mAdapter = null;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_lens_catigory_list, null);
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
		mCatigoryList = (ListView) mRootView.findViewById(R.id.catigory_list);
	}
	
	private void initData() {
		mAdapter = new LensCatigoryAdapter(StaticsData.lensGroupList);
		mCatigoryList.setAdapter(mAdapter);
	}
	
	class LensCatigoryAdapter extends BaseAdapter{

		List<LensGroup> mGroupList = new ArrayList<LensGroup>();
		
		public LensCatigoryAdapter(List<LensGroup> groupList) {
			super();
			updateData(groupList);
		}

		public void updateData(List<LensGroup> groupList) {
			this.mGroupList = groupList;
			notifyDataSetChanged();
		}
		
		@Override
		public int getCount() {
			return mGroupList.size();
		}

		@Override
		public Object getItem(int arg0) {
			return mGroupList.get(arg0);
		}

		@Override
		public long getItemId(int arg0) {
			return arg0;
		}

		@Override
		public View getView(int position, View view, ViewGroup arg2) {
			ViewHolder holder = null;
			if (view == null) {
				view = LayoutInflater.from(getActivity()).inflate(R.layout.list_item_lens_catigory, null);
				holder = new ViewHolder();
				holder.icon = (ImageView) view.findViewById(R.id.ca_icon);
				holder.description = (TextView) view.findViewById(R.id.ca_description);
				holder.name = (TextView) view.findViewById(R.id.ca_name);
				view.setTag(holder);
				view.setOnClickListener(mOnclickListener);
			} else {
				holder = (ViewHolder) view.getTag();
			}
			holder.position = position;
			LensGroup group = mGroupList.get(position);
			if (group.icon != -1) {
				holder.icon.setImageResource(group.icon);
			}
			holder.name.setText(group.name);
			holder.description.setText(group.description);
			return view;
		}
		
		
		class ViewHolder {
			int position;
			ImageView icon;
			TextView name;
			TextView description;
		}
		
		private OnClickListener mOnclickListener = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ViewHolder tag = (ViewHolder) v.getTag();
				int position = tag.position;
				Intent intent = new Intent();
				intent.setClass(getActivity(), LensListActivity.class);
				intent.putExtra(LensListActivity.KEY_CATIGORY_POSITION, position);
				intent.putExtra(LensListActivity.KEY_TITLE, tag.name.getText());
				startActivity(intent);
			}
		};
	}
	
}
