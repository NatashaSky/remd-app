package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView appointmentbtn = findViewById(R.id.imgAppoint);
        ImageView patientrecordbtn = findViewById(R.id.imgRecord);
        ImageView inventorybtn = findViewById(R.id.imgIventory);

        appointmentbtn.setOnClickListener(this);
        patientrecordbtn.setOnClickListener(this);
        inventorybtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgAppoint:
                Intent appointActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(appointActivity);
                break;

            case R.id.imgRecord:
                Intent patientActivity = new Intent(getApplicationContext(), patientrecord.class);
                startActivity(patientActivity);
                break;

            case R.id.imgIventory:
                Intent inventActivity = new Intent(getApplicationContext(), inventory.class);
                startActivity(inventActivity);
                break;
        }
    }
}
