package com.generation.org.lojagamer.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.org.lojagamer.model.ProdutoModel;


@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {
			public List <ProdutoModel> findAllByTituloContainingIgnoreCase (String Titulo);



}
