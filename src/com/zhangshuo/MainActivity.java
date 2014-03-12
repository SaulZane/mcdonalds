package com.zhangshuo;

import com.zhangshuo.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends FragmentActivity
{

	private Button button1 = null;
	private Button button2 = null;
	private Fragment fragment1 = null;
	private Fragment fragment2 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.change1);
		button2 = (Button) findViewById(R.id.change2);
		fragment1 = new Fregment1();
		fragment2 = new Fragment2();
		replaceFragment(fragment1);
		button1.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View arg0)
			{

				replaceFragment(fragment1);

			}
		});
		button2.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				replaceFragment(fragment2);
			}
		});

	}

	public void replaceFragment(Fragment fragment1)
	{
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		fragmentTransaction.setCustomAnimations(R.anim.intofregment, R.anim.outfregment);
		fragmentTransaction.replace(R.id.content, fragment1);
		fragmentTransaction.commit();
	}

}
