package br.com.fsg;

import lombok.Getter;

/**
 * 
 * @author fernando-godoy
 *
 */
@Getter
public class Endereco {

	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
}
