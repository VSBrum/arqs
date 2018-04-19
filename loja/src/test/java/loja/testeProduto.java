package loja;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.unibh.loja.entidades.Categoria;

import br.unibh.loja.entidades.Produto;

public class testeProduto {

	@Test

	public void testCreateObject() {

		Categoria c = new Categoria(1L, "lavabo");

		Produto p = new Produto(1L, "Panela Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		assertEquals(p.getId(), new Long(1));

		assertEquals(p.getNome(), "Panela Tramontina");

		assertEquals(p.getDescricao(), "panelinha de pressao");

		assertEquals(p.getCategoria(), c);

		assertEquals(p.getPreco(), new BigDecimal(10.00));

		assertEquals(p.getFabricante(), "Tramontina");

	}

	@Test

	public void testCompareObjects() {

		Categoria c = new Categoria(1L, "lavabo");

		Produto p1 = new Produto(1L, "Panela Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		Produto p2 = new Produto(1L, "Panelinha Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		assertNotEquals(p1, p2);

	}

	@Test

	public void testGenerateHash() {

		Categoria c = new Categoria(1L, "lavabo");

		Produto p1 = new Produto(1L, "Panela Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		Produto p2 = new Produto(1L, "Panela Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		assertEquals(p1.hashCode(), p2.hashCode());

		Produto p3 = new Produto(1L, "Panelinha Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		assertNotEquals(p1.hashCode(), p3.hashCode());

	}

	public void testPrintObject() {

		Categoria c = new Categoria(1L, "lavabo");

		Produto p1 = new Produto(1L, "Panela Tramontina", "panelinha de pressao", c, new BigDecimal(10.00),
				"Tramontina");

		assertEquals(p1.toString(),

				"Produto [id= 1L, nome=Panela Tramontina, descricao=panelinha de pressao, categoria=lavabo, preco=new BigDecimal(10.00), fabricante=Tramontina");

	}

}