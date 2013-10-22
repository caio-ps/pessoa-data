package br.com.caiosousa.pessoa.model;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Cpf extends Documento {

	private String numero;
	private String digitoVerificador;

	@Override
	public String getDescricao() {

		MaskFormatter mask;

		try {

			mask = new MaskFormatter("###.###.###");
			mask.setValueContainsLiteralCharacters(false);

			String numeroFormatado = mask.valueToString(getNumero());

			return String.format("%s-%s", numeroFormatado, getDigitoVerificador());

		} catch (ParseException e) {
			throw new RuntimeException(e);
		}

	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDigitoVerificador() {
		return digitoVerificador;
	}

	public void setDigitoVerificador(String digitoVerificador) {
		this.digitoVerificador = digitoVerificador;
	}

}
