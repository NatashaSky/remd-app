package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inventory extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientrecord);

        Button addItm = findViewById(R.id.btnAddItem);
        Button editItm = findViewById(R.id.btnEditItem);
        Button deleteItm = findViewById(R.id.btnDeleteItem);


    }

    public void addItem(View v){

    }

    public void editItem(View v){

    }

    public void deleteItem(View v){

    }

}
