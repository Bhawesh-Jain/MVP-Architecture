package com.smtlabs.mvparchitecture.ui.dashboard;

public interface DashboardContract {
    interface View {
        void showProgress();

        void hideProgress();

        void setString(String string);
    }

    interface DashboardModel {

        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextString(DashboardModel.OnFinishedListener onFinishedListener);
    }

    interface Presenter {

        void onButtonClick();

        void onDestroy();
    }
}
