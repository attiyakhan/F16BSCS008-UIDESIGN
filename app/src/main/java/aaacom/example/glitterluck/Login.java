package aaacom.example.glitterluck;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
private Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              openforgotpassword();

            }
        });
                btn2=findViewById(R.id.button5);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensignup();
        }
        });

}

    private void openforgotpassword() {
        Intent intent=new Intent(this,Forgotpassword.class);
        startActivity(intent);
    }

    private void opensignup() {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
