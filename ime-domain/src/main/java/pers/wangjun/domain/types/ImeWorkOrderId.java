package pers.wangjun.domain.types;

import lombok.Getter;
import lombok.Value;

/**
 * 工单Id
 *
 * @author wangjun
 */
@Getter
@Value
public class ImeWorkOrderId {

    /**
     * 工单编码
     */
    private String code;
}
