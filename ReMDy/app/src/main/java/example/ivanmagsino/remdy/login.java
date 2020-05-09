package example.ivanmagsino.remdy;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText email;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email =(EditText) findViewById(R.id.txtEmail);
        pass =(EditText) findViewById(R.id.txtPass);
    }
    public void Login(View v){
        String txt1 = email.getText().toString();
        String txt2 = pass.getText().toString();
        if (txt1.equals("ivan@gmail.com")&& txt2.equals("1234")){
            Intent nextActivity = new Intent(getApplicationContext(),index.class);
            startActivity(nextActivity);
        }else {
            Toast.makeText(this,"Error Try Again",Toast.LENGTH_LONG).show();
        }
    }

}
