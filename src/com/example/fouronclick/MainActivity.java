package com.example.fouronclick;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//ʵ�����ؼ�
		Button btn_anonymous = (Button) findViewById(R.id.btn_anonymous);
		Button btn_InnerClass = (Button) findViewById(R.id.btn_InnerClass);
		Button btn_Interface = (Button) findViewById(R.id.btn_Interface);
		
		//�����ֵ���¼���ʽ----ʵ�ֽӿڣ���Ҫʵ�� OnClickListener�ӿ�
		btn_Interface.setOnClickListener(this);
		//�԰�ťע��һ����ť����¼�������
		//��һ�ֵ���¼���ʽ-------�����ڲ���
		btn_anonymous.setOnClickListener(new OnClickListener() {
			//����¼�
			public void onClick(View v) {
				//Toast�ĵ�һ�������������ģ��ڶ����������ı�����������������ʾ��ʱ��
				Toast.makeText(MainActivity.this, "�����ڲ��෽ʽ", Toast.LENGTH_SHORT).show();
			}
		});
		
		//�ڶ��ֵ���¼���ʽ--------�ڲ���
		btn_InnerClass.setOnClickListener(new MyOnclickLinstener());
	}
	//�ڶ��ֵ���¼���ʽ--------�ڲ���ķ�ʽ
	class MyOnclickLinstener implements OnClickListener {

		public void onClick(View v) {
			Toast.makeText(MainActivity.this, "�ڲ��෽ʽ", Toast.LENGTH_SHORT).show();
		}
		
	}
	//�����ֵ���¼���ʽ----����
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_Interface:
			Toast.makeText(MainActivity.this, "ʵ�ֽӿڵķ�ʽ", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
	}
	//�����ֵ���¼���ʽ----����
	public void XmlConfigure(View v){
		Toast.makeText(MainActivity.this, "XML���õķ�ʽ", Toast.LENGTH_SHORT).show();
	}
}
