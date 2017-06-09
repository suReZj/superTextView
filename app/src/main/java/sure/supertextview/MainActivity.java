package sure.supertextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.allen.library.SuperTextView;

public class MainActivity extends AppCompatActivity {
    private SuperTextView superText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        superText=(SuperTextView) findViewById(R.id.superText);
        superText.setOnSuperTextViewClickListener(new SuperTextView.OnSuperTextViewClickListener(){
            @Override
            public void onSuperTextViewClick(){
                super.onSuperTextViewClick();
                if(superText.getCbisChecked()){
                    Toast.makeText(getApplicationContext(),"SuperTextViewClick",Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onLeftTopClick() {
                super.onLeftTopClick();
                Toast.makeText(getApplicationContext(),"LeftTopClick",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onLeftBottomClick() {
                super.onLeftBottomClick();
                Toast.makeText(getApplicationContext(),"LeftBottomClick",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onLeftBottomClick2() {
                super.onLeftBottomClick2();
                Toast.makeText(getApplicationContext(),"LeftBottomClick2",Toast.LENGTH_SHORT).show();
            }

        });
    }
}
