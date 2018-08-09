package myshop.service;

import java.util.List;

import myshop.model.Cellphone;

public interface CellphoneService {

	List<Cellphone> findAll(Cellphone cellphone);

	List<Cellphone> search(Cellphone cellphone);

	Cellphone findOne(Long id);

}
