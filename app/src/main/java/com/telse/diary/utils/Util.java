package com.telse.diary.utils;


import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

public class Util {

    /**
     * This method converts dp unit to equivalent pixels, depending on device density.
     *
     * @param dp      A value in dp (density independent pixels) unit. Which we need to convert into pixels
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent px equivalent to dp depending on device density
     */
    public static float convertDpToPixel(float dp, Context context) {
        final Resources resources = context.getResources();
        final DisplayMetrics metrics = resources.getDisplayMetrics();
        return dp * (metrics.densityDpi / 160f);
    }

    /**
     * This method converts device specific pixels to density independent pixels.
     *
     * @param px      A value in px (pixels) unit. Which we need to convert into db
     * @param context Context to get resources and device specific display metrics
     * @return A float value to represent dp equivalent to px value
     */
    public static float convertPixelsToDp(float px, Context context) {
        final Resources resources = context.getResources();
        final DisplayMetrics metrics = resources.getDisplayMetrics();
        return px / (metrics.densityDpi / 160f);
    }


    /**
     * This method converts input stream into string.
     *
     * @param stream A stream that is needed to be converted.
     * @return A string with converted stream in UTF-8;
     * @throws IOException
     */
    public static String getStringFromInputStream(InputStream stream) throws IOException {
        final int BUFFER_SIZE = 1024;
        char[] buffer = new char[BUFFER_SIZE * 4];
        int size;
        InputStreamReader reader = new InputStreamReader(stream, "UTF-8");
        StringWriter writer = new StringWriter();
        do {
            size = reader.read(buffer, 0, BUFFER_SIZE);
            if (size > 0) {
                writer.write(buffer, 0, size);
            }
        } while (size == BUFFER_SIZE);
        return writer.toString();
    }
}