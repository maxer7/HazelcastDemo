package com.epam.topic;

import java.io.Serializable;

public class News implements Serializable {

    private String description;
    private String source;

    public News(String description, String source) {
        this.description = description;
        this.source = source;
    }

    public String getDescription() {
        return description;
    }

    public String getSource() {
        return source;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        News news = (News) o;

        if (description != null ? !description.equals(news.description) : news.description != null) return false;
        return source != null ? source.equals(news.source) : news.source == null;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + (source != null ? source.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "News{" +
            "description='" + description + '\'' +
            ", source='" + source + '\'' +
            '}';
    }
}
