package myshop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myshop.mapper.CellphoneMapper;
import myshop.model.Cellphone;
import myshop.service.CellphoneService;

@Service
public class CellphoneServiceImpl implements CellphoneService {
	private CellphoneMapper cellphoneMapper;

	@Autowired
	public CellphoneServiceImpl(CellphoneMapper cellphoneMapper) {
		this.cellphoneMapper = cellphoneMapper;
	}

	@Override
	public List<Cellphone> findAll(Cellphone cellphone) {
		return cellphoneMapper.findAll(cellphone);
	}

	@Override
	public List<Cellphone> search(Cellphone cellphone) {
		return cellphoneMapper.search(cellphone);
	}

	@Override
	public Cellphone findOne(Long id) {
		return cellphoneMapper.findOne(id);
	}

}
