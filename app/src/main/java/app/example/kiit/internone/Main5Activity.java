package app.example.kiit.internone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    EditText et,et2,et3;
    TextView name,dob,eid,y,g,it;
    RadioButton m,f;
    CheckBox ab,ind;
    CalendarView cv;
    Button sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        et=findViewById(R.id.et);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        name=findViewById(R.id.name);
        dob=findViewById(R.id.dob);
        eid=findViewById(R.id.eid);
        y=findViewById(R.id.y);
        g=findViewById(R.id.g);
        it=findViewById(R.id.it);
        m=findViewById(R.id.m);
        f=findViewById(R.id.f);
        ab=findViewById(R.id.ab);
        ind=findViewById(R.id.ind);
        cv=findViewById(R.id.cv);
        sb=findViewById(R.id.sb);

    }
    public void submit(View view)
    {
        Toast.makeText(Main5Activity.this,"YOUR DATA HAS BEEN SAVED",Toast.LENGTH_SHORT).show();
    }
}
