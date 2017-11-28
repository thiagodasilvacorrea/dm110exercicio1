package br.inatel.pos.dm110.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.pos.dm110.impl.CalcServiceImpi;

@ApplicationPath("/rest")
public class RestService extends Application
{
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(CalcServiceImpi.class);
		return classes;
	}
}
