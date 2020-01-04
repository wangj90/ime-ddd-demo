package pers.wangjun.application.service;

import com.sun.media.sound.InvalidDataException;
import pers.wangjun.application.requestdto.CreateWorkOrderRequestDto;
import pers.wangjun.application.responsedto.CreateWorkOrderResponseDto;

/**
 * 工单应用服务
 *
 * @author wangjun
 */
public interface ImeWorkOrderApplicationService {

    /**
     * 创建工单
     *
     * @return 工单数据Id
     */
    CreateWorkOrderResponseDto create(CreateWorkOrderRequestDto dto) throws InvalidDataException;
}
