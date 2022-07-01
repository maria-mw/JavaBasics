package Java_Basics.Lesson_6.ITMO.Extra.service;

import Java_Basics.Lesson_6.ITMO.Extra.dao.Document;

import java.util.List;

public interface Service {
    Document create(Integer pageCount, String format, Boolean isEditable);
    Document read(Long id);
    Document update(Document document);
    void delete (Long id);
    List<Document> getDocuments();
}
