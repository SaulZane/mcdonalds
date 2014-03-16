package com.zhangshuo;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fregment3 extends Fragment
{
	EditText month = null;
	EditText day = null;
	EditText hour = null;
	int realmonth;
	int realday;
	int realhour;

	Button ok = null;
	TextView jiedong = null;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		View contentView = inflater.inflate(R.layout.activity_fregment3, null);

		ok = (Button) contentView.findViewById(R.id.OK);
		month = (EditText) contentView.findViewById(R.id.month);
		day = (EditText) contentView.findViewById(R.id.day);
		hour = (EditText) contentView.findViewById(R.id.hour);
		jiedong = (TextView) contentView.findViewById(R.id.jiedong);
		// 设置默认的当前时间，默认当天9点
		Calendar calendar = Calendar.getInstance();
		month.setText(calendar.get(calendar.MONTH) + 1 + "");
		day.setText(calendar.get(calendar.DAY_OF_MONTH) + "");
		hour.setText(7 + "");
		ok.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{
				okclick(v);

			}
		});
		return contentView;
	}

	/**
	 * 确定的点击事件
	 */
	/**
	 * @param v
	 */
	public void okclick(View v)
	{
		// 判断是否输入有误
		Calendar calendarceshi;
		try
		{
			realmonth = Integer.parseInt(month.getText().toString().trim());
			realday = Integer.parseInt(day.getText().toString().trim());
			realhour = Integer.parseInt(hour.getText().toString().trim());
			calendarceshi = Calendar.getInstance();
			// 设置严格日期模式，如果输入错误抛出异常
			calendarceshi.setLenient(false);
			calendarceshi.set(calendarceshi.YEAR, realmonth - 1, realday, realhour, 0);
			// 错误引发异常
			calendarceshi.get(Calendar.YEAR);

		}
		catch (IllegalArgumentException e)
		{
			Toast.makeText(getActivity(), "输入的时间无效，请重新输入。", 0).show();
			return;
		}

		// 准备接受core程序算出来的数据
		int[] month1 = new int[10];
		int[] day1 = new int[10];
		int[] hour1 = new int[10];
		int[] month2 = new int[10];
		int[] day2 = new int[10];
		int[] hour2 = new int[10];
		int[] month3 = new int[10];
		int[] day3 = new int[10];
		int[] hour3 = new int[10];

		// 接受用户输入的时间
		realmonth = Integer.parseInt(month.getText().toString().trim());
		realday = Integer.parseInt(day.getText().toString().trim());
		realhour = Integer.parseInt(hour.getText().toString().trim());
		System.out.println("调试：传送时间" + realmonth + "月" + realday + "日" + realhour + "时");

		Core core = new Core();

		core.calcjiang(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("调试：酱表");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.setText("");
		jiedong.append("酱时间表\n");
		jiedong.append("   解冻：" + (month1[0] + 1) + "月" + day1[0] + "日" + hour1[0] + "时\n"
				+ "   使用：" + (month2[0] + 1) + "月" + day2[0] + "日" + hour2[0] + "时\n" + "   到期："
				+ (month3[0] + 1) + "月" + day3[0] + "日" + hour3[0] + "时\n");

		jiedong.append("\n");

		core.calcmianbao(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("调试：早餐面包表");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.append("早餐面包时间表\n");
		
			jiedong.append("  松饼：\n");
			jiedong.append("   解冻：" + (month1[0] + 1) + "月" + day1[0] + "日" + hour1[0] + "时\n"
					+ "   使用：" + (month2[0] + 1) + "月" + day2[0] + "日" + hour2[0] + "时\n"
					+ "   到期：" + (month3[0] + 1) + "月" + day3[0] + "日" + hour3[0] + "时\n");
		
		jiedong.append("\n");

		 core.calclengcangku(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("调试：冷藏库表");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.append("冷藏库时间表\n");
		for (int i = 0; i < month1.length; i++)
		{
			if(i==0)
			{
				jiedong.append("  烟肉：\n");
				jiedong.append("   解冻：" + (month1[i] + 1) + "月" + day1[i] + "日" + hour1[i] + "时\n"
						+ "   使用：" + (month2[i] + 1) + "月" + day2[i] + "日" + hour2[i] + "时\n"
						+ "   到期：" + (month3[i] + 1) + "月" + day3[i] + "日" + hour3[i] + "时\n");
			}
			if(i==1)
			{
				jiedong.append("  短片培根：\n");
				jiedong.append("   解冻：" + (month1[i] + 1) + "月" + day1[i] + "日" + hour1[i] + "时\n"
						+ "   使用：" + (month2[i] + 1) + "月" + day2[i] + "日" + hour2[i] + "时\n"
						+ "   到期：" + (month3[i] + 1) + "月" + day3[i] + "日" + hour3[i] + "时\n");
			}
			if(i==2)
			{
				jiedong.append("  土豆泥：\n");
				jiedong.append("   解冻：" + (month1[i] + 1) + "月" + day1[i] + "日" + hour1[i] + "时\n"
						+ "   使用：" + (month2[i] + 1) + "月" + day2[i] + "日" + hour2[i] + "时\n"
						+ "   到期：" + (month3[i] + 1) + "月" + day3[i] + "日" + hour3[i] + "时\n");
			}			
		}
		jiedong.append("\n");
		
		 core.calcbocaimianbing(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("调试：菠菜面饼表");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.append("菠菜面饼时间表\n");
		for (int i = 0; i < month1.length; i++)
		{
			if(i==0)
			{
				jiedong.append("  面饼：\n");
				jiedong.append("   解冻：" + (month1[i] + 1) + "月" + day1[i] + "日" + hour1[i] + "时\n"
						+ "   使用：" + (month2[i] + 1) + "月" + day2[i] + "日" + hour2[i] + "时\n"
						+ "   到期：" + (month3[i] + 1) + "月" + day3[i] + "日" + hour3[i] + "时\n");
			}
			if(i==1)
			{
				jiedong.append("  葱油饼：\n");
				jiedong.append("   解冻：" + (month1[i] + 1) + "月" + day1[i] + "日" + hour1[i] + "时\n"
						+ "   使用：" + (month2[i] + 1) + "月" + day2[i] + "日" + hour2[i] + "时\n"
						+ "   到期：" + (month3[i] + 1) + "月" + day3[i] + "日" + hour3[i] + "时\n");
			}
		}

	}
}
