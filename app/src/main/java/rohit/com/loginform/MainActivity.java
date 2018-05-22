package rohit.com.loginform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mLoginButton = findViewById(R.id.button);
        mLoginButton.setOnClickListener(this);
    }

    // Handling the button click
    @Override
    public void onClick(View v) {
        if (R.id.button == v.getId()){
            Toast.makeText(this, "Button Clicked", Toast.LENGTH_LONG).show();
        }
    }
}
