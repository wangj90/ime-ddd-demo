package pers.wangjun.domain.types;

import lombok.Getter;
import lombok.Value;

import java.util.Date;

/**
 * 工单计划时间
 *
 * @author wangjun
 */
@Getter
@Value
public class ImeWorkOrderPlanTime {

    /**
     * 计划开始时间
     */
    private Date imeWorkOrderPlanBeginTime;

    /**
     * 计划结束时间
     */
    private Date imeWorkOrderPlanEndTime;
}
