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
package sailfish.remoting.configuration;

import sailfish.remoting.utils.StrUtils;

/**
 * 
 * @author spccold
 * @version $Id: ExchangeServerConfig.java, v 0.1 2016年10月27日 下午5:42:01 jileng Exp $
 */
public class ExchangeServerConfig extends AbstractExchangeConfig{
    private int bossThreads = 1;
    private String bossThreadName = "sailfish-server-boss";
   
    @Override
    public void check() {
        super.check();
        if(StrUtils.isBlank(ioThreadName)){
            this.ioThreadName = "sailfish-server-io";
        }
        if(StrUtils.isBlank(codecThreadName)){
            this.codecThreadName= "sailfish-server-codec";
        }
    }
    
    public int bossThreads() {
        return bossThreads;
    }
    public void bossThreads(int bossThreads) {
        this.bossThreads = bossThreads;
    }
    public String bossThreadName() {
        return bossThreadName;
    }
    public void bossThreadName(String bossThreadName) {
        this.bossThreadName = bossThreadName;
    }
}