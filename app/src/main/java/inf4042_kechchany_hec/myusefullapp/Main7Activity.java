package inf4042_kechchany_hec.myusefullapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main7Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

    }

    public void onClick(View v) {

        if (v.getId() == R.id.textView3) {
            Intent i = new Intent(Main7Activity.this, Main71Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView4) {
            Intent i = new Intent(Main7Activity.this, Main72Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView5) {
            Intent i = new Intent(Main7Activity.this, Main73Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView6) {
            Intent i = new Intent(Main7Activity.this, Main74Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView7) {
            Intent i = new Intent(Main7Activity.this, Main75Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView8) {
            Intent i = new Intent(Main7Activity.this, Main76Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView9) {
            Intent i = new Intent(Main7Activity.this, Main77Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView10) {
            Intent i = new Intent(Main7Activity.this, Main78Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView11) {
            Intent i = new Intent(Main7Activity.this, Main79Activity.class);
            startActivity(i);
        }
    }
}
