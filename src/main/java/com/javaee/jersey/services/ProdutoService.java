package com.javaee.jersey.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.javaee.jersey.domain.Produto;

public class ProdutoService {
	private List<Produto> produtos = new ArrayList<Produto>();
	private Integer actualId = 1;

	public ProdutoService() {
		produtos.add(new Produto(actualId++, "Smart TV LED 58\" Samsung 58mu6120 Ultra HD 4K", 3749.99));
		produtos.add(new Produto(actualId++, "Game - Red Dead Redemption 2 - PS4", 215.99));
		produtos.add(new Produto(actualId++, "Livro - Box Harry Potter - Guia Cinematográfico - Coleção", 59.90));
		produtos.add(new Produto(actualId++, "Mouse Gamer G403 Prodigy 12.000 DPI - Logitech G", 218.27));
		produtos.add(new Produto(actualId++, "Samsung Galaxy Note 8 Dual Chip Android 7.1 Tela 6.3\" Octa-Core 128GB 4G Wi-Fi Câmera 12MP - Preto", 2999.00));
	}

	public List<Produto> getAll() {
		return produtos;
	}

	public Produto findById(Integer id) {
		Optional<Produto> vehicleOptional = produtos.stream()
				.filter(produto -> produto.getId().equals(id)).findFirst();

		return vehicleOptional.orElse(null);
	}
}