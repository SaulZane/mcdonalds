package com.zhangshuo;
import java.util.Calendar;







import com.zhangshuo.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fregment1 extends Fragment
{
    EditText month = null;
	EditText day = null;
	EditText hour = null;
	int realmonth;
	int realday;
	int realhour;

	 Button ok=null;
	TextView jiedong = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) 
    {
        View contentView = inflater.inflate(R.layout.activity_fregment1, null);
       
    


        ok=(Button)contentView.findViewById(R.id.OK);
		month = (EditText) contentView.findViewById(R.id.month);
		day = (EditText) contentView.findViewById(R.id.day);
		hour = (EditText) contentView.findViewById(R.id.hour);
		jiedong = (TextView) contentView.findViewById(R.id.jiedong);

		//����Ĭ�ϵĵ�ǰʱ�䣬Ĭ�ϵ���9��
		Calendar calendar = Calendar.getInstance();
		month.setText(calendar.get(calendar.MONTH) + 1 + "");
		day.setText(calendar.get(calendar.DAY_OF_MONTH) + "");
		hour.setText(9 + "");
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
	 * ȷ���ĵ���¼�
	 */
	public void okclick(View v)
	{
		// �ж��Ƿ���������
		Calendar calendarceshi;
		try
		{
			realmonth = Integer.parseInt(month.getText().toString().trim());
			realday = Integer.parseInt(day.getText().toString().trim());
			realhour = Integer.parseInt(hour.getText().toString().trim());
			calendarceshi = Calendar.getInstance();
			//�����ϸ�����ģʽ�������������׳��쳣
			calendarceshi.setLenient(false);
			calendarceshi.set(calendarceshi.YEAR, realmonth - 1, realday, realhour, 0);
			//���������쳣
			calendarceshi.get(Calendar.YEAR);

		}
		catch (IllegalArgumentException e)
		{
			Toast.makeText(getActivity(), "�����ʱ����Ч�����������롣", 0).show();
			return;
		}

		//׼������core���������������
		int[] month1 = new int[10];
		int[] day1 = new int[10];
		int[] hour1 = new int[10];
		int[] month2 = new int[10];
		int[] day2 = new int[10];
		int[] hour2 = new int[10];
		int[] month3 = new int[10];
		int[] day3 = new int[10];
		int[] hour3 = new int[10];

		//�����û������ʱ��
		realmonth = Integer.parseInt(month.getText().toString().trim());
		realday = Integer.parseInt(day.getText().toString().trim());
		realhour = Integer.parseInt(hour.getText().toString().trim());
		System.out.println("���ԣ�����ʱ��" + realmonth + "��" + realday + "��" + realhour + "ʱ");

		Core core = new Core();

		core.calcjiedongchi(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("���ԣ������");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.setText("");
		jiedong.append("��������ⶳʱ��\n");
		for (int i = 0; i < month1.length; i++)
		{
			jiedong.append("  ��" + (i + 1) + "�飺\n");
			jiedong.append("   �ⶳ��" + (month1[i] + 1) + "��" + day1[i] + "��" + hour1[i] + "ʱ\n"
					+ "   ʹ�ã�" + (month2[i] + 1) + "��" + day2[i] + "��" + hour2[i] + "ʱ\n"
					+ "   ���ڣ�" + (month3[i] + 1) + "��" + day3[i] + "��" + hour3[i] + "ʱ\n");
		}
		jiedong.append("\n");

		core.calcjiedongtui(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("���ԣ����ȱ�");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.append("�������Ƚⶳʱ��\n");
		for (int i = 0; i < month1.length; i++)
		{
			jiedong.append("  ��" + (i + 1) + "�飺\n");
			jiedong.append("   �ⶳ��" + (month1[i] + 1) + "��" + day1[i] + "��" + hour1[i] + "ʱ\n"
					+ "   ʹ�ã�" + (month2[i] + 1) + "��" + day2[i] + "��" + hour2[i] + "ʱ\n"
					+ "   ���ڣ�" + (month3[i] + 1) + "��" + day3[i] + "��" + hour3[i] + "ʱ\n");
		}
		jiedong.append("\n");

		core.calcjiedongbanshao(realmonth, realday, realhour);
		month1 = core.month1;
		day1 = core.day1;
		hour1 = core.hour1;
		month2 = core.month2;
		day2 = core.day2;
		hour2 = core.hour2;
		month3 = core.month3;
		day3 = core.day3;
		hour3 = core.hour3;
		System.out.println("���ԣ����ձ�");
		for (int i = 0; i < month1.length; i++)
		{
			System.out.println(month1[i] + "  " + day1[i] + "  " + hour1[i] + "||" + month2[i]
					+ "  " + day2[i] + "  " + hour2[i] + "||" + month3[i] + "  " + day3[i] + "  "
					+ hour3[i]);
		}

		jiedong.append("���սⶳʱ��\n");
		for (int i = 0; i < month1.length; i++)
		{
			jiedong.append("  ��" + (i + 1) + "�飺\n");
			jiedong.append("   �ⶳ��" + (month1[i] + 1) + "��" + day1[i] + "��" + hour1[i] + "ʱ\n"
					+ "   ʹ�ã�" + (month2[i] + 1) + "��" + day2[i] + "��" + hour2[i] + "ʱ\n"
					+ "   ���ڣ�" + (month3[i] + 1) + "��" + day3[i] + "��" + hour3[i] + "ʱ\n");
		}
	}
}
