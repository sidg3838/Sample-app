package app.example.kiit.internone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.b);
        t=findViewById(R.id.t);
    }
    public void jp1(View view)
    {
        Intent a = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(a);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id=item.getItemId();
        switch (id) {
            case R.id.about:
                Intent ab = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(ab);
                break;
            case R.id.claculate:
                Intent cl = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(cl);
                break;
            case R.id.register:
                Intent rg = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(rg);
                break;
            case R.id.contact:
                Intent ct = new Intent(Intent.ACTION_DIAL);
                ct.setData(Uri.parse("tel:9838494093"));
                startActivity(ct);
                break;

        }
        return super.onOptionsItemSelected(item);

    }
}
