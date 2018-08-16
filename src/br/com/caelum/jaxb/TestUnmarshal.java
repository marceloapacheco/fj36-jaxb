package br.com.caelum.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class TestUnmarshal {

	public static void main(String args[]) throws Exception {
		
		JAXBContext context = JAXBContext.newInstance(Livro.class);
		Unmarshaller unmarshaler = context.createUnmarshaller();
		
		Livro livro = (Livro) unmarshaler.unmarshal(new File("livro.xml"));
		System.out.println(livro.getTitulo() + " - " + livro.getCategoria().getNome());
		
	}
	
}
