package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_DE_LINHA_UNICA = "<br>";
	
	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Administrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicitamos informar as mudanças de teste!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
public Email montarEmailSecretario(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Secretário")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
			.append("Solicitamos informar as outras mudanças de teste!")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
					.append("Atenciosamente,")
					.append(QUEBRA_DE_LINHA_UNICA)
					.append("Qualquer pessoa")
					.append(QUEBRA_DE_LINHA_DUPLA)
					.toString();
		
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automático. Favor não responder esse e-mail!").toString();
		
	}

}
