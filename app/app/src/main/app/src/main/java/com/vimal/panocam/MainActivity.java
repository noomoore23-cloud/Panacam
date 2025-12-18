package com.vimal.panocam;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn = new Button(this);
        btn.setText("இது விமலின் சொந்த ஆப்!");
        btn.setOnClickListener(v -> Toast.makeText(this, "வெற்றி!", Toast.LENGTH_SHORT).show());
        setContentView(btn);
    }
}
