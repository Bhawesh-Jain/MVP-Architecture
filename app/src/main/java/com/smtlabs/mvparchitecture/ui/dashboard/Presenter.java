package com.smtlabs.mvparchitecture.ui.dashboard;


public class Presenter implements DashboardContract.Presenter, DashboardContract.DashboardModel.OnFinishedListener {

    private DashboardContract.View mainView;

    private DashboardContract.DashboardModel dashboardModel;

    public Presenter(DashboardContract.View mainView, DashboardContract.DashboardModel dashboardModel) {
        this.mainView = mainView;
        this.dashboardModel = dashboardModel;
    }

    @Override
    public void onButtonClick() {
        if (mainView != null) {
            mainView.showProgress();
        }
        dashboardModel.getNextString(this);
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void onFinished(String string) {
        if (mainView != null) {
            mainView.setString(string);
            mainView.hideProgress();
        }
    }
}

