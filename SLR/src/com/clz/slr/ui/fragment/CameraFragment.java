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
		mCameraList = (ListView) mRootView.findViewById(R.id.catigory_list);
		//mAdapter = new LensAdapter(StaticsData.lensGroupList);
		//mCameraList.setAdapter(mAdapter);
	}
	
	private void initData() {
		
	}
	
	
}
