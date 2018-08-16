package br.com.caelum.jaxb;

import java.io.FileOutputStream;
import java.math.BigDecimal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class TestMarshal {

	public static void main(String args[]) throws Exception {
		
		Livro livro = new Livro();
		livro.setCodigo("ARQ");
		livro.setTitulo("Arquitetura Java");
		livro.setAutor("Paulo Silveira");
		livro.setValor(new BigDecimal("29.90"));
		Categoria categoria = new Categoria();
		categoria.setNome("TI");
		livro.setCategoria(categoria);
		
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		Marshaller marshaler = context.createMarshaller();
		
		marshaler.marshal(livro, new FileOutputStream("livro.xml"));
		
	}
	
}
