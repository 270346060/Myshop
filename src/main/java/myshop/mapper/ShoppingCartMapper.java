package myshop.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import myshop.model.ShoppingCartItem;

public interface ShoppingCartMapper {

	int itemExists(@Param("userId") Long userId, @Param("cellphoneId") Long cellphoneId);

	void incItemAmount(@Param("userId") Long userId, @Param("cellphoneId") Long cellphoneId,
			@Param("amount") int amount);

	void createItem(@Param("userId") Long userId, @Param("cellphoneId") Long cellphoneId, @Param("amount") int amount);

	List<ShoppingCartItem> findAllItems(Long userId);

	void removeItem(@Param("userId") Long userId,@Param("cellphoneId") Long cellphoneId);

}
