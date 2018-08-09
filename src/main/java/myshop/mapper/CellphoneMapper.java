package myshop.mapper;

import java.util.List;

import myshop.model.Cellphone;

public interface CellphoneMapper {

	List<Cellphone> findAll(Cellphone cellphone);

	List<Cellphone> search(Cellphone cellphone);

	Cellphone findOne(Long id);

}
