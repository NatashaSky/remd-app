package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class editItem extends AppCompatActivity {
    Button saveItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        saveItem = (Button) findViewById(R.id.btnSavePatient);

    }

    public void saveItem(View v){
        Intent nextActivity = new Intent(getApplicationContext(), inventory.class);
        startActivity(nextActivity);
    }
}
