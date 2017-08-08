package com.menuitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int score[] = {67, 69, 75, 87, 89, 90, 99, 100};
        for (int i = 0; i < score.length - 1; i++) {//7
            for (int j = 0; j < score.length - i - 1; j++) {//7 6
                if (score[j] < score[j + 1]) {
                    int temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
                //69 67 75 87 89 90 99 100
                //69 75 67 87 89 90 99 100
                //69 75 87 67 89 90 99 100
                //69 75 87 89 67 90 99 100
                //69 75 87 89 90 67 99 100
                //69 75 87 89 90 99 67 100
                //69 75 87 89 90 99 100 67
                for (int a = 0; a < score.length; a++) {
//                    Log.e("df", "排序..：" + j + score[a]);
                }
            }
            // 69 75 87 89 90 99 100 67
            // 75 87 89 90 99 100 69 67
            // 87 89 90 99 100 75 69 67
            // 89 90 99 100 87 75 69 67
            // 90 99 100 89 87 75 69 67
            // 99 100 90 89 87 75 69 67
            // 100 99 90 89 87 75 69 67
            for (int a = 0; a < score.length; a++) {
//                Log.e("df", "排序..：" + score[a] );
            }
        }
        for (int a = 0; a < score.length; a++) {
//            Log.e("df", "排序之后：" + score[a] );
        }
    }
}
