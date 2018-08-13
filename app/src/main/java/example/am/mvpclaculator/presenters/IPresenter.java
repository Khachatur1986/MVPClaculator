package example.am.mvpclaculator.presenters;

/**
 * Created by Khach on 12-Aug-18.
 */

public interface IPresenter {
    void onCreate();

    void onPause();

    void onResume();

    void onDestroy();
}
