package cn.yxffcode.http.bootstrap;

import cn.yxffcode.http.transport.RequestHandler;
import cn.yxffcode.http.transport.DefaultRequestHandler;

/**
 * Created by hang.gao on 2015/6/9.
 */
public class SimpleConfiguration implements Configuration {
    public int getPort() {
        return 8080;
    }

    public int getMaxInitialLineLength() {
        return 2048;
    }

    public int getMaxHeaderSize() {
        return 2048;
    }

    public int getMaxChunkSize() {
        return 2048;
    }

    public int getApplicationThreadCount() {
        return 8;
    }

    public RequestHandler getRequestHandler() {
        return new DefaultRequestHandler();
    }
}
