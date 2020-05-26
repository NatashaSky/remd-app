package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addRecord extends AppCompatActivity {
    Button btnPADD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        btnPADD = (Button) findViewById(R.id.btnSavePatient);

    }

    public void addItem (View v){
        Intent nextActivity = new Intent(getApplicationContext(), patientrecord.class);
        startActivity(nextActivity);
    }
}
