package com.smtlabs.mvparchitecture.ui.dashboard;

import android.os.Handler;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DashboardModel implements DashboardContract.DashboardModel {

    private final List<String> arrayList = Arrays.asList(
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. ",
            "Lorem Ipsum has been the industry's standard dummy text ever since",
            " the 1500s, when an unknown printer took a galley of type and ",
            "scrambled it to make a type specimen book. ",
            "It has survived not only five centuries, but also the leap into",
            " electronic typesetting, remaining essentially unchanged. It was popularised",
            " in the 1960s with the release of Least sheets containing Lorem Ipsum passages, ",
            "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    );

    @Override
    public void getNextString(final OnFinishedListener listener) {
        new Handler().postDelayed(() -> listener.onFinished(getRandomString()), 500);
    }

    private String getRandomString() {
        Random random = new Random();
        int index = random.nextInt(arrayList.size());
        return arrayList.get(index);
    }
}

