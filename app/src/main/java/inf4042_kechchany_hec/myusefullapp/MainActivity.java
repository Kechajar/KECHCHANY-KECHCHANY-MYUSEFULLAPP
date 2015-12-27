package inf4042_kechchany_hec.myusefullapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    public void onClick(View v) {
       if(v.getId()==R.id.button){
           Intent i = new Intent(MainActivity.this, Main2Activity.class);
           startActivity(i);
        }
        Toast.makeText(getApplicationContext(),
                "Welcome to My Usefull Application !!!",
                Toast.LENGTH_LONG).show();

    }
}



