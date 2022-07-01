package Java_Basics.Lesson_6.ITMO.Extra.dao;

public class Document {
    private Long id;
    private Integer pageCount;
    private String format;
    private Boolean isEditable;

    public Document(Integer pageCount, String format, Boolean isEditable) {
        this.pageCount = pageCount;
        this.format = format;
        this.isEditable = isEditable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", pageCount=" + pageCount +
                ", format='" + format + '\'' +
                ", isEditable=" + isEditable +
                '}';
    }
}
