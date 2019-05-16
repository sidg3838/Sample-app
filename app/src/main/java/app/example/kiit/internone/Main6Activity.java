package app.example.kiit.internone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main6Activity extends AppCompatActivity {
    ListView internship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        internship=findViewById(R.id.internship);
        String numbers[]={"Foreign Training: Intro","Importance of foreign Training","How To Begin","When To Begin","CGPA?","What do I Require","Applying Procedure"};
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, numbers);
        internship.setAdapter(stringArrayAdapter);
        internship.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent ft = new Intent(Main6Activity.this,Main8Activity.class);
                    startActivity(ft);
                }
                if(position==1)
                {
                    Intent ift = new Intent(Main6Activity.this,Main9Activity.class);
                    startActivity(ift);
                }
                if(position==2)
                {
                    Intent hb = new Intent(Main6Activity.this,Main10Activity.class);
                    startActivity(hb);
                }
                if(position==3)
                {
                    Intent wb = new Intent(Main6Activity.this,Main11Activity.class);
                    startActivity(wb);
                }
                if(position==4)
                {
                    Intent cgpa = new Intent(Main6Activity.this,Main12Activity.class);
                    startActivity(cgpa);
                }
                if(position==5)
                {
                    Intent wr = new Intent(Main6Activity.this,Main13Activity.class);
                    startActivity(wr);
                }
                if(position==6)
                {
                    Intent ap = new Intent(Main6Activity.this,Main14Activity.class);
                    startActivity(ap);
                }
            }
        });
    }
}
