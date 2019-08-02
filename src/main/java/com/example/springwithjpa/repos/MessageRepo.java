package com.example.springwithjpa.repos;

import com.example.springwithjpa.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
