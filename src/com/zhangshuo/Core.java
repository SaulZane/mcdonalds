package com.zhangshuo;

import java.util.Calendar;

public class Core
{
	// ��һ���¼�ⶳʱ��
	public int[] month1 = new int[10];
	public int[] day1 = new int[10];
	public int[] hour1 = new int[10];

	// �ڶ����¼ʹ��ʱ��
	public int[] month2 = new int[10];
	public int[] day2 = new int[10];
	public int[] hour2 = new int[10];

	// �������¼����ʱ��
	public int[] month3 = new int[10];
	public int[] day3 = new int[10];
	public int[] hour3 = new int[10];
	public int[] arraylist = new int[90];

	/**
	 * ������������ʹ�ú��ļ��㺯��
	 */
	@SuppressWarnings("static-access")
	public void calcjiedongchi(int month, int day, int hour)
	{
		// ���������Ϊ�˻�õ�ǰ��ݵ�
		Calendar calendar = Calendar.getInstance();

		// �ֱ���˳���Ӧ����1,2,3����
		Calendar calendartemp1 = Calendar.getInstance();
		Calendar calendartemp2 = Calendar.getInstance();
		Calendar calendartemp3 = Calendar.getInstance();

		// ���������ʱ��������Թ������ʱʹ��
		calendartemp1.set(calendar.YEAR, month - 1, day, hour, 0);

		for (int i = 0; i <= 9; i++)
		{
			// ��ǰʱ�̼������
			month1[i] = calendartemp1.get(calendartemp1.MONTH);
			day1[i] = calendartemp1.get(calendartemp1.DAY_OF_MONTH);
			hour1[i] = calendartemp1.get(calendartemp1.HOUR_OF_DAY);
			// ÿ6��Сʱ��һ��
			calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			// ���㲻���ƣ��°���
			if (calendartemp1.get(calendartemp1.HOUR_OF_DAY) == 3)
			{
				calendartemp1.add(calendartemp1.HOUR_OF_DAY, -6);
			}
		}
		// +24h �ڶ���ʹ��ʱ��
		for (int i = 0; i <= 9; i++)
		{
			calendartemp2.set(calendar.YEAR, month1[i], day1[i], hour1[i], 0);
			calendartemp2.add(calendartemp2.HOUR_OF_DAY, 24);
			month2[i] = calendartemp2.get(calendartemp2.MONTH);
			day2[i] = calendartemp2.get(calendartemp2.DAY_OF_MONTH);
			hour2[i] = calendartemp2.get(calendartemp2.HOUR_OF_DAY);
		}
		// +24h ���������ʱ��
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
	 * ������������ʹ�ú��ļ��㺯��
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
	 * ���ư���ʹ�ú��ļ��㺯��
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
}
