package pers.wangjun.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import pers.wangjun.application.service.impl.ImeWorkOrderApplicationServiceImpl;
import pers.wangjun.domain.service.impl.CreateWorkOrderDomainServiceImpl;
import pers.wangjun.persistence.repository.impl.ImeWorkOrderRepositoryImpl;

/**
 * 工单配置
 *
 * @author wangjun
 */
@Configuration
@Import({ImeWorkOrderRepositoryImpl.class, CreateWorkOrderDomainServiceImpl.class, ImeWorkOrderApplicationServiceImpl.class})
public class ImeWorkOrderConfig {
}
