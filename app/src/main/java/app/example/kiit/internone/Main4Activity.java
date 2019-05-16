package app.example.kiit.internone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    Button b;
    EditText et,et2;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        b=findViewById(R.id.b);
        et=findViewById(R.id.et);
        et2=findViewById(R.id.et2);
        tv=findViewById(R.id.tv);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x=Float.parseFloat(et.getText().toString());
                float y=Float.parseFloat(et2.getText().toString());
                float z=x+y;
                if(z>20){
                    tv.setText("Beta kaha se engineering kiye ho cgpa jo 10 k upar hi");
                }
                       else if(z<=20&&z>=18){
                            tv.setText("You are eligible for any type of internship you want");
                        }
                        else if (z<18&&z>=16){
                            tv.setText("You Might be sorted by some world class University but don't worry you have enough cgpa to clear there cutoff");
                        } else if (z<16&&z>=14){
                            tv.setText("There are might be some problem during the hr round but if you have any ordinary definately go through with");
                        }
                        else
                        {
                            tv.setText("Beta tumhara kuch nhi hone wala");
                        }


            }
        });
    }
}
