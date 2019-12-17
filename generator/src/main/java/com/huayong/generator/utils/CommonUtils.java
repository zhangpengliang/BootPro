package com.huayong.generator.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CommonUtils {
	/**
	 * 清除字符串下划线,下划线之后首字母大写
	 * 
	 * @param strKey
	 * @return
	 */
	public static String getNoUnderlineStr(String strKey) {
		if (strKey.indexOf("_") != -1) {
			String[] keyArray = strKey.split("_");
			StringBuffer sb = new StringBuffer();
			boolean flag = false;
			for (String key : keyArray) {
				if (flag) {
					// 下划线后的首字母大写
					sb.append(StringUtils.capitalize(key));
				} else {
					flag = true;
					sb.append(key);
				}
			}
			strKey = sb.toString();
		}
		return strKey;
	}

	/**
	 * 去掉字符串指定的前缀
	 * 
	 * @param str
	 *            字符串名称
	 * @param prefix
	 *            前缀数组
	 * @return
	 */
	public static String removePrefix(String str, String[] prefix) {
		if (StringUtils.isEmpty(str)) {
			return "";
		} else {
			if (null != prefix) {
				String[] prefixArray = prefix;

				for (int i = 0; i < prefix.length; ++i) {
					String pf = prefixArray[i];
					if (str.toLowerCase().matches("^" + pf.toLowerCase() + ".*")) {
						return str.substring(pf.length());
					}
				}
			}

			return str;
		}
	}

	public static String getFormatTime(String pattern, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT+08:00"));
		return sdf.format(date == null ? new Date() : date);
	}

	public static void main(String[] args) {
		String[] prefix = { "pre_", "log_" };
		String str = "pre_name";
		System.out.println("去掉前缀后的字符串:" + removePrefix(str, prefix));
	}
}
