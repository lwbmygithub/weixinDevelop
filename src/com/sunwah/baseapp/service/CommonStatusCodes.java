/**
 * 
 */
package com.sunwah.baseapp.service;

/**
 * 
 * 公共状态码定义
 * 
 * @author MARK
 * 
 */
public interface CommonStatusCodes {
	// 正常
	int OK = 99;

	// 数据不存在
	int DATA_NOT_EXIST = 1;

	// 数据已被使用
	int DATA_IS_USED = 2;

	// 代码已存在
	int CODE_EXIST = 101;

	// 名称已存在
	int NAME_EXIST = 102;
}
