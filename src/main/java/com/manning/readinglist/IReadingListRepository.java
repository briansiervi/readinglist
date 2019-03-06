package com.manning.readinglist;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReadingListRepository extends JpaRepository<BookDto, Long> {
    List<BookDto> findByReader(String reader);
}