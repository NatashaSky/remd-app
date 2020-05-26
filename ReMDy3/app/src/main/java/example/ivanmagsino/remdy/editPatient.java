package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editPatient extends AppCompatActivity {
    Button savePatient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_patient);
        savePatient = (Button) findViewById(R.id.btnSavePatient);
    }

    public void SaveChange (View v){
        Intent nextActivity = new Intent(getApplicationContext(), patientrecord.class);
        startActivity(nextActivity);
    }
}
