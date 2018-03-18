package e.thai1.ptbacnhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    TextView txtKq;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtKq = (TextView)findViewById(R.id.kq);
        btnBack = (Button)findViewById(R.id.back);
        Intent intent = getIntent();
        int a = intent.getIntExtra("a",1);
        int b = intent.getIntExtra("b",1);
        double kq = -b*1.0/a;
        DecimalFormat df = new DecimalFormat("#.##");
        txtKq.setText(df.format(kq)+ "");
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent1);
            }
        });
    }


}
