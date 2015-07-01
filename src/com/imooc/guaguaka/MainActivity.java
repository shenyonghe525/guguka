package com.imooc.guaguaka;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.imooc.guaguaka.view.GuaGuaKa;
import com.imooc.guaguaka.view.GuaGuaKa.OnGuaGuaKaCompleteListener;

public class MainActivity extends Activity
{
	GuaGuaKa mGuaGuaKa;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mGuaGuaKa = (GuaGuaKa) findViewById(R.id.id_guaguaka);
		mGuaGuaKa
				.setOnGuaGuaKaCompleteListener(new OnGuaGuaKaCompleteListener()
				{
					@Override
					public void complete()
					{
//						Toast.makeText(getApplicationContext(), "用户已经刮得差不多了",
//								Toast.LENGTH_SHORT).show();
						//do something
					}
				});
		
		mGuaGuaKa.setText("Android新技能Get");
	}

}
