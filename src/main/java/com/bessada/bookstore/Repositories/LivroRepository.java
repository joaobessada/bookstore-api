package com.bessada.bookstore.Repositories;

import com.bessada.bookstore.Domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
