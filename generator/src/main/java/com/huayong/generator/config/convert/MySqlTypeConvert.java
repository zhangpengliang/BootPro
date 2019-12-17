package com.huayong.generator.config.convert;

import com.huayong.generator.config.DbColumnType;
import com.huayong.generator.config.ITypeConvert;

public class MySqlTypeConvert implements ITypeConvert {
	public MySqlTypeConvert() {
	}

	public DbColumnType processTypeConvert(String fieldType) {
		String t = fieldType.toLowerCase();
		if (!t.contains("char") && !t.contains("text")) {
			if (t.contains("bigint")) {
				return DbColumnType.LONG;
			} else if (t.contains("int")) {
				return DbColumnType.INTEGER;
			} else if (!t.contains("date") && !t.contains("time") && !t.contains("year")) {
				if (t.contains("text")) {
					return DbColumnType.STRING;
				} else if (t.contains("bit")) {
					return DbColumnType.BOOLEAN;
				} else if (t.contains("decimal")) {
					return DbColumnType.BIG_DECIMAL;
				} else if (t.contains("clob")) {
					return DbColumnType.CLOB;
				} else if (t.contains("blob")) {
					return DbColumnType.BLOB;
				} else if (t.contains("binary")) {
					return DbColumnType.BYTE_ARRAY;
				} else if (t.contains("float")) {
					return DbColumnType.FLOAT;
				} else if (t.contains("double")) {
					return DbColumnType.DOUBLE;
				} else {
					return !t.contains("json") && !t.contains("enum") ? DbColumnType.STRING : DbColumnType.STRING;
				}
			} else {
				return DbColumnType.DATE;
			}
		} else {
			return DbColumnType.STRING;
		}
	}
}
