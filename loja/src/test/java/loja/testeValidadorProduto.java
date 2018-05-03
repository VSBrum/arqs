package loja;

import java.math.BigDecimal;

import java.util.Set;

import javax.validation.ConstraintViolation;

import javax.validation.Validation;

import javax.validation.Validator;

import javax.validation.ValidatorFactory;

import org.junit.Assert;

import org.junit.BeforeClass;

import org.junit.Test;

import br.unibh.loja.entidades.Categoria;
import br.unibh.loja.entidades.Produto;

public class testeValidadorProduto {

	private static Validator validator;

	@BeforeClass

	public static void setUp() {

		System.out.println("Inicializando validador...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

		validator = factory.getValidator();

	}

	@Test

	public void testeValidacaoProduto1() {

		Categoria c1 = new Categoria(1L, "lavabo");

		Produto o = new Produto(1L, "Panela Tramontina", "panelinha de pressao", c1, new BigDecimal(10.00),
				"Tramontina");

		System.out.println(o);

		Set<ConstraintViolation<Produto>> constraintViolations = validator.validate(o);

		for (ConstraintViolation<Produto> c : constraintViolations) {

			System.out.println(" Erro de Validacao: " + c.getMessage());

		}

		Assert.assertEquals(0, constraintViolations.size());

	}

	@Test

	public void testeValidacaoProduto2() {

		Categoria c1 = new Categoria(1L, "lavabo");

		Produto o = new Produto(1L, "", "panelinha de pressao", c1, new BigDecimal(10.00), "Tramontina");

		System.out.println(o);

		Set<ConstraintViolation<Produto>> constraintViolations = validator.validate(o);

		for (ConstraintViolation<Produto> c : constraintViolations) {

			System.out.println(" Erro de Validacao: " + c.getMessage());

		}

		Assert.assertEquals(1, constraintViolations.size());

	}

}
