package org.superbiz.moviefun.moviesapi;


import java.util.Objects;

public class MovieInfo {

    private long id;
    private String director;
    private String title;
    private int year;
    private String genre;
    private int rating;

    public MovieInfo() {

    }

    public MovieInfo(Long id, String title, String director, String genre, int rating, int year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public MovieInfo(String title, String director, String genre, int rating, int year) {
        this(0L,title,director,genre,rating,year);
    }

    public long getId() {
        return id;
    }

    public String getDirector() {
        return director;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MovieInfo)) return false;
        MovieInfo movieInfo = (MovieInfo) o;
        return getId() == movieInfo.getId() &&
                getYear() == movieInfo.getYear() &&
                getRating() == movieInfo.getRating() &&
                Objects.equals(getDirector(), movieInfo.getDirector()) &&
                Objects.equals(getTitle(), movieInfo.getTitle()) &&
                Objects.equals(getGenre(), movieInfo.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDirector(), getTitle(), getYear(), getGenre(), getRating());
    }

    @Override
    public String toString() {
        return "MovieInfo{" +
                "id=" + id +
                ", director='" + director + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }
}
