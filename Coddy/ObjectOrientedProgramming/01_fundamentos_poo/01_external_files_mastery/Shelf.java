class Shelf {
    private Book first;
    private Book second;
    public Shelf(Book first, Book second) { this.first = first; this.second = second; }
    public int totalPages() { return first.getPages() + second.getPages(); }
    public String longestTitle() { return first.getPages() > second.getPages() ? first.getTitle() : second.getTitle(); }
}