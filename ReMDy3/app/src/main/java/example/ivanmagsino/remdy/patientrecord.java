package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patientrecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientrecord);

        Button addRecord = findViewById(R.id.btnAddRecord);

    }

    public void addRecord(View v){
        Intent nextActivity = new Intent(getApplicationContext(), addRecord.class);
        startActivity(nextActivity);
    }

}
