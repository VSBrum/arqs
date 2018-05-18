package loja;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;
import org.junit.Test;

import br.unibh.loja.entidades.Cliente;

public class testeCliente {

	@Test

	public void testCreateObject() {

		Cliente c = new Cliente(1L, "Vinicius", "vinicim1997", "senha", "vinic", "12876581647", "(11)9811-1111",

				"vinicim1997@gmail.com", new Date(), new Date());

		assertEquals(c.getId(), new Long(1));

		assertEquals(c.getNome(), "Vinicius");

		assertEquals(c.getLogin(), "vinicim");

		assertEquals(c.getSenha(), "senha");

		assertEquals(c.getPerfil(), "vinic");

		assertEquals(c.getCpf(), "12876581647");

		assertEquals(c.getTelefone(), "(11)9811-1111");

		assertEquals(c.getEmail(), "vinicim1997@gmail.com");

		assertEquals(c.getDataNascimento(), new Date());

		assertEquals(c.getDataCadastro(), new Date());

	}

	@Test

	public void testCompareObjects() {

		Date d = new Date();

		Cliente c1 = new Cliente(1L, "Vinicius", "vinicim", "senha", "vinicimg", "11111111111", "11 1 11111111",

				"vinicim1997@gmail.com", d, d);

		Cliente c2 = new Cliente(1L, "Viniciusll", "vinicim", "senha", "vinicimg", "11111111111", "11 1 11111111",

				"vinicim1997@gmail.com", d, d);

		assertNotEquals(c1, c2);

	}

	@Test

	public void testGenerateHash() {

		Date d = new Date();

		Cliente c1 = new Cliente(1L, "Vinicius", "vinicim", "senha", "vinicimg", "11111111111", "11 1 11111111",

				"vinicim1997@gmail.com", d, d);

		Cliente c2 = new Cliente(1L, "Vinicius", "vinicim", "senha", "vinicimg", "11111111111", "11 1 11111111",

				"vinicim1997@gmail.com", d, d);

		assertEquals(c1.hashCode(), c2.hashCode());

		Cliente c3 = new Cliente(1L, "Viniciuszinho", "vinicim", "senha", "vinicimg", "11111111111", "11 1 11111111",

				"vinicim1997@gmail.com", d, d);

		assertNotEquals(c1.hashCode(), c3.hashCode());

	}

	public void testPrintObject() {

		Date d = new Date();

		Cliente c1 = new Cliente(1L, "Vinicius", "vinicim", "senha", "vinicimg", "11111111111", "11 1 11111111",

				"vinicim1997@gmail.com", d, d);

		assertEquals(c1.toString(),

				"Cliente [id= 1L, nome=Vinicius, login=vinicim, senha=senha, perfil=vinicimg, cpf=11111111111, telefone=11 1 11111111, email=vinicim1997@gmail.com, dataNascimento=new Date(), dataCadastro=new Date()");

	}

}