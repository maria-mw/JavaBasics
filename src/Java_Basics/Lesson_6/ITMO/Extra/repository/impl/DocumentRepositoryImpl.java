package Java_Basics.Lesson_6.ITMO.Extra.repository.impl;

import Java_Basics.Lesson_6.ITMO.Extra.dao.Document;
import Java_Basics.Lesson_6.ITMO.Extra.repository.DocumentRepository;

import java.util.ArrayList;
import java.util.List;

public class DocumentRepositoryImpl implements DocumentRepository {
    private List<Document> documents = new ArrayList<>();
    private static long id = 1;

    {
        Document csv = new Document(12, "csv", true);
        csv.setId(id++);
        this.documents.add(csv);
    }

    @Override
    public Document findBy(Long id) {
        Document document = null;
        for (Document doc : this.documents) {
            if (doc.getId().equals(id)) {
                document = doc;
            }
        }
        return document;
    }

    @Override
    public void save(Document document) {
        Document docById = findBy(document.getId());
        if (docById != null) {
            delete(docById.getId());
        } else {
            document.setId(id++);
        }
        this.documents.add(document);
    }

    @Override
    public void delete(Long id) {
        Document document = findBy(id);
        if (document != null) {
            documents.remove(document);
        } else {
            System.err.printf("Document with id: %s is not found", id);
        }
    }

    @Override
    public List<Document> getDocuments() {
        return this.documents;
    }
}
