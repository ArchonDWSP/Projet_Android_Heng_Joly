package projetmobile.esiea.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Intent secAct = new Intent(this, SecondActivity.class);

        Button btnSecAct = (Button)findViewById(R.id.ButtonSecondActivity);
        btnSecAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(secAct);
            }
        });
    }
}
