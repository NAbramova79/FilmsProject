package ru.netology.javaqa.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.domain.FilmsManager;

public class FilmsManagerTest {

    @Test
    public void shouldFindAllWithZeroFilms() {
        FilmsManager movie = new FilmsManager();

        String[] expected = {};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllWithOneFilm() {
        FilmsManager movie = new FilmsManager();

        movie.addFilm("Bloodshot");

        String[] expected = {"Bloodshot"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllFilms() {
        FilmsManager movie = new FilmsManager();

        movie.addFilm("Bloodshot");
        movie.addFilm("Onward");
        movie.addFilm("Belgrad hotel");

        String[] expected = {"Bloodshot", "Onward", "Belgrad hotel"};
        String[] actual = movie.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithNumberLessLength() {
        FilmsManager movie = new FilmsManager(3);

        movie.addFilm("Bloodshot");
        movie.addFilm("Onward");
        movie.addFilm("Belgrad hotel");
        movie.addFilm("Gentlemen");
        movie.addFilm("Invisible Man");

        String[] expected = {"Invisible Man", "Gentlemen", "Belgrad hotel"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithNumberEqualLength() {
        FilmsManager movie = new FilmsManager(3);

        movie.addFilm("Bloodshot");
        movie.addFilm("Onward");
        movie.addFilm("Belgrad hotel");

        String[] expected = {"Belgrad hotel", "Onward", "Bloodshot"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithNumberExceedingLength() {
        FilmsManager movie = new FilmsManager(7);

        movie.addFilm("Bloodshot");
        movie.addFilm("Onward");
        movie.addFilm("Belgrad hotel");
        movie.addFilm("Gentlemen");
        movie.addFilm("Invisible Man");

        String[] expected = {"Invisible Man", "Gentlemen", "Belgrad hotel", "Onward", "Bloodshot"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveFilms() {
        FilmsManager movie = new FilmsManager();

        movie.addFilm("Bloodshot");
        movie.addFilm("Onward");
        movie.addFilm("Belgrad hotel");
        movie.addFilm("Gentlemen");
        movie.addFilm("Invisible Man");
        movie.addFilm("Trolls World Tour");
        movie.addFilm("Number One");

        String[] expected = {"Number One", "Trolls World Tour", "Invisible Man", "Gentlemen", "Belgrad hotel"};
        String[] actual = movie.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}