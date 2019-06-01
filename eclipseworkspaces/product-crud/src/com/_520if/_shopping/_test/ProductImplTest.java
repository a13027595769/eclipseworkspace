package com._520if._shopping._test;

import java.util.List;

import org.junit.Test;

import com._520if._shopping._dao.IProductDAO;
import com._520if._shopping._dao._Impl.ProductImpl;
import com._520if._shopping._domain.Product;

public class ProductImplTest {
	private IProductDAO dao = new ProductImpl();
	@Test
	public void testSave() {
		Product p = dao.get(1L);
		p.setProductName("机械键盘");
		dao.save(p);
		System.out.println(p);
		
	}

	@Test
	public void testUpdate() {
		Product p = dao.get(1L);
		p.setProductName("美女键盘");
		dao.update(p);
		System.out.println(p);
	}

	@Test
	public void testDelete() {
		dao.delete(33L);
	}

	@Test
	public void testGet() {
		Product product = dao.get(5L);
		System.out.println(product);
	}

	@Test
	public void testList() {
		List<Product> list = dao.list();
		for (Product product : list) {
			System.out.println(product);
		}
	}

}
