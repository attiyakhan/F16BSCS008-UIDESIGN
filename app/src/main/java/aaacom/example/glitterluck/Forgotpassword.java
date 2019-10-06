package aaacom.example.glitterluck;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Forgotpassword extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpassword);
     
    }

    public void click(View view)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(Forgotpassword.this);
        builder.setMessage("Password changed. Your new password is 12345.");
        builder.setTitle("Alert!");
        builder.setIcon(R.drawable.alert);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Forgotpassword.this,"Hello",Toast.LENGTH_SHORT);
                startActivity(new Intent(Forgotpassword.this,Forgotpassword.class));
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Forgotpassword.this,"Hello",Toast.LENGTH_SHORT);
                startActivity(new Intent(Forgotpassword.this,Forgotpassword.class));

            }
        });

                AlertDialog alertdialog = builder.create();
        alertdialog.setCancelable(false);
        alertdialog.show();
    }
}
