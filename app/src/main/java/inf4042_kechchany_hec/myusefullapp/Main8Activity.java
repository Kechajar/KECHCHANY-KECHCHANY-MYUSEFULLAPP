package inf4042_kechchany_hec.myusefullapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main8Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
    }
    public void onClick(View v) {

        if (v.getId() == R.id.textView3) {
            Intent i = new Intent(Main8Activity.this, Main81Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView4) {
            Intent i = new Intent(Main8Activity.this, Main82Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView5) {
            Intent i = new Intent(Main8Activity.this, Main83Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView6) {
            Intent i = new Intent(Main8Activity.this, Main84Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView7) {
            Intent i = new Intent(Main8Activity.this, Main85Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView8) {
            Intent i = new Intent(Main8Activity.this, Main86Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView9) {
            Intent i = new Intent(Main8Activity.this, Main87Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView10) {
            Intent i = new Intent(Main8Activity.this, Main88Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.textView11) {
            Intent i = new Intent(Main8Activity.this, Main89Activity.class);
            startActivity(i);
        }
    }
}
