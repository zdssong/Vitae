package com.vitae.controller;

import com.vitae.R;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class PersonalController implements OnClickListener {
	
	private View mainView = null;
	private ImageView portrait;

	public PersonalController(View view) {
		// TODO Auto-generated constructor stub
		mainView = view;
		initView();
		initListener();
	}

	private void initView() {
		portrait = (ImageView) mainView.findViewById(R.id.portrait);
	}

	private void initListener() {
		portrait.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	}
}
