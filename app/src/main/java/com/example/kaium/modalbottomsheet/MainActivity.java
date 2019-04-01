package com.example.kaium.modalbottomsheet;

import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleBottomSheetDialog.BottomSheetListener{

    private TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.tv_button_clicked);

        Button buttonOpenBottomSheet = findViewById(R.id.btn_open_bottom_sheet);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExampleBottomSheetDialog bottomSheetDialog = new ExampleBottomSheetDialog();
                bottomSheetDialog.show(getSupportFragmentManager(),"examplebottomsheet");
            }
        });
    }

    @Override
    public void onButtonClicked(String text) {
        mTextView.setText(text);
    }
}
