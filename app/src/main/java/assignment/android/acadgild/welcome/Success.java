package assignment.android.acadgild.welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Success extends AppCompatActivity {
TextView txtViewWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        txtViewWelcome=(TextView)findViewById(R.id.textViewWelcome);
        txtViewWelcome.setText(" Welcome "+getIntent().getExtras().getString("username"));

    }
}
