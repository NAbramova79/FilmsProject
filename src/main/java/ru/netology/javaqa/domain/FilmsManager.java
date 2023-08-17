package ru.netology.javaqa.domain;

public class FilmsManager {

    private String[] films = new String[0];
    private int number;

    public FilmsManager() {
        this.number = 5;
    }

    public FilmsManager(int number) {
        this.number = number;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < number) {
            resultLength = films.length;
        } else {
            resultLength = number;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
