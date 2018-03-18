package e.thai1.ptbacnhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txta,txtb;
    Button btnTinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta = (TextView)findViewById(R.id.input_a);
        txtb = (TextView)findViewById(R.id.input_b);
        btnTinh = (Button)findViewById(R.id.tinh);
        btnTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String sa = txta.getText().toString();
                    String sb = txtb.getText().toString();
                    if(sa.equals("")) throw  new UserException("Yeu cau nhap a");
                    if(sb.equals("")) throw  new UserException("Yeu cau nhap b");
                    try {
                        int a = Integer.parseInt(txta.getText().toString());
                        int b = Integer.parseInt(txtb.getText().toString());
                        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                        intent.putExtra("a",a);
                        intent.putExtra("b",b);
                        startActivity(intent);
                    }catch (Exception e){
                        Toast.makeText(MainActivity.this,"a va b phai la so nguyen", Toast.LENGTH_SHORT).show();
                    }

                }catch (UserException e){
                    Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_SHORT).show();
                }



            }
        });
    }


}
