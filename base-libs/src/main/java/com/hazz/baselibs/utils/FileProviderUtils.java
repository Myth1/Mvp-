package com.hazz.baselibs.utils;

import android.net.Uri;
import android.os.Build;

import androidx.appcompat.app.AppCompatActivity;

import com.hazz.baselibs.provider.FileProvider;

import java.io.File;

public class FileProviderUtils {
    /**
     * Get compatible Android 7.0 and lower versions of Uri.
     *
     * @param activity [Activity].
     * @param file apk file.
     *
     * @return uri.
     */
    public static Uri getFileUri(AppCompatActivity activity, File file) {
        Uri uri;
         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
             uri = FileProvider.getUriForFile(activity, activity.getPackageName() + ".file.path.share", file);
        } else {
             uri = Uri.fromFile(file);
         }
        return uri;
    }
}
