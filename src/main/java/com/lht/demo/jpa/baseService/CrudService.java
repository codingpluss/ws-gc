/*
 *
 *  * Copyright 2016 http://www.kedacomframework.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.lht.demo.jpa.baseService;

/**
 * 通用Service,实现增删改查
 *
 * @author
 * @since 3.0
 */
public interface CrudService<E, PK> extends
        UpdateService<E, PK>,
        InsertService<E, PK>,
        DeleteService<PK>,
        QueryService<E, PK>{

//    boolean checkUnique(String name, String value);

}
