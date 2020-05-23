package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patientrecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientrecord);

        Button addRecord = findViewById(R.id.btnAddRecord);
        Button editRecord = findViewById(R.id.btnEditRecord);
        Button deleteRecord = findViewById(R.id.btnDeleteRecord);

    }

    public void addRecord(View v){

    }

    public void editRecord(View v){

    }

    public void deleteRecord(View v){

    }
}
