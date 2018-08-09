package myshop.service;

import java.util.List;

import myshop.model.ShoppingCartItem;

public interface ShoppingCartService {

	void addToCart(Long userId, Long cellphoneId, int i);

	List<ShoppingCartItem> findAllItems(Long userId);

	void removeItem(Long userId, Long cellphoneId);

}
