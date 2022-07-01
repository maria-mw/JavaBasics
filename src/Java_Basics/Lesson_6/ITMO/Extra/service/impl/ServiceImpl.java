package Java_Basics.Lesson_6.ITMO.Extra.service.impl;

import Java_Basics.Lesson_6.ITMO.Extra.dao.Document;
import Java_Basics.Lesson_6.ITMO.Extra.repository.DocumentRepository;
import Java_Basics.Lesson_6.ITMO.Extra.repository.impl.DocumentRepositoryImpl;
import Java_Basics.Lesson_6.ITMO.Extra.service.Service;

import java.util.List;

public class ServiceImpl implements Service {
    private DocumentRepository documentRepository = new DocumentRepositoryImpl();

    @Override
    public Document create(Integer pageCount, String format, Boolean isEditable) {
        Document document = new Document(pageCount,format,isEditable);
        documentRepository.save(document);
        return document;
    }

    @Override
    public Document read(Long id) {
        return documentRepository.findBy(id);
    }

    @Override
    public Document update(Document document) {
        documentRepository.save(document);
        return document;
    }

    @Override
    public void delete(Long id) {
        documentRepository.delete(id);
    }

    @Override
    public List<Document> getDocuments() {
        return documentRepository.getDocuments();
    }
}
