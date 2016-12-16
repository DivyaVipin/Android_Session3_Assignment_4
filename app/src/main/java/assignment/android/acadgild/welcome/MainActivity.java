package assignment.android.acadgild.welcome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editUsername;
    EditText editPassword;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editUsername=(EditText)findViewById(R.id.editTextUsername);
        editPassword=(EditText)findViewById(R.id.editTextPassword);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=editUsername.getText().toString();
                String pass=editPassword.getText().toString();
                if(user.equals("Divya")&&(pass.equals("Vipin")))
                {
                    Intent i=new Intent(MainActivity.this,Success.class);
                    i.putExtra("username",user);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid username and password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
