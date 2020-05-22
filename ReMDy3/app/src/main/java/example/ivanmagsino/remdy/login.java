package example.ivanmagsino.remdy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
            Intent nextActivity = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(nextActivity);
        }else {
            Toast.makeText(this,"Email or Password is incorrect",Toast.LENGTH_LONG).show();
        }
    }
}
