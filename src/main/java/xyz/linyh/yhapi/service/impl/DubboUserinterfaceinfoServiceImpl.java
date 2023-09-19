package xyz.linyh.yhapi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.linyh.yhapi.ducommon.common.BaseResponse;
import xyz.linyh.yhapi.ducommon.service.DubboUserinterfaceinfoService;
import xyz.linyh.yhapi.service.UserinterfaceinfoService;

@DubboService
@Slf4j
public class DubboUserinterfaceinfoServiceImpl implements DubboUserinterfaceinfoService {

    @Autowired
    private UserinterfaceinfoService userinterfaceinfoService;


    @Override
    public BaseResponse invokeOk(Long interfaceInfoId, Long userId) {
        try {
            BaseResponse baseResponse = userinterfaceinfoService.invokeOk(interfaceInfoId, userId);
        } catch (Exception e) {
            log.info("DubboUserinterfaceinfoServiceImpl错误");
            throw new RuntimeException(e);
        }
        return null;
    }

    /**
     * 判断接口是否还有调用次数或是否允许这个用户调用
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    @Override
    public Boolean isInvoke(Long interfaceInfoId, Long userId) {
        return userinterfaceinfoService.isInvoke(interfaceInfoId,userId);
    }
}
