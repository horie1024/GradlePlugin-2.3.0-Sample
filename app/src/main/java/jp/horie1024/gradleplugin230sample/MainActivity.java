package jp.horie1024.gradleplugin230sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import jp.horie1024.gradleplugin230sample.databinding.ActivityMainBinding;

/**
 * @author horie1024
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.text.setText("Hello World!");
    }
}
