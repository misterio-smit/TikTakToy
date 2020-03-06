package com.example.tiktaktoy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String ANS = "answers";

    private ArrayList<Integer> answers = new ArrayList<>();
/* Первый метод
 */
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);
        Log.d(MainActivity.class.getName(),   "onCreate");
        load(state);
    }

    public void answer(View view) {
        ((Button) view).setText("X");
        answers.add(view.getId());
    }



    @Override
    protected void onSaveInstanceState (Bundle state) {
            super.onSaveInstanceState(state);
            Log.d(MainActivity.class.getName(), "onSaveInstanceState");
            state.putIntegerArrayList(ANS, answers);
    }

    private void  load(Bundle state ) {
        if(state !=null) {
            for (Integer id : state.getIntegerArrayList(ANS)) {
                Button btn = findViewById(id);
                btn.setText("X");
                answers.add(btn.getId());
            }
        }
    }


/* Второй метод
 */
    @Override
    protected  void onStart() {
        super.onStart();
        Log.d(MainActivity.class.getName(), "onStart");
    }

/* Третий метод
 */
    @Override
    protected  void onResume() {
        super.onResume();
        Log.d(MainActivity.class.getName(),   "onResume");
    }


    @Override
    protected  void onPause() {
        super.onPause();
        Log.d(MainActivity.class.getName(), "onPause");
    }

    @Override
    protected  void onStop() {
        super.onStop();
        Log.d(MainActivity.class.getName(), "onStop");
    }
    @Override
    protected  void onDestroy() {
        super.onDestroy();
        Log.d(MainActivity.class.getName(), "onDestroy");
    }

}
