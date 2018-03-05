package com.zrf.struts2.converters;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConverter extends StrutsTypeConverter {
	private DateFormat dateFormat;

	public DateConverter() {
		System.out.println("DateConverter's constructor...");
		dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	}

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		System.out.println("convertFromString...");
		if (toClass == Date.class) {
			if (values != null && values.length > 0) {
				String value = values[0];
				try {
					dateFormat.parse(value);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
		// 若没有转换成功，则返回values
		return values;
	}

	@Override
	public String convertToString(Map context, Object object) {
		System.out.println("convertToString...");
		if (object instanceof Date) {
			Date date = (Date) object;
			return dateFormat.format(date);
		}
		// 若转换失败，则返回null
		return null;
	}

}
