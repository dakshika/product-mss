/*
 *  Copyright (c) WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.carbon.mss.example2.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wso2.carbon.mss.HttpHandler;
import org.wso2.carbon.mss.example2.StockQuoteService;

/**
 * BundleActivator which registers the StockQuote OSGi service.
 */
public class StockQuoteActivator implements BundleActivator {
    private static final Logger log = LoggerFactory.getLogger(StockQuoteActivator.class);

    public void start(BundleContext bundleContext) throws Exception {
        bundleContext.registerService(HttpHandler.class, new StockQuoteService(), null);
        log.info("Registered StockQuoteService2");
    }

    public void stop(BundleContext bundleContext) throws Exception {

    }
}
