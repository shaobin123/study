package constant;

/**
 * 状态常量类
 */
public class StatusConstants {
    /**
     * 有效状态
     */
    public static final Integer STATUS_NORMAL = 1;

    /**
     * 无效状态
     */
    public static final Integer STATUS_FAILURE = 0;

    /**
     * 删除状态
     */
    public static final Integer STATUS_DELETE = 9;

    /**
     * 流程状态
     * 状态：0待上报，1待审核，2已下发
     */
    public static class Process {

        /**
         * 待上报
         */
        public static final Integer STATUS_REPORT = 0;

        /**
         * 待审核
         */
        public static final Integer STATUS_AUDIT = 1;

        /**
         * 已下发
         */
        public static final Integer STATUS_APPROVE = 2;


    }

    /**
     * 流程状态
     * 状态：0待上报，1待审核，2已下发
     */
    public static class JobOrderStatus {

        /**
         * 0未开始
         */
        public static final Integer STATUS_NOT_START = 0;

        /**
         * 1已开始
         */
        public static final Integer STATUS_STARTED = 1;

        /**
         * 2已完工
         */
        public static final Integer STATUS_COMPLETE = 2;

        /**
         * 3异常申报
         */
        public static final Integer STATUS_DECLARE = 3;

        /**
         * 4异常结案
         */
        public static final Integer STATUS_HANDLE = 4;


    }

    public static class PortConnect{

        /**
         * 无效
         */
        public static final Integer STATUS_FAILURE = 0;

        /**
         * 空端口
         */
        public static final Integer STATUS_NONE = 1;

        /**
         * 正常连线
         */
        public static final Integer STATUS_NORMAL = 2;

        /**
         * 异常连线
         */
        public static final Integer STATUS_THROW = 3;

    }

}
