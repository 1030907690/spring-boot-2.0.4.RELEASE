/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.condition;

/**
 * Some named search strategies for beans in the bean factory hierarchy.
 *
 * @author Dave Syer
 */
public enum SearchStrategy {

	/**
	 * Search only the current context.
	 */
	// 查询当前的context
	CURRENT,

	/**
	 * Search all ancestors, but not the current context.
	 */
	// 搜索所有的祖先,不搜索当前的context
	ANCESTORS,

	/**
	 * Search the entire hierarchy.
	 */
	// 搜索整个上下文
	ALL

}
