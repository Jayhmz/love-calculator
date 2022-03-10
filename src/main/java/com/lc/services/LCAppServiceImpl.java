package com.lc.services;

import org.springframework.stereotype.Service;

@Service
public class LCAppServiceImpl implements LCAppService{
	
	public final String formula = "FLAME";

	@Override
	public String calculateLove(String yourName, String crushName) {
		
		int loversName = (yourName + crushName).toCharArray().length;
		
		int formulacount = formula.toCharArray().length;
		
		int rem = loversName % formulacount;
		
		char charResult = formula.charAt(rem);
		
		String relationship = relationship(charResult);
		
		return relationship;
		
	}

	@Override
	public String relationship(char formulaChar) {
		
		String result = null;
		
//		if (formulaChar == 'F') {
//			result = LCAppConstants.F_CHAR_MEANING;
//		}
//		if (formulaChar == 'L') {
//			result =  LCAppConstants.L_CHAR_MEANING;
//		}
//		if (formulaChar == 'A') {
//			result = LCAppConstants.A_CHAR_MEANING;
//		}
//		if (formulaChar == 'M') {
//			result = LCAppConstants.M_CHAR_MEANING;
//		}
//		if (formulaChar == 'E') {
//			result = LCAppConstants.E_CHAR_MEANING;
//		}
//		if (formulaChar == 'S') {
//			result = LCAppConstants.S_CHAR_MEANING;
//		}
		
		switch (formulaChar) {
		case 'F':
			result = LCAppConstants.F_CHAR_MEANING;
			break;
		case 'L':
			result = LCAppConstants.L_CHAR_MEANING;
			break;
		case 'A':
			result = LCAppConstants.A_CHAR_MEANING;
			break;
		case 'M':
			result = LCAppConstants.M_CHAR_MEANING;
			break;
		case 'E':
			result = LCAppConstants.E_CHAR_MEANING;
			break;
		case 'S':
			result = LCAppConstants.S_CHAR_MEANING;
			break;

		default:
			result = null;
			break;
		}
		
		return result;
	}

}
