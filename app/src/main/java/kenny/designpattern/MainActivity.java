package kenny.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import kenny.designpattern.builder_pattern.builder.MacbookBuilder;
import kenny.designpattern.builder_pattern.product.Computer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_builder).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_builder:
                Computer computer = new MacbookBuilder().buildBoard("Inter").buildDisplay("Retina display").buildOS().create();
                Toast.makeText(MainActivity.this, computer.toString(), Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
