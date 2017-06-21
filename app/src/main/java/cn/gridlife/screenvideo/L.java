package cn.gridlife.screenvideo;

import android.util.Log;

/**
 * ProjectName ScreenVideo
 * PackageName cn.gridlife.screenvideo
 * Created by beizhenbo on 2017/6/20.
 */


public class L {

    private static final String sTag = "WallPaper";

    public static void d(String msg, Object... params) {

        Log.d(sTag, String.format(msg, params));

    }

}