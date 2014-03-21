package com.zhangshuo;

import java.util.Calendar;

import android.R.integer;

public class Core
{
	// 第一组记录解冻时间
	public int[] month1 = new int[10];
	public int[] day1 = new int[10];
	public int[] hour1 = new int[10];

	// 第二组记录使用时间
	public int[] month2 = new int[10];
	public int[] day2 = new int[10];
	public int[] hour2 = new int[10];

	// 第三组记录到期时间
	public int[] month3 = new int[10];
	public int[] day3 = new int[10];
	public int[] hour3 = new int[10];
	public int[] arraylist = new int[90];

	/**
	 * 腌制麦辣鸡翅使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calcjiedongchi(int month, int day, int hour)
	{
		// 这个日期是为了获得当前年份的
		Calendar calendar = Calendar.getInstance();

		// 分别按照顺序对应数组1,2,3来的
		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		// 设置输入的时间给程序以供后面加时使用
		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 9; i++)
		{
			// 当前时刻计算出来
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
			// 每6个小时搞一次
			calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			// 三点不腌制，下班了
			if (calendartemp1.get(calendartemp1.HOUR_OF_DAY) == 3)
			{
				calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			}
		}
		// +24h 第二组使用时间
		for (int i = 0; i <= 9; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[i], day1[i], hour1[i], 0);
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 24);
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
		// +24h 第三组过期时间
		for (int i = 0; i <= 9; i++)
		{
			calendartemp3.set(calendar.YEAR, month2[i], day2[i], hour2[i], 0);
			calendartemp3.add(calendartemp3.HOUR_OF_DAY, 24);
			month3[i] = calendartemp3.get(calendartemp2.MONTH);
			day3[i] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[i] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		}
	}

	/**
	 * 腌制麦辣鸡腿使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calcjiedongtui(int month, int day, int hour)
	{
		Calendar calendar = Calendar.getInstance();

		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 9; i++)
		{
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
			calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			if (calendartemp1.get(calendartemp1.HOUR_OF_DAY) == 3)
			{
				calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			}
		}
		// +36h
		for (int i = 0; i <= 9; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[i], day1[i], hour1[i], 0);
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 36);
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
		// +24h
		for (int i = 0; i <= 9; i++)
		{
			calendartemp3.set(calendar.YEAR, month2[i], day2[i], hour2[i], 0);
			calendartemp3.add(calendartemp3.HOUR_OF_DAY, 24);
			month3[i] = calendartemp3.get(calendartemp2.MONTH);
			day3[i] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[i] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		}
	}

	/**
	 * 腌制板烧使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calcjiedongbanshao(int month, int day, int hour)
	{
		Calendar calendar = Calendar.getInstance();

		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 9; i++)
		{
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
			calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			if (calendartemp1.get(calendartemp1.HOUR_OF_DAY) == 3)
			{
				calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			}
		}
		// +36h
		for (int i = 0; i <= 9; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[i], day1[i], hour1[i], 0);
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 36);
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
		// +36h
		for (int i = 0; i <= 9; i++)
		{
			calendartemp3.set(calendar.YEAR, month2[i], day2[i], hour2[i], 0);
			calendartemp3.add(calendartemp3.HOUR_OF_DAY, 36);
			month3[i] = calendartemp3.get(calendartemp2.MONTH);
			day3[i] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[i] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		}
	}
	/**
	 * 酱使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calcjiang(int month, int day, int hour)
	{
		Calendar calendar = Calendar.getInstance();

		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 5; i++)
		{
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
		}
		// +4h
		for (int i = 0; i <= 5; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[i], day1[i], hour1[i], 0);
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 4);
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
		// +24h-4
		for (int i = 0; i <= 5; i++)
		{
			calendartemp3.set(calendar.YEAR, month2[i], day2[i], hour2[i], 0);
			calendartemp3.add(calendartemp3.HOUR_OF_DAY, 20);
			month3[i] = calendartemp3.get(calendartemp2.MONTH);
			day3[i] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[i] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		}
		for(int i=5;i<=9;i++)
		{
			month1[i]=0;
			day1[i]=0;
			hour1[i]=0;
			month2[i]=0;
			day2[i]=0;
			hour2[i]=0;
			month3[i]=0;
			day3[i]=0;
			hour3[i]=0;
			
		}
	}
	
	/**
	 * 早餐面包使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calcmianbao(int month, int day, int hour)
	{
		Calendar calendar = Calendar.getInstance();

		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		
			month1[0] = calendartemp1.get(calendartemp1.MONTH);
			day1[0] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[0] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
		
	
		// +12h
		
			calendartemp2.set(calendar.YEAR, month1[0], day1[0], hour1[0], 0);
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 12);
			month2[0] = calendartemp2.get(calendartemp2.MONTH);
			day2[0] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[0] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		
			
		// +48h-12
		
			calendartemp3.set(calendar.YEAR, month2[0], day2[0], hour2[0], 0);
			calendartemp3.add(calendartemp3.HOUR_OF_DAY, 36);
			month3[0] = calendartemp3.get(calendartemp2.MONTH);
			day3[0] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[0] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		
		for(int i=1;i<=9;i++)
		{
			month1[i]=0;
			day1[i]=0;
			hour1[i]=0;
			month2[i]=0;
			day2[i]=0;
			hour2[i]=0;
			month3[i]=0;
			day3[i]=0;
			hour3[i]=0;
			
		}
	}
	/**
	 * 冷藏库使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calclengcangku(int month, int day, int hour)
	{
		Calendar calendar = Calendar.getInstance();

		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 2; i++)
		{
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
		}
	
		// +24h 土豆泥48
		for (int i = 0; i <= 2; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[0], day1[0], hour1[0], 0);
			if(i==2)
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 48);
			else 
				calendartemp2.add(calendartemp2.HOUR_OF_DAY, 24);
			
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
			
		// +72h-24 土豆泥48
		for (int i = 0; i <= 2; i++)
		{
			calendartemp3.set(calendar.YEAR, month2[i], day2[i], hour2[i], 0);
			if(i==2)
				calendartemp3.add(calendartemp2.HOUR_OF_DAY, 48);
				else 
					calendartemp3.add(calendartemp2.HOUR_OF_DAY, (72-24));
			month3[i] = calendartemp3.get(calendartemp2.MONTH);
			day3[i] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[i] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		}
		for(int i=3;i<=9;i++)
		{
			month1[i]=0;
			day1[i]=0;
			hour1[i]=0;
			month2[i]=0;
			day2[i]=0;
			hour2[i]=0;
			month3[i]=0;
			day3[i]=0;
			hour3[i]=0;
			
		}
	}
	/**
	 * 菠菜面饼使用核心计算函数
	 */
	@SuppressWarnings("static-access")
	public void calcbocaimianbing(int month, int day, int hour)
	{
		Calendar calendar = Calendar.getInstance();

		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 1; i++)
		{
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
		}
	
		// 面饼+12h 葱油36
		for (int i = 0; i <= 1; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[i], day1[i], hour1[i], 0);
			if(i==1)
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 36);
			else 
				calendartemp2.add(calendartemp2.HOUR_OF_DAY, 12);
			
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
			
		// 面饼48h-12 葱油72-36
		for (int i = 0; i <= 1; i++)
		{
			calendartemp3.set(calendar.YEAR, month2[i], day2[i], hour2[i], 0);
			if(i==1)
				calendartemp3.add(calendartemp2.HOUR_OF_DAY, 36);
				else 
					calendartemp3.add(calendartemp2.HOUR_OF_DAY, 36);
			month3[i] = calendartemp3.get(calendartemp2.MONTH);
			day3[i] = calendartemp3.get(calendartemp3.DAY_OF_MONTH);
			hour3[i] = calendartemp3.get(calendartemp3.HOUR_OF_DAY);
		}
		for(int i=2;i<=9;i++)
		{
			month1[i]=0;
			day1[i]=0;
			hour1[i]=0;
			month2[i]=0;
			day2[i]=0;
			hour2[i]=0;
			month3[i]=0;
			day3[i]=0;
			hour3[i]=0;
			
		}
	}
}
