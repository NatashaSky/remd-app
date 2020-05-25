package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class inventory extends AppCompatActivity{
        Button btnAdd;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_inventory);

            btnAdd = (Button) findViewById(R.id.btnAddItem);

        }

        public void addItem (View v){
            Intent nextActivity = new Intent(getApplicationContext(), additem.class);
            startActivity(nextActivity);
        }
}

