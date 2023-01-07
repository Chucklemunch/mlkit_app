package com.google.mlkit.vision.demo;

import android.net.Uri;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.VideoWriter;
import org.opencv.videoio.Videoio;

import java.io.File;
import java.net.URI;

/**
 * Instance of this class is used to process the
 * recording of a rep and return an array of checkpoints
 * the characterize the evolution of joint angles that make
 * up a rep.
 */
public class RepLearner {
    {System.loadLibrary("opencv_java4");}
    String vidUri;
    String vidLocation; // URI of rep recording
    Double[][] checkpoints; // Array of rep checkpoints

    public RepLearner (Uri uri, String filesDir, String fileName) {//TODO fix video retrieval
        this.vidUri = uri.toString();
        this.vidLocation = fileName;
        if (this.vidLocation != null) {
            System.out.println("VID LOCATION NOT NULL");
            System.out.println("fileName -> : " + vidLocation);
        }
        this.checkpoints = getCheckpoints();
    }

    public Double[][] getCheckpoints () {
        double frmCount = 0; // Number of frames in video
        double fps = 0;
        Size vidSize = null;
        // Load Rep Vid
        VideoCapture repVid = new VideoCapture(vidLocation); // //TODO prob creating vidcap
        /*boolean isVidOpened = repVid.open(vidLocation); //TODO problem opening file
        System.out.println(isVidOpened);
        // Checks if video is successfully opened
        if (isVidOpened) { // Gets video metadata
            System.out.println("VIDEO OPENED!!!");
            frmCount = repVid.get(Videoio.CAP_PROP_FRAME_COUNT);
            fps = repVid.get(Videoio.CAP_PROP_FPS);
            vidSize = new Size(repVid.get(Videoio.CAP_PROP_FRAME_WIDTH),
                                repVid.get(Videoio.CAP_PROP_FRAME_HEIGHT));
            // Initializes Videowriter object
            Mat img = new Mat();
            VideoWriter vidOutput = new VideoWriter(vidLocation.toString(),
                    VideoWriter.fourcc('m','p','g','4'), fps, vidSize, true);
            System.out.println("VideoWriter: " + vidOutput);
        } else {
            System.out.println("Problem opening video!!");
        }*/


        return this.checkpoints;
    }


}
