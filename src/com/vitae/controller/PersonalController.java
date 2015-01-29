package com.vitae.controller;

import com.vitae.R;
import com.vitae.model.PersonalInfo;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonalController implements OnClickListener {

	private View mainView = null;
	private ImageView portrait;
	private TextView name;
	private TextView sex;
	private TextView birthday;
	private TextView age;
	private TextView nation;
	private TextView polity;
	private TextView school;
	private TextView major;
	private TextView address;
	private TextView phone;
	private TextView email;

	public PersonalController(View view) {
		// TODO Auto-generated constructor stub
		mainView = view;
		initView();
		initListener();
		setPersonalInfo(null);
	}

	private void initView() {
		portrait = (ImageView) mainView.findViewById(R.id.portrait);
		name = (TextView) mainView.findViewById(R.id.name);
		sex = (TextView) mainView.findViewById(R.id.sex);
		birthday = (TextView) mainView.findViewById(R.id.birthday);
		age = (TextView) mainView.findViewById(R.id.age);
		nation = (TextView) mainView.findViewById(R.id.nation);
		polity = (TextView) mainView.findViewById(R.id.polity);
		school = (TextView) mainView.findViewById(R.id.school);
		major = (TextView) mainView.findViewById(R.id.major);
		address = (TextView) mainView.findViewById(R.id.address);
		phone = (TextView) mainView.findViewById(R.id.phone);
		email = (TextView) mainView.findViewById(R.id.email);
	}

	private void initListener() {
		portrait.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	}

	public void setPersonalInfo(PersonalInfo personal) {
		// name.setText(personal.getName());
		// sex.setText(personal.getSex());
		// birthday.setText(personal.getBirthday());
		// age.setText(personal.getAge());
		// nation.setText(personal.getNation());
		// polity.setText(personal.getPolity());
		// school.setText(personal.getSchool());
		// major.setText(personal.getMajor());
		// address.setText(personal.getAddress());
		// phone.setText(personal.getPhone());
		// email.setText(personal.getEmail());
		name.setText("更木剑八");
		sex.setText("男");
		birthday.setText("11月19日");
		age.setText("不祥");
		nation.setText("尸魂界");
		polity.setText("队长");
		school.setText("流魂街");
		major.setText("死神");
		address.setText("十一番队");
		phone.setText("不祥");
		email.setText("不祥");
	}
}
