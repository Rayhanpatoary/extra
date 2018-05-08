package exr.at.com.firebasechat;


import android.app.Application;

public class firebasechat extends Application {
    private static boolean sIsChatActivityOpen = false;

    public static boolean isChatActivityOpen() {
        return sIsChatActivityOpen;
    }

    public static void setChatActivityOpen(boolean isChatActivityOpen) {
        firebasechat.sIsChatActivityOpen = isChatActivityOpen;
    }
    @Override
    public void onCreate() {
        super.onCreate();
    }
}