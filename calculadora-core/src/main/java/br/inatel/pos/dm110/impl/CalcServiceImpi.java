package br.inatel.pos.dm110.impl;

import br.inatel.pos.dm110.api.CalcService;
import br.inatel.pos.dm110.api.Response;

public class CalcServiceImpi implements CalcService
{

	@Override
	public Response sum(Double frist, Double second) 
	{
		Double resultado = frist + second;
		
		Response resposta = new Response();
		resposta.setFrist(frist);
		resposta.setSecond(second);
        resposta.setResult(resultado);
        
        return resposta;
        
	}

	@Override
	public Response subtract(Double frist, Double second) 
	{
       Double resultado = frist - second;
		
		Response resposta = new Response();
		resposta.setFrist(frist);
		resposta.setSecond(second);
        resposta.setResult(resultado);
        
        return resposta;
	}

}
