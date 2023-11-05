package com.sypnix.wifimanager;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {

    public static void writeCSV(Context context, String fileName, String data) {
        File downloadsFolder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File file = new File(downloadsFolder, fileName);

        try {
            FileWriter writer = new FileWriter(file);
            writer.append(data);
            writer.flush();
            writer.close();
            Log.d("CSVWriter", "CSV file created successfully at " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("CSVWriter", "Error writing CSV file: " + e.getMessage());
        }
    }
}
