package base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志记录基础类
 */
public class BaseController {

    protected Logger logger;

    public void initLogger(Class classType) {
        this.logger = LoggerFactory.getLogger(classType);
    }
}
