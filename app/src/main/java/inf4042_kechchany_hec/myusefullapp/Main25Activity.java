package inf4042_kechchany_hec.myusefullapp;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

public class Main25Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);

        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        int ID = getIntent().getIntExtra("ID", 8);
        nm.cancel(ID);
    }
}
