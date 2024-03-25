package org.example.javaAdvancedCoding.excercise.stream.task1;

//Using the functional programming mechanisms based on the given structure,
//please provide:
//a list of all episodes
//a list of all videos
//a list of all season names
//a list of all season numbers
//a list of all episode names
//a list of all episode numbers
//a list of all video names
//a list of all url addresses for each video
//only episodes from even seasons
//only videos from even seasons
//only videos from even episodes and seasons
//only Clip videos from even episodes and odd seasons
//only Preview videos from odd episodes and even seasons
public class Video {


    public String title;
    public String url;
    public VideoType videoType;

    public Video(String title, String url, VideoType videoType) {
        this.title = title;
        this.url = url;
        this.videoType = videoType;
    }
}

