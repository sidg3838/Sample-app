package app.example.kiit.internone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main7Activity extends AppCompatActivity {
    ListView scholarship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
       scholarship = findViewById(R.id.scholarship);
       String numbers[]={"Mitacs","CERN","DAAD","IAESTE","Khorana Program","S.N Bose Scholar's Program","Helpful Links"};
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, numbers);
        scholarship.setAdapter(stringArrayAdapter);
        scholarship.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent mit = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(mit);
                }
                if(position==1)
                {
                    Intent cern = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(cern);
                }
                if(position==2)
                {
                    Intent daad = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(daad);
                }
                if(position==3)
                {
                    Intent iaeste = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(iaeste);
                }
                if(position==4)
                {
                    Intent kp = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(kp);
                }
                if(position==5)
                {
                    Intent sn = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(sn);
                }
                if(position==6)
                {
                    Intent hl = new Intent(Main7Activity.this,MainActivity.class);
                    startActivity(hl);
                }
            }
        });
    }
}
