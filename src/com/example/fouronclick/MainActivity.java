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
		//实例化控件
		Button btn_anonymous = (Button) findViewById(R.id.btn_anonymous);
		Button btn_InnerClass = (Button) findViewById(R.id.btn_InnerClass);
		Button btn_Interface = (Button) findViewById(R.id.btn_Interface);
		
		//第三种点击事件方式----实现接口，需要实现 OnClickListener接口
		btn_Interface.setOnClickListener(this);
		//对按钮注册一个按钮点击事件监听器
		//第一种点击事件方式-------匿名内部类
		btn_anonymous.setOnClickListener(new OnClickListener() {
			//点击事件
			public void onClick(View v) {
				//Toast的第一个参数：上下文，第二个参数：文本，第三个参数：显示的时长
				Toast.makeText(MainActivity.this, "匿名内部类方式", Toast.LENGTH_SHORT).show();
			}
		});
		
		//第二种点击事件方式--------内部类
		btn_InnerClass.setOnClickListener(new MyOnclickLinstener());
	}
	//第二种点击事件方式--------内部类的方式
	class MyOnclickLinstener implements OnClickListener {

		public void onClick(View v) {
			Toast.makeText(MainActivity.this, "内部类方式", Toast.LENGTH_SHORT).show();
		}
		
	}
	//第三种点击事件方式----方法
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_Interface:
			Toast.makeText(MainActivity.this, "实现接口的方式", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
	}
	//第四种点击事件方式----方法
	public void XmlConfigure(View v){
		Toast.makeText(MainActivity.this, "XML配置的方式", Toast.LENGTH_SHORT).show();
	}
}
