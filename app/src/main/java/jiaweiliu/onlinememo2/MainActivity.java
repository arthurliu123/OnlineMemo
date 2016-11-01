package jiaweiliu.onlinememo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String MEMO_API = "https://jiawei-liu-cs496-assign3.appspot.com/memos";
    private Map<String, String> params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dis_data{
        super(Request.Method.POST, MEMO_API, listener, null);

    }
}
