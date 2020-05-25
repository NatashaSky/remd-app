package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class additem extends AppCompatActivity {

    Button btnItmAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        btnItmAdd = (Button) findViewById(R.id.btnPADD);
    }

    public void addItm (View v){
        Intent nextActivity = new Intent(getApplicationContext(), inventory.class);
        startActivity(nextActivity);
    }
}
