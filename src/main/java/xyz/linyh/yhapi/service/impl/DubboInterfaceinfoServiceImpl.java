package xyz.linyh.yhapi.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import xyz.linyh.yhapi.ducommon.common.BaseResponse;
import xyz.linyh.yhapi.ducommon.constant.InterfaceInfoConstant;
import xyz.linyh.yhapi.ducommon.model.entity.Interfaceinfo;
import xyz.linyh.yhapi.ducommon.service.DubboInterfaceinfoService;
import xyz.linyh.yhapi.service.InterfaceinfoService;

import java.util.List;

@DubboService
public class DubboInterfaceinfoServiceImpl implements DubboInterfaceinfoService {

    @Autowired
    private InterfaceinfoService interfaceinfoService;

    @Override
    public Interfaceinfo getInterfaceByURI(String interfaceURI, String method) {
        return interfaceinfoService.getInterfaceInfoByURI(interfaceURI,method);
    }

    /**
     * 获取所有可用接口
     * @return
     */
    @Override
    public List<Interfaceinfo> getAllInterface() {
        List<Interfaceinfo> interfaceInfos = interfaceinfoService.list(Wrappers.<Interfaceinfo>lambdaQuery().eq(Interfaceinfo::getStatus, InterfaceInfoConstant.STATIC_USE));
        return interfaceInfos;
    }
}
