
package com.huayong.generator;

import java.util.Map;

import com.huayong.generator.CodeFactory.CodeType;

public abstract interface ICallBack {
	public abstract Map<String, Object> execute(CodeType type);
}
