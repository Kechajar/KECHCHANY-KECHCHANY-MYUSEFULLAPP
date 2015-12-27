package inf4042_kechchany_hec.myusefullapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends Activity implements View.OnClickListener {
    Button button8;
    Button button3;
    Button button5;
    Button button2;
    Button button6;
    Button button4;
    Button button7;
    Button button9;
    Button button00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button8=(Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button9=(Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button00=(Button)findViewById(R.id.button00);
        button00.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.getId() == R.id.button8) {
            Intent i = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(i);
            Context context = getApplicationContext();
            CharSequence message = "Hey, clique sur un bouton!!";
            int duration = Toast.LENGTH_SHORT;
            final Toast toastBasic = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        }
        if (v.getId() == R.id.button3) {
            Intent i = new Intent(Main2Activity.this, Main3Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button5) {
            Intent i = new Intent(Main2Activity.this, Main4Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button2) {
            Intent i = new Intent(Main2Activity.this, Main5Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button6) {
            Intent i = new Intent(Main2Activity.this, Main6Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button4) {
            Intent i = new Intent(Main2Activity.this, Main7Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button7) {
            Intent i = new Intent(Main2Activity.this, Main8Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button9) {
            Intent i = new Intent(Main2Activity.this, Main90Activity.class);
            startActivity(i);
        }
        if (v.getId() == R.id.button00) {
            Intent i = new Intent(Main2Activity.this, Main24Activity.class);
            startActivity(i);
        }



    }

}
