package inf4042_kechchany_hec.myusefullapp;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class Main24Activity extends Activity {

    private Button button00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);

        button00 = (Button) findViewById(R.id.button00);

        //NOTIFICATION
        button00.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                NotificationCompat.Builder notification = new NotificationCompat.Builder(Main24Activity.this);

                notification.setSmallIcon(R.drawable.ic_launcher);
                notification.setTicker("New notification!!!");
                notification.setWhen(System.currentTimeMillis());
                notification.setContentTitle("How to android");
                notification.setContentText("This a new notification !");

                Uri sound = RingtoneManager.getDefaultUri(Notification.DEFAULT_SOUND);
                notification.setSound(sound);
                Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.mono);
                notification.setLargeIcon(picture);

                PendingIntent myPendingIntent;
                Intent myIntent = new Intent();
                Context myContext = getApplicationContext();

                myIntent.setClass(myContext, Main25Activity.class);
                myIntent.putExtra("ID", 1);
                myPendingIntent = PendingIntent.getActivity(myContext,0, myIntent, 0);
                notification.setContentIntent(myPendingIntent);

                Notification n = notification.build();

                NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(1,n);

            }

        });
    }
}