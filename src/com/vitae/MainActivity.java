package com.vitae;

import java.util.ArrayList;
import java.util.List;

import com.vitae.adapter.MainPagerAdapter;
import com.vitae.controller.ExperienceController;
import com.vitae.controller.PersonalController;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class MainActivity extends Activity implements OnPageChangeListener {

	private ViewPager viewPager = null;
	private LayoutInflater inflater = null;
	private List<View> views = new ArrayList<View>();
	private View personalInfoView = null;
	private View experienceView = null;
	private View rewardView = null;
	private View showOpusView = null;

	// To mark the current pager in ViewPager
	private int currentPager = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		inflater = LayoutInflater.from(this);
		initView();
		initViewPager();
		initListener();
		addController();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = new MenuInflater(this);
		inflater.inflate(R.menu.main_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		Intent intent = new Intent();
		switch (currentPager) {
		case 0:
			intent.setClass(MainActivity.this, PersonalEditActivity.class);
			startActivity(intent);
			break;
		case 1:
			intent.setClass(MainActivity.this, ExperienceEditActivity.class);
			startActivity(intent);
			break;
		case 2:
			intent.setClass(MainActivity.this, RewardEditActivity.class);
			startActivity(intent);
			break;
		case 3:
			intent.setClass(MainActivity.this, ShowOpusEditActivity.class);
			startActivity(intent);
			break;
		}
		return true;
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
		new ExperienceController(experienceView);
	}

	private void initListener() {
		viewPager.setOnPageChangeListener(this);
	}

	private void initViewPager() {
		MainPagerAdapter adapter = new MainPagerAdapter(views);
		viewPager.setAdapter(adapter);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPageSelected(int currentPager) {
		// TODO Auto-generated method stub
		this.currentPager = currentPager;
	}

}
