package pl.droidsonroids.wuot.demo;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TelephonyManager telephonyManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
		boolean smsCapable = telephonyManager.isSmsCapable();

		System.out.println("SMS capable: " + smsCapable);
		System.out.println("Limited: " + BuildConfig.IS_LIMITED);
	}
}
