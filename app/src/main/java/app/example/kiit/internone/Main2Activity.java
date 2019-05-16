package app.example.kiit.internone;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    Button sb,cb,ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sb=findViewById(R.id.sb);
        cb=findViewById(R.id.cb);
        ib=findViewById(R.id.ib);
    }
    public void internship(View view)
    {
        Intent ishp = new Intent(Main2Activity.this,Main6Activity.class);
        startActivity(ishp);
    }
    public void scholarship(View view)
    {
        Intent schp = new Intent(Main2Activity.this,Main7Activity.class);
        startActivity(schp);
    }
    public void collage(View view)
    {
        Intent cllg = new Intent(Main2Activity.this,Main15Activity.class);
        startActivity(cllg);
    }
}
