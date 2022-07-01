package Java_Basics.Lesson_6.ITMO.Extra.repository;

import Java_Basics.Lesson_6.ITMO.Extra.dao.Document;

import java.util.List;

public interface DocumentRepository {
    Document findBy(Long id);
    void save(Document document);
    void delete(Long id);
    List<Document> getDocuments();
}
