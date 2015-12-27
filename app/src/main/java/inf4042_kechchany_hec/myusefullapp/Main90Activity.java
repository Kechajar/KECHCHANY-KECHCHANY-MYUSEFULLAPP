package inf4042_kechchany_hec.myusefullapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsMessage;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class Main90Activity extends Activity {

    BroadcastReceiver receiver = null;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main90);

        IntentFilter filter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context arr0, Intent arr1) {
                processReceiver(arr0, arr1);

            }
        };
        registerReceiver(receiver,filter);
    }
    protected void onDestroy (){
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    public void processReceiver(Context context, Intent intent){

        Toast.makeText(context,"CD tin nhan", Toast.LENGTH_LONG).show();
        TextView lbs =  (TextView)findViewById(R.id.textView12);

        Bundle bundle = intent.getExtras();
        Object[] objArr = (Object[]) bundle.get("pdus");
        String sms="";

        for(int i = 0; i<objArr.length;i++){
            SmsMessage smsMsg =SmsMessage.createFromPdu((byte[]) objArr[i]);
            String smsBody = smsMsg.getMessageBody();
            String senderNumber = smsMsg.getDisplayOriginatingAddress();
            sms +="From : "+senderNumber+"\nContent: "+smsBody+"\n";
        }
        lbs.setText(sms);
    }

}
