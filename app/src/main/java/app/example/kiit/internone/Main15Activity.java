package app.example.kiit.internone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main15Activity extends AppCompatActivity {
    ListView ci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        ci=findViewById(R.id.ci);
        String numbers[]={"Massachusetts Institute of Technology","Stanford University","Yale University","Imperial Collage","California Institute of Technology"};
        final ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,numbers);
        ci.setAdapter(stringArrayAdapter);
        ci.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent mit = new Intent(Main15Activity.this,Main16Activity.class);
                    startActivity(mit);
                }
                if(position==1)
                {
                    Intent su = new Intent(Main15Activity.this,Main17Activity.class);
                    startActivity(su);
                }
                if(position==2)
                {
                    Intent yu = new Intent(Main15Activity.this,Main19Activity.class);
                    startActivity(yu);
                }
                if(position==3)
                {
                    Intent ic = new Intent(Main15Activity.this,Main20Activity.class);
                    startActivity(ic);
                }
                if(position==4)
                {
                    Intent ct = new Intent(Main15Activity.this,Main18Activity.class);
                    startActivity(ct);
                }

            }
        });
    }
}
