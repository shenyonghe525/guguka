package com.imooc.guaguaka;

import android.app.Activity;
import android.os.Bundle;
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
//						Toast.makeText(getApplicationContext(), "�û��Ѿ��εò����",
//								Toast.LENGTH_SHORT).show();
						//do something
					}
				});
		
		mGuaGuaKa.setText("$50000");
	}

}
