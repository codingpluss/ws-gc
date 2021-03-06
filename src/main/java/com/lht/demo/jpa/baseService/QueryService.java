/*
 * Copyright 2016 http://www.kedacomframework.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.lht.demo.jpa.baseService;

import java.util.List;

/**
 * 查询服务接口,提供基本的查询功能
 *
 * @author
 * @since 3.0
 */
public interface QueryService<E, PK> {

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return 查询结果, 无结果时返回{@code null}
     */
    E get(PK id);

    /**
     * 根据多个主键查询
     *
     * @param id 主键集合
     * @return 查询结果, 如果无结果返回空集合, 而不是返回{@code null}
     */
    List<E> get(List<PK> id);

    /**
     * 查询所有结果
     *
     * @return 所有结果, 如果无结果则返回空集合, 而不是返回{@code null}
     */
    List<E> getAll();

    /**
     * 查询结果总数
     *
     * @return 结果总数
     */
    long count();
}
