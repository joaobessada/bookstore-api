package com.bessada.bookstore;

import com.bessada.bookstore.Domain.Categoria;
import com.bessada.bookstore.Domain.Livro;
import com.bessada.bookstore.Repositories.CategoriaRepository;
import com.bessada.bookstore.Repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository CateRepo;
	@Autowired
	private LivroRepository LivroRepo;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática", "Livros de TI");
		Livro l1 = new Livro(null, "Clean Code", "Robert Martin", "Lorem ipsum", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));

		this.CateRepo.saveAll(Arrays.asList(cat1));
		this.LivroRepo.saveAll(Arrays.asList(l1));
	}
}
