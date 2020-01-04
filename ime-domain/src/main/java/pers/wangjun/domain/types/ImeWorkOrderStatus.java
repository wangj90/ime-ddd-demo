package pers.wangjun.domain.aggregate;

/**
 * 工单状态
 *
 * @author wangjun
 */
public enum ImeWorkOrderStatus {

    /**
     * 已创建
     */
    Created,

    /**
     * 已发布
     */
    Published,

    /**
     * 已开工
     */
    Started,

    /**
     * 已完工
     */
    Ended;
}
