package com.vitae.controller;

import com.vitae.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ExperienceController implements OnClickListener {
	private View mainView = null;
	private TextView title = null;

	public ExperienceController(View mainView) {
		// TODO Auto-generated constructor stub
		this.mainView = mainView;
		initView();
		initListener();
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	private void initView() {
		title = (TextView) mainView.findViewById(R.id.label);
		title.setText("ExperienceController");
	}

	private void initListener() {

	}
}
