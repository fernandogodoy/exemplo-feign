package br.com.fsg;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 
 * @author fernando-godoy
 *
 */
@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface BuscaCepClient {

	@GetMapping("{cep}/json")
	Endereco buscaEnderecoPor(@PathVariable("cep") String cep);

}
