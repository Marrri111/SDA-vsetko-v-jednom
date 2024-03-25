package org.example.javaAdvancedCoding.excercise.stream.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Season {


    public static void main(String[] args) {
        // Vytvorenie niekoľkých videí
        Video video1 = new Video("Video 1", "url1", VideoType.CLIP);
        Video video2 = new Video("Video 2", "url2", VideoType.PREVIEW);
        Video video3 = new Video("Video 3", "url3", VideoType.EPISODE);

        // Vytvorenie niekoľkých epizód s priradenými videami
        List<Video> episode1Videos = new ArrayList<>();
        episode1Videos.add(video1);
        episode1Videos.add(video2);
        Episode episode1 = new Episode("Episode 1", 1, episode1Videos);

        List<Video> episode2Videos = new ArrayList<>();
        episode2Videos.add(video3);
        Episode episode2 = new Episode("Episode 2", 2, episode2Videos);

        // Vytvorenie sezóny so zoznamom epizód
        List<Episode> season1Episodes = new ArrayList<>();
        season1Episodes.add(episode1);
        season1Episodes.add(episode2);
        Season season1 = new Season("Season 1", 1, season1Episodes);

        // Pridanie ďalších sezón podľa potreby
        // ...

        // Vytvorenie listu sezón
        List<Season> seasons = new ArrayList<>();
        seasons.add(season1);
        // Pridanie ďalších sezón podľa potreby
        // ...


        //a list of all episodes
        List<Episode> collect1 = seasons.stream().flatMap(s -> s.episodes.stream()).collect(Collectors.toList());
        collect1.forEach(System.out::println);

        //a list of all videos
        List<Video> videoList = seasons.stream()
                .flatMap(s -> s.episodes.stream())
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());
        videoList.forEach(System.out::println);

        //druha varianta
        List<Video> videoList1 = seasons.stream()
                .map(season -> season.episodes)
                .flatMap(Collection::stream)
                .flatMap(e -> e.videos.stream())
                .collect(Collectors.toList());
        videoList1.forEach(System.out::println);

        //a list of all season names

        List<String> collect3 = seasons.stream().map(s -> s.seasonName).collect(Collectors.toList());
        //druhy pristup
        List<String> cellectt4 = seasons.stream().map(Season::getSeasonName).collect(Collectors.toList());

        //a list of all season numbers

        //only episodes from even seasons
        AtomicInteger ai = new AtomicInteger(-1);
        List<Episode> episodesFromEvenSeasons = seasons.stream()
                .filter(s -> ai.incrementAndGet() % 2 != 0)
                .flatMap(s -> s.episodes.stream())
                .collect(Collectors.toList());
        //same as above
        List<Episode> episodesFromEvenSeasons2 = IntStream.range(0, seasons.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(index -> seasons.get(index))
                .flatMap(season -> season.episodes.stream())
                .collect(Collectors.toList());

        //only example for Ivo's question not related to episode
        for (int i = 0; i < 2; i++) {
            Stream<Integer> integerStream = Stream.of(1, 2, 3);
            List<Integer> collect = integerStream.collect(Collectors.toList());
            //next will raise exception stream was closed by collect method
            //integerStream.filter(p->p%2==0);
        }


    }


    public String seasonName;
    public int seasonNumber;
    List<Episode> episodes;

    public String getSeasonName() {
        return seasonName;
    }

    public Season(String seasonName, int seasonNumber,
                  List<Episode> episodes) {
        this.seasonName = seasonName;
        this.seasonNumber = seasonNumber;
        this.episodes = episodes;
    }
}
