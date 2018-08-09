package myshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myshop.mapper.ShoppingCartMapper;
import myshop.model.ShoppingCartItem;
import myshop.service.ShoppingCartService;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	private ShoppingCartMapper shoppingCartMapper;
	
	@Autowired
	public ShoppingCartServiceImpl(ShoppingCartMapper shoppingCartMapper) {
		this.shoppingCartMapper = shoppingCartMapper;
	}


	@Override
	public void addToCart(Long userId, Long cellphoneId, int amount) {
		int ddd =shoppingCartMapper.itemExists(userId, cellphoneId);
		if (shoppingCartMapper.itemExists(userId, cellphoneId) > 0) {
            shoppingCartMapper.incItemAmount(userId, cellphoneId, amount);
        } else {
            shoppingCartMapper.createItem(userId, cellphoneId, amount);
        }
	}


	@Override
	public List<ShoppingCartItem> findAllItems(Long userId) {
		return shoppingCartMapper.findAllItems(userId);
	}


	@Override
	public void removeItem(Long userId, Long cellphoneId) {
		shoppingCartMapper.removeItem(userId,cellphoneId);
	}

}
