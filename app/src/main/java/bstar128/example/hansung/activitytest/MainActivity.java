package bstar128.example.hansung.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edit1,edit2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain=(Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHandler);
        edit1=(EditText)findViewById(R.id.edit_main);
        edit2=(EditText)findViewById(R.id.edit_tel);
    }

    View.OnClickListener butMainHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    //get-도 가능
            String name=edit1.getText().toString();
            String tel=edit2.getText().toString();
            intent.putExtra("name",name);//첫번째 이름, 값
            intent.putExtra("tel",tel);
            startActivity(intent);

        }
    };
}
