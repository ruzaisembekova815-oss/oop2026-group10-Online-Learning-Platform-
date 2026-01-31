package edu.aitu.oop3.db.secml;

import java.util.List;

public class Page<T> {

    private final List<T> content;
    private final int page;
    private final int size;
    private final long totalelements;

    public Page(List<T> content, int page, int size, long totalelements) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.totalelements = totalelements;
    }

    public List<T> getContent() {
        return content;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public long getTotalelements() {
        return totalelements;
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) totalelements / size);
    }
}

