package com.smtlabs.mvparchitecture.ui.dashboard;

import static android.view.View.GONE;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.smtlabs.mvparchitecture.R;

public class DashboardActivity extends AppCompatActivity implements DashboardContract.View {

    private TextView textView;
    private ProgressBar progressBar;

    DashboardContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        progressBar = findViewById(R.id.progressBar);

        presenter = new Presenter(this, new DashboardModel());

        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                presenter.onButtonClick();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    // method to display the Course Detail TextView
    public void showProgress() {
        progressBar.setVisibility(android.view.View.VISIBLE);
        textView.setVisibility(android.view.View.INVISIBLE);
    }

    @Override
    // method to hide the Course Detail TextView
    public void hideProgress() {
        progressBar.setVisibility(GONE);
        textView.setVisibility(android.view.View.VISIBLE);
    }

    @Override
    public void setString(String string) {
        textView.setText(string);
    }
}
