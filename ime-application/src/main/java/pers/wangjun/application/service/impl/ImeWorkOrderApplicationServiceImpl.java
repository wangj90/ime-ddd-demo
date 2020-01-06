package pers.wangjun.application.service.impl;

import com.sun.media.sound.InvalidDataException;
import pers.wangjun.application.requestdto.CreateWorkOrderRequestDto;
import pers.wangjun.application.responsedto.CreateWorkOrderResponseDto;
import pers.wangjun.application.service.ImeWorkOrderApplicationService;
import pers.wangjun.domain.service.CreateWorkOrderDomainService;
import pers.wangjun.domain.types.*;
import pers.wangjun.types.Measurement;

/**
 * 工单应用服务实现
 *
 * @author wangjun
 */
public class ImeWorkOrderApplicationServiceImpl implements ImeWorkOrderApplicationService {

    private CreateWorkOrderDomainService createWorkOrderDomainService;

    public ImeWorkOrderApplicationServiceImpl(CreateWorkOrderDomainService createWorkOrderDomainService) {
        this.createWorkOrderDomainService = createWorkOrderDomainService;
    }

    @Override
    public CreateWorkOrderResponseDto create(CreateWorkOrderRequestDto dto) throws InvalidDataException {
        String id = createWorkOrderDomainService.create(
                new ImeWorkOrderId(dto.getCode()),
                new ImeWorkOrderProduct(new ImeWorkOrderBom(), new ImeWorkOrderRouting()),
                new ImeWorkOrderQty(dto.getQty(), new Measurement()),
                new ImeWorkOrderPlanTime(dto.getImeWorkOrderPlanBeginTime(), dto.getImeWorkOrderPlanEndTime()));
        CreateWorkOrderResponseDto createWorkOrderResponseDto = new CreateWorkOrderResponseDto();
        createWorkOrderResponseDto.setId(id);
        return createWorkOrderResponseDto;
    }
}
