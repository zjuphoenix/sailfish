/**
 *
 *	Copyright 2016-2016 spccold
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *   	http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 */
package sailfish;

import sailfish.remoting.Endpoint;

/**
 * <a href="https://en.wikipedia.org/wiki/Client%E2%80%93server_model">Client–server_model</a>
 * 
 * @author spccold
 * @version $Id: Client.java, v 0.1 2016年10月3日 下午12:42:33 jileng Exp $
 */
public interface Client extends Endpoint{
    /**
     * one way invoke without response
     */
    void oneway(Object request, RequestControl control);
    
    /**
     * synchronous invoke
     */
    Object syncInvoke(Object request, RequestControl control);
    
    /**
     * asynchronous invoke in future pattern
     */
    ObjectResponseFuture futureInvoke(Object request, RequestControl control);
    
    /**
     * asynchronous invoke in callback pattern
     */
    void callBackInvoke(Object request, RequestControl control, ResponseCallback callback);
}