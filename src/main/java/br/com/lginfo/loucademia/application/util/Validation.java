package br.com.lginfo.loucademia.application.util;

public class Validation {

	public static void assertNotEmpty(Object obj) {
		if(obj instanceof String) {
			String s = (String) obj;
			if(StringUtils.isEmpty(s)) {
				throw new ValidationException("O texto não pode ser nulo");
			}
		}
		
		if(obj == null) {
			throw new ValidationException("O valor não pode ser nulo");
		}
	}
}
