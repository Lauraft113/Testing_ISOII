package edu.uclm.esi.measureConverter.domain;

import java.util.StringTokenizer;
import java.util.Vector;

public class Converter {
	public Vector<String> execute(String command) {
		Vector<String> result=new Vector<>();
		command=command.trim();
		StringTokenizer st=new StringTokenizer(command, ";");
		while (st.hasMoreTokens()) {
			String token=st.nextToken().trim();
			StringTokenizer stt=new StringTokenizer(token, " ");
			if (stt.countTokens()!=4) {
				result.add("Error: commands are composed by 4 tokens\r");
			} else {
				String cmd=stt.nextToken().toUpperCase().trim();
				String sUnidades=stt.nextToken().trim();
				String sMOrigen=stt.nextToken().toUpperCase().trim();
				String sMDestino=stt.nextToken().toUpperCase().trim();
				if (!cmd.equals("CONV"))
					result.add("Error: the reserved word \"conv\" was expected\r");
				else {
					try {
						double unidades=Double.parseDouble(sUnidades);
						double conversion=convert(sMOrigen, sMDestino, unidades);
						if (conversion==Integer.MIN_VALUE)
							result.add("Error: incompatible units");
						else
							result.add(""+conversion);
					}
					catch (Exception e) {
						result.add("Error: number expected\r");
					}
				}
			}
		}
		return result;
	}

	public double convert(String sourceUnit, String targetUnit, double magnitude) throws Exception {
		double result;
		final int TEMPERATURA = 0, LONGITUD = 1, MASA = 2, ERROR = -1;
		int mOrigen, mDestino;
		if (sourceUnit.equals("C") || sourceUnit.equals("F") || sourceUnit.equals("K"))
			mOrigen=TEMPERATURA;
		else if (sourceUnit.equals("M") || sourceUnit.equals("Y") || sourceUnit.equals("I") || sourceUnit.equals("KM") || sourceUnit.equals("ML"))
			mOrigen=LONGITUD;
		else if (sourceUnit.equals("KG") ||
				sourceUnit.equals("P") || 
				sourceUnit.equals("O"))
			mOrigen=MASA;
		else
			throw new Exception("Unexisting unit");
		
		if (targetUnit.equals("C") || targetUnit.equals("F") || targetUnit.equals("K"))
			mDestino=TEMPERATURA;
		else if (targetUnit.equals("M") || targetUnit.equals("Y") || targetUnit.equals("I") || targetUnit.equals("KM") || targetUnit.equals("ML"))
			mDestino=LONGITUD;
		else if (targetUnit.equals("KG") || targetUnit.equals("P") || targetUnit.equals("O"))
			mDestino=MASA;
		else
			throw new Exception("Unexisting unit");
		
		if (mOrigen!=mDestino)
			throw new Exception("Incompatible units");
		
		double origenNormalizado;
		switch (mOrigen) {
		case TEMPERATURA:
			origenNormalizado=toCelsius(sourceUnit, magnitude);
			result=fromCelsius(origenNormalizado, targetUnit);
			break;
		case LONGITUD:
			origenNormalizado=toMeters(sourceUnit, magnitude);
			result=convertMeters(origenNormalizado, targetUnit);
			break;
		case MASA:
			origenNormalizado=toKgs(sourceUnit, magnitude);
			result=fromKgs(origenNormalizado, targetUnit);
			break;
		default:
			throw new Exception("Illegal value");
		}
		return result;
	}

	private double convertMeters(double magnitude, String targetUnit) throws Exception {
		double result;
		if (targetUnit.equals("M"))
			result=magnitude;
		else if (targetUnit.equals("Y"))
			result=magnitude/0.91;
		else if (targetUnit.equals("I"))
			result=magnitude/0.0254;
		else if (targetUnit.equals("KM"))
			result=magnitude/1000;
		else if (targetUnit.equals("ML"))
			result=magnitude/1609;
		else 
			throw new Exception("Illegal value");
		return result;
	}
	
	private double toKgs(String sourceUnit, double magnitude) throws Exception {
		double result;
		if (sourceUnit.equals("KG"))
			result=magnitude;
		else if (sourceUnit.equals("P"))
			result=0.4531*magnitude;
		else if (sourceUnit.equals("O"))
			result=0.0028*magnitude;
		else 
			throw new Exception("Illegal value");
		return result;
	}

	private double fromKgs(double magnitude, String targetUnit) throws Exception {
		double result;
		if (targetUnit.equals("kG")) // Fallo
			result=magnitude;
		else if (targetUnit.equals("P"))
			result=magnitude/0.4531;
		else if (targetUnit.equals("O"))
			result=magnitude/0.0028;
		else 
			throw new Exception("Illegal value");
		return result;
	}

	private double toMeters(String sourceUnit, double magnitude) throws Exception {
		double result;
		if (sourceUnit.equals("M"))
			result=magnitude;
		else if (sourceUnit.equals("Y"))
			result=0.91*magnitude;
		else if (sourceUnit.equals("I"))
			result=0.0254*magnitude;
		else if (sourceUnit.equals("KM"))
			result=1000*magnitude;
		else if (sourceUnit.equals("ML"))
			result= 1609*magnitude;
		else
			throw new Exception("Illegal value");
		return result;
	}

	private double fromCelsius(double magnitude, String targetUnit) throws Exception {
		if (targetUnit.equals("C")) {
			return magnitude;
		}
		if (targetUnit.equals("F"))
			return 9.0/5.0*magnitude+32;
		if (targetUnit.equals("K"))
			return magnitude-273;
		throw new Exception("Incompatible units");
	}

	private double toCelsius(String origen, double unidades) throws Exception {
		double result;
		if (origen.equals("C"))
			result=unidades;
		else if (origen.equals("F"))
			result=5*(unidades-32)/9;
		else if (origen.equals("K")) {
			if (unidades<0)
				throw new Exception("Illegal value");
			result=unidades+273;  
		} else 
			throw new Exception("Incompatible units");
		return result;
	}
}