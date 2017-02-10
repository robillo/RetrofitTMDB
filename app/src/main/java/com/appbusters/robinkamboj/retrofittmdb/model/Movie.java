package com.appbusters.robinkamboj.retrofittmdb.model;

import java.util.List;

/**
 * Created by robinkamboj on 10/02/17.
 */

public class Movie {
        /**
         * poster_path : /xq1Ugd62d23K2knRUx6xxuALTZB.jpg
         * adult : false
         * overview : The "story of miracles and love" revolves around Mitsuha and Taki. Mitsuha is a female high school student who lives in a rural town nestled deep in the mountains. Taki is a male high school student who lives in central Tokyo. One day, Mitsuha has a dream where she is a young man in Tokyo. Taki also has a dream where he is a female high school student in a town in the mountains that he has never been to. What is the secret to their dreams of personal experience?
         * release_date : 2016-08-26
         * genre_ids : [878,16,18,14,10749]
         * id : 372058
         * original_title : 君の名は。
         * original_language : ja
         * title : Your Name.
         * backdrop_path : /7OMAfDJikBxItZBIug0NJig5DHD.jpg
         * popularity : 7.753508
         * vote_count : 179
         * video : false
         * vote_average : 8.5
         */

        private String poster_path;
        private boolean adult;
        private String overview;
        private String release_date;
        private int id;
        private String original_title;
        private String original_language;
        private String title;
        private String backdrop_path;
        private double popularity;
        private int vote_count;
        private boolean video;
        private double vote_average;
        private List<Integer> genre_ids;

    public Movie(String poster_path, boolean adult, String overview, String release_date, int id, String original_title, String original_language, String title, String backdrop_path, double popularity, int vote_count, boolean video, double vote_average, List<Integer> genre_ids) {
        this.poster_path = poster_path;
        this.adult = adult;
        this.overview = overview;
        this.release_date = release_date;
        this.id = id;
        this.original_title = original_title;
        this.original_language = original_language;
        this.title = title;
        this.backdrop_path = backdrop_path;
        this.popularity = popularity;
        this.vote_count = vote_count;
        this.video = video;
        this.vote_average = vote_average;
        this.genre_ids = genre_ids;
    }

    public String getPoster_path() {
            return poster_path;
        }

        public void setPoster_path(String poster_path) {
            this.poster_path = poster_path;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getOriginal_title() {
            return original_title;
        }

        public void setOriginal_title(String original_title) {
            this.original_title = original_title;
        }

        public String getOriginal_language() {
            return original_language;
        }

        public void setOriginal_language(String original_language) {
            this.original_language = original_language;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBackdrop_path() {
            return backdrop_path;
        }

        public void setBackdrop_path(String backdrop_path) {
            this.backdrop_path = backdrop_path;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public int getVote_count() {
            return vote_count;
        }

        public void setVote_count(int vote_count) {
            this.vote_count = vote_count;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVote_average() {
            return vote_average;
        }

        public void setVote_average(double vote_average) {
            this.vote_average = vote_average;
        }

        public List<Integer> getGenre_ids() {
            return genre_ids;
        }

        public void setGenre_ids(List<Integer> genre_ids) {
            this.genre_ids = genre_ids;
        }
}
