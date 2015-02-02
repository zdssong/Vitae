package com.vitae;

import java.util.ArrayList;
import java.util.List;

import com.vitae.adapter.MainPagerAdapter;
import com.vitae.controller.PersonalController;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class MainActivity extends Activity {

	private ViewPager viewPager = null;
	private LayoutInflater inflater = null;
	private List<View> views = new ArrayList<View>();
	private View personalInfoView = null;
	private View experienceView = null;
	private View rewardView = null;
	private View showOpusView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		inflater = LayoutInflater.from(this);
		initView();
		initListener();
		ininViewPager();
		addController();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}

	private void initView() {
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		personalInfoView = inflater.inflate(R.layout.view_personal,
				(ViewGroup) findViewById(R.layout.activity_main));
		experienceView = inflater.inflate(R.layout.view_experience,
				(ViewGroup) findViewById(R.layout.activity_main));
		rewardView = inflater.inflate(R.layout.view_reward,
				(ViewGroup) findViewById(R.layout.activity_main));
		showOpusView = inflater.inflate(R.layout.view_showopus,
				(ViewGroup) findViewById(R.layout.activity_main));

		views.add(personalInfoView);
		views.add(experienceView);
		views.add(rewardView);
		views.add(showOpusView);
	}

	private void addController() {
		new PersonalController(personalInfoView);
	}

	private void initListener() {
	}

	private void ininViewPager() {
		MainPagerAdapter adapter = new MainPagerAdapter(views);
		viewPager.setAdapter(adapter);
	}

}
