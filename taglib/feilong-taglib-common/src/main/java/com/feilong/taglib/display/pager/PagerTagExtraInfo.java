/**
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.taglib.display.pager;

import java.util.Map;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.ValidationMessage;
import javax.servlet.jsp.tagext.VariableInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.feilong.taglib.base.BaseTagTEL;
import com.feilong.tools.json.JsonUtil;

/**
 * TagExtraInfo can be used to <br>
 * 1. Define Scripting Variables. <br>
 * 2. Validation.
 * 
 * @author <a href="mailto:venusdrogon@163.com">金鑫</a>
 * @version 1.0 2012-3-13 上午12:50:50
 */
public class PagerTagExtraInfo extends BaseTagTEL{

	/** The Constant log. */
	private static final Logger	log	= LoggerFactory.getLogger(PagerTagExtraInfo.class);

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagExtraInfo#validate(javax.servlet.jsp.tagext.TagData)
	 */
	@Override
	// JSP 2.0 and higher containers call validate() instead of isValid().
	// The default implementation of this method is to call isValid().
	// If isValid() returns false, a generic ValidationMessage[] is returned indicating isValid() returned false.
	public ValidationMessage[] validate(TagData tagData){

		if (log.isDebugEnabled()){
			log.debug(JsonUtil.format(tagData));
			Map<String, Object> map = toMap(tagData);
			log.debug(JsonUtil.format(map));
		}

		// Object count = tagData.getAttribute("maxElements");
		// if (TagData.REQUEST_TIME_VALUE == count){
		// // String id = tagData.getId();
		// // return new ValidationMessage[] { new ValidationMessage(id, "asdasdasdad") };
		// }
		// if (TagData.REQUEST_TIME_VALUE == count){
		// showAttributes(tagData);
		// Object allPageNo = tagData.getAttribute("allPageNo");
		// Object pageParamName = tagData.getAttribute("pageParamName");
		// // if (maxElements < 0){
		// // log.debug("the param maxElements:{},must >=0", maxElements);
		// // return false;
		// // }
		// // Object maxIndexPages = tagData.getAttribute("maxIndexPages");
		// // Object skin = tagData.getAttribute("skin");
		// }
		return super.validate(tagData);
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagExtraInfo#getVariableInfo(javax.servlet.jsp.tagext.TagData)
	 */
	@Override
	public VariableInfo[] getVariableInfo(TagData tagData){
		// VariableInfo[] variableInfos = new VariableInfo[1];
		// variableInfos[0] = new VariableInfo(tagData.getAttributeString("id"), "java.lang.String[]", true, VariableInfo.NESTED);
		// return (variableInfos);
		return super.getVariableInfo(tagData);
	}

	/*
	 * (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagExtraInfo#isValid(javax.servlet.jsp.tagext.TagData)
	 */
	@Override
	public boolean isValid(TagData tagData){
		return super.isValid(tagData);
	}
}
