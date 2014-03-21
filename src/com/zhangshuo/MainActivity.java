package com.zhangshuo;

import com.zhangshuo.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
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
	private Button button3 = null;
	
	private Fragment fragment1 = null;
	private Fragment fragment2 = null;
	private Fragment fragment3 = null;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1 = (Button) findViewById(R.id.change1);
		button2 = (Button) findViewById(R.id.change2);
		button3 = (Button) findViewById(R.id.change3);
		fragment1 = new Fregment1();
		fragment2 = new Fragment2();
		fragment3 = new Fregment3();
		button1.setBackgroundResource(R.drawable.button_press);
		
		replaceFragment(fragment1);
		button1.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View arg0)
			{

				button1.setBackgroundResource(R.drawable.button_press);
				button2.setBackgroundResource(R.drawable.button_putong);
				button3.setBackgroundResource(R.drawable.button_putong);
				replaceFragment(fragment1);

			}
		});
		button2.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				button2.setBackgroundResource(R.drawable.button_press);
				button1.setBackgroundResource(R.drawable.button_putong);
				button3.setBackgroundResource(R.drawable.button_putong);
				replaceFragment(fragment2);
			}
		});
		button3.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				button3.setBackgroundResource(R.drawable.button_press);
				button1.setBackgroundResource(R.drawable.button_putong);
				button2.setBackgroundResource(R.drawable.button_putong);
				replaceFragment(fragment3);
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
