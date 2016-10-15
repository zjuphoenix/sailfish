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
package sailfish.remoting;

import java.net.InetSocketAddress;

import io.netty.channel.ChannelHandler;
import sailfish.common.ResponseFuture;

/**
 * 
 * @author spccold
 * @version $Id: ExchangeClient.java, v 0.1 2016年10月4日 下午4:13:49 jileng Exp $
 */
public class ExchangeClient implements Exchanger{
    private Channel channel;

    public ExchangeClient(RemotingConfig config, ChannelHandler handler) {
        this.channel = Transporters.connect(config, handler);
    }

    @Override
    public InetSocketAddress getLocalAddress() {
        return null;
    }

    @Override
    public void close() {
        
    }

    @Override
    public void close(int timeout) {
        
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public void oneway(byte[] data) {
        
    }

    @Override
    public ResponseFuture<byte[]> request(byte[] data) {
        return null;
    }

    @Override
    public ResponseFuture<byte[]> request(byte[] data, int timeout) {
        return null;
    }

}
