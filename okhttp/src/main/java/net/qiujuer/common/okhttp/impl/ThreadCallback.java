/*
 * Copyright (C) 2016 Qiujuer <qiujuer@live.cn>
 * WebSite http://www.qiujuer.net
 * Created 1/1/2016
 * Changed 1/6/2016
 * Version 1.0.0
 * Author Qiujuer
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
package net.qiujuer.common.okhttp.impl;

import com.squareup.okhttp.Request;

import net.qiujuer.common.okhttp.core.HttpCallback;


/**
 * This callback to call method by background thread
 */
public abstract class ThreadCallback<T> extends HttpCallback<T> {
    protected void dispatchStart(final Request request) {
        onStart(request);
    }

    protected void dispatchFinish() {
        onFinish();
    }
}
