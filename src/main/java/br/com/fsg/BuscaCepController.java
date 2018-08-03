package br.com.fsg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BuscaCepController {

	@Autowired
	private BuscaCepClient cliente;

	@GetMapping("/cep/{cep}")
	public Endereco findEndereco(@PathVariable("cep") String cep) {
		return cliente.buscaEnderecoPor(cep);
	}

}
