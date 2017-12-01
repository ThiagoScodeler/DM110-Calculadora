package br.inatel.pos.mobile.dm110.impl;

import br.inatel.pos.mobile.dm110.api.CalculadoraService;
import br.inatel.pos.mobile.dm110.api.Result;

public class CalculadoraServletImpl implements CalculadoraService {

	@Override
	public Result sum(int first, int second) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first+second);
		return result;
	}

	@Override
	public Result subtract(int first, int second) {
		// TODO Auto-generated method stub
		Result result = new Result();
		result.setFirst(first);
		result.setSecond(second);
		result.setResult(first-second);
		return result;
	}

}
